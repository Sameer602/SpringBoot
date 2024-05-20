package com.jtc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtc.entity.Account;
import com.jtc.entity.AccountPK;

public interface AccountRepo extends JpaRepository<Account,AccountPK>{

}
