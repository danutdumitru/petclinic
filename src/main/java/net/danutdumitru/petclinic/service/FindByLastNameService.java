package net.danutdumitru.petclinic.service;

public interface FindByLastNameService<T> {
	public T findByLastName(String lastName); 
}
