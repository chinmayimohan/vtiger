package CWebPages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practicing_DataProviders {
	@DataProvider(name="testdata")
	public Object[][] testdata() {
		 Object[][] data=new Object[1][2];
		 data[0][0]="chinmayi";
		 data[0][1]="mohan";
		return data;
		}
	@Test(dataProvider="testdata")
	public void demo(String name,String lname) {
		System.out.print(name);
		System.out.println(lname);
		
	}
}
