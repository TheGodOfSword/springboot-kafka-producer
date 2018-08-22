/**
 * Copyright (C), 2015-2017, tsfa
 * FileName: TestController.java
 * Author:   chin
 * Date:     2018/8/22    下午5:14
 * Description:
 * History: 修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.springboot.kafka.controller;

import com.springboot.kafka.component.kafka.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/v2")
public class TestController {

    public static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);


    @Autowired
    private Producer producer;

    @RequestMapping("/send/{msg}")
    public String sendMsg(@PathVariable("msg") String msg) {

        producer.send("default-topic", msg);

        return "OK";
    }
}
