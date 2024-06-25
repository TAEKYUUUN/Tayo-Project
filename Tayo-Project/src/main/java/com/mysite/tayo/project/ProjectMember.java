package com.mysite.tayo.project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "project_member")
public class ProjectMember {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_member_seq")
    @SequenceGenerator(name = "project_member_seq", sequenceName = "PROJECT_MEMBER_SEQ", allocationSize = 1)
    @Column(name = "project_member_idx")
	private Long projectMemberIdx;
	
	@Column(name = "member_idx")
	private Integer memberIdx;
	
	@Column(name = "project_idx")
	private Integer projectIdx;
	
	@Column(name = "is_manager")
	private Integer isManager;
	
	@Column(name = "hotlist")
	private Integer hotlist;
	
	@Column(name = "hide")
	private Integer hide;
	
	@Column(name = "set_mainpage")
	private Integer setMainPage;
	
	@Column(name = "alarm")
	private Integer alarm;
	
	@Column(name = "company_idx")
	private Integer companyIdx;
	
	@Column(name = "is_confirmed")
	private Integer isConfirmed;
}
