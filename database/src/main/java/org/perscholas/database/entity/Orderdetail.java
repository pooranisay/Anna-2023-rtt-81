package org.perscholas.database.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "orderdetails")
public class Orderdetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "order_id")
	private Integer orderid;
	
	@Column(name = "quantity_ordered")
	private Integer quantityordered;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getQuantityordered() {
		return quantityordered;
	}

	public void setQuantityordered(Integer quantityordered) {
		this.quantityordered = quantityordered;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public Double getPriceeach() {
		return priceeach;
	}

	public void setPriceeach(Double priceeach) {
		this.priceeach = priceeach;
	}

	public Short getOrderlinenumber() {
		return orderlinenumber;
	}

	public void setOrderlinenumber(Short orderlinenumber) {
		this.orderlinenumber = orderlinenumber;
	}

	@Column(name = "product_id")
	private Integer productid;
	
	@Column(name = "price_each", columnDefinition="Decimal(10,2)")
	private Double priceeach;
	
	@Column(name = "order_line_number")
	private Short orderlinenumber;
	
	
	

}
