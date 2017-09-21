package com.junge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "base",schema="a")
public class base {
	@Id
	@Column(name="id",length=10)
	private int a;
	@Column(name="ph",length=10)
	private String ph;
	@Column(name="pd",length=10)
	private String pd;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getPd() {
		return pd;
	}
	public void setPd(String pd) {
		this.pd = pd;
	}
}
