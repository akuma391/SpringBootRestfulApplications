package com.people.management.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="person_infor")
@DynamicUpdate // used to update only one field

//Named Queries using Entity name and Attribute name using JPQL
/*@NamedQueries(value= {
		@NamedQuery(name="People.PeopleInfofindByLastName", query="SELECT p FROM People p WHERE p.lastName=?1"),
		@NamedQuery(name="People.PeoplefindByFirstNameAndEmail", query="SELECT p FROM People p WHERE p.firstName=?1 AND email=?2")
		
})*/


//NamedNativeQueries using Table name and column name using sql query
@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "People.PeopleInfofindByLastName", query = "SELECT *FROM person_infor WHERE last_name=?1",resultClass=People.class),
		@NamedNativeQuery(name = "PeoplefindByFirstNameAndEmail", query = "SELECT *FROM person_infor WHERE first_name=?1 AND email=?2",resultClass=People.class) 

		})
public class People {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="people_id")
		private Integer id;
		 
		@Column(name="first_name", length=60, nullable=false)
		private String firstName;
		
		@Column(name="last_name",length=60, nullable=false)
		private String lastName;
		
		@Column(name="creation_date")
		private Date creationDate;
		
		@Column(name="email", unique=true)
		private String email;
		
		public People() {}
		

		public People(String firstName, String lastName, Date creationDate, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.creationDate = creationDate;
			this.email = email;
		}




		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
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
			return "People [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", creationDate="
					+ creationDate + ", email=" + email + "]";
		}

		}

	
