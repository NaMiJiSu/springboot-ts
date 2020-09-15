package com.ts.pojo;


import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Tppper {


    @NotNull(message = "dwadaw")
    @NotEmpty(message = "bababa")
    private String name;

    @NotNull
    @Min(value = 0,message = "传入的分数有误")
    @Max(value = 100,message = "传入的分数有误")
    private int id;

    @NotNull
    @NotEmpty
    @Length(min = 11,max = 11,message = "dwad")
    private int tlle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTlle() {
        return tlle;
    }

    public void setTlle(int tlle) {
        this.tlle = tlle;
    }

    @Override
    public String toString() {
        return "Tppper{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tlle=" + tlle +
                '}';
    }

    public Tppper(@NotNull(message = "dwadaw") @NotEmpty(message = "bababa") String name, @NotNull @Min(value = 0, message = "传入的分数有误") @Max(value = 100, message = "传入的分数有误") int id, @NotNull @NotEmpty @Length(min = 11, max = 11, message = "dwad") int tlle) {
        this.name = name;
        this.id = id;
        this.tlle = tlle;
    }
}
