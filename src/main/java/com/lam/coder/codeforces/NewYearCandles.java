package com.lam.coder.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * @author L.Azuaje.
 * 
 *         Программист Василий любит романтику — поэтому на этот Новый Год он
 *         решил освещать свою комнату свечами.
 * 
 *         У Василия есть a свечей. Когда Василий зажигает новую свечу, сначала
 *         она горит ровно один час, а затем тухнет. Василий — сообразительный
 *         малый, поэтому из b потухших свечей он умеет получать одну новую
 *         свечу. В последствии эту новую свечу (так же как и другие новые
 *         свечи) можно зажечь.
 * 
 *         Теперь Василию интересно, на сколько часов освещения хватит его
 *         свечек, если он будет действовать оптимальным образом. Помогите ему
 *         найти это число.
 * 
 *         Входные данные В единственной строке заданы два целых числа a и b
 *         (1 ≤ a ≤ 1000; 2 ≤ b ≤ 1000).
 * 
 *         Выходные данные Выведите единственное целое число — количество часов,
 *         которое Василий сможет освещать комнату.
 * 
 *         Примеры тестов входные данные 4 2 выходные данные 7 входные данные 6
 *         3 выходные данные 8 Примечание Рассмотрим первый тестовый пример.
 *         Первые четыре часа Василий будет зажигать свечи, которые изначально
 *         были новые, дальше из четырех потухших свечей он сделает две новые,
 *         которые в последствии зажжет. Когда эти две свечи прогорят (станут
 *         потухшими), можно будет из них сделать еще одну свечу. Итого, Василий
 *         сможет освещать комнату 7 часов.
 *
 */

public class NewYearCandles {

	public int find(String string) {

		String[] data = string.split(" ");

		float a = Float.parseFloat(data[0]);
		float b = Float.parseFloat(data[1]);
		float c = a;

		while (true) {
			c += a / b;
			a = a / b;

			if (a / b < 1 - (c - (int) c)) {
				break;
			}

		}

		return (int) Math.floor(c);
	}

	public static void main(String[] args) throws IOException {
		MyScanner scanner = new MyScanner();
		PrintStream out = System.out;

		NewYearCandles main = new NewYearCandles();

		String string = scanner.next();
		out.println(main.find(string));

		scanner.reader.close();
		out.close();
	}

	// -----------MyScanner class for faster input----------
	public static class MyScanner {
		BufferedReader	reader;

		public MyScanner() {
			this.reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public void close() throws IOException {
			this.reader.close();
		}

		int nextInt() {
			return Integer.parseInt(this.next());
		}

		long nextLong() {
			return Long.parseLong(this.next());
		}

		double nextDouble() {
			return Double.parseDouble(this.next());
		}

		String next() {
			String str = "";
			try {
				str = this.reader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] nextStringArray() {
			String[] str = null;
			try {
				str = this.reader.readLine().trim().split(" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
}
