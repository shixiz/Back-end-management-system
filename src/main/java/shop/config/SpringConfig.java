package shop.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"shop.dao","shop.service"})
@PropertySource("classpath:druid.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
