package org.lotus.loach.user.controller;

import org.lotus.loach.common.Response;
import org.lotus.loach.user.entity.User;
import org.lotus.loach.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户主页api
 *
 * @author: Foy Lian
 * Date: 6/4/2019
 * Time: 4:39 PM
 */
@RestController
@RequestMapping("/user")
public class UserDashboardController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/info")
    public ResponseEntity<Response<String>> userInfo() {
        return ResponseEntity.ok(Response.create().ok("Hello"));
    }

    @GetMapping("/list")
    public Response<List<User>> list() {
        return Response.create().ok(userMapper.selectList(null));
    }

    @GetMapping("/listByNameAndAge")
    public Response<List<User>> listByNameAndAge(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return Response.create().ok(userMapper.selectByNameAndAge(name,age));
    }
}
