package CWebPages;

import java.util.Scanner;

import org.testng.annotations.Test;

public class WorkingWithDataProviders {
@Test
public void demo() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter row and clm");
	String data[][]=new String[sc.nextInt()][sc.nextInt()];
	System.out.println("enter values");
	for(int i=0;i<data.length;i++) {
		for(int j=0;j<data[i].length;j++) {
			data[i][j]=sc.next();
		}
		
	}
	for(int i=0;i<data.length;i++) {
		for(int j=0;j<data[i].length;j++) {
			System.out.print(data[i][j]+" ");
		}
		System.out.println();
	}
	
}


}
