package Homework1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile2 {// 缓冲流复制文件
	public static void main(String[] args) throws IOException {
		FileInputStream filei = new FileInputStream("D:/A/myfile.txt");
		BufferedInputStream bufferi = new BufferedInputStream(filei);

		FileOutputStream fileo = new FileOutputStream("D:/A/myfile_cp2.txt");
		BufferedOutputStream buffero = new BufferedOutputStream(fileo);

		int len = -1;
		while ((len = bufferi.read()) != -1) {
			buffero.write(len);
		}
		System.out.println("复制成功！！！");
		buffero.close();
		bufferi.close();
	}
}
