package edu.cesur.fullstack.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cesur.fullstack.services.ArtistService;

@RestController
@RequestMapping("/artists")
public class ArtistRestController {
	
	@Autowired
	ArtistService artistService;
	
	
	@GetMapping("/{artistId}")
	public ResponseEntity<?> getArtist(@PathVariable Integer artistId){
		return ResponseEntity.ok(artistService.getArtistById(artistId));
		
	}

}
