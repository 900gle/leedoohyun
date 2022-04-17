package com.project.leedoohyun.domain;

import com.project.leedoohyun.dao.RoomMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomMembersRepository extends JpaRepository<RoomMembers, Long> {

//    List<Users> findAllByUpdatedTimeLessThan(@Param("updatedTime") LocalDateTime updatedTime);
//    List<Users> findAllByUpdatedTimeGreaterThan(@Param("updatedTime") LocalDateTime updatedTime);
}
