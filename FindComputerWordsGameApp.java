/*@Autor: Vanessa de Oliveira Lyra
ID: x19234554*/

import java.util.Random; //java library for the random .........
import java.util.Scanner;
import java.util.Arrays.*;
import java.util.*;
import java.io.*;


public class FindComputerWordsGameApp{ // creating class, starts the program

	public static void main(String args[]){


		//Declare variables
		String[] words = {"algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug", "binary", "browser", "bus", "cache", "command", "computer", "cookie", "compiler", "cyberspace",
		"compress", "configure", "database", "digital", "data", "debug", "desktop", "disk", "domain", "decompress", "development", "download", "dynamic", "email", "encryption", "firewall", "flowchart", "file", "folder",
		"graphics", "hyperlink", "host", "hardware", "icon", "inbox", "internet", "kernel", "keyword", "keyboard", "laptop", "login", "logic", "malware", "motherboard", "mouse", "mainframe", "memory", "monitor", "multimedia",
		"network", "node", "offline", "online", "path", "process", "protocol", "password", "phishing", "platform", "program","portal", "privacy", "programmer", "queue", "resolution", "root", "restore", "router", "reboot",
		"runtime", "screen", "security", "shell", "snapshot", "spam", "screenshot", "server", "script", "software", "spreadsheet", "storage", "syntax", "table", "template", "thread", "terminal", "username", "virtual",
		"virus", "web", "website", "window", "wireless"};
		String letters, randStr, randStrA,randStrB, playerA, playerB, againplay, winner, onlySame, onlySameB;
		int index, totPointA, totPointB;
		char char3;


		//Create objects
		FindComputerWordsGame myGM = new FindComputerWordsGame();
		Random ran = new Random(); //  Random class object
		Scanner vane = new Scanner(System.in); //create scanner named vane

		//Initialize variables
		playerA = new String();
		playerB = new String();
		winner = new String();

		totPointA=0;
		totPointB=0;
		letters = "abcdefghijklmnopqrstuvwxyz";//tring with all characters


		//Input
		//Initial game message with pontuation rules
		System.out.println("Welcome to the Find Computer Words Game!\n"
		+ "\n"
		+ "Pontuation rules:\n"
		+ "\n"
		+ "The player will receive the same amount of points as the number of duplicated vowels in the word formed. \n"
		+ "Example: bit:0 points / restore: 2 points \n"
		+ "\n");

		//Process

		do{ //do/while loop for game rounds

			//initialize variables
			int countA=0;
			int countE=0;
			int countI=0;
			int countO=0;
			int countU=0;
			int countA1=0;
			int countE1=0;
			int countI1=0;
			int countO1=0;
			int countU1=0;
			onlySame="";
			onlySameB="";
			StringBuilder stb = new StringBuilder();
			//randStr = "ptocsolerrvroe"; //to test the application


			//for loop with length 12 to create 12 random letters string
			for(int i = 0; i < 12; i++) {
				index = ran.nextInt(letters.length());// generate random index number
				char3 = letters.charAt(index);// get character specified by index from the string
				stb.append(char3);// append the character to string builder
			}

			randStr = stb.toString();
			randStrA = randStr;
			randStrB = randStr;
				System.out.println("The letters for this round are: " + randStr);
				System.out.println();

			//player A turn
			System.out.println("\n" + "PlayerA: Please enter your word.");
			playerA = vane.nextLine(); //send variable to scanner
			playerA=playerA.toLowerCase(); //convert to lower case
			char[] cha = playerA.toCharArray();

			for(int k = 0; k < playerA.length(); k++){ //for loop with nested if statement to count vowels qty
				if(cha[k] == 'a'){
					countA++;
				}
				else if(cha[k] == 'e'){
					countE++;
				}
				else if(cha[k] == 'i'){
					countI++;
				}
				else if(cha[k] == 'o'){
					countO++;
				}
				else if(cha[k] == 'u'){
					countU++;
				}
			}

			if((countA%2!=0) ||(countA==1)){ //transform all odd quantities to even and calculate round points
				countA=countA-1;
			}
			else if((countE%2!=0)||(countE==1)){
				countE=countE-1;
			}
			else if((countI%2==1)||(countI==1)){
				countI=countI-1;
			}
			else if((countO%2!=0)||(countO==1)){
				countO=countO-1;
			}
			else if((countU%2!=0)||(countU==1)){
				countU=countU-1;
			}
				totPointA = totPointA + (countA+countE+countI+countO+countU); // calculate total game points

			//loop to find for same characters
			StringBuilder stb2 = new StringBuilder();
			for(int j=0;j<playerA.length();j++){
				for(int k=0;k<randStrA.length();k++){
                  	if(playerA.charAt(j) == randStrA.charAt(k)){
						stb2.append(playerA.charAt(j));
                        	break;
                    }
                }
                onlySame = stb2.toString();
			}

			if((count(words, playerA))&& (playerA.equals(onlySame))){ //validate user input with array of valid number and 12 random letters and same characters
				System.out.println("Well done! The word chosen: " + playerA + ", is a valid word. Round points player A: " + (countA+countE+countI+countO+countU));
			}
			else{
				System.out.println( playerA + " is not a valid word better luck next round.");
			}


			//player B turn
			System.out.println("\n" + "PlayerB: Please enter your word.");
			playerB = vane.nextLine();
			playerB=playerB.toLowerCase();
			char[] cha1 = playerB.toCharArray();
			for(int h = 0; h < playerB.length(); h++){
				if(cha1[h] == 'a'){
					countA1++;
				}
				else if(cha1[h] == 'e'){
					countE1++;
				}
				else if(cha1[h] == 'i'){
					countI1++;
				}
				else if(cha1[h] == 'o'){
					countO1++;
					}
				else if(cha1[h] == 'u'){
					countU1++;
				}
			}

			if((countA1%2!=0) ||(countA1==1)){
				countA1=countA1-1;
			}
			else if((countE1%2!=0)||(countE1==1)){
				countE1=countE1-1;
			}
			else if((countI1%2==1)||(countI1==1)){
				countI1=countI1-1;
			}
			else if((countO1%2!=0)||(countO1==1)){
				countO1=countO1-1;
			}
			else if((countU1%2!=0)||(countU1==1)){
				countU1=countU1-1;
			}
				totPointB = totPointB + (countA1+countE1+countI1+countO1+countU1);

			//loop to find for same characters
			for(int l=0;l<playerB.length();l++){
				for(int m=0;m<randStrB.length();m++){
                  	if(playerB.charAt(l) == randStrB.charAt(m)){
						stb.append(playerB.charAt(l));
                        	break;
                    }
                }
                onlySameB = stb.toString();

			}


			if(((count1(words, playerB)) && (playerB.equals(onlySameB))) && (difer(playerA,playerB))){
				System.out.println("Well done! The word chosen: " + playerB + ", is a valid word. Round points playerB: " + (countA1+ countE1+ countI1+ countO1+ countU1));
			}
			else{
				System.out.println( playerB + " is not a valid word better luck next round.");
			}
			System.out.println("\n"
								+ "Do you want to play again? Enter Y for yes or N for no!");
				againplay = vane.nextLine();
		}
		while(againplay.equals("y")||againplay.equals("Y"));  //and of do/while loop

		System.out.println();

		myGM.setTotPointA(totPointA);
		myGM.setTotPointB(totPointB);
		myGM.compute();

		//Output
		winner = myGM.getWinner();

		if(winner.equals("Player A")){
			System.out.println( "Congratulations, player A, you scored: " + totPointA + " points, against: " + totPointB + " points from player B");
		}
		else if(winner.equals("Player B")){
			System.out.println( "Congratulations, player B, you scored: " + totPointB + " points, against: " + totPointA + " points from player A");
		}
		else{
			System.out.println( "No winner, it was a draw. Total points A: " + totPointA + ", total points B: " + totPointB );
		}

	}//end of method


	public static boolean count(String[] words, String playerA){ //validate array words with user input
		for (int j = 0; j < words.length; j++){
			if(words[j].equals(playerA))
				return true;
			}
		return false;
	}



	//part B
	public static boolean difer(String playerA, String playerB){ //check if words from the players are different in each round
		if(!playerA.equals(playerB)){
			return true;
		}
			return false;
	}


	public static boolean count1(String[] words, String playerB){ //validation for B
		for (int j = 0; j < words.length; j++){
			if(words[j].equals(playerB))
				return true;
			}
			return false;
	}



}//end of main class
