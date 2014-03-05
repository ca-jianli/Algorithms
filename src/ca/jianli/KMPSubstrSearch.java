package ca.jianli;

/**
 * Implement Knuth-Morris-Pratt (KMP) substring search algorithm
 * 
 * @author jli132
 * 
 */
public class KMPSubstrSearch {
	int[][] dfa;
	String p;
	int R = 256;
	int M;

	public KMPSubstrSearch(String p) {
		M = p.length();

		// construct finite automaton

		dfa = new int[R][M];
		dfa[charAt(p, 0)][0] = 1;
		for (int prev = 0, j = 1; j < M; j++) {
			for (int i = 0; i < R; i++) {
				dfa[i][j] = dfa[i][prev];
			}
			dfa[charAt(p, j)][j] = j + 1;
			prev = dfa[charAt(p, j)][prev];
		}

	}

	public int find(String text) {

		// state correspond to number of matching chars

		int state = 0;

		for (int i = 0; i < text.length(); i++) {
			state = dfa[charAt(text, i)][state];
			if (state == M)
				return i - M + 1;
		}

		return -1;
	}

	private int charAt(String p, int i) {
		return p.charAt(i) % R;
	}
}
