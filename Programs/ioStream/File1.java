package ioStream;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Nikhil Tripathi\\Desktop\\Test2.txt");
		if (f.createNewFile()) {
			System.out.println("File Created Successfully");	
		}else {
			System.out.println("File Already Exists");
		}
	}

}
/*--Output--
File Created Successfully
*/