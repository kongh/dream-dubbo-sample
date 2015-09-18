package com.coder.dream.web.controller;

import com.coder.dream.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/9/18.
 */
@Controller
@RequestMapping(value = "/consumer")
public class DubboConsumerController {

    @Resource(name = "demoServiceConsumer")
    private DemoService demoService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return demoService.sayHello("hello");
    }
}
