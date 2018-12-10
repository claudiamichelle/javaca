package javaca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javaca.model.StudentCourse;


public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {

}
