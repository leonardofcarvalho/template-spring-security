package br.org.template.model;

import java.util.Calendar;

import javax.validation.constraints.Size;

public class Task {
	private Long id;
	
	@Size(min=5, message = "{short.desc}")
	private String desc;
	private boolean done;
	private Calendar doneDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Calendar getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(Calendar doneDate) {
		this.doneDate = doneDate;
	}
}
