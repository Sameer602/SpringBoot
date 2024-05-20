package com.jtc.beans;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDBDao implements ReportDao {
	
	
	public void getData() {
		System.out.println("Getting Data from OracleDB...");
	}

}
