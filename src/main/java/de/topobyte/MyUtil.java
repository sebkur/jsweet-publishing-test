package de.topobyte;

import de.topobyte.viewports.geometry.Coordinate;

public class MyUtil
{

	public static void printSomething()
	{
		System.out.println("Hello JSweet");
	}

	public static String returnSomething()
	{
		return "Hello JSweet";
	}

	public static Coordinate newCoord(int x, int y)
	{
		return new Coordinate(x, y);
	}

}
