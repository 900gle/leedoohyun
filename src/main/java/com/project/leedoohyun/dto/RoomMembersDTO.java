package com.project.leedoohyun.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RoomMembersDTO {
    private Long roomId;
    private Long userId;
    private String black;
}
