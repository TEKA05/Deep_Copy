package com.universal_yazilim.bid.ysm.oop.cloning.deep_copy;

public class Main
{

	public static void main(String[] args)
	{
		Calisan calisan1 = new Calisan();
		calisan1.a = 1000;
		calisan1.b = 2000;
		calisan1.lokasyon.x = 100;
		calisan1.lokasyon.y = 200;
		
		if(calisan1.clone() != null)
		{
			// Calisan calisan2 = calisan1;
			
			// calisan2, calisan1'in klonunu iþaret ediyor.
			Calisan calisan2 = (Calisan)calisan1.clone();



			calisan2.a = 100000;
			
			System.out.println("calisan1 a:" +  calisan1.a + ", b:" + calisan1.b 
					+ ", x:" + calisan1.lokasyon.x + ", y:" + calisan1.lokasyon.y);
			
			System.out.println("calisan2 a:" +  calisan2.a + ", b:" + calisan2.b 
					+ ", x:" + calisan2.lokasyon.x + ", y:" + calisan2.lokasyon.y);
			
			
			calisan2.lokasyon.x = -100;
			
			
			System.out.println("\n");

			System.out.println("calisan1 a:" +  calisan1.a + ", b:" + calisan1.b 
					+ ", x:" + calisan1.lokasyon.x + ", y:" + calisan1.lokasyon.y);
			
			System.out.println("calisan2 a:" +  calisan2.a + ", b:" + calisan2.b 
					+ ", x:" + calisan2.lokasyon.x + ", y:" + calisan2.lokasyon.y);
			
		}
	}
	

}
