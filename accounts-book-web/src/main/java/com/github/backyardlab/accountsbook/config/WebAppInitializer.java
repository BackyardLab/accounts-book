package com.github.backyardlab.accountsbook.config;

import org.springframework.web.servlet.support.*;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected String[] getServletMappings() {
	return new String[] { "/" };
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
	return new Class<?>[] { RootConfig.class, SecurityConfig.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
	return new Class<?>[] { WebConfig.class };
	}
	
}
