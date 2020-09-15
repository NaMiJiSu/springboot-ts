package com.ts.pojo;


import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {


    private Integer id;
    private String name;
    private int  sex;
    private String tel;
    private String address;

}
