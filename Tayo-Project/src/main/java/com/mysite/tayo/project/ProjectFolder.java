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
@Table(name = "project_folder")
public class ProjectFolder {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_folder_seq")
    @SequenceGenerator(name = "project_folder_seq", sequenceName = "PROJECT_FOLDER_SEQ", allocationSize = 1)
    @Column(name = "project_folder_idx")	
	private Long projectFolderIdx;
	
	@Column(name = "project_idx")
	private Integer projectIdx;
	
	@Column(name = "folder_name", length = 100)
	private String folderName;
}
