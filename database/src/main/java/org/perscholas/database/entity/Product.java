package org.perscholas.database.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="products")
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
    
    @OneToMany(mappedBy = "product", 
    		fetch = FetchType.LAZY, 
    		cascade = CascadeType.ALL)
    private List<Orderdetail> orderdetails;
	
	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Column(name = "product_code")
	private String productcode;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProductlineid() {
		return productlineid;
	}

	public void setProductlineid(Integer productlineid) {
		this.productlineid = productlineid;
	}

	public String getProductscale() {
		return productscale;
	}

	public void setProductscale(String productscale) {
		this.productscale = productscale;
	}

	public String getProductvendor() {
		return productvendor;
	}

	public void setProductvendor(String productvendor) {
		this.productvendor = productvendor;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	@Column(name = "product_name")
	private String productname;
	
	@Column(name = "productline_id")
	private Integer productlineid;
	
	@Column(name = "product_scale")
	private String productscale;
	
	@Column(name = "product_vendor")
	private String productvendor;
	
	@Column(name = "product_description",columnDefinition = "text")
    @Type(type = "text")
    private String productdescription;
	
	//@Column(name = "product_description", length = 255)
	//private String product_description;
	
	

}
