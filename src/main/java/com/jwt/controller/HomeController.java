package com.jwt.controller;

import com.jwt.model.JWTRequest;
import com.jwt.model.JWTResponse;
import com.jwt.service.UserService;
import com.jwt.util.JWTUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final JWTUtil jwtUtil;

    private final AuthenticationManager authenticationManager;

    private final UserService userService;

    @GetMapping("")
    public String getHome() {
        return "Welcome to JWT Demo";
    }

    @PostMapping("authenticate")
    public JWTResponse authenticate(@RequestBody JWTRequest request) {
        return new JWTResponse();
    }
}
