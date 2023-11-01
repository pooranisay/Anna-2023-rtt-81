package jpa.entitymodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
	@Table(name = "student")
	public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "email", unique = true)
	    private String sEmail;

	    @Column(name = "name")
	    private String sName;

	    @Column(name = "password")
	    private String sPass;

	    @ManyToMany(mappedBy = "student",fetch = FetchType.EAGER, 
	    		cascade = CascadeType.ALL)
	    private List<Course> sCourses;
	    
	    public Student() {
	        // Default constructor
	    }

		public String getsEmail() {
			return sEmail;
		}

		public void setsEmail(String sEmail) {
			this.sEmail = sEmail;
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}

		public String getsPass() {
			return sPass;
		}

		public void setsPass(String sPass) {
			this.sPass = sPass;
		}

		public List<Course> getsCourses() {
			return sCourses;
		}

		public void setsCourses(List<Course> sCourses) {
			this.sCourses = sCourses;
		}
	    
	    

}


