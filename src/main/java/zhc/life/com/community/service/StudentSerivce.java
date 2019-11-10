package zhc.life.com.community.service;

import org.springframework.stereotype.Service;
import zhc.life.com.community.vo.Student;

import java.util.List;

@Service
public interface StudentSerivce {
    public List<Student> selectAll();
    public int insert(Student student);
}
