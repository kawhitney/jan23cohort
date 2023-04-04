package com.codingdojo.wosmart.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="items")
public class Item {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private double price;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
// ==========================
//        CONSTRUCTOR
// ==========================  
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Item() {	}

// ==========================
//     GETTERS / SETTERS
// ==========================
    @PrePersist
    protected void onCreate(){	this.createdAt = new Date();	}
	public Date getCreatedAt() {	return createdAt;	}
	public void setCreatedAt(Date createdAt) {	this.createdAt = createdAt;	}
	
    @PreUpdate
    protected void onUpdate(){	this.updatedAt = new Date();	}
	public Date getUpdatedAt() {	return updatedAt;	}
	public void setUpdatedAt(Date updatedAt) {	this.updatedAt = updatedAt;	}

	public Long getId() {	return id;	}
	public void setId(Long id) {	this.id = id;	}
	
	public String getName() {	return name;	}
	public void setName(String name) {		this.name = name;	}

	public double getPrice() {		return price;	}
	public void setPrice(double price) {		this.price = price;	}
    
    
}
