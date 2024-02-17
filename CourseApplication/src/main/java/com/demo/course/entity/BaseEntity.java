package com.demo.course.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BaseEntity {
	
	@Column(name="CREATED_BY")
	private String createdUser;
	@Column(name="UPDATED_BY")
	private String updatedUser;
	@Column(name="CREATED_TMS")
	private Timestamp createTms;
	@Column(name="UPDATED_TMS")
	private Timestamp updateTms;

}
