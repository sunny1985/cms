package com.xinxinyu.cms.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xinxinyu.framework.pojo.BasePojo;

@Entity
public class UserInfo extends BasePojo{
	 private int age;  
     
	    private int id;  
	    private String name;  
	    public int getAge() {  
	        return age;  
	    }  
	      
	    @Id  
	    @GeneratedValue  
	    public int getId() {  
	        return id;  
	    }  
	    public String getName() {  
	        return name;  
	    }  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
	    public void setId(int id) {  
	        this.id = id;  
	    }  
	      
	    public void setName(String name) {  
	        this.name = name;  
	    }  
}
