package kr.co.urbancode.dto;

import lombok.Data;

@Data //롬복 getter,setter,생성자,toString
public class PlaceDTO {

    private int contentId;

    private Integer contentTypeId; //관광타입 id

    private String title;

    private int areaCode;

    private String image1;

    private String image2;

    private String address;

    private double mapx;

    private double mapy;

    private String contents;

    private String theme;

    private String writingtime;

    private int likecnt;

    private int viewcnt;

    private String homepage;

}
