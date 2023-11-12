package kr.co.urbancode.service;

import kr.co.urbancode.dto.PlaceDTO;

import java.util.List;

public interface PlaceService {
     PlaceDTO getOnePlace(int contentId);
     void deletePlace(int contentId);
     void updatePlace(PlaceDTO placeDTO);
     void insertPlace(PlaceDTO placeDTO);
     List<PlaceDTO> getPlaceList();

}
