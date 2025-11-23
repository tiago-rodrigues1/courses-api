package com.ufrndata.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufrndata.api.domain.course.Course;

public interface CourseRepository extends JpaRepository<Course, UUID> {

}
