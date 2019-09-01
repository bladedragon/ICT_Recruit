package team.ict.recruit.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import team.ict.recruit.exception.MyException;
import team.ict.recruit.model.response.ExceptionResponse;

@Slf4j
public class ExceptionHandleAdvice {


    public ExceptionHandleAdvice() {
    }

    @ExceptionHandler({MyException.class})
    public ExceptionResponse handleException(MyException e) {
        log.error(">>>>异常出现：" + e.toString() + "/n");

        return new ExceptionResponse(420, e.getMessage());
    }
}
