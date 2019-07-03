package com.wonder.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wonder.hotel.interceptor.LoginHandlerInterceptor;

@Configuration
public class SpringMvcConig {
	@Bean
	// 所有的WebMvcConfigurerAdapter组件都会一起起作用 2 @Bean //将组件注册在容器 3
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/main.html").setViewName("dashboard");
			}

			// 注册拦截器
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				// super.addInterceptors(registry);
				// 静态资源； *.css , *.js
				// SpringBoot已经做好了静态资源映射
				registry.addInterceptor(new LoginHandlerInterceptor())
				.addPathPatterns("/sys/*","/greenn/main").excludePathPatterns("/","/greenn/login");
			
			}
		};
		return adapter;
	}
}
