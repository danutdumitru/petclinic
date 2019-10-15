package net.danutdumitru.petclinic.service;

import net.danutdumitru.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	public Owner findByLastName(String lastName);
}
