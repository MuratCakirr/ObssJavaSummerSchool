package tr.com.obss.jss.finalproject.Results;

import lombok.Data;
import lombok.Getter;

@Getter
public class Result {
    private boolean success;
    private String message;

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, String message) {
        this(success);
        this.message = message;
    }
}
