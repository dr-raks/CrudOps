package com.crudOperation.crudOperation.entity;

import java.util.Date;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@DynamicInsert
@Entity
@Table(name = "students")
@SequenceGenerator(name = "stid_seq", initialValue = 101)
public class Students {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stid")
	private int stid;
	
	@Column(name = "stname")
	private String stname;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "doa")
	private Date doa;
	
	@Column(name = "cid")
	private int cid;
	
	@Column(name = "cfee")
	private int cfee;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int stid, String stname, Date dob, Date doa, int cid, int cfee) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.dob = dob;
		this.doa = doa;
		this.cid = cid;
		this.cfee = cfee;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoa() {
		return doa;
	}

	public void setDoa(Date doa) {
		this.doa = doa;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCfee() {
		return cfee;
	}

	public void setCfee(int cfee) {
		this.cfee = cfee;
	}

	@Override
	public String toString() {
		return "Students [stid=" + stid + ", stname=" + stname + ", dob=" + dob + ", doa=" + doa + ", cid=" + cid
				+ ", cfee=" + cfee + "]";
	}
	
}