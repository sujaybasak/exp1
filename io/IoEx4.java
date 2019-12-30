package io;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IoEx4 {
public static void main(String[] args) {
	IoEx4 ex = new IoEx4();
	ex.execute();
}
public void execute() {
	InputStreamReader reader =null;
	OutputStreamWriter writer =null;
	try {
reader = new InputStreamReader(System.in);
writer = new OutputStreamWriter(System.out);
int read;
while((read=reader.read())>=0) {
	writer.write(read);
	writer.flush();
	char ch = (char) read;
	if(ch=='z') {
		break;
	}
	//System.out.write(read);
}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(reader!=null) {
				reader.close();
			}
			if(writer!=null) {
				writer.close();
			}
		}
		catch(Exception e) {
			System.out.println("couldnt trace stream properly");
		}
		
	}
}
}
