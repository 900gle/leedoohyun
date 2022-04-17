package com.project.leedoohyun.domain;

import com.project.leedoohyun.dao.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

//    List<Users> findAllByUpdatedTimeLessThan(@Param("updatedTime") LocalDateTime updatedTime);
//    List<Users> findAllByUpdatedTimeGreaterThan(@Param("updatedTime") LocalDateTime updatedTime);
}
