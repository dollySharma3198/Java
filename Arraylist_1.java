// java.util	
// Contains the collections framework, some internationalization support classes,
// a service loader, properties, random number generation, string parsing and scanning classes, 
// base64 encoding and decoding, a bit array, and several miscellaneous utility classes.
// import java.util.Scanner;

//error

package com.company;
import java.util.*;


public class Main  //Arraylist  
{   
 
	public static void main(String[] args) {
	    Arraylist<Integer>l1=new Arraylist<Integer>();       //Arraylist IS A MODIFIED ARRAY
		l1.add(6);
		l1.add(4);
		l1.add(3);
		l1.add(5);
		l1.add(1);
	//	l1.add(index 0,element 5);
		for(int i=0; i<l1.size(); i++)  
		{   
		  System.out.println(l1.get(i));     //.get method
		}
	}
}	
		
	

