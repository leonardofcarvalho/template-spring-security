package br.org.template.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.org.template.model.Task;

@Controller
public class TasksController {
	@RequestMapping("/helloWorldSpring")
	public String helloWorld() {

		System.out.println("Executing logic..");
		return "ok";
	}

	@RequestMapping("newTask")
	public String form() {
		return "task/form";
	}

	@RequestMapping("addTask")
	public String adiciona(@Valid Task tasks, BindingResult result) {

		if (result.hasFieldErrors("desc")) {
			return "task/form";
		}
		// add task
		return "task/added";
	}

}
