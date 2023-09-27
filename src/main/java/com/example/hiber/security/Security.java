package com.example.hiber.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
public class Security extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("Семён")
//                .password("{noop}pass")
//                .authorities("name")
//                .and()
//                .withUser("Пьер")
//                .password("{noop}pass1")
//                .authorities("age")
//                .and()
//                .withUser("Ольга")
//                .password("{noop}pass2")
//                .authorities("name");
//    }
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.formLogin()
//                .and()
//                .authorizeHttpRequests().antMatchers("/persons/by-city").permitAll()
//                .and()
//                .authorizeHttpRequests().antMatchers("/persons/by-age").hasAuthority("age")
//                .and()
//                .authorizeHttpRequests().antMatchers("/persons/by-name&surname").hasAuthority("name")
//                .and()
//                .authorizeHttpRequests().anyRequest().authenticated();
//    }
}
