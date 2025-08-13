package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MostRepeated {

	public static void main(String[] args) throws IOException {
		String url = "https://public.karat.io/content/urls2.txt";
		getMostRepeatedURl(url);
	}
	
	static void getMostRepeatedURl(String path) throws IOException {
		
		URL url = new URL(path);
		InputStream in = url.openStream();
		HashMap<String,Integer> mp = null ; 
		String[] arr = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			mp = new HashMap<String, Integer>();
			String line;
			while((line=br.readLine()) != null) {
				 arr = line.split("/");
				
				mp.put(arr[2], mp.getOrDefault(arr[2], 0)+1);
			}
			
	
		}
		catch(IOException e){
			e.getMessage();
		}
		
		Optional<String> op =  mp.entrySet().stream().sorted((x,y) -> y.getValue()-x.getValue()).map(x -> x.getKey()).findFirst();
		
		System.out.println(arr[0] + arr[1] + op.get());

		
		
	}
	
	

}
