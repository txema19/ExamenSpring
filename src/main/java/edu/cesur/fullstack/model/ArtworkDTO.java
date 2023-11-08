package edu.cesur.fullstack.model;

import edu.cesur.fullstack.validators.DescripcionValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtworkDTO {

	Integer id;

	String title;
	
	@DescripcionValidator
	String description;
		
	Integer artistId;
		
}
