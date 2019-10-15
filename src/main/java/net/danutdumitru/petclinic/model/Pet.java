package net.danutdumitru.petclinic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet extends BaseEntity {
	private Owner owner;
	private PetType petType;
	private LocalDate birthDate;
}
