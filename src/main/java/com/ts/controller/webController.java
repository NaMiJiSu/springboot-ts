package com.ts.controller;


import com.ts.mapper.EmployeeMapper;
import com.ts.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.OpenOption;
import java.util.*;

@Controller
public class webController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/welcome.html")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/member-list.html")
    public String emplist(Model model){
        Collection<Employee> employees = employeeMapper.queryEmpList();
        model.addAttribute("emps",employees);
        return "member-list";
    }
    @GetMapping("/member-add.html")
    public String empAdd(){
        return "member-add";
    }

    @PostMapping("/member-add.html")
    public String empPostAdd(Employee employee){
        System.out.println(employee);
        int i = employeeMapper.EmpAdd(employee);
        System.out.println(i);
        return "redirect:/";
    }


    @GetMapping("/member-edit.html/{id}")
    public String empUpdate(@PathVariable("id") int id,Model model){
        Employee employee = employeeMapper.queryById(id);

        System.out.println(employee);
        model.addAttribute("emp",employee);
        return "member-edit";
    }

    @PostMapping("/member-edit.html")
    public String empUpdate(Employee employee){
        System.out.println(employee);
        employeeMapper.EmpUpdate(employee);
        return "redirect:/";
    }




//
//   @RequestMapping("/member-list.html")
//    public String memberList(){
//        return "member-list";
//    }

//    @RequestMapping("/member-list1.html")
//    public String memberList1(){
//        return "member-list1";
//    }
}
