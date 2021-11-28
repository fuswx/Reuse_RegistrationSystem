package fuswx.domain;

import java.util.HashMap;

public class RequestText {
    private HashMap<String,String> oneRequest;
    private HashMap<String,HashMap<String,String>> mulRequest;

    public RequestText() {
    }

    public RequestText(HashMap<String, String> oneRequest, HashMap<String, HashMap<String, String>> mulRequest) {
        this.oneRequest = oneRequest;
        this.mulRequest = mulRequest;
    }

    public HashMap<String, String> getOneRequest() {
        return oneRequest;
    }

    public void setOneRequest(HashMap<String, String> oneRequest) {
        this.oneRequest = oneRequest;
    }

    public HashMap<String, HashMap<String, String>> getMulRequest() {
        return mulRequest;
    }

    public void setMulRequest(HashMap<String, HashMap<String, String>> mulRequest) {
        this.mulRequest = mulRequest;
    }

    @Override
    public String toString() {
        return "RequestText{" +
                "oneRequest=" + oneRequest +
                ", mulRequest=" + mulRequest +
                '}';
    }

}
