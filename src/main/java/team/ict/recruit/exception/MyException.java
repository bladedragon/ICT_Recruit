package team.ict.recruit.exception;

import lombok.AllArgsConstructor;
import lombok.Data;


public class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
