package zhc.life.com.community.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zhc.life.com.community.vo.Student;

import java.util.List;
@Mapper
public interface StudentDao {
    @Select("select id,uid,name,score from score")
    List<Student> selectAll();

    @Insert("INSERT INTO SCORE(uid,name,score) VALUES(#{uid},#{name},#{score})")
    int insert(Student student);
}

