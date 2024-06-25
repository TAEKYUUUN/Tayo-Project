package com.mysite.tayo.project;

import java.util.Date;
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
@Table(name = "project")
public class Project {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_seq")
    @SequenceGenerator(name = "project_seq", sequenceName = "PROJECT_SEQ", allocationSize = 1)
    @Column(name = "project_idx")
	private Long projectIdx;
	
	@Column(name = "company_idx")
	private Integer companyIdx;
	
	@Column(name = "project_name", length = 100)
	private String projectName;
	
	@Column(name = "project_type")
	private Integer projectType;
	
	@Column(name = "category_idx")
	private Integer categoryIdx;
	
	@Column(name = "main_tab")
	private Integer mainTab;
	
	@Column(name = "creation_date")
	private Date creationDate;
	
	@Column(name = "folder_idx")
	private Integer folderIdx;
	
	@Column(name = "without_confirm")
	private Integer withoutConfirm;
	
	@Column(name = "can_write_post")
	private Integer canWritePost;
	
	@Column(name = "can_revise_post")
	private Integer canRevisePost;
	
	@Column(name = "can_see_post")
	private Integer canSeePost;
	
	@Column(name = "can_write_comments")
	private Integer canWriteComments;
	
	@Column(name = "can_see_file")
	private Integer canSeeFile;
	
	@Column(name = "can_download")
	private Integer canDownload;
	
	@Column(name = "creator_idx")
	private Integer creatorIdx;
	
	@Column(name = "used_template")
	private Integer usedTemplate;
}
