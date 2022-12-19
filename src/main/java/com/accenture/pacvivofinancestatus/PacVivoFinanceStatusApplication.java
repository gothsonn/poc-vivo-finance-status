package com.accenture.pacvivofinancestatus;

import com.accenture.pacvivofinancestatus.configurations.LocalDateConverter;
import com.accenture.pacvivofinancestatus.configurations.LocalDateTimeConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {
		"com.accenture.pacvivofinancestatus",
		"com.accenture.pacvivofinancestatus.api" ,
		"com.accenture.pacvivofinancestatus.configurations"
})
public class PacVivoFinanceStatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacVivoFinanceStatusApplication.class, args);
	}

	@Configuration
	static class MyConfig extends WebMvcConfigurerAdapter {
		@Override
		public void addFormatters(FormatterRegistry registry) {
			registry.addConverter(new LocalDateConverter("yyyy-MM-dd"));
			registry.addConverter(new LocalDateTimeConverter("yyyy-MM-dd'T'HH:mm:ss.SSS"));
		}
	}
}
