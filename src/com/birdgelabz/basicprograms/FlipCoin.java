package com.birdgelabz.basicprograms;

public class FlipCoin {

	public static void main(String[] args) {
		double coin = (int) (Math.random() * 10) % 2;
		//System.out.println(coin);
		if (coin == 1) {
			System.out.println("Head");
		} else {
			System.out.println("Tail");
		}

	}

}
