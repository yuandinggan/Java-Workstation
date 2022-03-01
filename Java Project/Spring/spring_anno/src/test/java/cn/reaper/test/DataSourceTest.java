package cn.reaper.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {
    @Test
    public void test4() throws Exception {
        //测试spring容器连接数据源
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = app.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }

    @Test
    public void test3() throws Exception {
        //c3p0测试（加载properties配置文件）
        //读取配置文件
        ResourceBundle rb = ResourceBundle.getBundle("dataSource");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        //手动测试c3p0
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        //连接参数
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        //获取connction
        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        //关闭
        connection.close();


    }

    @Test
    public void test2() throws Exception {
        //手动测试druid
        DruidDataSource dataSource = new DruidDataSource();

        //连接参数
        dataSource.setBreakAfterAcquireFailure(true);
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://rm-wz97b83e3879uy5csso.mysql.rds.aliyuncs.com:3306/test");
        dataSource.setUsername("reaper_mysql2086");
        dataSource.setPassword("Ydg_123456");

        //获取connction
        DruidPooledConnection connection = dataSource.getConnection();

        System.out.println(connection);

        //关闭
        connection.close();
    }

    @Test
    public void test1() throws Exception {
        //手动测试c3p0
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        //连接参数
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://rm-wz97b83e3879uy5csso.mysql.rds.aliyuncs.com:3306/test?useSSL=false");
        dataSource.setUser("reaper_mysql2086");
        dataSource.setPassword("Ydg_123456");

        //获取connction
        Connection connection = dataSource.getConnection();

        System.out.println(connection);

        //关闭
        connection.close();

    }
}
