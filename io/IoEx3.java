package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoEx3 {
	public static void main(String[] args){
		IoEx3 fs = new IoEx3();
		fs.execute();
	}
public void execute()  {
	InputStream is =System.in;
	OutputStream os =System.out;
	try {	
		int read;
		while((read=is.read())>=0) {
			os.write(read);
			//System.out.write(read);
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
			System.out.println("couldnt trace stream properly");
		}
		
	}
}
}
