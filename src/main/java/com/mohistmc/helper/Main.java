package com.mohistmc.helper;

public class Main {
	public static void main(String[] args){
		if (args[0] == "/mohistmc"){
			switch(args[1]){
				case "1.7.10":
					System.out.println("此版本已被弃用。");
					break;
				case "1.12.2":
					throw new Exception("Not implements yet.")
					break;
			}
		}
	}
}
