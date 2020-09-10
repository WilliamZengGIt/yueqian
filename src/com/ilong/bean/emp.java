package com.ilong.bean;

import java.util.Date;

public class emp {
	private Integer id;
	private String ename;
	private Integer jobid;
	private Integer mgr;
	private Date joindate;
	private double salary;
	private double bonus;
	private Integer deptid;
	
	public emp() {
		
		
	}
	public emp(Integer id, String ename, Integer jobid, Integer mgr, Date joindate, double salary, double bonus,
			Integer deptid) {
		
		this.id = id;
		this.ename = ename;
		this.jobid = jobid;
		this.mgr = mgr;
		this.joindate = joindate;
		this.salary = salary;
		this.bonus = bonus;
		this.deptid = deptid;
	}
	
	@Override
	public String toString() {
		return "emp [id=" + id + ", ename=" + ename + ", jobid=" + jobid + ", mgr=" + mgr + ", joindate=" + joindate
				+ ", salary=" + salary + ", bonus=" + bonus + ", deptid=" + deptid + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getJobid() {
		return jobid;
	}
	public void setJobid(Integer jobid) {
		this.jobid = jobid;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	
}
