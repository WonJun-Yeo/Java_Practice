//package chap19.EX08;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//
///* 1. 콘솔에서 한글을 인풋받아서 쓰기
// * 		c:\Temp\a\aaa.txt(MS949)
// * 		c:\Temp\b\bbb.txt(MS949)
// * 2. 파일을 읽기 
// */
//
//public class EX_Reader_Writer {
//
//	public static void main(String[] args) {
//		// 쓰기
//		File wFile = new File("c:\\Temp\\a\\aaa.txt");
//		File wFile2 = new File("c:\\Temp\\b\\bbb.txt");
//		
//		try {
//			InputStreamReader isr = new InputStreamReader(System.in, "MS949");
//			System.out.println("한글을 입력해주세요. >>");
//			int data;
//			while ((data = isr.read()) != '\r') {
//			}
//			OutputStream os = new FileOutputStream(wFile);
//			OutputStreamWriter osr = new OutputStreamWriter(os);
//			osr.write(isr);
//		} catch (Exception e) {}
//		
//		
//	}
//
//}
