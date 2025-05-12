package com.mohistmc.helper;

public class Main {
	public static void main(String[] args){
		boolean ansi = false;
		if (args[0].equalsIgnoreCase("-ANSI")){
			System.out.println("WARNING: If your console isn't support ANSI Escape Features");
			ansi = true;
		}
	}
}
