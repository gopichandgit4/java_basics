package com.learn.io;// Java Program for taking user
// input using BufferedReader Class


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {

	// Main Method
	public static void main(String[] args) throws IOException
	{
		// Creating BufferedReader Object
		// InputStreamReader converts bytes to
		// stream of character
		int it=0;
		String str=null;
		BufferedReader bfn=null;

		try {
			bfn = new BufferedReader(
					new InputStreamReader(System.in));

			System.out.println("Please enter your Name:");
			// String reading internally
			str = bfn.readLine();

			System.out.println("Please enter your age (0-100):");
			// Integer reading internally

			it = Integer.parseInt(bfn.readLine());
		} catch (Exception ioe) {
			System.out.println("ecteption occured:");
		}
		// Printing String
		System.out.println("Entered String : " + str);

		// Printing Integer
		System.out.println("Entered Integer : " + it);
	}
}
