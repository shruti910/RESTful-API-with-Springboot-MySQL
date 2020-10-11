
package com.demo.project;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
class DepartmentService {
     @Autowired
    private DeptRepository deptrepo;

    Department getDepartment(int id) {
 
   
         return deptrepo.findById(id).get();
    
    
    }

    List<Department> getAllDepartments() {
       
         List<Department> departmentList= new ArrayList<>();
	deptrepo.findAll().forEach(departmentList::add);
        return departmentList;
    }

    Department addDepartment(Department department) {
       
        return deptrepo.save(department);
    }

    Department updateDepartment(Department department) {
        
        return deptrepo.save(department); 
    }

    void deleteById(int id) {
      
     deptrepo.deleteById(id);
    }
    
}
