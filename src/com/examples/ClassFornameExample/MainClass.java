package com.examples.ClassFornameExample;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.examples.ClassFornameExample.Class_forName_Example");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}

}
