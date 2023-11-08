package edu.cesur.fullstack.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.exceptions.ArtworkCreationException;
import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;

@Service
public class ArtworkServiceImpl implements ArtworkService {

	ArrayList<ArtworkDTO> obras = new ArrayList<>();
	
	ArtistService artistservice;
	
	ArtworkDTO ar = new ArtworkDTO(1, "Titulo1", "hola soy la descripción uno", 1);
	ArtworkDTO ar2 = new ArtworkDTO(2, "Titulo2", "hola soy la descripción dos", 2);
	ArtworkDTO ar3 = new ArtworkDTO(3, "Titulo3", "hola soy la descripción tres", 1);
	ArtworkDTO ar4 = new ArtworkDTO(4,"Titulo4", "hola soy la descripción cuatro",3);

	public ArtworkServiceImpl() {
		obras.add(ar);
		obras.add(ar2);
		obras.add(ar3);
		obras.add(ar4);
	}
	
	
	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		
		return obras;
		
	}

	
	@Override
	public void createArtwork(ArtworkDTO artworkDTO) {
		
		ArtistDTO artist = artistservice.getArtistById(artworkDTO.getArtistId());

		if (artist != null) {
			obras.add(artworkDTO);
			
		} else {
			throw new ArtworkCreationException("No extieste el artista con id: " + artworkDTO.getArtistId());
		}
		
	}

}
