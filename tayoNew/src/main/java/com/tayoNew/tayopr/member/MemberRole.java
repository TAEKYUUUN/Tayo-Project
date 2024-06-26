package com.tayoNew.tayopr.member;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum MemberRole {
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");
	
	private String value;
	
	MemberRole(String value){
		this.value= value;
	}
	
}
