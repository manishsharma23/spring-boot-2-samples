package com.spring.crudrepository;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
public class System_s2h5 {
	public System_s2h5() {
	}
	public System_s2h5(String name, Date lastaudit) {
		this.id = id;
		this.lastaudit = lastaudit;
		this.name = name;
	}
	public System_s2h5(long id, String name, Date lastaudit) {
		this.id = id;
		this.lastaudit = lastaudit;
		this.name = name;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public long id;
	public String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastaudit() {
		return lastaudit;
	}
	public void setLastaudit(Date lastaudit) {
		this.lastaudit = lastaudit;
	}
	public Date lastaudit;
	public String toString() {
		return id + " | " + name + " | " + lastaudit;
	}
}