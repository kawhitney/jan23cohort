package com.codingdojo.loginReg.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message="Title must not be blank")
    private String title;
    
    @NotBlank(message="Author must not be blank")
    private String author;
    
    @NotBlank(message="Your Thoughts must not be blank")
    private String thoughts;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
// ==========================
// 	      RELATIONSHIPS
// ==========================
	// Many-to-One
	// Book >--- User
    @NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;

// ==========================
//        CONSTRUCTOR
// ==========================
    public Book(){}

// ==========================
//     GETTERS / SETTERS
// ==========================
    @PrePersist
    protected void onCreate(){	this.createdAt = new Date();}
	public Date getCreatedAt() {	return createdAt;	}
	public void setCreatedAt(Date createdAt) {	this.createdAt = createdAt;	}
	
    @PreUpdate
    protected void onUpdate(){	this.updatedAt = new Date();}
	public Date getUpdatedAt() {	return updatedAt;	}
	public void setUpdatedAt(Date updatedAt) {	this.updatedAt = updatedAt;	}
	
    // add getters/setters for ALL attributes 
	public Long getId() {	return id;	}
	public void setId(Long id) {	this.id = id;	}

	public String getTitle() {	return title;	}
	public void setTitle(String title) {	this.title = title;	}

	public String getAuthor() {	return author;	}
	public void setAuthor(String author) {	this.author = author;	}

	public String getThoughts() {	return thoughts;	}
	public void setThoughts(String thoughts) {	this.thoughts = thoughts;	}

	public User getUser() {	return user;	}
	public void setUser(User user) {	this.user = user;	}	
}
