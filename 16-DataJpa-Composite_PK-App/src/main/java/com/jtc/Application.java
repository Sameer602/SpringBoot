package com.jtc;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jtc.entity.Account;
import com.jtc.entity.AccountPK;
import com.jtc.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		AccountRepo bean =  context.getBean(AccountRepo.class);
		/*
		//setting composite key value
		AccountPK pk = new AccountPK();
	    pk.setAccNo(33011306);
		pk.setAccType("Saving");
		
		//setting entity data
		Account acc = new Account();
		acc.setHolderName("Sameer");
		acc.setBranch("Noida");
		acc.setAccountPk(pk);
		
		bean.save(acc);   //saving entity obj
		
		System.out.println("Record Saved......");
		*/
		AccountPK pk = new AccountPK();
		pk.setAccNo(33011306);
		pk.setAccType("Saving");
		
		  Optional<Account> findById = bean.findById(pk);
		  if(findById.isPresent()) {
			  System.out.println(findById.get());
		  }
	}

}
