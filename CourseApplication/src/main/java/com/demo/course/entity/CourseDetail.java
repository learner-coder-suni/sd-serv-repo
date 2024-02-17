package com.demo.course.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="T_COURSE_DTL")
@Data
public class CourseDetail extends BaseEntity{
	@Id
	private Integer courseId;
	@Column(name="COURSE_ID")
	private String title;
	private String description;
	private String duration;
	

}
