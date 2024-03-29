package net.danutdumitru.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity {
	private String firstName;
	private String lastName;
}
