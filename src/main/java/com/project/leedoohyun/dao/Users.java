package com.project.leedoohyun.dao;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(length = 100, nullable = false)
    private String userName;

    @Column(length = 2, nullable = false)
    private String black;

    @Column(length = 30, nullable = true)
    private LocalDateTime createdTime;

    @Column(length = 30, nullable = true)
    private LocalDateTime updatedTime;

    @Builder
    public Users(
            String userName,
            String black,
            LocalDateTime createdTime,
            LocalDateTime updatedTime
    ) {
        this.userName = userName;
        this.black = black;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

}
