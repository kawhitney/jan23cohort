package com.codingdojo.crudApp.models;

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
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="stickers")
public class Sticker {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message="Must have a name.")
    @Size(min=5, max=200)
    private String name;
    
    @NotBlank(message="URL is required.")
    @Size(min=20)
    private String url;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
// ==========================
//		RELATIONSHIPS	
// ==========================
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

// ==========================
//        CONSTRUCTOR
// ==========================
    public Sticker(){}
	// add constructor with parameters for other variables
    // WARNING: NOT auto generated ones (id, createdAt, and updatedAt)
    public Sticker(@NotBlank(message = "Must have a name.") @Size(min = 5, max = 200) String name,
    		@NotBlank(message = "URL is required.") @Size(min = 20) String url, Category category) {
    	this.name = name;
    	this.url = url;
    	this.category = category;
    }
    

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
	
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	
	public String getUrl() {	return url;	}
	public void setUrl(String url) {	this.url = url;	}	
	
	public Category getCategory() {		return category;	}
	public void setCategory(Category category) {	this.category = category;	}    
}
