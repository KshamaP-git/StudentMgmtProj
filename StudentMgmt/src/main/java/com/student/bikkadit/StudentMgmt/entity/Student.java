package com.student.bikkadit.StudentMgmt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")

public class Student {
	
	private String stId;
	private String stName;
	

	
}
