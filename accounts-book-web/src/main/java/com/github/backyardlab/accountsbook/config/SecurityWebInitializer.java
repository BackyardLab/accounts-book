package com.github.backyardlab.accountsbook.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(2)
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer {
	
}