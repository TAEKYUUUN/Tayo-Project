package com.mysite.tayo.paragraph;

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
@Table(name = "paragraph")
public class Paragraph {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paragraph_seq")
    @SequenceGenerator(name = "paragraph_seq", sequenceName = "PARAGRAPH_SEQ", allocationSize = 1)
    @Column(name = "paragraph_idx")
	private Long paragraphIdx;
	
	@Column(name = "paragraph_post_idx")
	private Integer paragraphPostIdx;
	
	@Column(name = "title", length = 100)
	private String title;
	
	@Column(name = "file_name", length = 100)
	private String fileName;
	
	@Lob
    @Column(name = "contents", columnDefinition = "CLOB")
	private String contents;
	
	@Column(name = "open_range")
	private Integer openRange;
}
