package com.guestbook.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Component
public class GuestBook {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="post_no")
	private Integer id;
	
	
	@Column(length=2000)
	private String post;
	
	@CreationTimestamp
	private LocalDateTime writeDate;
	
	private String writer;
}
