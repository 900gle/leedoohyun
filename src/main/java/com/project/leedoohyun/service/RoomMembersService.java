package com.project.leedoohyun.service;

import com.project.leedoohyun.dao.RoomMembers;
import com.project.leedoohyun.domain.RoomMembersRepository;
import com.project.leedoohyun.dto.RoomMembersDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class RoomMembersService {

    private final RoomMembersRepository roomMembersRepository;
    public void get() {

    }

    public RoomMembers save(RoomMembersDTO roomMembersDTO) {

        LocalDateTime createdTime = LocalDateTime.now();
        LocalDateTime updatedTime = LocalDateTime.now();

        return roomMembersRepository.save(
                RoomMembers.builder()
                        .roomId(roomMembersDTO.getRoomId())
                        .userId(roomMembersDTO.getUserId())
                        .black(roomMembersDTO.getBlack())
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
