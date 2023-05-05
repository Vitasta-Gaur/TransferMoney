package com.transfer.money.api;

import com.transfer.money.dto.TransferMoney;
import com.transfer.money.service.ITransferMoney;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class TransferMoneyAPI {

    @Resource
    ITransferMoney transferMoneyService;

    @PostMapping("/transfer")
    public String initiateTransferMoney(@RequestBody final TransferMoney transferMoney){
        log.info("Begin transfer of money between parties.");
        log.debug("Account to be credited : {} " , transferMoney.getCreditAccount());
        log.debug("Account to be debited : {} " , transferMoney.getDebitAccount());
        return transferMoneyService.transferAmount(transferMoney);
    }

    @PostMapping("/create")
    public String initiateAccountOpening(@RequestBody  final String accountNumber){
        log.info("Begin : Open new account.");
        log.debug("Account to open {}" , accountNumber);
        return transferMoneyService.openAccount(accountNumber);
    }
}
