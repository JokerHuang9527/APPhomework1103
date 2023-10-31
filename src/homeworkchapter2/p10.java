package homeworkchapter2;

import java.io.*;

public class p10 {

	public static void main(String[] args) throws IOException
	{
		System.out.print("請輸入一個整數:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        if(num == 1)
        	System.out.println("輸入的是1");
        else
        	System.out.print("選擇的是1以外的數字");
        
	}

}
