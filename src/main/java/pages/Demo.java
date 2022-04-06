package pages;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	
	public static void getReverseWord() {
		String reverseString = "";
		String str = "Hi jackie how r u";
		String[] arr = str.split(" ");
		
		for(String w : arr) {
			String reverseWord = "";
			for(int i=w.length()-1; i>=0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord+" ";
		}
		System.out.println(reverseString);
	}
	
	public static void getCountOfCharOccurance() {
		String str = "kodandaramkumar";
		int beforeCount = str.length();
		int afterCount = str.replace("a", "").length();
		int count = beforeCount - afterCount;
		System.out.println(count);
	}
	
	public static void getMaxVal() {
		int[] arr = new int[] {20, 40, 10, 60, 30, 90};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
	
	public static void removeDupFromString() {
		String str = "ramkumar";
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++) {
			lhs.add(str.charAt(i));
		}
		for(Character ch : lhs) {
			System.out.println(ch);
		}
	}
	
	public static void removeDupFromInteger() {
		Integer[] arr = new Integer[] {4,3,1,5,3,7,9,1,4};
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Arrays.asList(arr));
		Integer[] wDup = lhs.toArray(new Integer[] {});
		System.out.println(Arrays.toString(wDup));
	}
	
	public static void getPalindrome() {
		String str = "RAMUKUMRAR";
		String reverse = "";
		String original = str;
		for(int i=original.length()-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equals(original)) {
			System.out.println("The " +str+ " is palindrome");
		}else {
			System.out.println("The " +str+ " is a not palindrome");
		}
	}
	
	public static void getRandomString() {
		int len = 8;
		String str = "abcdefghijklmnopqrstuvwxyz";
		SecureRandom sr = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for(int i=0; i<len; i++) {
			sb.append(str.charAt(sr.nextInt(str.length())));
		}
		System.out.println(sb.toString());
	}
	
	public static void getStringFrequency() {
		String str = "ramkumar";
		char[] ec = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for(Character ch : ec) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> ss = charMap.entrySet();
		for(Entry<Character, Integer> entry : ss) {
			if(entry.getKey()>1) {
				System.out.println(entry.getKey()+ " " + entry.getValue());
			}
			
		}
	}
	
	public static void getFebonasiSeries() {
		int a,b,c,n=10, i=1;
		a = b =1;
		System.out.print(a+" "+b);
		while(i<n) {
			c = a + b;
			System.out.print(" ");
			System.out.print(c);
			a = b;
			b = c;
			i++;
		}
	}

	public static void getSeries() {
		int a,b,c,d,n=7, i=1;
		a = 1;
		b = a+5;
		System.out.print(a+" "+b);
		while(i<n) {
			c = b + 5;
			d = c;
			System.out.print(" ");
			System.out.print(d);
			b = d;		
			i++;
		}
	}
	
	public static void findOvels() {
		String str = "welcome";
		str = str.toLowerCase();

		long vowels = str.chars().filter(ch -> (ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' || ch == 'u')).count();
		System.out.println(vowels);
	}
	
	public static void removeOvels() {
		String input = "Hi welcome to tutorialspoint";
	      String regex = "[aeiou]";
	      String result = input.replaceAll(regex, "");
	      System.out.println("Result: "+result);
	}

	public static void main(String[] args) {
		Demo.removeOvels();
	}

}
