package org.perscholas.database.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
	@Table(name="orders")
	public class Order {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
		private Integer id;
	    
	    
	    @Column(name = "customer_id", insertable = false, updatable = false)
	   
	   private Integer customerid;
	    
	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "customer_id", nullable = false)
	    private Customer customer;
	    
	    @OneToMany(mappedBy = "order", 
	    		fetch = FetchType.LAZY, 
	    		cascade = CascadeType.ALL)
	    private List<Orderdetail> orderdetails;
	    
	    public List<Orderdetail> getOrderdetails() {
			return orderdetails;
		}

		public void setOrderdetails(List<Orderdetail> orderdetails) {
			this.orderdetails = orderdetails;
		}

		@Column(name = "order_date")
	    @Temporal(TemporalType.DATE)
	    private Date orderDate;
		
	    
	   public Integer getCustomerid() {
			return customerid;
		}

		public void setCustomerid(Integer customerid) {
			this.customerid = customerid;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		@Column(name = "required_date")
	    @Temporal(TemporalType.DATE)
	    private Date requiredDate;
	    
	    @Column(name = "shipped_date")
	    @Temporal(TemporalType.DATE)
	    private Date shippedDate;
	    
	    @Column(name = "status")
		private String status;
	    
	    @Column(name = "comments",columnDefinition = "text")
	    @Type(type = "text")
	    private String comments;
	    
	    // @Column(name = "comments", columnDefinition = "LONGTEXT")
	   // private String comments;

	    
		 // ------ getters and setters ------
	    
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public Date getRequiredDate() {
			return requiredDate;
		}

		public void setRequiredDate(Date requiredDate) {
			this.requiredDate = requiredDate;
		}

		public Date getShippedDate() {
			return shippedDate;
		}

		public void setShippedDate(Date shippedDate) {
			this.shippedDate = shippedDate;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}
	    


}
