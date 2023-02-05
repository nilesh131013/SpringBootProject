package com.example.Cars;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarsRepository extends JpaRepository<Cars, Integer>{ 

	@Query(value="select * from cars where brand like ?",nativeQuery=true)
	Cars getByBrand(String b);
	
	@Query(value="select brand from cars",nativeQuery=true)
	List<String> getBrand();
	
	
	@Query(value="select * from cars where price = (select max(price) from cars) ",nativeQuery=true)
	Cars maxPrice();
	
	
	@Query(value="select * from cars where price = (select min(price) from cars) ",nativeQuery=true)
	Cars minPrice();
	
	
	@Query(value="select * from cars order by price  desc limit 2,1 ",nativeQuery=true)
	Cars secondMax();
	
	
	@Query(value="select * from cars order by price  asc limit 2,1 ",nativeQuery=true)
	Cars secondMin();
}
