import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplateTest {

    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_01.xml");

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        String sql = "insert into students (id, name, gender, age, class) values (?,?,?,?,?) ";

        int rows = jdbcTemplate.update(sql, 22, "蒋晨光", "男",35, "三年二班");
        System.out.println(rows);

        sql = "select * from students where id = ?";
        Student stu1 = jdbcTemplate.queryForObject(sql, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("id"));
                student.setGender(rs.getString("gender"));
                student.setClasses(rs.getString("class"));
                return student;
            }
        }, 1);
        System.out.println(stu1);



    }
}
