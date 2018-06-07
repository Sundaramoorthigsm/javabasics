package com.basic;

public class Emergency {
	

	
	String name;
	String  phnnumber;
	String location;
	String time;
	static String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnnumber() {
		return phnnumber;
	}
	public void setPhnnumber(String phnnumber) {
		this.phnnumber = phnnumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public static String getType() {
		return type;
	}
	public static String setType(String type) {
		Emergency.type = type;
		return type;
	}
	public String solve()
	{
		switch(type)
		{
		case "crime":
			return "police";

		case "injury":
			return "ambulance";
		case "fire":
		 return "fireengine";
			default:
				return "accident";
		}
		
	}
	public static void main(String args[])
	{
		Emergency e1=new Emergency();
		e1.setName("SundaraMoorthi");
		e1.setPhnnumber("7708036108");
		e1.setLocation("erode");
		e1.setTime("5.00pm");
		e1.setType("ambulance");
		System.out.println("the method is emergency" +e1.solve());
		System.out.println(e1.getName());
		System.out.println(e1.getPhnnumber());
		System.out.println(e1.getLocation());
		System.out.println(e1.getTime());
		//System.out.println("the method is " +e1.solve());
		
		
	}

	}
	
