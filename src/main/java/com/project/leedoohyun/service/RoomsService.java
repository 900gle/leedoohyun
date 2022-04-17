package com.project.leedoohyun.service;

import com.project.leedoohyun.dao.Rooms;
import com.project.leedoohyun.domain.RoomsRepository;
import com.project.leedoohyun.dto.RoomsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class RoomsService {

    private final RoomsRepository roomsRepository;

    public void get() {

    }

    public Rooms save(RoomsDTO roomsDTO) {

        LocalDateTime createdTime = LocalDateTime.now();
        LocalDateTime updatedTime = LocalDateTime.now();

        return roomsRepository.save(
                Rooms.builder()
                        .roomId(roomsDTO.getRoomId())
                        .roomName(roomsDTO.getRoomName())
                        .category1(roomsDTO.getCategory1())
                        .category2(roomsDTO.getCategory2())
                        .category3(roomsDTO.getCategory3())
                        .category4(roomsDTO.getCategory4())
                        .category5(roomsDTO.getCategory5())
                        .memberCount(roomsDTO.getMemberCount())
                        .open(roomsDTO.getOpen())
                        .ownerId(roomsDTO.getOwnerId())
                        .createdTime(createdTime)
                        .updatedTime(updatedTime)
                        .build()
        );
    }

    public void update() {

    }

    public void delete() {

    }

}
