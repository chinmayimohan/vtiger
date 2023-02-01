package CWebPages;

import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataproviders2 {
	@DataProvider(name="testdata")
	public Object[][] testdata(){
		Object data[][]=new Object[2][2];
		data[0][0]="van";
		data[0][1]="bus";
		data[1][0]="key";
		data[1][1]="lock";
		return data;
		
	}
	@Test(dataProvider="testdata")
	public void demo(String a,String b) {
		System.out.println(a+"  "+b);
		
	}

}
