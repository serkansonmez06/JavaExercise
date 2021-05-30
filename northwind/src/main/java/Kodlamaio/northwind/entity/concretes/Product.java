package Kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@Table(name="products") //table name in database. has to match
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id                                //it is for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)                   // indicated auto incremented
	@Column(name="product_id")       //column name in database
	private int id;
	
//	@Column(name="category_id") because of  @ManyToOne() @JoinColumn(name="category_id") we dont need to have category_id
//	private int categoryId;

	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="categories")
	private Category category;
	

	

}
