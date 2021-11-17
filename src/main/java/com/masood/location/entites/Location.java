package com.masood.location.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	private Long loc_id;
	private String loc_code;
	private String loc_name;
	private String loc_type;

	public Long getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(Long loc_id) {
		this.loc_id = loc_id;
	}

	public String getLoc_code() {
		return loc_code;
	}

	public void setLoc_code(String loc_code) {
		this.loc_code = loc_code;
	}

	public String getLoc_name() {
		return loc_name;
	}

	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}

	public String getLoc_type() {
		return loc_type;
	}

	public void setLoc_type(String loc_type) {
		this.loc_type = loc_type;
	}

	@Override
	public String toString() {
		return "Location [loc_id=" + loc_id + ", loc_code=" + loc_code + ", loc_name=" + loc_name + ", loc_type="
				+ loc_type + "]";
	}
}
