package fuswx.domain;

import fuswx.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class NewTable {
    private Integer id;
    private String formTitle;
    private String textTable;
    private String titleTable;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String createTimeStr;
    private Integer adminId;
    private String eg;

    @Override
    public String toString() {
        return "NewTable{" +
                "id=" + id +
                ", formTitle='" + formTitle + '\'' +
                ", questionTable='" + textTable + '\'' +
                ", titleTable='" + titleTable + '\'' +
                ", createTime=" + createTime +
                ", createTimeStr='" + createTimeStr + '\'' +
                ", adminId=" + adminId +
                ", eg='" + eg + '\'' +
                '}';
    }

    public String getCreateTimeStr() {
        if (createTime!=null){
            createTimeStr= DateUtils.dateToString(createTime,"yyyy-MM-dd HH:mm:ss");
        }
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getTextTable() {
        return textTable;
    }

    public void setTextTable(String textTable) {
        this.textTable = textTable;
    }

    public String getTitleTable() {
        return titleTable;
    }

    public void setTitleTable(String titleTable) {
        this.titleTable = titleTable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getEg() {
        return eg;
    }

    public void setEg(String eg) {
        this.eg = eg;
    }
}
