package com.project.leedoohyun.controller;

import com.project.leedoohyun.dto.UsersDTO;
import com.project.leedoohyun.model.CommonResult;
import com.project.leedoohyun.service.ResponseService;
import com.project.leedoohyun.service.UsersService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"1. Users"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/Users")
public class UsersRestController {

    private final ResponseService responseService;
    private final UsersService usersService;

    private static final String BLACK = "Y";

    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = true, dataType = "String", paramType = "header")
    })
    @ApiOperation(value = "회원 리스트 조회", notes = "모든 회원을 조회한다")
    @GetMapping(value = "")
    @CrossOrigin("*")
    public CommonResult findAllUser() {
        return responseService.getSuccessResult();
    }


    @ApiOperation(value = "회원 저장", notes = "회원저장")
    @PostMapping(value = "")
    @CrossOrigin("*")
    public CommonResult saveUser(
            @ApiParam(value = "userName") @RequestParam(value = "userName", defaultValue = "", required = true) String userName
    ) {
        return responseService.getSingleResult(
                usersService.save(UsersDTO.builder().userName(userName).black(BLACK).build())
        );
    }

}
