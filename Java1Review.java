/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}

	public static double divide (double a, double b) {
		return a/b;
	}
	
	public static int divide (int a, int b) {
		return a/b;
	}
	
	public static boolean isDivisibleBy7 (int a) {
		if (a % 7 == 0) {
			return true;
		}
		else
			return false;
	}
	
	public static int findMin (int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		}
		else if (b < a && b < c) {
			return b;
		}
		else
			return c;
	}
	
	public static int findMin (int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; ++i) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double average (int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; ++i) {
			total = total + array[i];
		}
		return total / array.length;
	}
	
	public static String[] toLowerCase (String[] strings) {
		for (int i = 0; i < strings.length; ++i) {
			strings [i] = strings[i].toLowerCase();
		}
		return strings;
	}
	
	public static String[] toLowerCaseCopy (String[] strings) {
		String[] copy = new String[strings.length];
		for (int i = 0; i < strings.length; ++i) {
			copy[i] = strings[i].toLowerCase();
		}
		return copy;
	}
	
	public static String main (String thing) {
		String returning = "Overloaded main method was passed \"" + thing + "\".";
		return returning;
	}
	
	public static int[] removeDuplicates(int[] array) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int aCounter = 0;
		int bCounter = 0;
		int cCounter = 0;
		int dCounter = 0;
		int eCounter = 0;
			for (int i = 0; i < array.length; ++i) {
				if (array[i] != a && array[i] != b && array[i] != c && array[i] != d && array[i] != e) {
					if (a == 0) 
						a = array[i];
					else if (b == 0)
						b = array[i];
					else if (c == 0)
						c = array[i];
					else if (d == 0)
						d = array[i];
					else if (e == 0)
						e = array[i];
				}
			}
			for (int i = 0; i < array.length; ++i) {
				if (array[i] == a) {
					++aCounter;
				}
				else if (array[i] == b) {
					++bCounter;
				}
				else if (array[i] == c) {
					++cCounter;
				}
				else if (array[i] == d) {
					++dCounter;
				}
				else if (array[i] == e) {
					++eCounter;
				}
			}
			if (aCounter > 1) {
				for (int i = 0; i < array.length; ++i) {
					if (array[i] == a) {
						array[i] = 0;
					}
				}
			}
			if (bCounter > 1) {
				for (int i = 0; i < array.length; ++i) {
					if (array[i] == b) {
						array[i] = 0;
					}
				}
			}
			if (cCounter > 1) {
				for (int i = 0; i < array.length; ++i) {
					if (array[i] == c) {
						array[i] = 0;
					}
				}
			}
			if (dCounter > 1) {
				for (int i = 0; i < array.length; ++i) {
					if (array[i] == d) {
						array[i] = 0;
					}
				}
			}
			if (eCounter > 1) {
				for (int i = 0; i < array.length; ++i) {
					if (array[i] == e) {
						array[i] = 0;
					}
				}
			}
			return array;
		}
 }
