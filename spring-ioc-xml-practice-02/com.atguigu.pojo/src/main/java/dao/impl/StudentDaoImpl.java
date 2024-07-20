package dao.impl;

import dao.StudentDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Student> queryAll() {
        String sql = "select id, name, gender, age, class as classes from students";
        List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));

        System.out.println("studentDao:" + students);
        return students;
    }
}
