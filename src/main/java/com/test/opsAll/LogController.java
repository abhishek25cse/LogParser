package com.test.opsAll;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.opsAll.dto.ParserDto;
import com.test.opsAll.service.LogCacheWithValues;

@RestController
@RequestMapping(value = "api")
public class LogController {
	
	@Autowired
	@Qualifier(value="logsAll")
	private ArrayList<ParserDto> parserDtos;
	
	@Autowired
	private LogCacheWithValues logCacheWithValues;
	
	@GetMapping(value = "logs")
	public ResponseEntity<ArrayList<ParserDto>> fetchAllLogs() {
		ResponseEntity<ArrayList<ParserDto>> response = null;
		response = new ResponseEntity<ArrayList<ParserDto>>(parserDtos, HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value = "logsBypfm")
	public ResponseEntity<ArrayList<ParserDto>> logsBypfm(@RequestParam("pfm") final String pfm) {
		ResponseEntity<ArrayList<ParserDto>> response = null;
		response = new ResponseEntity<ArrayList<ParserDto>>(logCacheWithValues.fetchByPfm(pfm),HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value = "logsByLevel")
	public ResponseEntity<ArrayList<ParserDto>> logsByLevel(@RequestParam("level") final String level) {
		ResponseEntity<ArrayList<ParserDto>> response = null;
		response = new ResponseEntity<ArrayList<ParserDto>>(logCacheWithValues.fetchByLevel(level),HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value = "logsByStep")
	public ResponseEntity<ArrayList<ParserDto>> logsByStep(@RequestParam("step") final String step) {
		ResponseEntity<ArrayList<ParserDto>> response = null;
		response = new ResponseEntity<ArrayList<ParserDto>>(logCacheWithValues.fetchByStep(step),HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value = "logsByTime")
	public ResponseEntity<ArrayList<ParserDto>> logsByTime(@RequestParam("time") final String time) {
		ResponseEntity<ArrayList<ParserDto>> response = null;
		response = new ResponseEntity<ArrayList<ParserDto>>(logCacheWithValues.fetchByTime(time),HttpStatus.OK);
		return response;
	}

}
