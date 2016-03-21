package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

UUID SectionID;
UUID StudentID;
UUID EnrollmentID;
double Grade;
public UUID getSectionID() {
	return SectionID;
}
private void setSectionID(UUID sectionID) {
	SectionID = sectionID;
}
public UUID getStudentID() {
	return StudentID;
}
public void setStudentID(UUID studentID) {
	StudentID = studentID;
}
public UUID getEnrollmentID() {
	return EnrollmentID;
}


public double getGrade() {
	return Grade;
}
private double setGrade(double grade) {
	Grade =  com.cisc181.core.Course.GradePoints;
}
private Enrollment() {

}


private Enrollment1 (StudentID , SectionID){
	SectionID = getSectionID();
	StudentID = getStudentID();
	EnrollmentID = enrollmentID;
}

}
