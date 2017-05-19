package com.bit.oop8.filewriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Filewriter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName ="src/com/bit/filewriter/grade/txt";
		
		try {
			PrintWriter pw =new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


}
