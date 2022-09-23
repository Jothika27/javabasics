package com.oops.practice;

import com.opencsv.bean.CsvBindByName;

public class BayCsv {
    @CsvBindByName(column ="building")
    private String building;
    @CsvBindByName(column ="floor")
    private String floor;
    @CsvBindByName(column ="room")
    private String room;
    @CsvBindByName(column ="baytype")
    private String baytype;
    @CsvBindByName(column ="bayno")
    private String bayno;
    @CsvBindByName(column ="orderno")
    private String orderno;
    @CsvBindByName(column ="status")
    private String status;
    @CsvBindByName(column ="associate_code")
    private String associate_code;
    @CsvBindByName(column ="official_email")
    private String official_email;
    @CsvBindByName(column ="associate_name")
    private String associate_name;
    @CsvBindByName(column ="assigndate")
    private String assigndate;
    @CsvBindByName(column ="floorno")
    private String floorno;
    // public BayCsv(String building, String floor, String room, String baytype, String bayno, String orderno,
    //         String status, String associate_code, String official_email, String associate_name, String assigndate,
    //         String floorno) {
    //     this.building = building;
    //     this.floor = floor;
    //     this.room = room;
    //     this.baytype = baytype;
    //     this.bayno = bayno;
    //     this.orderno = orderno;
    //     this.status = status;
    //     this.associate_code = associate_code;
    //     this.official_email = official_email;
    //     this.associate_name = associate_name;
    //     this.assigndate = assigndate;
    //     this.floorno = floorno;
    // }
    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public String getFloor() {
        return floor;
    }
    public void setFloor(String floor) {
        this.floor = floor;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public String getBaytype() {
        return baytype;
    }
    public void setBaytype(String baytype) {
        this.baytype = baytype;
    }
    public String getBayno() {
        return bayno;
    }
    public void setBayno(String bayno) {
        this.bayno = bayno;
    }
    public String getOrderno() {
        return orderno;
    }
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAssociate_code() {
        return associate_code;
    }
    public void setAssociate_code(String associate_code) {
        this.associate_code = associate_code;
    }
    public String getOfficial_email() {
        return official_email;
    }
    public void setOfficial_email(String official_email) {
        this.official_email = official_email;
    }
    public String getAssociate_name() {
        return associate_name;
    }
    public void setAssociate_name(String associate_name) {
        this.associate_name = associate_name;
    }
    public String getAssigndate() {
        return assigndate;
    }
    public void setAssigndate(String assigndate) {
        this.assigndate = assigndate;
    }
    public String getFloorno() {
        return floorno;
    }
    public void setFloorno(String floorno) {
        this.floorno = floorno;
    }
    @Override
    public String toString() {
        return "BayCsv [assigndate=" + assigndate + ", associate_code=" + associate_code + ", associate_name="
                + associate_name + ", bayno=" + bayno + ", baytype=" + baytype + ", building=" + building + ", floor="
                + floor + ", floorno=" + floorno + ", official_email=" + official_email + ", orderno=" + orderno
                + ", room=" + room + ", status=" + status + "]";
    }

    

}
