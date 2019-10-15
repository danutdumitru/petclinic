package net.danutdumitru.petclinic.service.map;

import net.danutdumitru.petclinic.model.Owner;
import net.danutdumitru.petclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		Owner owner = super.save(object.getId(), object);
		return owner;
	}

}
