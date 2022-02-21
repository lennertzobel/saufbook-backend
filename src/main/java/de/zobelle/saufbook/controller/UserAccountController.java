package de.zobelle.saufbook.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAccountController {
    @GetMapping("hello")
    @PreAuthorize("isAuthenticated()")
    public String hello() {
        return "Hello World";
    }
}
