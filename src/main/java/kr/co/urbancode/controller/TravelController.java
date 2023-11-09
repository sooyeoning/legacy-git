package kr.co.urbancode.controller;

import kr.co.urbancode.dto.PlaceDTO;
import kr.co.urbancode.service.PlaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러 -> 서비스 호출

@RestController
@RequiredArgsConstructor //(롬복)초기화되지 않은 final/@NonNull 필드 생성자 생성 후 의존성 주입
@Slf4j //로깅
@RequestMapping("/travel") //하위 메서드 모두에 공통 url 설정
public class TravelController {
	
	private final PlaceService placeService;

	@GetMapping(value = "/{contentId}")
	public PlaceDTO getOnePlace(@PathVariable int contentId) {
		return 	placeService.getOnePlace(contentId);
    }
	
}
