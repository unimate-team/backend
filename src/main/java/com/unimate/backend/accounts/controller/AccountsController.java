

package com.unimate.backend.accounts.controller;

import com.unimate.backend.accounts.dto.AccountSaveRequestDto;
import com.unimate.backend.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountsController {

    private final AccountService accountService;

    @PostMapping("/register")
    public Long save(@RequestBody AccountSaveRequestDto requestDto){
        return accountService.save(requestDto);
    }
}