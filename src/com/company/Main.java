package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
By using Scanner, find the phone number of a specific name. PhoneBook is persisted in the "phonebook.txt".
phonebook.txt

Abby 0321323132
Jolly 0313212222
Marius-Silviu Jilca 0313221222
Yey Ronaldo Perez 0231332211
Andrei Mladin 0731299212

Input: Marius
Output: 0313221222
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name:");
        String name = scanner.nextLine();
        Scanner sc = null;

        try{
            sc = new Scanner(new BufferedReader(new FileReader("phonebook.txt")));
            System.out.println("You searched: "+ name);
            while (sc.hasNext()) {
              if (sc.hasNextLine()){
                  String str = sc.nextLine();
                  if (str.toLowerCase().contains(name.toLowerCase())){
                      System.out.println(str.substring(0,str.length()-10)+ " phone no. is: "+ str.substring(str.length()-10));
                  }
              }
            }
        }
        finally{
            if (sc != null)
                sc.close();
        }
    }
}
