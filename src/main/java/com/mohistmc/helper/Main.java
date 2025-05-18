package com.mohistmc.helper;
import com.mohistmc.helper.ANSITest;

public class Main {
	public static void main(String[] args){
		boolean ansi = false;
		if (args[0].equalsIgnoreCase("-ANSI")){
			System.out.println("WARNING: If your console isn't support ANSI Escape Features, then maybe Causing a lot of inconvenience.\nIf you Don't know Current console Support or not support ANSI, Please run 'ANSI Test' Utility Application.");
			System.out.print("Do you need it? (Y/n)");
			String str = new Scanner(System.in).nextLine();
			if (str.toLowerCase().equals("y")){
				
			}
			ansi = true;
		}
	}
}
