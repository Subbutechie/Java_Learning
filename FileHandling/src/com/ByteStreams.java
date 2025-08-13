package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreams {
	
	public static void main(String[] args) throws IOException {
		
		
		File ob  = new File("C:\\Users\\pudu.reddy\\git\\JavaPractice\\FileHandling\\src\\newFile.txt");
		
		/*
		 * if(ob.createNewFile()) { System.out.println("File is created"); } else {
		 * System.out.println("File already exists"); }
		 */
		if(ob.delete()) {
			System.out.println(ob.getName());
		};
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try{
			in = new FileInputStream("file.txt");
			out = new FileOutputStream("output.txt",true);
			int c;
			
			while((c = in.read()) != -1){
				out.write(c);
			}
		}
		
		finally{
			if(in != null) {
				in.close();
			}
			
			if(out != null) {
				out.close();
			}
			
		}
	}

}
