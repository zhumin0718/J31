package J31;

import java.io.File;
import java.io.IOException;

public class Liu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File file=new File("G:/J301.Java");
     System.out.println("�ļ������ļ����Ƿ����"+file.exists());
     System.out.println("�ж����ļ������ļ���"+file.isFile());
     System.out.println("�ļ���"+file.getName());
     System.out.println("����·��"+file.getAbsolutePath());
     System.out.println("��·��"+file.getParent());
     System.out.println("�ļ��ֽ�"+file.length());
     System.out.println("����һ���µ��ļ���"+file.createNewFile());
	}

}
