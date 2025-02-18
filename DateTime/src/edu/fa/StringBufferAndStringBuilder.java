package edu.fa;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Fresher ");
		sb.append("Academy");
		System.out.println(sb.toString());
		
		StringBuffer sbu = new StringBuffer();
		sbu.append("Fresher ");
		sbu.append("Academy");
		System.out.println(sbu.toString());
	}

}
