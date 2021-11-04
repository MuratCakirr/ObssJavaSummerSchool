package tr.com.obss.jss.finalproject.Results;

public class SuccessResult extends Result{

    public  SuccessResult() {
        super(true);
    }

    public SuccessResult(String message) {
        super(true, message);
    }
}
