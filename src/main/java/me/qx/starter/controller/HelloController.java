package me.qx.starter.controller;

import me.qx.starter.entity.User;
import me.qx.starter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/start")
    @ResponseBody
    public String hello(){
        String msg = "hello ";
        List<User> users = userMapper.queryAll();
        for (User u:users){
            msg += u.toString()+" ";
        }
        return msg;
    }
}
