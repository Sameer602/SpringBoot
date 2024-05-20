package com.jtc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	  private Integer userid;
	  private String username;
	  private String email;
	  private String pwd;
	  private String gender;
	  private Long phone;
	  
  

}
