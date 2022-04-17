package com.project.leedoohyun.controller;

import com.project.leedoohyun.dto.UsersAccountDTO;
import com.project.leedoohyun.model.CommonResult;
import com.project.leedoohyun.service.AccountService;
import com.project.leedoohyun.service.ResponseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"2. Account"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/account")
public class AccountRestController {

    private final ResponseService responseService;
    private final AccountService accountService;

    private static final String BLACK = "Y";

    @ApiOperation(value = "금액 저장", notes = "금액저장")
    @PostMapping(value = "")
    @CrossOrigin("*")
    public CommonResult saveUser(
            @ApiParam(value = "userId") @RequestParam(value = "userId", defaultValue = "", required = true) Long userId,
            @ApiParam(value = "balance") @RequestParam(value = "balance", defaultValue = "", required = true) Long balance
    ) {
        return responseService.getSingleResult(
                accountService.save(UsersAccountDTO.builder().userId(userId).balance(balance).black(BLACK).build())
        );
    }

}
