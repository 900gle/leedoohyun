package com.project.leedoohyun.controller;

import com.project.leedoohyun.dto.RoomMembersDTO;
import com.project.leedoohyun.model.CommonResult;
import com.project.leedoohyun.service.ResponseService;
import com.project.leedoohyun.service.RoomMembersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"3. RoomMembers"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/room/members")
public class RoomMemebersRestController {

    private final ResponseService responseService;
    private final RoomMembersService roomMembersService;

    private static final String BLACK = "Y";

    @ApiOperation(value = "채팅방 입장", notes = "채팅방 입장")
    @PostMapping(value = "")
    @CrossOrigin("*")
    public CommonResult joinRoom(
            @ApiParam(value = "roomId") @RequestParam(value = "roomId", defaultValue = "", required = true) Long roomId,
            @ApiParam(value = "userId") @RequestParam(value = "userId", defaultValue = "", required = true) Long userId
    ) {
        return responseService.getSingleResult(
                roomMembersService.save(RoomMembersDTO.builder()
                        .roomId(roomId)
                        .userId(userId)
                        .black(BLACK)
                        .build())
        );
    }

}
