package com.project.leedoohyun.controller;

import com.project.leedoohyun.dto.RoomsDTO;
import com.project.leedoohyun.dto.UsersDTO;
import com.project.leedoohyun.model.CommonResult;
import com.project.leedoohyun.service.ResponseService;
import com.project.leedoohyun.service.RoomsService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"2. Rooms"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/rooms")
public class RoomsRestController {

    private final ResponseService responseService;
    private final RoomsService roomsService;

    private static final String OPEN = "Y";

    @ApiOperation(value = "채팅방 생성", notes = "채팅방 생성")
    @PostMapping(value = "")
    @CrossOrigin("*")
    public CommonResult createRoom(
            @ApiParam(value = "roomId") @RequestParam(value = "roomId", defaultValue = "", required = true) String roomId,
            @ApiParam(value = "roomName") @RequestParam(value = "roomName", defaultValue = "", required = true) String roomName,
            @ApiParam(value = "category1") @RequestParam(value = "category1", defaultValue = "", required = true) String category1,
            @ApiParam(value = "category2") @RequestParam(value = "category2", defaultValue = "", required = false) String category2,
            @ApiParam(value = "category3") @RequestParam(value = "category3", defaultValue = "", required = false) String category3,
            @ApiParam(value = "category4") @RequestParam(value = "category4", defaultValue = "", required = false) String category4,
            @ApiParam(value = "category5") @RequestParam(value = "category5", defaultValue = "", required = false) String category5,
            @ApiParam(value = "memberCount") @RequestParam(value = "memberCount", defaultValue = "1", required = true) int memberCount,
            @ApiParam(value = "ownerId") @RequestParam(value = "ownerId", defaultValue = "", required = true) Long ownerId

    ) {
        return responseService.getSingleResult(
                roomsService.save(RoomsDTO.builder()
                        .roomId(roomId)
                        .roomName(roomName)
                        .category1(category1)
                        .category2(category2)
                        .category3(category3)
                        .category4(category4)
                        .category5(category5)
                        .memberCount(memberCount)
                        .open(OPEN)
                        .ownerId(ownerId)
                        .build())
        );
    }

}
