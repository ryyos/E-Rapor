package com.erapor.erapor.configuration;

import com.erapor.erapor.utils.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilsConfiguration {

    @Bean
    public Converter converter(){
        return new Converter();
    }
}
