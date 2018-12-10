package javaca.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javaca.model.Login;
import javaca.repository.LecturerCourseRepository;
import javaca.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Resource
	LoginRepository loginRepository;

	@Override
	@Transactional
	public List<Login> findAll() {
		return loginRepository.findAll();
	}

}
