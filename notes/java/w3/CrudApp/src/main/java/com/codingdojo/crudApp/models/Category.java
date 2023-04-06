package com.codingdojo.crudApp.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="categories")
public class Category {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message="Must have a name")
    private String name;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

// ==========================
//  	RELATIONSHIPS	
// ==========================
    @OneToMany(mappedBy="category", fetch = FetchType.LAZY)
    private List<Sticker> stickers;
    

// ==========================
//        CONSTRUCTOR
// ==========================
    public Category(){}
	// add constructor with parameters for other variables
    // WARNING: NOT auto generated ones (id, createdAt, and updatedAt)
    public Category(@NotBlank(message = "Must have a name") String name) {
    	this.name = name;
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
	
	public List<Sticker> getStickers() {	return stickers;	}
	public void setStickers(List<Sticker> stickers) {	this.stickers = stickers;}
    
}
