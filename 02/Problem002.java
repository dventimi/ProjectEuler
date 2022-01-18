package org.neptunestation.projecteuler;

import java.util.*;

/**
 * Even Fibonacci numbers
 *
 * Problem 2
 *
 * Each new term in the Fibonacci sequence is generated by adding the
 * previous two terms. By starting with 1 and 2, the first 10 terms
 * will be:
 *  
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *  
 * By considering the terms in the Fibonacci sequence whose values do
 * not exceed four million, find the sum of the even-valued terms.
 */								       

public class Problem002 {
    public static void main (String[] args) {
	if (args.length!=2) System.exit(1);
	long sum=0L;
	try {
	    final long limit = Long.parseLong(args[0]);
	    final int factor = Integer.parseInt(args[1]);
	    for (long n : new Iterable<Long> () {
		    public Iterator<Long> iterator () {
			return new Iterator<Long> () {
			    long a = 0L;
			    long b = 1L;
			    long c = 0L;
			    public boolean hasNext () {
				return (a+b)<limit;}
			    public Long next () {
				c = a+b;
				a = b;
				b = c;
				return c;}};}}) if (n%factor==0) sum+=n;
	    System.out.println(sum);}
	catch (Exception e) {System.exit(1);}}}
