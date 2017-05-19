package com.bit.oop8.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String fileName="src/com/bit/oop8/filereader/grade.txt";
		
		try {
			FileReader filereader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(filereader);
			
			String reader = new String();
			while(reader != null){
				reader=buffer.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
