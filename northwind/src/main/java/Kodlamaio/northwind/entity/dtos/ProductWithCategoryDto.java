package Kodlamaio.northwind.entity.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
//DTO= data transformation object
	
	
	private int id;
	private String productName;
	private String categoryName;
	
	
	
	
}
