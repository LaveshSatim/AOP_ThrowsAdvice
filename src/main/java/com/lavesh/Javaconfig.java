package com.lavesh;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({ "com.lavesh.aspect", "com.lavesh.bean" })
@EnableAspectJAutoProxy
public class Javaconfig {

}
