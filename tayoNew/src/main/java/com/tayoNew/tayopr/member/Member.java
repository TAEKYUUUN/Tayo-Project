package com.tayoNew.tayopr.member;

import java.util.Date;

import org.checkerframework.common.aliasing.qual.Unique;

import com.tayoNew.tayopr.company.Company;
import com.tayoNew.tayopr.organization.Organization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "member")
public class Member {
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
	 @SequenceGenerator(name = "member_seq", sequenceName = "MEMBER_SEQ", allocationSize = 1)
	 @Column(name = "member_idx")
	 private Long memberIdx;
	 
	 @Column(name = "name", length=100)
	 private String name;
	 
	 @Unique
	 @Column(name = "email", length=100)
	 private String email;
	 
	 @Column(name="password", length=100)
	 private String password;
	 
	 @Column(name="phone", length=100)
	 private String phone;
	 
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "company_idx")
	 private Company company;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "organization_idx")
	 private Organization organization;
	 
	 @Column(name="rank_name", length=100)
	 private String rankName;
	 
	 @Column(name="regist_date")
	 private Date registDate;
	 
	 @Column(name="certification_number")
	 private Integer certificationNumber;
	 
	 @Column(name="is_confirmed")
	 private Integer isConfirmed;
	 
	 @Column(name="phone_company", length=100)
	 private String phoneCompany;
	 
	 @Column(name="status_message", length=100)
	 private String statusMessage;
	 
	 @Column(name="profile_image", length=100)
	 private String profileImage;
	 
	 @Column(name="benefit_agree")
	 private Integer benefitAgree;
	 
	 @Column(name="set_auto_logout")
	 private Integer setAutoLogout;
}
