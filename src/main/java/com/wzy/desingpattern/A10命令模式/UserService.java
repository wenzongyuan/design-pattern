package com.wzy.desingpattern.A10命令模式;

public class UserService {

    public void save(User user){

        System.out.println("save user success user name is " + user.getName());
    }

    public void update(User user){

        System.out.println("update user success user name is " + user.getName());
    }

    public void del(User user){

        System.out.println("del user success user name is " + user.getName());
    }

    public void select(User user){

        System.out.println("select user success user name is " + user.getName());
    }
}
