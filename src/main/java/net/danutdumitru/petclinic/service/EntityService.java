package net.danutdumitru.petclinic.service;

import java.util.Set;

public interface EntityService<T> {
	public T findById(Long id);
	
	public T save(T entity);
	
	public Set<T> findAll();
}
