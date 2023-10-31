package homeworkchapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p47 {

	public static void main(String[] args) throws IOException
	{
        BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));
        
        Integer test[] = new Integer[5];
        
        System.out.println("請輸入5個人的分數:");
        
        for(int  i = 0; i < test.length; i++)
        	test[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(test, Collections.reverseOrder());;
        
        for(int i = 0; i < test.length; i++)
        	System.out.println("第"+ (i+1) +"名的分數是"+ test[i]);
	}

}
