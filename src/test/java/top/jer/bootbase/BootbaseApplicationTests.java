package top.jer.bootbase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.jer.bootbase.service.HelloService;

@SpringBootTest
class BootbaseApplicationTests {
    @Autowired
    HelloService helloService;


    @Test
    void contextLoads() {

    }

    @Test
    void testHelloService(){
        String str = helloService.hello();
        System.out.println(str);
    }

}
