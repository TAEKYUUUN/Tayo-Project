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
@Table(name = "project_category")
public class ProjectCategory {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_category_seq")
    @SequenceGenerator(name = "project_category_seq", sequenceName = "PROJECT_CATEGORY_SEQ", allocationSize = 1)
    @Column(name = "project_category_idx")
	private Long projectCategoryIdx;
	
	@Column(name = "company_idx")
	private Integer companyIdx;
	
	@Column(name = "category_name", length = 100)
	private String categoryName;
	
	@Column(name = "category_active")
	private Integer categoryActive;
	
	@Column(name = "category_order")
	private Integer categoryOrder;
}
