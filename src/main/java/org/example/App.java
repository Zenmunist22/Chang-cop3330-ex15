package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "What is the password? " );
        String pw = sc.nextLine();
        if (pw.equals("abc$123")){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }


    }
}
