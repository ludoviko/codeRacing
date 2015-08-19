package com.lam.coder.topCoder;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Class Name: DNA Method Name: getComplement Arg Types: String Return
 *         Type: String
 * 
 *         Implement a class DNA, which contains a method getComplement.
 *         getComplement takes a String representing a strand of DNA and returns
 *         the complement of that strand, as a String.
 * 
 *         DNA is composed of the following four bases: adenine, guanine,
 *         thymine, and cytosine. Two strands of DNA are considered complements
 *         of each other if all of the following conditions are met: - they are
 *         of equal length - for each adenine in the first strand, a thymine is
 *         located in the exact same position of the second strand - for each
 *         thymine in the first strand, an adenine is located in the exact same
 *         position of the second strand - for each guanine in the first strand,
 *         a cytosine is located in the exact same position of the second strand
 *         - for each cytosine in the first strand, a guanine is located in the
 *         exact same position of the second strand
 * 
 *         In both the input String and return String, let A stand for adenine,
 *         T for thymine, C for cytosine and G for guanine and let each
 *         character in the String represent a position in the DNA strand.
 * 
 *         Here is the method signature: String getComplement(String strStrand);
 *         Be sure your method is public.
 * 
 *         strStrand has length 1 to 50, inclusive. strStrand contains only the
 *         characters 'A', 'T', 'C', and 'G'.
 * 
 *         Examples: If the input is "GAAACT", the method should return "CTTTGA"
 *         If the input is "ACCAAAAGCTGCAGTATGA", the method should return
 *         "TGGTTTTCGACGTCATACT" If the input is
 *         "TAGGTCTCACTTAGCTTTCGTCCCTATAGTATATAGCTCCCAACCATCCA", the method
 *         should return "ATCCAGAGTGAATCGAAAGCAGGGATATCATATATCGAGGGTTGGTAGGT"
 * 
 *         Definition
 * 
 *         Class: DNA Method: getComplement Parameters: String Returns: String
 *         Method signature: String getComplement(String param0) (be sure your
 *         method is public)
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 *         
 *         This problem was used for: Single Round Match 8 Round 1 - Division I,
 *         Level One Single Round Match 8 Round 1 - Division II, Level One
 */

public class DNA {
	public static final char A = 'A';
	public static final char C = 'C';
	public static final char G = 'G';
	public static final char T = 'T';

	public String getComplement(String chain) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < chain.length(); i++) {
			switch (chain.charAt(i)) {
			case A:
				builder.append(T);
				break;
			case C:
				builder.append(G);
				break;
			case G:
				builder.append(C);
				break;
			case T:
				builder.append(A);
				break;
			default:
				break;
			}
		}
		return builder.toString();
	}
}
