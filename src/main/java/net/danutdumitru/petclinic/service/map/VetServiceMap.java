package net.danutdumitru.petclinic.service.map;

import net.danutdumitru.petclinic.model.Vet;
import net.danutdumitru.petclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		Vet vet = super.save(object.getId(), object);
		return vet;
	}

}
