package com.demo.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.course.entity.CourseDetail;

public interface CourseRepository extends JpaRepository<CourseDetail, Integer>{

}
