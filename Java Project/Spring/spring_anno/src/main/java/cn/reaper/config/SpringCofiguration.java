package cn.reaper.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标准该类是Spring的核心配置类
@Configuration
//扫包 <context:component-scan base-package="cn.reaper"/>
@ComponentScan("cn.reaper")
@Import(DataSourceConfiguration.class)
public class SpringCofiguration {

}
