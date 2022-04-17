package com.project.leedoohyun.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UsersDTO {
    private Long userId;
    private String userName;
    private String black;
}
