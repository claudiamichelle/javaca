package javaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javaca.model.Course;
import javaca.model.LecturerCourse;

public interface CourseRepository  extends JpaRepository<Course, Integer> {

}
