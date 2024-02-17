package com.demo.course.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="T_COURSE_DTL")
@Data
public class CourseDetail extends BaseEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer courseId;
	@Column(name="COURSE_TITLE")
	private String title;
	@Column(name="COURSE_DESCRIPTION")
	private String description;
	@Column(name="COURSE_DURATION")
	private String duration;
	

}
