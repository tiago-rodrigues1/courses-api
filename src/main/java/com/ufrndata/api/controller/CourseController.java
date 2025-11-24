package com.ufrndata.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufrndata.api.domain.course.Course;
import com.ufrndata.api.repositories.CourseRepository;

@RestController
@RequestMapping("/course")
public class CourseController {
  @Autowired
  private CourseRepository courseRepository;

  @PostMapping
  private ResponseEntity<Course> createCourse(@RequestBody Course newCourseRequest) {
    Course savedCourse = courseRepository.save(newCourseRequest);
    return ResponseEntity.ok(savedCourse);
  }
}
