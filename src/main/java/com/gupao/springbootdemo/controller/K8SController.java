package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {

    String result="";

    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8s <br/>111222 333 444 555 666 777 888";
    }
}
