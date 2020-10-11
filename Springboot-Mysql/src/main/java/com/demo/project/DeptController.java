
package com.demo.project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/department")
public class DeptController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(value = "/{id}")
    public @ResponseBody
    Department getDepartment(@PathVariable("id") int id) throws Exception {

        return departmentService.getDepartment(id);
    }

    @GetMapping(value = "/")
    public @ResponseBody
    List<Department> getAllDepartments() throws Exception {
        return departmentService.getAllDepartments();
    }

    @PostMapping(value = "/")
    public @ResponseBody
    Department addDepartment(@RequestBody Department department) {

        return departmentService.addDepartment(department);
    }


    @PutMapping(value = "/")
    public @ResponseBody
    Department updateDepartment(@RequestBody Department department) {

        return departmentService.updateDepartment(department);
    }


    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void deleteById( @PathVariable("id") int id) {

        departmentService.deleteById(id);

    }

}
