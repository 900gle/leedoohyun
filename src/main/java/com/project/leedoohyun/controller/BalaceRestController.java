package com.project.leedoohyun.controller;

import com.project.leedoohyun.dto.UsersAccountDTO;
import com.project.leedoohyun.model.CommonResult;
import com.project.leedoohyun.service.AccountService;
import com.project.leedoohyun.service.ResponseService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"5. Balance"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/balance")
public class BalaceRestController {

    private final ResponseService responseService;
    private final AccountService accountService;

    private static final String BLACK = "Y";

    @ApiOperation(value = "뿌리기", notes = "뿌리기")
    @PostMapping(value = "")
    @CrossOrigin("*")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "X-USER-ID", value = "USER ID", required = true, dataType = "String", paramType = "header"),
            @ApiImplicitParam(name = "X-ROOM-ID", value = "ROOM ID", required = true, dataType = "String", paramType = "header")
    })
    public CommonResult sendBalance(
            @ApiParam(value = "balance") @RequestParam(value = "balance", defaultValue = "", required = true) Long balance,
            @ApiParam(value = "memberCount") @RequestParam(value = "memberCount", defaultValue = "", required = true) int member_count

    ) {
        return responseService.getSingleResult(
                accountService.save(UsersAccountDTO.builder().balance(balance).black(BLACK).build())
        );
    }

}
