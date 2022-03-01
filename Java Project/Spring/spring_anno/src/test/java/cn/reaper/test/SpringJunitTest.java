package cn.reaper.test;

import cn.reaper.config.SpringCofiguration;
import cn.reaper.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringCofiguration.class})
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void Test() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
    }
}
