package com.codingdojo.loginReg.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
// ==========================
//        ATTRIBUTES
// ==========================
    // create unique id
    @Id		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Name is required!")
    @Size(min=3, max=30, message="First Name must be between 3 and 30 characters")
    private String userName;

    @NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;

    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;

    @Transient // don't go to the db
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirm;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

// ==========================
//       RELATIONSHIPS
// ==========================
	// One-to-Many
	// User ---< Book
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Book> books;

// ==========================
//        CONSTRUCTOR
// ==========================
    public User(){}

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

    public String getUserName() {	return userName;	}
    public void setUserName(String userName) {	this.userName = userName;	}

    public String getEmail() {	return email;	}
    public void setEmail(String email) {	this.email = email;	}

    public String getPassword() {	return password;	}
    public void setPassword(String password) {	this.password = password;	}

    public String getConfirm() {	return confirm;	}
    public void setConfirm(String confirm) {	this.confirm = confirm;	}	
}
