package com.codingdojo.dojosAndNinjas.models;

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
@Table(name="ninjas")
public class Ninja {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String firstName;
    
    @NotBlank
    private String lastName;
    
    @NotNull
    private Integer age;

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
	// Ninja >--- Dojo
    @NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dojo_id")
	private Dojo dojo;
    
// ==========================
//        CONSTRUCTOR
// ==========================
    public Ninja(){}

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

	public String getFirstName() {	return firstName;	}
	public void setFirstName(String firstName) {	this.firstName = firstName;	}

	public String getLastName() {	return lastName;	}
	public void setLastName(String lastName) {	this.lastName = lastName;	}

	public Integer getAge() {	return age;	}
	public void setAge(Integer age) {	this.age = age;	}

	public Dojo getDojo() {	return dojo;}
	public void setDojo(Dojo dojo) {	this.dojo = dojo;}    
}
