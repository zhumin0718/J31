package J31;

import java.io.File;
import java.io.IOException;

public class Liu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File file=new File("G:/J301.Java");
     System.out.println("文件或者文件夹是否存在"+file.exists());
     System.out.println("判断是文件还是文件夹"+file.isFile());
     System.out.println("文件名"+file.getName());
     System.out.println("绝对路径"+file.getAbsolutePath());
     System.out.println("父路径"+file.getParent());
     System.out.println("文件字节"+file.length());
     System.out.println("创建一个新的文件夹"+file.createNewFile());
	}

}
