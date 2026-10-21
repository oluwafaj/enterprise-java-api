package com.enterprise.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String redirectToStatus() {
        return "redirect:/api/v1/status";
    }
}
