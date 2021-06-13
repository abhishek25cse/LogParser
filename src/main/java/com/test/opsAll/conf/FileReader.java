package com.test.opsAll.conf;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.opsAll.dto.ParserDto;

@Configuration
public class FileReader {

	@Bean(name = "logsAll")
	public ArrayList<ParserDto> readLogFile() {
		ArrayList<ParserDto> logs = new ArrayList<ParserDto>();
		try {
			FileInputStream fstream = new FileInputStream(
					"C:\\Abhishek\\Code\\LogParserApp\\src\\main\\resources\\LogFile.log");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			//Gson gson = new Gson();
			ObjectMapper mapper = new ObjectMapper();
			String pattern = "yyyy-MM-DD HH:mm:ss.SSSZ";
			
			SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern, new Locale("en", "US"));			
			/* read log line by line */
			while ((strLine = br.readLine()) != null) {
				try {
					//ParserDto parserDto = gson.fromJson(strLine, ParserDto.class);
					ParserDto parserDto = mapper.readValue(strLine, ParserDto.class);	
					
					
					//String date = simpleDateFormat.format(new Date());
					//Date date1=simpleDateFormat.parse(sDate1);  
					//System.out.println(date);
					
					// System.out.println (strLine);
					logs.add(parserDto);
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
			}
			fstream.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		System.out.println(logs);
		return logs;

	}

}
