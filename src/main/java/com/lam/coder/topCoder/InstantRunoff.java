package com.lam.coder.topCoder;

import java.util.Arrays;

/**
 * 
 * @author Ludoviko Azuaje
 * 
 *         Problem Statement
 * 
 *         Many elections are decided by plurality voting, which means that the
 *         winning candidate is the one who earns more votes than any other
 *         candidate. Such elections are susceptible to the phenomenon of vote
 *         splitting. Several candidates with similar views may draw support
 *         from the same voting base, thereby losing to a single candidate who
 *         holds less popular views. One remedy for vote splitting is a runoff
 *         election, where the field of candidates is narrowed down through
 *         successive rounds of voting until one candidate wins a majority of
 *         the vote.
 * 
 *         The scheme known as instant runoff voting, or IRV, is intended to
 *         accomplish the same result as a runoff election without incurring the
 *         expense of multiple voting rounds. In an IRV election, each voter
 *         uses a slip of paper called a ballot to rank the slate of n
 *         candidates from 1 to n. The ballots are tallied as follows.
 * 
 *         1. If one candidate is ranked first on more than half of all ballots,
 *         this candidate is declared the winner.
 * 
 *         2. Otherwise, the candidate with the fewest number-one rankings is
 *         eliminated from all ballots, and each voter's ranking is adjusted as
 *         necessary. If a voter ranked this candidate first, for instance, the
 *         number-one rank on her ballot is now reallocated to her second-ranked
 *         candidate, and so on down the line. If several candidates are tied
 *         for fewest number-one rankings, all of them are eliminated in this
 *         fashion.
 * 
 *         3. If no candidates remain, the election is declared void. Otherwise,
 *         return to step 1.
 * 
 *         For an election with n candidates, you are given a String containing
 *         n distinct upper-case letters, each of which represents a candidate.
 *         You are also given a String[] encoding all ballots cast by the voting
 *         public. Each ballot ranks the candidates from most favored to least
 *         favored. If n is 5, for example, the candidates might be encoded as
 *         "PQRST", and some voter may rank them on her ballot as "SRTQP",
 *         signifying that she ranks candidate S first and candidate P fifth.
 * 
 *         Tally the ballots as described above to determine the outcome of the
 *         election. If the election is void, return an empty String. Otherwise,
 *         return a single-character String containing the candidate's code.
 * 
 *         Definition
 * 
 *         Class: InstantRunoff Method: outcome Parameters: String, String[]
 *         Returns: String Method signature: String outcome(String candidates,
 *         String[] ballots) (be sure your method is public)
 * 
 * 
 *         Constraints - candidates contains between 1 and 10 characters,
 *         inclusive - each character in candidates is an upper-case letter
 *         between 'A' and 'Z', inclusive - candidates contains no duplicate
 *         characters - ballots contains between 1 and 50 elements, inclusive -
 *         each element of ballots is exactly as long as candidates - each
 *         element of ballots contains the same characters as candidates,
 *         without duplication, but not necessarily in the same order
 * 
 *         Examples 0)
 * 
 * 
 *         "ABC"
 * 
 *         {"ACB", "BCA", "ACB", "BCA", "CBA"}
 * 
 *         Returns: "B"
 * 
 *         In the first round, candidates A and B earn two votes each, and C has
 *         only one. C is therefore eliminated. In the second round, B has three
 *         votes to A's two. 1)
 * 
 * 
 *         "DCBA"
 * 
 *         {"ACBD", "ACBD", "ACBD", "BCAD", "BCAD", "DBCA", "CBDA"}
 * 
 *         Returns: "B"
 * 
 *         2)
 * 
 * 
 *         "ACB"
 * 
 *         {"ACB", "BCA", "ACB", "BCA", "ACB", "BCA", "CBA", "CAB"}
 * 
 *         Returns: ""
 * 
 *         Candidates A and B have three votes each to C's two. C is eliminated.
 *         A and B now have four votes each, so both are eliminated. The
 *         election is void. 3)
 * 
 * 
 *         "CAB"
 * 
 *         {"ACB", "BCA", "ACB", "BCA", "ACB", "BCA", "CAB", "CAB"}
 * 
 *         Returns: "A"
 * 
 *         C is eliminated in the first round. In the second round, candidate A
 *         has five votes to B's three. A wins. 4)
 * 
 * 
 *         "Z"
 * 
 *         {"Z"}
 * 
 *         Returns: "Z"
 * 
 *         Z wins by unanimous vote.
 * 
 *         This problem statement is the exclusive and proprietary property of
 *         TopCoder, Inc. Any unauthorized use or reproduction of this
 *         information without the prior written consent of TopCoder, Inc. is
 *         strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.
 * 
 *         This problem was used for:
 * 
 *         Single Round Match 175 Round 1 - Division I, Level One
 * 
 *         Single Round Match 175 Round 1 - Division II, Level Two
 * 
 */

public class InstantRunoff {

	public String outcome(String candidates, String[] ballots) {
		String losers;

		if (candidates.length() == 1) {
			return candidates;
		}

		while (candidates.length() > 0) {
			CandadidateVotes[] election = this.findListVotes(candidates, ballots);

			CandadidateVotes winner = election[candidates.length() - 1];

			if (winner.getVotes() > Math.floor(ballots.length / 2.0)) {
				return winner.getCandidate();
			} else {
				losers = this.findLosers(election);
			}

			// delete losers
			for (int i = 0; i < losers.length(); i++) {
				for (int j = 0; j < ballots.length; j++) {
					ballots[j] = ballots[j].replace(losers.charAt(i) + "", "");
				}
				candidates = candidates.replace(losers.charAt(i) + "", "");
			}
		}

		return "";
	}

	private String findLosers(CandadidateVotes[] election) {
		String losers = "";

		losers += election[0].getCandidate();

		for (int i = 1; i < election.length; i++) {
			if (election[i].votes == election[0].votes) {
				losers += election[i].getCandidate();
			}
		}

		return losers;
	}

	private CandadidateVotes[] findListVotes(String candidates, String[] ballots) {
		CandadidateVotes[] array = new CandadidateVotes[candidates.length()];

		int summa = 0;
		for (int i = 0; i < candidates.length(); i++) {
			for (int j = 0; j < ballots.length; j++) {
				if (candidates.charAt(i) == ballots[j].charAt(0)) {
					summa++;
				}
			}
			array[i] = new CandadidateVotes(candidates.charAt(i) + "", summa);
			summa = 0;
		}

		Arrays.sort(array);

		return array;
	}

	private class CandadidateVotes implements Comparable<CandadidateVotes> {
		String candidate;
		int votes;

		public int getVotes() {
			return this.votes;
		}

		public String getCandidate() {
			return this.candidate;
		}

		public CandadidateVotes(String candidate, int votes) {
			this.candidate = candidate;
			this.votes = votes;
		}

		public int compareTo(CandadidateVotes other) {
			return this.votes > other.votes ? 1 : this.votes < other.votes ? -1
					: 0;
		}

		@Override
		public String toString() {
			return "CandadidateVotes [candidate=" + this.candidate + ", votes="
					+ this.votes + "]";
		}
	}
}
