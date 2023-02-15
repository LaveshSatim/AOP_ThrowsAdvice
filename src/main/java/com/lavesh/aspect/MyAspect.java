package com.lavesh.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@AfterThrowing(value = "within(com.lavesh.bean.*)", throwing = "exception")
	public void checkForError(JoinPoint joinPoint, IllegalArgumentException exception) {

		System.out.println(
				joinPoint.getSignature().getName() + " message in aspect class : " + exception.getLocalizedMessage());
		System.out.println(
				joinPoint.getSignature().getName() + " message in aspect class : " + exception.getMessage());
		System.out.println(
				joinPoint.getSignature().getName() + " message in aspect class : " + exception.toString());

	}
}
