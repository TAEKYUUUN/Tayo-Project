package com.mysite.tayo.task;

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
@Table(name = "lower_task")
public class LowerTask {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lower_task_seq")
    @SequenceGenerator(name = "lower_task_seq", sequenceName = "LOWER_TASK_SEQ", allocationSize = 1)
    @Column(name = "lower_task_idx")
	private Long LowerTaskIdx;
	
	@Column(name = "upper_idx")
	private Integer upperIdx;
	
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
}
