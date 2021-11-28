package fuswx.domain;

import java.util.ArrayList;

public class AddIput_Total {
    private String title;
    private ArrayList<AddInput> addInputs;

    public AddIput_Total() {
    }

    public AddIput_Total(String title, ArrayList<AddInput> addInputs) {
        this.title = title;
        this.addInputs = addInputs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<AddInput> getAddInputs() {
        return addInputs;
    }

    public void setAddInputs(ArrayList<AddInput> addInputs) {
        this.addInputs = addInputs;
    }

    @Override
    public String toString() {
        return "AddIput_Total{" +
                "title='" + title + '\'' +
                ", addInputs=" + addInputs +
                '}';
    }
}
