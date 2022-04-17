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
public class RoomMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private Long roomId;

    @Column(length = 20, nullable = false)
    private Long userId;

    @Column(length = 2, nullable = false)
    private String black;

    @Column(length = 30, nullable = true)
    private LocalDateTime createdTime;

    @Column(length = 30, nullable = true)
    private LocalDateTime updatedTime;

    @Builder
    public RoomMembers(
            Long roomId,
            Long userId,
            String black,
            LocalDateTime createdTime,
            LocalDateTime updatedTime
    ) {
        this.roomId = roomId;
        this.userId = userId;
        this.black = black;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

}
