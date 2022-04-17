package com.project.leedoohyun.domain;

import com.project.leedoohyun.dao.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomsRepository extends JpaRepository<Rooms, Long> {

//    List<Users> findAllByUpdatedTimeLessThan(@Param("updatedTime") LocalDateTime updatedTime);
//    List<Users> findAllByUpdatedTimeGreaterThan(@Param("updatedTime") LocalDateTime updatedTime);
}
