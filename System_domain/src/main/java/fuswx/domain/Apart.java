package fuswx.domain;

public class Apart {
    private Integer id;
    private String apartName;
    private String apartQQ;

    public Apart(Integer id, String apartName, String apartQQ) {
        this.id = id;
        this.apartName = apartName;
        this.apartQQ = apartQQ;
    }

    public Apart(String apartName, String apartQQ) {
        this.apartName = apartName;
        this.apartQQ = apartQQ;
    }

    public Apart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApartName() {
        return apartName;
    }

    public void setApartName(String apartName) {
        this.apartName = apartName;
    }

    public String getApartQQ() {
        return apartQQ;
    }

    public void setApartQQ(String apartQQ) {
        this.apartQQ = apartQQ;
    }

    @Override
    public String toString() {
        return "Apart{" +
                "id=" + id +
                ", apartName='" + apartName + '\'' +
                ", apartQQ='" + apartQQ + '\'' +
                '}';
    }
}
