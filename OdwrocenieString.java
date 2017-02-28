import java.util.Scanner;

class OdwrocenieString {

	public static String FirstReverse1(String str) {
		// zapisanie stringa do arraya i odwrócenie w pętli
		String[] ary = str.split("");
		str = "";
		for (int i = ary.length; i > 0; i--) {
			str = str + ary[i - 1];
		}
		return str;
	}

	public static String FirstReverse2(String str) {
		// odwrócenie za pomocą gotowej funkcji
		str = new StringBuffer(str).reverse().toString();
		return str;
	}

	public static void main(String[] args) {
		System.out.print("Podaj string\'a: ");
		Scanner s = new Scanner(System.in);
		s.close();
		String ans = s.nextLine();
		System.out.println("Pierwszy sposób: " + FirstReverse1(ans));
		System.out.println("Drugi sposób: " + FirstReverse2(ans));
	}

}
