package zhc.life.com.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhc.life.com.community.dao.StudentDao;
import zhc.life.com.community.service.StudentSerivce;
import zhc.life.com.community.vo.Student;

import java.util.List;
@Service
public class StudentSerivceImpl implements StudentSerivce {
    @Autowired
    StudentDao studentDao;
    @Override
    public List<Student> selectAll() {
        List<Student> result = studentDao.selectAll();
        return result;
    }

    @Override
    public int insert(Student student) {
//        student.setName("李四");
//        student.setScore(85);
//        student.setUid(2);
        int count = studentDao.insert(student);
        return count;
    }

}
