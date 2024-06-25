package com.mysite.tayo.todo;

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
@Table(name = "todo_member")
public class TodoMember {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_member_seq")
	@SequenceGenerator(name = "todo_member_seq", sequenceName = "TODO_MEMBER_SEQ", allocationSize = 1)
	@Column(name = "todo_member_idx")
	private Long todoMemberIdx;
	
	@Column(name = "todoname_idx")
	private Integer todonameIdx;
	
	@Column(name = "member_idx")
	private Integer memberIdx;
	
	@Column(name = "is_done")
	private Integer isDone;
}

