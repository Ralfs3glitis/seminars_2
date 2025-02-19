package model;

public class Professor {
	private long p_ID = 0;
	private String name = "";
	private String surname = "";
	private String degree = "";
	public Professor(String x, String y, String z) {
		p_ID += 1;
		name = x;
		surname = y;
		degree = z;
	}
}
