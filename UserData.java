package com.exam;

import com.google.gson.Gson;

public class UserData {
private String msg;
private String name;
private String studentId;
private String passWord;
private String dob;
private String email;
private String phone;
  public UserData(String msg, String name,
  String studentId,
  String passWord,
  String dob,
  String email,
  String phone){
    super();
    this.msg= msg;
    this.name=name;
    this.studentId=studentId;
    this.passWord=passWord;
    this.dob=dob;
    this.email=email;
    this.phone=phone;
  }
 public String getMsg(){
   return msg;
 
 }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setpassWord(String passWord) {
    this.passWord = passWord;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getaPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
  
}
