package com.ts.controller;

import com.ts.mapper.EmployeeMapper;
import com.ts.mapper.UserMapper;
import com.ts.pojo.Employee;
import com.ts.pojo.Tppper;
import com.ts.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class MybatisController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private EmployeeMapper employeeMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList() {
        List<User> userList = userMapper.queryUserList();

        return userList;
    }


    @GetMapping("/queryById")
    public User queryById() {
//        User user = userMapper.queryById(1);
        return userMapper.queryById(1);
    }

    //
    @GetMapping("/addUser")
    public String addUser() {
//        return Optional.ofNullable(user)
//                .map()


        userMapper.addUser(new User(11, "wwwmmm"));
        return "addUser-ok";
    }

    @GetMapping("/updateUser")
    public String updateUser() {
        userMapper.updateUser(new User(11, "awsl"));
        return "updateUser-ok";


    }

    @GetMapping("/deleteUser")
    public String deleteUser() {
        userMapper.deleteUser(11);
        return "deleteUser-ok";

    }

    @GetMapping("/qq")
    public String qq(Employee employee) {
        HashMap map = new HashMap();
//        map.put("name","dwadw");
//        map.put("tel","3424324");
//        map.put("address","cdscsfsrf");
        map.put("sex","1");
        System.out.println(employeeMapper.dddd(map));
        return null;
    }

    @GetMapping("/upper")
    public String upper(){
        HashMap map = new HashMap();

        map.put("name","shashini");
        map.put("tel","31233434");
        map.put("id","1");

        System.out.println(employeeMapper.Empupper(map));


        return null;
    }

}
//    @GetMapping("/qq")
//    public String qq(Employee employee){
//        employee.
//        return ;
//    }

