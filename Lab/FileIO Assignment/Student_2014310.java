package com.shadmansakib;

public class Student_2014310 {
  
  private String first_name, last_name, id;
  private double cgpa, attendanceMarks, quiz1, quiz2, quiz3, midTerm, finalTerm, project;
  
  public Student_2014310() {
    
    this.first_name = getFirst_name();
    this.last_name = getLast_name();
    this.id = getId();
    this.cgpa = getCgpa();
    this.attendanceMarks = getAttendanceMarks();
    this.quiz1 = getQuiz1();
    this.quiz2 = getQuiz2();
    this.quiz3 = getQuiz3();
    this.midTerm = getMidTerm();
    this.finalTerm = getFinalTerm();
    this.project = getProject();
    
  }
  
  public String getFirst_name() {
    return first_name;
  }
  
  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }
  
  public String getLast_name() {
    return last_name;
  }
  
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public double getCgpa() {
    return cgpa;
  }
  
  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }
  
  public double getAttendanceMarks() {
    return attendanceMarks;
  }
  
  public void setAttendanceMarks(double attendanceMarks) {
    this.attendanceMarks = attendanceMarks;
  }
  
  public double getQuiz1() {
    return quiz1;
  }
  
  public void setQuiz1(double quiz1) {
    this.quiz1 = quiz1;
  }
  
  public double getQuiz2() {
    return quiz2;
  }
  
  public void setQuiz2(double quiz2) {
    this.quiz2 = quiz2;
  }
  
  public double getQuiz3() {
    return quiz3;
  }
  
  public void setQuiz3(double quiz3) {
    this.quiz3 = quiz3;
  }
  
  public double getMidTerm() {
    return midTerm;
  }
  
  public void setMidTerm(double midTerm) {
    this.midTerm = midTerm;
  }
  
  public double getFinalTerm() {
    return finalTerm;
  }
  
  public void setFinalTerm(double finalTerm) {
    this.finalTerm = finalTerm;
  }
  
  public double getProject() {
    return project;
  }
  
  public void setProject(double project) {
    this.project = project;
  }
  
  @Override
  public String toString() {
    
    return   "First Name: " + first_name + "\n" +
             "Last Name: " + last_name + "\n" +
             "ID: " + id + "\n" +
             "CGPA: " + cgpa + "\n" +
             "Attendance Marks: " + attendanceMarks + "\n" +
             "Quiz1: " + quiz1 + "\n" +
             "Quiz2: " + quiz2 + "\n" +
             "Quiz3: " + quiz3 + "\n" +
             "MidTerm: " + midTerm + "\n" +
             "FinalTerm: " + finalTerm + "\n" +
             "Project: " + project + "\n\n";
  }
}
