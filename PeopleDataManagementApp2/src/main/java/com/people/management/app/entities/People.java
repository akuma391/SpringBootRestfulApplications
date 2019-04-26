package com.people.management.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="people_info")
@DynamicUpdate // used to update only one field
public class People {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="people_id")
		private Integer id;
		 
		public People() {
			
		}

		public People( String firstName, String lastName, Date creationDate, String email) {
			super();
			
			FirstName = firstName;
			LastName = lastName;
			this.creationDate = creationDate;
			this.email = email;
		}
		@Column(name="first_name", length=60, nullable=false)
		private String FirstName;
		
		@Column(name="last_name",length=60, nullable=false)
		private String LastName;
		
		@Column(name="creation_date")
		private Date creationDate;
		
		@Column(name="email", unique=true)
		private String email;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "People [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", creationDate="
					+ creationDate + ", email=" + email + "]";
		}

	
}