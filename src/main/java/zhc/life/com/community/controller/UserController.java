package zhc.life.com.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zhc.life.com.community.service.StudentSerivce;
import zhc.life.com.community.vo.Student;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private StudentSerivce studentSerivce;
    @GetMapping("/select")
    public List<Student> selectUser(){
        List<Student> result = studentSerivce.selectAll();
       return result;
    }

    @GetMapping("/insert")
    public String insert(@RequestParam(required = true) String name,@RequestParam(required = true) int uid, int score){
        Student student = new Student();
        student.setUid(uid);
        student.setName(name);
        student.setScore(score);
        studentSerivce.insert(student);
        return "Add success!"+student.toString();
    }
}
