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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // name of the burger
    @NotNull
    private String burgerName;
    
    // name of the restaurant
    @NotNull
    private String restaurant;
    
    // 0 < rating < 5
    @NotNull
    @Min(1)
    @Max(5)
    private int rating;
    
    // description of notes
    @NotNull
    private String notes;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

// ==========================
//        CONSTRUCTOR
// ==========================
    // empty constructor *Needed*
    public Burger(){}
    // add constructor with parameters for other variables
    // WARNING: NOT auto generated ones (id, createdAt, and updatedAt)
	public Burger(@NotNull String burgerName, @NotNull String restaurant, @NotNull @Min(1) @Max(5) int rating,
				@NotNull String notes) {
			this.burgerName = burgerName;
			this.restaurant = restaurant;
			this.rating = rating;
			this.notes = notes;
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

	public Long getId() {	return id;	}
	public void setId(Long id) {	this.id = id;	}     
}
    
