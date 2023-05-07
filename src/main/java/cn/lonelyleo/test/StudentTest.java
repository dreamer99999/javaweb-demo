package cn.lonelyleo.test;

import cn.lonelyleo.domain.Student;
import cn.lonelyleo.mapper.StudentMapper;
import cn.lonelyleo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void test() {
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.getStudentList();
        session.close();
    }
}
