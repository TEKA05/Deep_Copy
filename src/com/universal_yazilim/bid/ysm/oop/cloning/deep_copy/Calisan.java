package com.universal_yazilim.bid.ysm.oop.cloning.deep_copy;

import com.universal_yazilim.bid.ysm.utility.Util;

public class Calisan implements Cloneable
{
	int a;
	
	int b;
	
	Lokasyon lokasyon = new Lokasyon();


	@Override
	public Object clone()
	{
		try
		{ Calisan calisan = (Calisan) super.clone();
			calisan.lokasyon = (Lokasyon) lokasyon.clone();
			return calisan;
		}
		catch (CloneNotSupportedException  e) 
		{
			Util.showGeneralExceptionInfo(e);
			return null;
		}
	}
}
