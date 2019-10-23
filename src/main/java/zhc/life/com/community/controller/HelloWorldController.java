package zhc.life.com.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import zhc.life.com.community.service.StudentSerivce;

import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@RestController
public class HelloWorldController {
    @Autowired
    private StudentSerivce studentSerivce;
    //@GetMapping("/hello")
    @RequestMapping("/hello")
    public String HelloWorld(){
        return "Hello World!";
    }
}
