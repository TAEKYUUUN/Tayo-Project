package com.mysite.tayo.schedule;

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
@Table(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schedule_seq")
	@SequenceGenerator(name = "schedule_seq", sequenceName = "SCHEDULE_SEQ", allocationSize = 1)
	@Column(name = "schedule_idx")
	private Long scheduleIdx;
	
	@Column(name = "title", length = 100)
	private String title;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "manager_idx")
	private Integer managerIdx;
	
	@Column(name = "place", length = 200)
	private String place;
	
	@Column(name = "can_online")
	private Integer canOnline;
	
	@Lob
	@Column(name = "contents", columnDefinition = "CLOB")
	private String contents;
	
	@Column(name = "schedule_alarm")
	private Integer number;
}
