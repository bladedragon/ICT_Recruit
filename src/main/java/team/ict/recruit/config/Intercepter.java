package team.ict.recruit.config;

import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import team.ict.recruit.exception.MyException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class Intercepter extends HandlerInterceptorAdapter {

    public Intercepter(){

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String errorPath = "/error";
        String path =request.getServletPath();

        if(path.matches(errorPath)){
            try {
                throw new MyException("Internal Server Error");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }else{
            return true;
        }
        return super.preHandle(request, response, handler);
    }
}
