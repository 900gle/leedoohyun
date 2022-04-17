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
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(length = 20, nullable = false)
    private Long userId;

    @Column(length = 20, nullable = false)
    private Long balance;

    @Column(length = 2, nullable = false)
    private String black;

    @Column(length = 30, nullable = true)
    private LocalDateTime createdTime;

    @Column(length = 30, nullable = true)
    private LocalDateTime updatedTime;

    @Builder
    public UserAccount(
            Long userId,
            Long balance,
            String black,
            LocalDateTime createdTime,
            LocalDateTime updatedTime
    ) {
        this.userId = userId;
        this.balance = balance;
        this.black = black;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

}
