package com.bit.oop8.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereader01 {

	public static void main(String[] args) {
		
		
		
		String fileName = "src/com/bit/oop8/filereader/data.txt";

		
		try {
			FileReader filereader = new FileReader(fileName);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
