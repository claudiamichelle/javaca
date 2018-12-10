package javaca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaca.model.LecturerCourse;
import javaca.repository.LecturerCourseRepository;

@Service
public class LecturerCourseService {
	@Autowired
	LecturerCourseRepository lecturerCourseRepository;

	public List<LecturerCourse> findAll() {
		return lecturerCourseRepository.findAll();
	}

}
