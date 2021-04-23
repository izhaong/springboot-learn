package com.imooc.springbootlearn;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParaController {
    @GetMapping({"/firstRequest"})
    public String firstRequest() {
        return "第一个接口";
    }
}
