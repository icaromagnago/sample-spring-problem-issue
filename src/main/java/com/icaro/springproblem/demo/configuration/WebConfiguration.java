package com.icaro.springproblem.demo.configuration;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.zalando.problem.ProblemModule;
import org.zalando.problem.violations.ConstraintViolationProblemModule;

import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		ObjectMapper mapper = Jackson2ObjectMapperBuilder.json()
				.modules(new ProblemModule(), new ConstraintViolationProblemModule())
				.build();

		converters.add(new MappingJackson2HttpMessageConverter(mapper));
	}

}