package com.BookFinderApplication;
import java.util.Date;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.BookFinderApplication")
@Entity

public class BookFinderRecords {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String author;
	private String nameofthebook;
	private String username;
	private String description;
	private Date targetDate;
	
	
	public BookFinderRecords() {
		
	}

	public BookFinderRecords(Long id,String author,String nameofthebook ,String username, String description, Date targetDate) {
		super();
		this.id = id;
		this.author=author;
		this.nameofthebook=nameofthebook;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	public String getNameofthebook() {
		return nameofthebook;
	}

	public void setNameofthebook(String nameofthebook) {
		this.nameofthebook = nameofthebook;
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
		BookFinderRecords other = (BookFinderRecords) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}



