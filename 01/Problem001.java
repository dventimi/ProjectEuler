package org.neptunestation.projecteuler;

import java.util.*;


/**
 * Multiples of 3 and 5
 *
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3
 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *  
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {
    public static void main (String[] args) {
	if (args.length==0) System.exit(1);
	int sum = 0;
	try {
	    final int limit = Integer.parseInt(args[0]);
	    for (int i = 0; i<limit; i++)
		for (String s : Arrays.copyOfRange(args, 1, args.length))
		    if (i%Integer.parseInt(s)==0) {
			sum+=i;
			break;}
	    System.out.println(sum);}
	catch (Exception e) {
	    System.exit(1);}}}
