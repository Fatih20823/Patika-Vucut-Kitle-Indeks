package com.fatih.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		double Boy,Kilo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz: ");
		Boy = scan.nextDouble();
		System.out.println("Lutfen kilonuzu giriniz: ");
		Kilo = scan.nextDouble();
		
		double VucutKitleIndeks = Kilo/(Boy*Boy);
		
		System.out.println("Vucut Kitle Indeksiniz: "+VucutKitleIndeks);

	}

}
