package kr.co.urbancode.controller;

import kr.co.urbancode.dto.PlaceDTO;
import kr.co.urbancode.service.PlaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//컨트롤러 -> 서비스 호출

@EnableSwagger2
@RestController
@RequiredArgsConstructor //(롬복)초기화되지 않은 final/@NonNull 필드 생성자 생성 후 의존성 주입
@Slf4j //로깅
@RequestMapping("/travel") //하위 메서드 모두에 공통 url 설정
//@Tag(name="travel", description = "여행지 API")
public class TravelController {
	
	private final PlaceService placeService;

	@GetMapping(value = "/{contentId}")
//	@Operation(summary = "여행지 조회",description = "contentId를 이용해 여행지를 조회합니다")
	public PlaceDTO getOnePlace(@PathVariable int contentId) {
		return 	placeService.getOnePlace(contentId);
    }

	/*
	@GetMapping(value = "/entity/{contentId}")
	public ResponseEntity<PlaceDTO> getREPlace(@PathVariable int contentId) {

		// return new ResponseEntity 하지 않아도 되는 이유는 스프링이 편의성 제공하기 때문
		return 	ResponseEntity.ok(placeService.getOnePlace(contentId));

	}
	*/
}
