package com.udemyjavacompleto.workshop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemyjavacompleto.workshop.entities.Song;

@RestController
@RequestMapping(value = "/songs")
public class SongResource {
	
	@GetMapping
	public ResponseEntity<Song> findAll() {		
		Song s = new Song(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		return ResponseEntity.ok().body(s);
	}
}
