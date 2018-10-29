package com.flynetion.bill.manager.controller;

import com.flynetion.bill.manager.bean.vo.UserRespVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public UserRespVO get(){
      return new UserRespVO("张三",55,"555@qq.com")  ;
    }

    /**
     * 获取所有用户
     * @param model
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listAllUser(Model model){
        List<UserRespVO> userList= new ArrayList<>();
        for (int i=0;i<10;i++){
            userList.add(new UserRespVO("张三+i",i,i+"@qq.com"));
        }

        model.addAttribute("users",userList);
        return "/user/list";
    }



}
