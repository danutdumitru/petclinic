package net.danutdumitru.petclinic.service.map;

import net.danutdumitru.petclinic.model.Pet;
import net.danutdumitru.petclinic.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		Pet pet = super.save(object.getId(), object);
		return pet;
	}

}
