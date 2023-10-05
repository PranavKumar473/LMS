package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repositories.CourseRepository;
import com.learnSphere.repositories.LessonRepository;

@Service
public class StudentServiceImplementation 
				implements StudentService{
	@Autowired
	CourseRepository repo;
	@Autowired
	LessonRepository lrepo;
	@Override
	public List<Course> fetchCourseList() {
		return repo.findAll();
	}
	@Override
	public Course fetchCourse(int courseId) {
		return repo.findByCourseId(courseId);
	}
	//modification
	@Override
	public Lesson getLesson(int lessonId) {
		return lrepo.findByLessonId(lessonId);
	}
	
}
