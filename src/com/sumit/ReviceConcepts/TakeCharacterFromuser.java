package com.sumit.ReviceConcepts;
import java.util.Scanner;

public class TakeCharacterFromuser 
{
	public static void main(String[] args) {
		System.out.println("Enter the chacter");
		Scanner sc = new Scanner(System.in);
		char cr=sc.next().charAt(0);
		
		System.out.println(cr);
	}

}
