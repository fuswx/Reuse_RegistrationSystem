package fuswx.domain;

import java.util.List;

public class AddInput {

    private String inputContent;
    private String titleContent;
    private List<String> textContents;
    private Integer type;

    public AddInput(String inputContent, String titleContent, List<String> textContents, Integer type) {
        this.inputContent = inputContent;
        this.titleContent = titleContent;
        this.textContents = textContents;
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AddInput{" +
                "inputContent='" + inputContent + '\'' +
                ", titleContent='" + titleContent + '\'' +
                ", textContents=" + textContents +
                '}';
    }

    public String getInputContent() {
        return inputContent;
    }

    public void setInputContent(String inputContent) {
        this.inputContent = inputContent;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public List<String> getTextContents() {
        return textContents;
    }

    public void setTextContents(List<String> textContents) {
        this.textContents = textContents;
    }

    public AddInput() {
    }

    public AddInput(String inputContent, String titleContent, List<String> textContents) {
        this.inputContent = inputContent;
        this.titleContent = titleContent;
        this.textContents = textContents;
    }
}
