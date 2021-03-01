package com.fullstackdemo.rest.webservices.restfulwebservices.todo;
import java.util.Date;


//public class Todo{
//	
//	private long id;
//	private String username;
//	private String author;
//	private String nameofthebook;
//	private String isbn;
//	private String description;
//	private Date targetdate;
//	
//	 protected Todo() {
//	 
//}
//
//	public Todo(long id, String username,String author, String nameofthebook, String isbn, String description, Date targetdate) {
//		super();
//		this.id = id;
//		this.username=username;
//		this.author=author;
//		this.nameofthebook = nameofthebook;
//		this.isbn = isbn;
//		this.description = description;
//		this.targetdate = targetdate;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getNameofthebook() {
//		return nameofthebook;
//	}
//
//	public void setNameofthebook(String nameofthbook) {
//		this.nameofthebook = nameofthbook;
//	}
//
//	public String getIsbn() {
//		return isbn;
//	}
//
//	public void setIsbn(String isbn) {
//		this.isbn = isbn;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Date getTargetdate() {
//	return targetdate;
//}
//
//public void setTargetdate(Date targetdate) {
//	this.targetdate = targetdate;
//}
//	 
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (id ^ (id >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Todo other = (Todo) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//	 
//}

import java.util.Date;

public class Todo {
	private long id;
	private String username;
	private String description;
	private Date targetDate;
	private boolean isDone;
	
	public Todo() {
		
	}

	public Todo(long id, String username, String description, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		result = prime * result + (int) (id ^ (id >>> 32));
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