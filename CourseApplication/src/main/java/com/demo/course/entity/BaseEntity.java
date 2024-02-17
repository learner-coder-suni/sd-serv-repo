package com.demo.course.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BaseEntity {
	
	private String createdUser;
	private String updatedUser;
	private Timestamp createTms;
	private Timestamp updateTms;

}
