package fuswx.domain;

import java.util.LinkedHashMap;

public class FormDetail {
    private LinkedHashMap<String,String> totalTexts;

    @Override
    public String toString() {
        return "FormDetail{" +
                "totalTexts=" + totalTexts +
                '}';
    }

    public LinkedHashMap<String, String> getTotalTexts() {
        return totalTexts;
    }

    public void setTotalTexts(LinkedHashMap<String, String> totalTexts) {
        this.totalTexts = totalTexts;
    }

    public FormDetail(LinkedHashMap<String, String> totalTexts) {
        this.totalTexts = totalTexts;
    }

    public FormDetail() {
    }

}
