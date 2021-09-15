//Given a cost and an amount, work out the change given in specific coinage.
//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
//1 £10 note
//1 £5 note
//2 20p's
//1 2p

package com.liambass.iterationexercises;

public class Coins {

	public static void main(String[] args) {
		int totalpence = 458;
		int paidpence = 2000;
		change(totalpence, paidpence);

	}

	private static void change(int tot, int paid) {
		int change = paid - tot;
		int i = 0;
		while (change > 5000) {
			change -= 5000;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " £50 note(s)");}
		i = 0;
		while (change > 2000) {
			change -= 2000;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " £20 note(s)");}
		i = 0;
		while (change > 1000) {
			change -= 1000;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " £10 note(s)");}
		i = 0;
		while (change > 500) {
			change -= 500;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " £5 note(s)");}
		i = 0;
		while (change > 200) {
			change -= 200;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " £2 coin(s)");}
		i = 0;
		while (change > 100) {
			change -= 100;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " £1 coin(s)");}
		i = 0;
		while (change > 50) {
			change -= 50;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " 50p(s)");}
		i = 0;
		while (change > 20) {
			change -= 20;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " 20p(s)");}
		i = 0;
		while (change > 10) {
			change -= 10;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " 10p(s)");}
		i = 0;
		while (change > 5) {
			change -= 5;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " 5p(s)");}
		i = 0;
		while (change > 2) {
			change -= 2;
			i += 1;
		}
		if (i != 0) {System.out.println(i + " 2p(s)");}
		if (change != 0) {System.out.println(change + " 1p(s)");}

	}

}
