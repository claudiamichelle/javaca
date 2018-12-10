package javaca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javaca.model.LecturerCourse;
import javaca.service.LecturerCourseServiceImpl;

@Controller
public class LecturerViewController {
	@Autowired
	private LecturerCourseServiceImpl service;

	@RequestMapping(value = "/lecturer-course", method = RequestMethod.GET)
	public ModelAndView getAll() {

		List<LecturerCourse> list = service.findAll();
		ModelAndView mav = new ModelAndView("lecturer-course");
		mav.addObject("list", list);
		return mav;
	}
}
