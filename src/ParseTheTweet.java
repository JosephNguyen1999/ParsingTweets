/*
 * ParseTheTweet.java
 * Author:  Joseph Nguyen 
 * Submission Date:  1/28/2020
 *
 * Purpose: The purpose of this program is that it takes a tweet which is inputed by the keyboard and breaks it down into
 * categories of information.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		//keyboard input for the original tweet / original string
		Scanner keyboard = new Scanner(System.in);
		String tweet = keyboard.nextLine();
		
		//variables
		int type = tweet.indexOf("#typ");
		int detail = tweet.indexOf("#det");
		int location = tweet.indexOf("#loc");
		int latitude = tweet.indexOf("#lat");
		int longitude = tweet.indexOf("#lng");
		int semicolon = tweet.lastIndexOf(';');
		
		System.out.println(type);
		System.out.println(detail);
		
		
		//1st substring for type information
		String tweet2 = tweet.substring(type + 5, detail - 2);
		tweet2 = tweet2.trim();
		tweet2 = tweet2.toUpperCase();
		
		//2nd substring for detail information
		String tweet3 = tweet.substring(detail + 5, location - 2);
		tweet3 = tweet3.replace(',', '-');
		tweet3 = tweet3.trim();
		
		//3rd substring for location information
		String tweet4 = tweet.substring(location + 5,latitude - 2);
		tweet4 = tweet4.replace(',', '-');
		tweet4 = tweet4.trim();
		
		//4th substring for latitude information
		String tweet5 = tweet.substring(latitude + 5, longitude - 2);
		tweet5 = tweet5.trim();
		
		//5th substring for longitude information
		String tweet6 = tweet.substring(longitude + 5, semicolon);
		tweet6 = tweet6.trim();
		
		//prints the output and information in the correct format
		System.out.println("\nType:\t\t" + tweet2);
		System.out.println("Detail:\t\t" + tweet3);
		System.out.println("Location:\t" + tweet4);
		System.out.println("Latitude:\t" + tweet5);
		System.out.println("Longitude:\t" + tweet6);
		
		
		keyboard.close();
		

	}

}