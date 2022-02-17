package top.jer.bootbase.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Jer.
 * @CreateTime 2022/2/17 14:46
 * @Other Info
 */
@SpringBootTest
public class HelloServiceTest {
    @Autowired
    HelloService helloService;

    @Test
    void testHelloService(){
        String str = helloService.hello();
        System.out.println(str);
    }

}
