package javaca.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javaca.model.User;
import javaca.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserRepository  userRepository;
	
	@Override
	@Transactional
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
