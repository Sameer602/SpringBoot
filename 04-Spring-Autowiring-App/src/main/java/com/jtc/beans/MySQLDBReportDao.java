package com.jtc.beans;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class MySQLDBReportDao implements ReportDao {
	
	 public void getData() {
		 System.out.println("Getting Data from MySQLDB......");
	 }

}
