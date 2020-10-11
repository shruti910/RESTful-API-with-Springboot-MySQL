
package com.demo.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dept")  //if we don't specify the table name here, Hibernate will make a Table "department" in DB
public class Department {

    
        @Id
        @Column(name="deptNo")
	private int id;
        @Column(name="deptName")
	private String name;
                
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
     public Department() {
        
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }
     
     

     
	  
	 
    
}
