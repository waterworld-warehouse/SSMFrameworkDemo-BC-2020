package com.zd.controller;

import com.zd.domain.Role;
import com.zd.domain.UserInfo;
import com.zd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ProjectName: SSM_Demo1
 * @Package: com.zd.controller
 * @ClassName: UserController
 * @Author: 晴天
 * @Date: 2020/4/10 17:05
 * @Version: 1.0
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //用户添加
    @RequestMapping("/save.do")
    @PreAuthorize("authentication.principal.username == 'tom'")
    public String save(UserInfo userInfo) throws Exception{
        userService.save(userInfo);
        return "redirect:findAll.do";
    }


    //查询所有用户
    @RequestMapping("/findAll.do")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ModelAndView findAll() throws Exception{
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        mv.addObject("userList",userList);
        mv.setViewName("user-list");
        return mv;
    }

    //查询用户详情
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception{
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo =  userService.findById(id);
        mv.addObject("user",userInfo);
        mv.setViewName("user-show1");
        return mv;
    }

    //查询用户以及用户可以添加的角色
    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true) String userId)throws Exception{
        ModelAndView mv = new ModelAndView();
        //1.根据用户id查询用户
        UserInfo userInfo = userService.findById(userId);
        //2.根据用户id查询可以添加的角色
        List<Role> otherRoles = userService.findOtherRoles(userId);
        mv.addObject("user",userInfo);
        mv.addObject("roleList",otherRoles);
        mv.setViewName("user-role-add");
        return mv;
    }

    //给用户添加角色
    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId",required = true) String userId,@RequestParam(name = "ids",required = true)String[] roleIds)throws Exception{
        userService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }
}
