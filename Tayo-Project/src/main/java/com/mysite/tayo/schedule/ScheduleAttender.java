package com.mysite.tayo.schedule;

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
@Table(name = "schedule_attender")
public class ScheduleAttender {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schedule_attender_seq")
	@SequenceGenerator(name = "schedule_attender_seq", sequenceName = "SCHEDULE_ATTENDER_SEQ", allocationSize = 1)
	@Column(name = "schedule_attender_idx")
	private Long scheduleAttenderIdx;
	
	@Column(name = "schedule_idx")
	private Integer scheduleIdx;
	
	@Column(name = "member_idx")
	private Integer memberIdx;
	
	@Column(name = "is_attend")
	private Integer isAttend;
}
