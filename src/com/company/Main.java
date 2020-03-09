package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Введите число ");
	int k=in.nextInt();
	int resault=1;
	for (int i=2; i<=k; i++){
    resault*=i;
    }
	System.out.println(  "!"+k+"="+resault);
    }
}
