package com.project.leedoohyun.domain;

import com.project.leedoohyun.dao.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

//    List<Users> findAllByUpdatedTimeLessThan(@Param("updatedTime") LocalDateTime updatedTime);
//    List<Users> findAllByUpdatedTimeGreaterThan(@Param("updatedTime") LocalDateTime updatedTime);
}
