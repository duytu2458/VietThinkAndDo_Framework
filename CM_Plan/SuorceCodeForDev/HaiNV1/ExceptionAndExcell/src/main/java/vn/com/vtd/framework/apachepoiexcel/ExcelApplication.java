package vn.com.vtd.framework.apachepoiexcel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class ExcelApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(ExcelApplication.class, args);
    }
}
