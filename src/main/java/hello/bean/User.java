package hello.bean;

import java.util.Date;

public class User {
  private int id;
  private String name;
  private Date date;

  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public Date getDate(){
    return date;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setId(int id){
    this.id = id;
  }
  public void setDate(Date date){
    this.date = date;
  }

  public String toString(){
    return "user: " + id + " " + name + ", createTime=" + date.toString();
  }
  
}




