package com.mysite.tayo.vote;

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
@Table(name = "voter")
public class Voter {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "voter_seq")
	@SequenceGenerator(name = "voter_seq", sequenceName = "VOTER_SEQ", allocationSize = 1)
	@Column(name = "voter_idx")
	private Long voterIdx;
	
	@Column(name = "member_idx")
	private Integer memberIdx;
	
	@Column(name = "vote_item_idx")
	private Integer voteItemIdx;
	
	@Column(name = "vote_idx")
	private Integer voteIdx;
}
