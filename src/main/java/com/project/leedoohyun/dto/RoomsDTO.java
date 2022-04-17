package com.project.leedoohyun.dto;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;

@Getter
@Builder
public class RoomsDTO {

    private String roomId;
    private String roomName;
    private String category1;
    private String category2;
    private String category3;
    private String category4;
    private String category5;
    private int memberCount;
    private String open;
    private Long ownerId;

}
