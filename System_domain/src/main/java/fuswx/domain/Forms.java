package fuswx.domain;

public class Forms {
    private int inputId;
    private String content;
    private String uuid;
    private String type;

    @Override
    public String toString() {
        return "Forms{" +
                "inputId=" + inputId +
                ", content='" + content + '\'' +
                ", uuid='" + uuid + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Forms() {
    }

    public Forms(int inputId, String content, String uuid, String type) {
        this.inputId = inputId;
        this.content = content;
        this.uuid = uuid;
        this.type = type;
    }

    public int getInputId() {
        return inputId;
    }

    public void setInputId(int inputId) {
        this.inputId = inputId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
