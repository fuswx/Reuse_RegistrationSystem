package fuswx.domain;

import fuswx.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.util.Date;

public class Admin {
    private Integer id;
    private String name;
    private String password;
    private Integer status;
    private String statusStr;
    private String phoneNum;
    private String qqNum;
    private String adminName;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String createTimeStr;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private String updateTimeStr;

    public Date getUpdateTime() {
        updateTime=new Date();
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateTimeStr() {
        if (updateTime!=null){
            updateTimeStr=DateUtils.dateToString(updateTime,"yyyy-MM-dd HH:mm");
        }
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        if (createTime!=null){
            createTimeStr= DateUtils.dateToString(createTime,"yyyy-MM-dd HH:mm");
        }
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Admin(String name, String password, Integer status, String statusStr, String phoneNum, String qqNum, String adminName) {
        this.name = name;
        this.password = password;
        this.status = status;
        this.statusStr = statusStr;
        this.phoneNum = phoneNum;
        this.qqNum = qqNum;
        this.adminName = adminName;
    }

    public Admin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        if (statusStr!=null){
            if (statusStr.equals("未开启使用")){
                status=0;
            }else if (statusStr.equals("已开启使用")){
                status=1;
            }
        }
        return status;
    }

    public void setStatus(Integer status) {
        if (statusStr!=null){
            if (statusStr.equals("未开启使用")){
                status=0;
            }else if (statusStr.equals("已开启使用")){
                status=1;
            }
        }
        this.status = status;
    }

    public String getStatusStr() {
        if (status!=null){
            if (status==0){
                statusStr="未开启使用";
            }else if (status==1){
                statusStr="已开启使用";
            }
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }
}
