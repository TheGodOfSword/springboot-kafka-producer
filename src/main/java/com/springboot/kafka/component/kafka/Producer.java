/**
 * Copyright (C), 2015-2017, tsfa
 * FileName: Producer.java
 * Author:   chin
 * Date:     2018/8/22    下午4:53
 * Description:
 * History: 修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间      版本号        描述
 */
package com.springboot.kafka.component.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Kafka生产者组件<br>
 * 〈功能详细描述〉
 *
 * @author Chin
 * @since 1.0
 */
@Component
public class Producer {

    public static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String payload) {
        LOGGER.info("send msg topic=[{}],payload=[{}]", topic, payload);

        kafkaTemplate.send(topic, payload);

        LOGGER.info("send over !");
    }

}
