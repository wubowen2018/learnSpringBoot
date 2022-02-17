package top.jer.bootbase.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jer.
 * @CreateTime 2022/2/17 13:45
 * @Other Info
 */
@RestController
@Component
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
