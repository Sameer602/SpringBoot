package com.jtc.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.jtc.AppConfig;
import com.jtc.beans.ReportService;

public class Test {
	    public static void main(String[] args) {
			ApplicationContext ctxt=new AnnotationConfigApplicationContext(AppConfig.class);
			          ReportService service=ctxt.getBean(ReportService.class);
			          service.generateReport();
		}

}
