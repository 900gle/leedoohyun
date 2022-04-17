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
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 3, nullable = false)
    private String roomId;

    @Column(length = 30, nullable = false)
    private String roomName;

    @Column(length = 200, nullable = true)
    private String category1;

    @Column(length = 200, nullable = true)
    private String category2;

    @Column(length = 200, nullable = true)
    private String category3;

    @Column(length = 200, nullable = true)
    private String category4;

    @Column(length = 200, nullable = true)
    private String category5;

    @Column(length = 3, nullable = true)
    private int memberCount;

    @Column(length = 1, nullable = true)
    private String open;

    @Column(length = 30, nullable = true)
    private Long ownerId;

    @Column(length = 200, nullable = true)
    private LocalDateTime createdTime;

    @Column(length = 200, nullable = true)
    private LocalDateTime updatedTime;

    @Builder
    public Rooms(
            String roomId,
            String roomName,
            String category1,
            String category2,
            String category3,
            String category4,
            String category5,
            int memberCount,
            String open,
            Long ownerId,
            LocalDateTime createdTime,
            LocalDateTime updatedTime
    ) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.category4 = category4;
        this.category5 = category5;
        this.memberCount = memberCount;
        this.open = open;
        this.ownerId = ownerId;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

}
