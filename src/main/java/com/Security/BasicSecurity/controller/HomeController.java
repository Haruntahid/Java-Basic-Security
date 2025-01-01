package com.Security.BasicSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(HttpServletRequest request) {
        return "Hello, it's working!" + request.getRequestURI() + "  token  " + request.getRequestedSessionId();
    }

    @GetMapping("/csrf")
    public CsrfToken csrf(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
