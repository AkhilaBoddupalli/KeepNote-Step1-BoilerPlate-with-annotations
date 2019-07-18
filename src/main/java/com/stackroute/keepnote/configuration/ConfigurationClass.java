package com.stackroute.keepnote.configuration;

import org.springframework.context.annotation.ComponentScan;
import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

    @Configuration
    @ComponentScan(basePackages = "com.stackroute.keepnote")
    public class ConfigurationClass
    {
        @Bean
        public Note noteBean()
        {
            return new Note();
        }
        @Bean
        public NoteRepository noteRepositoryBean()
        {
            return new NoteRepository();
        }
        @Bean
        public ViewResolver viewResolver()
        {
            InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
            internalResourceViewResolver.setPrefix("/WEB-INF/views/");
            internalResourceViewResolver.setSuffix(".jsp");
            return internalResourceViewResolver;
        }

    }


