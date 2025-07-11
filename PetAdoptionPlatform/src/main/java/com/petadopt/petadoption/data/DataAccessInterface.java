package com.petadopt.petadoption.data;

import java.util.List;

//Main class or interface for dataaccessinterface operations
public interface DataAccessInterface <T> {
// Method to handle findall functionality
	public List<T> findAll();
	public T findById(int id);
	public boolean create(T t);
	public boolean update(T t);
	public boolean delete(T t);
}
