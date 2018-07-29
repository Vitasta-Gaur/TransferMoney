package com.transfer.money.repository;

import com.transfer.money.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferMoneyRepository extends CrudRepository<Account,String> {

}
