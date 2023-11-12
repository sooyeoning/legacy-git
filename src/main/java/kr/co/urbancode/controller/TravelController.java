package kr.co.urbancode.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import kr.co.urbancode.dto.PlaceDTO;
import kr.co.urbancode.service.PlaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//컨트롤러 -> 서비스 호출

@RestController
@RequiredArgsConstructor //(롬복)초기화되지 않은 final/@NonNull 필드 생성자 생성 후 의존성 주입
@Slf4j //로깅
@RequestMapping("/travel") //하위 메서드 모두에 공통 url 설정
@Api(tags = {"여행지 API"})
public class TravelController {
	
	private final PlaceService placeService;

	@ApiOperation(value="contentId를 이용하여 여행지 레코드를 조회합니다")
	@GetMapping(value = "/{contentId}")
	public ResponseEntity<PlaceDTO> getOnePlace(@ApiParam(value = "여행지 id", defaultValue = "125266") @PathVariable int contentId) {
		return 	ResponseEntity.ok(placeService.getOnePlace(contentId));
    }

	@ApiOperation(value="contentId를 이용하여 여행지 레코드를 삭제합니다")
	@DeleteMapping(value="/{contentId}")
	public void deletePlace(@ApiParam(value = "여행지 id", defaultValue = "125266") @PathVariable int contentId){
		placeService.deletePlace(contentId);
	}

	@ApiOperation(value="여행지 레코드를 수정합니다")
	@PutMapping(value="/put")
	public void updatePlace(@ApiParam(value="여행 DTO") @RequestBody PlaceDTO placeDTO){
		placeService.updatePlace(placeDTO);
	}

	@ApiOperation(value="여행지 레코드를 추가합니다")
	@PostMapping(value="/post")
	public void insertPlace(@ApiParam(value="여행 DTO") @RequestBody PlaceDTO placeDTO){
		placeService.insertPlace(placeDTO);
	}

	@ApiOperation(value="여행지 레코드 전체를 조회합니다")
	@GetMapping(value="/list")
	public ResponseEntity<List<PlaceDTO>> getPlaceList(){
		return ResponseEntity.ok(placeService.getPlaceList());
	}
	/*
	@GetMapping(value = "/entity/{contentId}")
	public ResponseEntity<PlaceDTO> getREPlace(@PathVariable int contentId) {

		// return new ResponseEntity 하지 않아도 되는 이유는 스프링이 편의성 제공하기 때문
		return 	ResponseEntity.ok(placeService.getOnePlace(contentId));

	}
	*/
}
