package com.dkit.domain;

import lombok.Data;

@Data
public class Student {
	private String uname;
	private String pwd;
	private String email;
	private String gender;
	private Long phno;
	private String course;
	private String[] preferrableTimings;
}
