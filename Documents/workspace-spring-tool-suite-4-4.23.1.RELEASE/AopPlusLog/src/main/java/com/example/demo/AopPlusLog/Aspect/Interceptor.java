package com.example.demo.AopPlusLog.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Interceptor {

	/*
	 * @Pointcut("execution(* com.example.demo.AopPlusLog.controller.*.*(..))",
	 * returning = "result") public void pc(){
	 * 
	 * }
	 */
	
	@AfterReturning(pointcut = "execution(* com.example.demo.AopPlusLog.controller.*.*(..))", returning = "result")
	public void pc(JoinPoint joinPoint, Object result){
		System.out.println("acs");
		System.out.println(result);
	}
	
	/*
	 * @Before("pc()") public void pointcut (JoinPoint jp) {
	 * System.out.println("pcs"); }
	 */
}
