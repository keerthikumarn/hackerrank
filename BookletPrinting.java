package com.hackerrank.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BookletPrinting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;

		while (!(s = br.readLine()).equals("0")) {
			int pages = Integer.parseInt(s);
			StringBuilder sb = new StringBuilder("Printing order for ");
			sb.append(s);
			sb.append(" pages:\n");

			int currSheet = 1;
			boolean leftBig = true;
			int actualPage = pages;
			if (pages % 4 != 0) {
				actualPage += (4 - pages % 4);
			}
			if (pages == 1) {
				System.out.println("Printing order for 1 pages:\nSheet 1, front: Blank, 1");
			} else {
				for (int i = 1; i <= actualPage / 2; i++) {
					sb.append("Sheet ");
					sb.append(currSheet);
					sb.append(", ");
					if (leftBig) {
						sb.append("front: ");
						if (actualPage - i + 1 <= pages) {
							sb.append(actualPage - i + 1);
						} else {
							sb.append("Blank");
						}
						sb.append(", ");
						sb.append(i);
					} else {
						sb.append("back : ");
						sb.append(i);
						sb.append(", ");
						if (actualPage - i + 1 <= pages) {
							sb.append(actualPage - i + 1);
						} else {
							sb.append("Blank");
						}
						currSheet++;
					}
					leftBig = !leftBig;
					sb.append("\n");
				}
				System.out.print(sb.toString());
			}
		}
	}
}