package kr.co.urbancode.service;

import kr.co.urbancode.dto.PlaceDTO;
import lombok.RequiredArgsConstructor;
import kr.co.urbancode.mapper.PlaceMapper;
import org.springframework.stereotype.Service;

//서비스 -> dao(mapper) 호출
@Service
@RequiredArgsConstructor
public class PlaceService {

    private final PlaceMapper placeMapper;

    public PlaceDTO getOnePlace(int contentId){
       return placeMapper.getOnePlace(contentId);
    }
}
