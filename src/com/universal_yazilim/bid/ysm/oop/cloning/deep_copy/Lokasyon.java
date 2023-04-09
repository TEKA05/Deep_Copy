package com.universal_yazilim.bid.ysm.oop.cloning.deep_copy;

public class Lokasyon implements Cloneable
{
	public int x; 
	public int y;
	
	public Lokasyon() 
	{
		x = 10;
		y = 20;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
