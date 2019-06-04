package org.lotus.loach.user.controller;

import org.lotus.loach.common.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/info")
    public ResponseEntity<Response<String>> userInfo() {
        return ResponseEntity.ok(Response.create().ok("Hello"));
    }
}
