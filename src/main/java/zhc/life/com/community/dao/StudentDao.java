package zhc.life.com.community.dao;

import org.springframework.stereotype.Repository;
import zhc.life.com.community.vo.Student;

import java.util.List;
@Repository
public interface StudentDao {

    List<Student> selectAll();
}

