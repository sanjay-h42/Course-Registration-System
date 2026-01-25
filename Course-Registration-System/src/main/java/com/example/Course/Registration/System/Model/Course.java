package com.example.Course.Registration.System.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
public class Course {
    @Id
    private String CourseId;
    private String CourseName;
    private String Trainer;
    private int DurationInWeeks;

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public int getDurationInWeeks() {
        return DurationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        DurationInWeeks = durationInWeeks;
    }
}
