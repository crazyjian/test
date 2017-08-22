package com.hujian.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hujian.entity.Student;
import com.hujian.service.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "index";
	}
	
	@RequestMapping(value="/find")
	public String find(@RequestParam(value="id",required=true)String id,Model model) {
		return null;
	}
	
	@RequestMapping(value="/save")
	@ResponseBody
	public Map<String,Object> find(@Valid @ModelAttribute Student student,BindingResult br) {
		Map<String, Object> result = new HashMap<String, Object>();
		if(br.hasErrors()){
			result.put("flag", false);
			List<FieldError> errors = br.getFieldErrors();
			String errormsg = "";
			for (FieldError error : errors) {
				errormsg += error.getDefaultMessage();
			}
			result.put("msg", errormsg);
			return result;
		}
		studentService.save(student);
		result.put("flag", true);
		return result;
	}
}
