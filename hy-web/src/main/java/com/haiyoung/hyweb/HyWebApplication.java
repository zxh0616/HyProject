package com.haiyoung.hyweb;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class HyWebApplication {

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
//		SpringApplication.run(HyWebApplication.class, args);
		SpringApplication application = new SpringApplication(HyWebApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
