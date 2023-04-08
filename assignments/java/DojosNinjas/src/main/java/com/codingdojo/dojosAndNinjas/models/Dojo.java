package com.codingdojo.dojosAndNinjas.models;

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
@Table(name="dojos")
public class Dojo {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String name;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
// ==========================
// 	      RELATIONSHIPS
// ==========================
    // One-to-Many
    // Dojo ---< Ninja
    @OneToMany(mappedBy="dojo", fetch = FetchType.LAZY)
    private List<Ninja> ninjas;    

// ==========================
//        CONSTRUCTOR
// ==========================
    public Dojo(){}

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

	public List<Ninja> getNinjas() {	return ninjas;	}
	public void setNinjas(List<Ninja> ninjas) {	this.ninjas = ninjas;	}	
}
