package team.ict.recruit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
public class EceptionConfiguration {
    public EceptionConfiguration() {
    }

    @Bean
    public Intercepter loginInterceptor() {
        return new Intercepter();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.loginInterceptor()).addPathPatterns(new String[]{"/**"});
    }
}
