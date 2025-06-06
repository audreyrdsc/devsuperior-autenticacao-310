package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//Define configurações através de métodos
@Configuration
public class SecurityConfig {

    //Criptografia da senha
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean  //metodo para controle de acesso global
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()); //desabilita proteção contra ataques csrf - aplicação que grava dados na sessão, diferente de API que não guarda
        http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); //configura permissão para as requisições - endpoints
        return http.build();
    }

}