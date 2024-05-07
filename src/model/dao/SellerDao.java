package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller dinByid(Integer id);
	List<Seller> findAll();
	Seller findById(Integer id);

}
