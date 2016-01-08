/**
 * 
 */
package org.project.simple.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author jlopes
 *
 */
@Entity
@Table(name="customer_list")
public class Customer_List {

	public Customer_List() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name", nullable=true, columnDefinition="varchar", length=91, insertable=true, updatable=true)
	private String name;
	
	@Column(name="address", nullable=false, columnDefinition="varchar", length=50, insertable=true, updatable=true)
	private String address;
	
	@Column(name="zipcode", nullable=true, columnDefinition="varchar", length=10, insertable=true, updatable=true)
	private String zipcode;
	
	@Column(name="phone", nullable=false, columnDefinition="varchar", length=20, insertable=true, updatable=true)
	private String phone;
	
	@Column(name="city", nullable=false, columnDefinition="varchar", length=50, insertable=true, updatable=true)
	private String city;
	
	@Column(name="country", nullable=false, columnDefinition="varchar", length=50, insertable=true, updatable=true)
	private String country;
	
	@Column(name="note", nullable=false, columnDefinition="varchar", length=6, insertable=true, updatable=true)
	private String note;

	@Column(name="SID", nullable=false, columnDefinition="tinyint", length=3, insertable=true, updatable=true)
	private short sid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public short getSid() {
		return sid;
	}

	public void setSid(short sid) {
		this.sid = sid;
	}
	
}
