package com.test.opsAll.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.test.opsAll.dto.ParserDto;

@Service
@CacheConfig(cacheNames={"logs"})   
public class LogCacheWithValues {
	
	@Autowired
	@Qualifier(value = "logsAll")
	private  ArrayList<ParserDto> logs;
	
	@Cacheable(value="pfmType", key="#pfm")  
	public ArrayList<ParserDto> fetchByPfm(String pfm) {
		System.out.println("The method at cache layer is executed for pfm ="+pfm);
		ArrayList<ParserDto> parserDtos= new  ArrayList<ParserDto>();		 
		 parserDtos = (ArrayList<ParserDto>) logs.parallelStream().filter(dto -> 
			 dto.getPfm().equalsIgnoreCase(pfm)
		 ).collect(Collectors.toList());
		 return parserDtos;		
	}
	
	@Cacheable(value="levelType", key="#level")  
	public ArrayList<ParserDto> fetchByLevel(String level) {
		System.out.println("The method at cache layer is executed for Level ="+level);
		ArrayList<ParserDto> parserDtos= new  ArrayList<ParserDto>();		 
		 parserDtos = (ArrayList<ParserDto>) logs.parallelStream().filter(dto -> 
			 dto.getLevel().equalsIgnoreCase(level)
		 ).collect(Collectors.toList());
		 return parserDtos;		
	}
	
	@Cacheable(value="stepType", key="#step")  
	public ArrayList<ParserDto> fetchByStep(String step) {
		System.out.println("The method at cache layer is executed for step ="+step);
		ArrayList<ParserDto> parserDtos= new  ArrayList<ParserDto>();		 
		 parserDtos = (ArrayList<ParserDto>) logs.parallelStream().filter(dto -> 
			 dto.getStep().equalsIgnoreCase(step)
		 ).collect(Collectors.toList());
		 return parserDtos;		
	}

	@Cacheable(value="dateType", key="#date")  
	public ArrayList<ParserDto> fetchByTime(String time) {
		System.out.println("The method at cache layer is executed for time ="+time);
		ArrayList<ParserDto> parserDtos= new  ArrayList<ParserDto>();			
		/*
		 * parserDtos = (ArrayList<ParserDto>) logs.parallelStream().filter(dto ->
		 * dto.getTimestamp(). ).collect(Collectors.toList());
		 */
		 
		 return parserDtos;	
	}
	

}
