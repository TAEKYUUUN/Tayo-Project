package com.tayoNew.tayopr.organization;


import java.util.List;

import com.tayoNew.tayopr.member.Member;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organization_seq")
	@SequenceGenerator(name = "organization_seq", sequenceName = "ORGANIZATION_SEQ", allocationSize = 1)
	@Column(name = "organization_idx")
	private Long organizationIdx;
	
	@Column(name="company_idx")
	private Integer companyIdx;
	
	@Column(name="og_manager_idx")
	private Integer ogManagerIdx;
	
	@Column(name="organization_name", length=100)
	private String organizationName;
	
	@Column(name="upper_organization")
	private Integer upperOrganization;
	
	@Column(name="organization_order")
	private Integer organizationOrder;
	
}
