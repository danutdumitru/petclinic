package net.danutdumitru.petclinic.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pet {
	private Owner owner;
	private PetType petType;
	private LocalDate birthDate;
}
