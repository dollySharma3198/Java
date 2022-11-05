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
	    Arraylist<Integer>l1=new Arraylist<Integer>();  //Arraylist IS A MODIFIED ARRAY
	    Arraylist<Integer>l2=new Arraylist<Integer>();
	    l2.add(4);
	    l2.add(1);
	    l2.add(3);
	    l2.add(8);
	    
	    
		l1.add(6);
		l1.add(4);
		l1.add(3);
		l1.add(5);
		l1.add(1);
		//l1.add(index 0,element 5);
		l1.addAll(l2);
		System.out.println(l1.contains(5));   //for boolean
		System.out.println(l1.indexOf(5));
		System.out.println(l1.lastindexOf(5));
		System.out.println(l1.remove(3));
		l1.set(1,566);
		
		
		//l1.clear();
		
		for(int i=0; i<l1.size(); i++)  
		{   
		  System.out.println(l1.get(i));     //.get method
		  System.out.print(", ");     //for see the horizontal
		  
		}
	}
}	
		
	

