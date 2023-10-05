package com.learnSphere.services;

import java.util.List;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;

public interface TrainerService {
	String addCourse(Course course);
	List<Course> fetchAllCourses();
	String addLesson(Lesson lesson);
	String saveCourse(Course course);
}
