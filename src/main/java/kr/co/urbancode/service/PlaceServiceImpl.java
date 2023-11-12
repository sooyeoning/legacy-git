package kr.co.urbancode.service;

import kr.co.urbancode.dto.PlaceDTO;
import kr.co.urbancode.mapper.PlaceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//서비스 -> dao(mapper) 호출
@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final PlaceMapper placeMapper;

    @Override
    public PlaceDTO getOnePlace(int contentId){
        return placeMapper.selectOnePlace(contentId);
    }

    @Override
    public void deletePlace(int contentId){placeMapper.deletePlace(contentId);}

    @Override
    public void updatePlace(PlaceDTO placeDTO) {
        placeMapper.updatePlace(placeDTO);
    }

    @Override
    public void insertPlace(PlaceDTO placeDTO) {
        placeMapper.insertPlace(placeDTO);
    }

    @Override
    public List<PlaceDTO> getPlaceList() {
        return placeMapper.selectPlaceList();
    }
}
