package ioStream;

import java.io.File;

public class File2 {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Nikhil Tripathi\\Desktop\\Test2.txt");
		System.out.println("File Exists : "+f.exists());
		System.out.println("File is Readable : "+f.canRead());
		System.out.println("File is Writable : "+f.canWrite());
		System.out.println("File Length : "+f.length());
		System.out.println("File Absolute Path : "+f.getAbsolutePath());
	}
}
/*--Output--
File Exists : true
File is Readable : true
File is Writable : true
File Length : 0
File Absolute Path : C:\Users\Nikhil Tripathi\Desktop\Test2.txt
 */