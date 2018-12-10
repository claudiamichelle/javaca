package javaca.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javaca.model.LecturerCourse;
import javaca.repository.LecturerCourseRepository;

@Service
public class LecturerCourseServiceImpl implements LecturerCourseService {
	@Resource
	LecturerCourseRepository lecturerCourseRepository;

	@Override
	@Transactional
	public List<LecturerCourse> findAll() {
		return lecturerCourseRepository.findAll();
	}

}
