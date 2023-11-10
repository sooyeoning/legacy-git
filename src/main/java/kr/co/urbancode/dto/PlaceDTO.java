package kr.co.urbancode.dto;

import lombok.Data;

@Data //롬복 getter,setter,생성자,toString
//@Schema(description = "여행지 정보 DTO")
public class PlaceDTO {
//    @Schema(description = "여행지 id")
    private int contentId;

//    @Schema(description = "관광타입 id")
    private Integer contentTypeId; //관광타입 id

//    @Schema(description = "장소명")
    private String title;

//    @Schema(description = "지역코드")
    private int areaCode;

//    @Schema(description = "대표 사진1")
    private String image1;

//    @Schema(description = "대표 사진2")
    private String image2;

//    @Schema(description = "주소")
    private String address;

//    @Schema(description = "경도")
    private double mapx;

//    @Schema(description = "위도")
    private double mapy;

//    @Schema(description = "여행지 설명")
    private String contents;

//    @Schema(description = "테마")
    private String theme;

//    @Schema(description = "작성시간")
    private String writingtime;

//    @Schema(description = "좋아요수")
    private int likecnt;

//    @Schema(description = "조회수")
    private int viewcnt;

//    @Schema(description = "홈페이")
    private String homepage;

}
