package com.devsuperior.sendemail.config;

import com.devsuperior.sendemail.services.EmailService;
import com.devsuperior.sendemail.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
