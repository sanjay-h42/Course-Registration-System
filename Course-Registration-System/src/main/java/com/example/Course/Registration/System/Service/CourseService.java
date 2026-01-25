package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Repository.CourseRegistryRepo;
import com.example.Course.Registration.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseRegistryRepo courseRegistryRepo;

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public List<CourseRegistry> getEnrolledStudentList() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String coursename, String emailid) {
        CourseRegistry registry = new CourseRegistry(name, emailid, coursename);
        courseRegistryRepo.save(registry);
    }
}