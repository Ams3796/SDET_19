package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
		@Test(dataProvider="getvalues")
		public void data(String s1,String s2)
		{
			System.out.println(s1+""+s2);
		}
		
		@DataProvider
		public Object[][]getvalues()
		{
		     Object[][]arr=new Object[5][2];
		     
		     arr[0][0]="US1";
		     arr[0][1]="PWD1";
		     
		     arr[1][0]="US2";
		     arr[1][1]="PWD";
		     
		     arr[2][0]="US3";
		     arr[2][1]="PWD3";
		     
		     arr[3][0]="US4";
		     arr[3][1]="PWD4";
		     
		     arr[4][0]="US5";
		     arr[4][1]="PWD5";
		     
		     return arr;
		}
			
	

		
	}


