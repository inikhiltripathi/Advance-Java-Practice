package ioStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File3 {
 public static void main(String[] args){
try (FileWriter fw = new FileWriter("C:\\Users\\Nikhil Tripathi\\Desktop\\Test2.txt")) {
fw.write("Java Programming");
	}	catch (Exception e) {
	   System.out.println(e);
	}
FileReader fr=null;
try {
	fr = new FileReader("C:\\Users\\Nikhil Tripathi\\Desktop\\Test2.txt");
} catch (FileNotFoundException e) {
	System.out.println(e);
}
int i;
try {
	while((i=fr.read())!=-1) {
		System.out.print((char)i);
	   }
} catch (IOException e) {
	System.out.println(e);
}
}
}
/* Output
Java Programming
*/