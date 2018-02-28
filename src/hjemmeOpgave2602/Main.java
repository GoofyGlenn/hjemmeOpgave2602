package hjemmeOpgave2602;

import java.util.ArrayList;

public class Main {

	char c;
	char d;
	int x = 0;
	int max = 5;
	ArrayList<Character> darray = new ArrayList<Character>();
	ArrayList<Character> carray = new ArrayList<Character>();

	public void initializeloop() {
		for (c = 'A'; c <= 'Z'; c++) {
			carray.add(c);
			System.out.println(carray.get(x));
			x++;
		}
	}

	public void secondloop() {
		x=0;
		if (c > 'Y') {
			System.out.println("fandt");
			d = 'A';
			c = 'A';

			for (d = 'A'; d <= 'Z'; d++) {
				darray.add(d);
				System.out.println(carray.get(0) + "" + darray.get(x));
				x++;
			}
		}
	}

	public void repeatloop(int counter) {

		while (counter < max) {
			ArrayList<Character> charray = new ArrayList<Character>();
			char set ='A';

		}
	}

}
