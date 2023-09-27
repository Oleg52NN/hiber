package com.example.hiber.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

    @Configuration
    @EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true, jsr250Enabled = true)
    public class SecurityMethodConfiguration extends WebSecurityConfigurerAdapter {

        @Bean
        public PasswordEncoder encoder() {
            return new BCryptPasswordEncoder();
        }

        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                    .withUser("Max")
                    .password(encoder().encode("pass"))
                    .roles("read")
                    .and()
                    .withUser("Peter")
                    .password(encoder().encode("pass1"))
                    .roles("write")
                    .and()
                    .withUser("Ivan")
                    .password(encoder().encode("pass2"))
                    .roles("read", "write")
                    .and()
                    .withUser("John")
                    .password(encoder().encode("pass3"))
                    .roles("read", "write", "delete");
        }
}
