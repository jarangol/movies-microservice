package co.edu.eafit.moviesapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MoviesService moviesService() {
        return new MoviesService();
    }
}
