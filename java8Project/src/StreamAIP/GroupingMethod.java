package StreamAIP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
private String name;
private int id;
private String productName;
private String category;


public Product() {
	super();
}


public Product(String name, int id, String productName, String category) {
	super();
	this.name = name;
	this.id = id;
	this.productName = productName;
	this.category = category;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


@Override
public String toString() {
	return "[name=" + name + ", id=" + id + ", productName=" + productName + ", category=" + category + "]";
}

}


public class GroupingMethod {
	public static void main(String[] args) {
		 Map<Integer, List<String>> map = Stream.of("hi","hello","ravi")
		.collect(Collectors.groupingBy((x)->x.length()));
		 System.out.println(map);
		
		 List<Product> product = new ArrayList<>();
		 product.add(new Product("Name1",101,"AA","C1"));
		 product.add(new Product("Name2",102,"BB","C2"));
		 product.add(new Product("Name3",103,"CC","C3"));
		 product.add(new Product("Name4",104,"DD","C1"));
		 product.add(new Product("Name5",105,"EE","C2"));
		 product.add(new Product("Name6",106,"FF","C4"));
		 product.add(new Product("Name7",107,"GG","C5"));
		 
		 //grouping (function)
		 /*Map<String, List<Product>> map1= product.stream()
		 .collect(Collectors.groupingBy((x)->x.getCategory()));
		 System.out.println(map1);*/
		 
		 //Grouping(function,downStream)
		 Map<String, String> map1= product.stream()
		 .collect(Collectors.groupingBy((x)->x.getCategory(),
				 Collectors.mapping((x)->x.getName(),
						 Collectors.joining(",","{","}"))));
		 System.out.println(map1);
		 
		 //partitioning
		 Map<Boolean, List<Product>> map2= product.stream()
		 .collect(Collectors.partitioningBy((x)->x.getId()>=103));
		 System.out.println(map2);
		 
		//partitioning(predicate,downStream)
		 Map<Boolean, List<Integer>> map3 =product.stream()
		.collect(Collectors.partitioningBy((x)->x.getId()>=103,
		                      Collectors.mapping((x)->x.getId(),
		                    		  Collectors.toList())));
		 System.out.println(map3);
		
		 
	}

}
