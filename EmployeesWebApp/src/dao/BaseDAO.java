package dao;

import java.util.List;

import model.BaseEntity;

public interface BaseDAO<T extends BaseEntity> {

	
	public T findById(int id);
	public List<T> findAll();
	public int update(T item);
	public int insert(T item);
	
	
	
	
}
