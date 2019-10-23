package zhc.life.com.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhc.life.com.community.dao.StudentDao;
import zhc.life.com.community.service.StudentSerivce;
import zhc.life.com.community.vo.Student;

import java.util.List;
@Service
public class StudentSerivceImpl implements StudentSerivce {

    @Override
    public List<Student> selectAll() {
        //List<Student> result = studentDao.selectAll();
        return null;
    }
}
