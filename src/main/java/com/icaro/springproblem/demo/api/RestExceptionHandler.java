package com.icaro.springproblem.demo.api;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.ProblemHandling;

@ControllerAdvice
public class RestExceptionHandler implements ProblemHandling {

}
