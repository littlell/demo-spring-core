package com.demo.spring.core21;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
public class SimpleProfiler {

  @Pointcut("execution(* com.demo.spring.core21.FooService.getFoo(..))")
  private void theExecutionOfSomeFooServiceMethod() {
  }

  @Before("theExecutionOfSomeFooServiceMethod()")
  public void profilerBefore() throws Throwable {
    System.out.println("profiler before");
  }

  @After("theExecutionOfSomeFooServiceMethod()")
  public void profilerAfter() throws Throwable {
    System.out.println("profiler after");
  }

  @AfterReturning("theExecutionOfSomeFooServiceMethod()")
  public void profilerAfterReturning() throws Throwable {
    System.out.println("profiler after returning");
  }

  @AfterThrowing("theExecutionOfSomeFooServiceMethod()")
  public void profilerException() throws Throwable {
    System.out.println("profiler exception");
  }

  @Around("theExecutionOfSomeFooServiceMethod()")
  @Order(1)
  public Object profilerAround(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("profiler around start");
    Object obj = joinPoint.proceed();
    System.out.println("profiler around end");
    return obj;
  }
}
