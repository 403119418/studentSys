package com.hudongwx.studentsys.model;

import com.hudongwx.studentsys.common.BaseStudent;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Student extends BaseStudent<Student> {
	public static final Student dao = new Student();
	public static final String SEARCH_FROM_STUDENT = "select * from student ";
}
