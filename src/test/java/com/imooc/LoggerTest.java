package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author PGOne
 * @date 2018/12/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {

    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
//        log.debug("debug...");
//        log.info("name: " + name + " ,password: " + password);
//        log.info("name: {}, password: {}", name, password);
//        log.error("error...");
//        log.warn("warn...");
    }
}