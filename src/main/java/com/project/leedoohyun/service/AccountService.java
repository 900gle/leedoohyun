package com.project.leedoohyun.service;

import com.project.leedoohyun.dao.UserAccount;
import com.project.leedoohyun.dao.Users;
import com.project.leedoohyun.domain.UserAccountRepository;
import com.project.leedoohyun.dto.UsersAccountDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final UserAccountRepository userAccountRepository;

    public void get() {

    }

    public UserAccount save(UsersAccountDTO usersAccountDTO) {

        LocalDateTime createdTime = LocalDateTime.now();
        LocalDateTime updatedTime = LocalDateTime.now();

        return userAccountRepository.save(
                UserAccount.builder()
                        .userId(usersAccountDTO.getUserId())
                        .black(usersAccountDTO.getBlack())
                        .balance(usersAccountDTO.getBalance())
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
