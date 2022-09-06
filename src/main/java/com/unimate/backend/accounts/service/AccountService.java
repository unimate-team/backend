package com.unimate.backend.accounts.service;

import com.unimate.backend.accounts.dto.AccountSaveRequestDto;
import com.unimate.backend.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Transactional
    public Long save(AccountSaveRequestDto accountSaveRequestDto){
        return accountRepository.save(accountSaveRequestDto.toEntity()).getId();
    }

}
