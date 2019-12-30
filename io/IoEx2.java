package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoEx2 {
	public static void main(String[] args){
		long startTime =System.currentTimeMillis();
		IoEx2 fs = new IoEx2();
		fs.execute();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime-startTime;
		System.out.println("program finished in millis="+executionTime);
	}
public void execute()  {
	InputStream is =null;
	OutputStream os =null;
	try {
		File inputFile = new File("C:/Users/admin/eclipse-workspace/Files/Test1.txt");
		is = new FileInputStream(inputFile);
		File outFile = new File("C:/Users/admin/eclipse-workspace/Files/Test2.txt");
		os = new FileOutputStream(outFile);
		int readBytesCount;
		byte[] buffer = new byte[1000];
		BufferedInputStream bis =new BufferedInputStream(is);
		while((readBytesCount=bis.read(buffer))>=0) {
			os.write(buffer,0,readBytesCount);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(is!=null) {
				is.close();
			}
			if(os!=null) {
				os.close();
			}
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
		
	}
}
}
