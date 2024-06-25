package com.mysite.tayo.task;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_seq")
    @SequenceGenerator(name = "task_seq", sequenceName = "TASK_SEQ", allocationSize = 1)
    @Column(name = "task_idx")
	private Long taskIdx;
	
	@Column(name = "task_post_idx")
	private Integer taskPostIdx;
	
	@Column(name = "task_name", length = 100)
	private String taskName;
	
	@Column(name = "condition")
	private Integer condition;
	
	@Column(name = "task_priority")
	private Integer taskPriority;
	
	@Column(name = "manager_idx")
	private Integer managerIdx;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "upload_date")
	private Date uploadDate;
	
	@Lob
	@Column(name = "contents", columnDefinition = "CLOB")
	private String contents;
}
