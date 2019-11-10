package zhc.life.com.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zhc.life.com.community.service.StudentSerivce;
import zhc.life.com.community.vo.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@RestController
public class HelloWorldController {
    @Autowired
    private StudentSerivce studentSerivce;
    @GetMapping("/hello")
    //@RequestMapping("/hello")
    public String HelloWorld(){
        Map<String,String> map = new HashMap<>();
        LOGGER.info("测试");
        Student student = new Student();
        studentSerivce.insert(student);
        List<Student> result = studentSerivce.selectAll();
        LOGGER.info("返回结果" + result);
        return "Hello World!";
    }
}
