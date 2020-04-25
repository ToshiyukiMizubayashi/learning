package jp;

import java.io.File;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class practise {

	public static void main ( String[] args)
	{		
		ObjectMapper mapper = new ObjectMapper();
			try {
				Dto dto = mapper.readValue(new File() , Dto.class);
				System.out.println(dto.main);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
	}
}
