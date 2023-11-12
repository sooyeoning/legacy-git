package kr.co.urbancode.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data //롬복 getter,setter,생성자,toString
public class PlaceDTO {
    @ApiModelProperty(value="장소 id")
    private int contentId;

    @ApiModelProperty(value="관광타입 id")
    private Integer contenttypeid; //관광타입 id

    @ApiModelProperty(value="장소명")
    private String title;

    @ApiModelProperty(value="지역코드")
    private int areaCode;

    @ApiModelProperty(value="대표 사진1")
    private String image1;

    @ApiModelProperty(value="대표 사진2")
    private String image2;

    @ApiModelProperty(value="주소")
    private String address;

    @ApiModelProperty(value = "경도")
    private double mapx;

    @ApiModelProperty(value="위도")
    private double mapy;

    @ApiModelProperty(value = "여행지 설명")
    private String contents;

    @ApiModelProperty(value = "테마")
    private String theme;

    @ApiModelProperty(value = "작성시간")
    private String writingtime;

    @ApiModelProperty(value="좋아요수")
    private int likecnt;

    @ApiModelProperty(value = "조회수")
    private int viewcnt;

    @ApiModelProperty(value="홈페이지")
    private String homepage;

}
