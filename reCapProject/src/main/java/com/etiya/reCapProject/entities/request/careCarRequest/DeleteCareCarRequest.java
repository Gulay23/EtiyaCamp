package com.etiya.reCapProject.entities.request.careCarRequest;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeleteCareCarRequest {

	@NotNull
	private int careCarId;
	
	@NotNull
	private int carId;
	
}
