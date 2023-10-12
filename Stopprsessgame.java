package com.game;
import java.util.Scanner;
import java.util.Random;
public class Stopprsessgame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		//Selecting Random number 1-stone,2-Paper,3-Scissor
		int compchoice = rand.nextInt(3);
		// User selecting his choice
		System.out.println("Welcom to the Game OF STONEpaperSCISSOR\nPlease Enter Your Choice");
		System.out.println("1.Stone\n2.Paper\n3.Scissor");
		int usrchoice = s.nextInt();
		//Game logic
	
		if(compchoice==usrchoice) {
			System.out.println("DRAW");
		}
		else if(usrchoice==1 && compchoice==3) {
			System.out.println("YOU WON");
		}
		else if(usrchoice==1 && compchoice==2) {
			System.out.println("YOU LOOSE");
		}
		else if(usrchoice==2 && compchoice==1) {
			System.out.println("YOU WON");
		}
		else if(usrchoice==2 && compchoice==3) {
			System.out.println("YOU LOOSE");
		}
		else if(usrchoice==3 && compchoice==2) {
			System.out.println("YOU WON");
		}
		else if(usrchoice==3 && compchoice==1) {
			System.out.println("YOU LOOSE");
		}
		s.close();
		}
	
	}


