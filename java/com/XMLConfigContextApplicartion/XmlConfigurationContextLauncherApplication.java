package com.XMLConfigContextApplicartion;

import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		try(var context =
				new ClassPathXmlApplicationContext("contextConfiguration.xml"))
		{Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
	}

}
