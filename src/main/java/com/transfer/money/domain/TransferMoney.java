package com.transfer.money.domain;

import com.fasterxml.jackson.annotation.*;

import java.math.BigDecimal;

@JsonPropertyOrder({"creditAccount","debitAccount","amount"})
public class TransferMoney {

    @JsonProperty(value = "creditAccount" , required = true)
    private String creditAccount;

    @JsonProperty(value = "debitAccount" , required = true)
    private String debitAccount;

    @JsonProperty(value = "amount" , required = true)
    private BigDecimal amount;

    @JsonCreator
    public TransferMoney(final String creditAccount , final String debitAccount , final BigDecimal amount){
        this.creditAccount = creditAccount;
        this.debitAccount = debitAccount;
        this.amount =amount;
    }

    public String getCreditAccount() {
        return creditAccount;
    }

    //@JsonSetter(value = "creditAccount")
    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
    }

    public String getDebitAccount() {
        return debitAccount;
    }

   // @JsonSetter(value = "debitAccount")
    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    //@JsonSetter(value = "amount")
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
