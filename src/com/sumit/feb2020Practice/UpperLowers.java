package com.sumit.feb2020Practice;

public class UpperLowers
{
    /*1. Sumit——nUmIt
    2. Sample97value6= 103
    3. Number is prime or not
    4. Find a duplicate character in the given string and a number occurrences
*/

    public static void main(String[] args) {

        String str = "Sumit";

        String st= "";

        for(int i=0; i<str.length(); i++)
        {
            char car = str.charAt(i);

            st = str+car;
            System.out.println(st);
        }

    }
}
