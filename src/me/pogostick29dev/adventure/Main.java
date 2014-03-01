package me.pogostick29dev.adventure;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		print("What is your name?");
		
		String name = s.nextLine();
		
		Player player = new Player(name);
		
		print("Welcome to Adventure, " + player.getName() + "!");
		
		int input;
		
		do {
			System.out.println("[0] Quit.");
			System.out.println("[1] Go to the store.");
			System.out.println("[2] Go into the forest.");
			System.out.println("[3] Talk to the townspeople.");
			
			input = s.nextInt();
			
			if (input == 0) {
				continue;
			}
			
			else if (input == 1) { // Go to the store.
				if (player.getMoney() - 1 < 0) {
					print("You don't have enough money.");
					continue;
				}
				
				if (player.getHealth() + 1 > 10) {
					print("You have max health.");
					continue;
				}
				
				print("You bought a health potion and restored some health.");
				player.modifyMoney(-1);
				player.modifyHealth(1);
			}
			
			else if (input == 2) { // Go into the forest
				if (player.getHealth() - 1 < 0) {
					print("You don't have enough health.");
					continue;
				}
				
				Monster m = new Monster(1);
				
				print("You discovered treasure in the forest after a long day of hiking.");
				player.modifyMoney(1);
				player.modifyHealth(-1);
			}
			
			else if (input == 3) { // Talk to the townspeople.
				String[] msgs = new String[] {
						"Hey there.",
						"How are you today?",
						"Nice weather we've been having!",
						"This game is amazing! Oops, I just broke the fourth wall."
						};
				
				print(msgs[rand.nextInt(msgs.length)]);
			}
			
			else {
				print("Invalid item.");
			}
		} while (input != 0);
	}
	
	public static void print(String msg) {
		System.out.println("Adventure: " + msg);
	}
}