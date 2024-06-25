package com.mysite.tayo.post;

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
@Table(name = "post")
public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    @SequenceGenerator(name = "post_seq", sequenceName = "POST_SEQ", allocationSize = 1)
    @Column(name = "post_idx")
    private Long postIdx;

    @Column(name = "project_idx")
    private Integer projectIdx;
    
    @Column(name = "member_idx")
    private Integer memberIdx;

    @Column(name = "upload_date")
    private Date uploadDate;

    @Column(name = "file_type")
    private Integer fileType;

    @Column(name = "is_repeated")
    private Integer isRepeated;

    @Column(name = "repeat_until")
    private Date repeatUntil;
 
    @Column(name = "is_fixed")
    private Integer isFixed;
  
    @Column(name = "is_temporary")
    private Integer isTemporary;
  
    @Column(name = "is_revised")
    private Integer isRevised;
}
