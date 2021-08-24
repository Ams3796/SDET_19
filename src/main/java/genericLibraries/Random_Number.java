package genericLibraries;

import java.util.Random;

public class Random_Number {

	public int random_data()
	{
		Random r=new Random();
		int ran=r.nextInt(1000);
		System.out.println(ran);
		return ran;

	}

}
