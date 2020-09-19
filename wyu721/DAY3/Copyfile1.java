package Homework1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile1 {// 以文件流方式复制文件
	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String fileSrc = "D:/A/myfile.txt";
		String fileDes = "D:/A/myfile_cp.txt";
		copyFile(fileSrc, fileDes);// 调用文件复制方法
		System.out.println("C:/A文件复制成功");
	}
}
