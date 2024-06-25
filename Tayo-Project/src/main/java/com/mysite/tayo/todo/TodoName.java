package com.mysite.tayo.todo;

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
@Table(name = "todo_name")
public class TodoName {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_name_seq")
	@SequenceGenerator(name = "todo_name_seq", sequenceName = "TODO_NAME_SEQ", allocationSize = 1)
	@Column(name = "todo_name_idx")
	private Long todoNameIdx;
	
	@Column(name = "todo_idx")
	private Integer todoIdx;
	
	@Column(name = "todo_name", length = 100)
	private String todoName;
	
	@Column(name = "todo_manager_idx")
	private Integer todoManagerIdx;
	
	@Column(name = "is_finished")
	private Integer isFinished;
	
	@Column(name = "deadline")
	private Date deadline;
}
