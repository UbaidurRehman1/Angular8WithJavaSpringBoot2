package com.ubaid.BootAngularApp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name="user_name", nullable = true)
	private String userName;
	@Column(nullable = true, name = "description")
	private String description;
	@Column(nullable = true, name="target_date")
	private Date targetDate;
	@Column(nullable =  true, name="is_done")
	private boolean isDone;
	
	public Todo()
	{
		
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", desc=" + description + ", targetDate=" + targetDate
				+ ", isDone=" + isDone + "]";
	}

	public Todo(int id, String userName, String desc, Date targetDate, boolean isDone) {
		this.id = id;
		this.userName = userName;
		this.description = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
