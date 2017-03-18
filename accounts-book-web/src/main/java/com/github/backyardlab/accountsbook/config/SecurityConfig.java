package com.github.backyardlab.accountsbook.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
				.password("admin").roles("USER", "ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/login").defaultSuccessUrl("/accounts").and().rememberMe().and().httpBasic().and()
				.authorizeRequests().antMatchers("/accounts").hasRole("USER")
				.antMatchers(HttpMethod.POST, "/adminconsole").hasRole("ADMIN").antMatchers("/login").anonymous()
				.anyRequest().permitAll();

		if ("true".equals(System.getProperty("httpsOnly"))) {
			LOGGER.info("Launching the application in HTTPS-only mode");
			http.requiresChannel().anyRequest().requiresSecure();
		}
	}
}
