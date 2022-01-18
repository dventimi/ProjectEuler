package org.neptunestation.projecteuler;

import java.util.*;

/**
 * Largest prime factor
 *
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *  
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {
    public static void main (String[] args) {
	for (String s : args) {
	    try {
		long limit = Long.parseLong(s);
		for (long n : pi1(limit))
		    System.out.println(n);}
	    catch (Exception e) {
		System.exit(1);}}}

	public static Iterable<Long> pi1 (long limit) {
	    return new Iterable<Long> () {
		public Iterator<Long> iterator () {
		    return new Iterator<Long> () {
			LinkedList<Long> primes = new LinkedList<>();
			boolean hasNext = false;
			boolean hasFactor (long c) {
			    for (long p : primes) if (c%p==0) return true;
			    return false;}
			long searchNext () {
			    if (primes.size()==0) return 2L;
			    long candidate = primes.getLast() + 1;
			    while (hasFactor(candidate)) candidate++;
			    return candidate;}
			public boolean hasNext () {
			    if (hasNext) return true;
			    primes.add(searchNext());
			    if (primes.size()>0) if (primes.getLast()>limit) return false;
			    hasNext = true;
			    return true;}
			public Long next () {
			    hasNext = false;
			    return primes.getLast();}};}};}}

