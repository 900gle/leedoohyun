package com.project.leedoohyun.service;

import com.project.leedoohyun.dao.Users;
import com.project.leedoohyun.domain.UsersRepository;
import com.project.leedoohyun.dto.UsersDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public void get() {

    }

    public Users save(UsersDTO usersDTO) {

        LocalDateTime createdTime = LocalDateTime.now();
        LocalDateTime updatedTime = LocalDateTime.now();

        return usersRepository.save(
                Users.builder()
                        .userName(usersDTO.getUserName())
                        .black(usersDTO.getBlack())
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
