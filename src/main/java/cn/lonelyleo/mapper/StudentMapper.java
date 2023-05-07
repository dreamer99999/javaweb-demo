package cn.lonelyleo.mapper;

import cn.lonelyleo.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getStudentList();
    @Select("select * from student where Sno = #{sno}")
    List<Student> getStudent(@Param("sno") String sno);
}
