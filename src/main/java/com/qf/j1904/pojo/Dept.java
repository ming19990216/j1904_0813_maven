package com.qf.j1904.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private int deptno;
    private String deptname;
    private String loc;

    public Dept() {
    }

    public Dept(int deptno, String deptname, String loc) {
        this.deptno = deptno;
        this.deptname = deptname;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "dept{" +
                "deptno=" + deptno +
                ", deptname='" + deptname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
