package com.cxf.dubbo.entities;

import java.io.Serializable;



public class Bike implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String  bikeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Bike(Integer id, String bikeName) {
		super();
		this.id = id;
		this.bikeName = bikeName;
	}
	public Bike() {
		super();
	}

	@Override
	public String toString() {
		return "Bike{" +
				"id=" + id +
				", bikeName='" + bikeName + '\'' +
				'}';
	}
}
