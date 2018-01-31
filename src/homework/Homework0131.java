package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Homework0131 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
       File file=new File("G:/J31.Java");
       InputStream is=new FileInputStream(file);
       byte[] a=new byte[(int) file.length()];
       is.read(a);
       File file1=new File("F:/J31.Java");
       OutputStream os=new FileOutputStream(file1,true);
       os.write(a);
       is.close();
       os.close();
	}
}
