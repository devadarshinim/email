package com.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
  static HashMap<String, String> users = new HashMap<String, String>();

  static HashMap<String, List<String>> userdata = new HashMap<String, List<String>>();

  /*public List<String> getUserData(String name)
    {
        return this.userdata.get(name);
    }
    public void setUserData(String dob, String name, String studentId )
    {
        List<String> data=new ArrayList<String>();
        data.add(dob);
        data.add(name);
        data.add(studentId);
        this.userdata.put(name, data);
    }
	
    public HashMap<String,String> getUser()
 {
     return this.users;
 }
 public void setUser(String name, String password )
 {
     this.users.put(name, password);
 }
*/
  private String name;
  private String studentId;
  private String passWord;
  private String dob;
  private String email;
  private String phone;

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPhone() {
    return phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setId(String studentId) {
    this.studentId = studentId;
  }

  public String getId() {
    return studentId;
  }

  public void setdob(String dob) {
    this.dob = dob;
  }

  public String getdob() {
    return dob;
  }

  public void setpassWord(String passWord) {
    this.passWord = passWord;
  }

  public String getpassWord() {
    return passWord;
  }

  public static List<String> getUserValue() {
    List<String> Value = new ArrayList<>();
    for (List<String> lis : userdata.values()) {
      Value.addAll(lis);
      System.out.println(Value);
    }
    return Value;
  }
  /*
List<String> users=  new ArrayList<String>();
users.addAll(userdata.keySet()); 
 return users;
}*/
}
