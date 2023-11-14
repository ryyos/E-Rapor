package com.erapor.erapor.configuration;

import com.erapor.erapor.utils.Converter;
import jakarta.validation.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class UtilsConfiguration {

    @Bean
    public Converter converter(){
        return new Converter();
    }

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}
