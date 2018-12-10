package javaca.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javaca.model.StudentCourse;
import javaca.repository.StudentCourseRepository;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {
	@Resource
	StudentCourseRepository studentCourseRepository;

	@Override
	@Transactional
	public List<StudentCourse> findAll() {
		return studentCourseRepository.findAll();
	}

}
