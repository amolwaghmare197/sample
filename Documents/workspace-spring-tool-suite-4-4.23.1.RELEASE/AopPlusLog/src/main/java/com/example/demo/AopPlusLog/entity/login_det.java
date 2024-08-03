package com.example.demo.AopPlusLog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class login_det {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private long age;
	
	private int numbe_phone;
	
	private String address;
	private String first_name;
	private String last_name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public int getNumbe_phone() {
		return numbe_phone;
	}
	public void setNumbe_phone(int numbe_phone) {
		this.numbe_phone = numbe_phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	@Override
	public String toString() {
		return "login_det [id=" + id + ", age=" + age + ", numbe_phone=" + numbe_phone + ", address=" + address
				+ ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	public login_det(Long id, long age, int numbe_phone, String address, String first_name, String last_name) {
		super();
		this.id = id;
		this.age = age;
		this.numbe_phone = numbe_phone;
		this.address = address;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public login_det() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
