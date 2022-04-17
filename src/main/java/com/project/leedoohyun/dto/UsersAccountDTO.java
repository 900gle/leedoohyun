package com.project.leedoohyun.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UsersAccountDTO {
    private Long userId;
    private Long balance;
    private String black;
}
