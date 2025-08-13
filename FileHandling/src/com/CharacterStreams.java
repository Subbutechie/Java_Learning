package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharacterStreams {
	
	public static void main(String[] args) throws IOException {
		
		//IOwithFileReaderWriter();
		IOwithBufferReaderBufferWriter();
		IOwithBufferReaderPrintWriter();
		
	}

	
	private static void IOwithBufferReaderPrintWriter() throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("file.txt"));
			outputStream = new PrintWriter(new File("output.txt"));
			
			String line;
			while((line = inputStream.readLine()) != null) {
				outputStream.println(line);
			}
			
		}
		finally {
			if(inputStream != null) {
				inputStream.close();
			}
			
			if(outputStream != null) {
				outputStream.close();
			}
		}
		
	}


	private static void IOwithBufferReaderBufferWriter() throws IOException {
		
		BufferedReader inputStream  = null;
		BufferedWriter outputStream = null;
		int c;
		//If you want to print anything on to the console use System.in and System.out
		try {
			inputStream = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Type something..");
			String input = inputStream.readLine();
			System.out.println("user's typed: "+input);
			
			outputStream = new BufferedWriter(new OutputStreamWriter(System.out));
			outputStream.write("This is being printed by using the Buffered Writer");
		}
		finally {
			if(inputStream !=null) {
				inputStream.close();
			}
			
			if(outputStream != null) {
				outputStream.close();
			}
		}
		
	}

	private static void IOwithFileReaderWriter() throws IOException {
		
		FileReader inputStream  = null;
		FileWriter outputStream = null;
		int c ;
		
		try {
			inputStream = new FileReader("file.txt");
			outputStream = new FileWriter("output.txt",true);
			
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
	}
	
}
