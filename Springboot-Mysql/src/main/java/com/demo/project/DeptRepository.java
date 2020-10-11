
package com.demo.project;

import org.springframework.data.repository.CrudRepository;


public interface DeptRepository extends CrudRepository<Department, Integer> {
    
}
