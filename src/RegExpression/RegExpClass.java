package RegExpression;

// Regex: Regular Expressions

// It is an expression which represents a group of Strings according to a particular pattern.
// We can write a Regular Expression to represent all valid mail ids.
// We can write a Regular Expression to represent all valid Indian mobile numbers.

// Application areas where we can use RE.
// 1 - Form validation.
// 2 - Pattern matching application(search) ctrl+f
// 3 - Designs translator,like compiler,assembler..
// etc...

// To represent and use Regular Expressions in Java applications, JAVA has provided
// some classes and interfaces belongs to "java.util.regex" package.

// we mainly uses following 2 classes from the java.util.regex package to 
// provide facility of RE in java:-

// 1.java.util.regex.Pattern :- A Pattern object represents "compiled 
// version of Regular Expression".

// 2.java.util.regex.Matcher :- Matcher obj we can use to match the given 
// pattern in the target String.

import java.util.regex.*;

public class RegExpClass {
	public static void main(String[] args) {
		
		String targetString = "af3abac% cbabc3bd $dabcd5#9 52cda";
		
		// we create a RegEx pattern object using the compile(factory method of Pattern class)
		Pattern p = Pattern.compile("abc{1}");
		//							^^^^^^^^^^^^^^^^ 
		// modify and test according to the given character classes and the quantifiers
		
		// p is the RegEx Patter which we will use in Matcher to get required outcome.
		
		// here the Pattern p itself cretes a matcher object using matcher() method
		// which has specific methods related to matched data.
		Matcher m1 = p.matcher(targetString);
		// 					  		^^^^ Target
		
		// there are lot of methods in Matcher object, but here are some basic one
		
		// public boolean find():- it attempts to find the next match and returns true 
		// if it is available otherwise returns false.
		
		// public int start():-returns the starting index of the matched subsequence.
		
		// public int end():- returns the ending index + 1 of the matched subsequence.
		
		// public String group():- returns the matched subsequence.
		
		int count = 0;
		
		while(m1.find()) {
			count++;
			System.out.println(m1.start()+"------"+m1.end()+"------"+m1.group());
		}
		
		System.out.println("Number of occurence: "+count);
		
		// There is also a method which includes both Pattern and Matcher at once
		// and if there is a match, it will return true, else false
		// here [amn] means there must be only single character in targetString
		// it must be only single a or m or n
		// we can combine following Character classes and quantifiers in it to 
		// get pattern according to our need
		System.out.println(Pattern.matches("[^amn]{3}", "xcv")); //true
		System.out.println(Pattern.matches("[amn]", "a")); //true
		System.out.println(Pattern.matches("[amn]", "ammmna")); //false
		System.out.println(Pattern.matches("[amn]", "amn")); //false
		System.out.println(Pattern.matches("[amn]{2}", "amn")); //false
		System.out.println(Pattern.matches("[amn]{3}", "amn")); //true
		
		// we can add multiple patterns
		System.out.println(Pattern.matches("[amn]{3}[0-9]{2,}", "amn12345")); //true
		
		// we can also add regex in following method structures
		// public boolean matches(String regex);
		// public String replaceAll(String regex, String target);
		// public String replace(CharSequence regex, CharSequence target);
		// public String[] split(String regex);
		
		// To prepare Regular Expressions, we have to use the following elements.
		// 1 - Character Classes
		// 2 - Quantifiers
		
		// Character Classes : 
		// Character classes are used to specify alphabets and digits in Regular Expressions.
		// abc ------------------Entire group searched as substring => abc is in abcfdfabcdsacba#bcrf string
		// [abc] ----------------Either 'a' or 'b' or 'c'
		// [^abc] ---------------Except 'a' and 'b' and 'c'
		// [a-z] ----------------Any lower case alphabet symbol
		// [A-Z] ----------------Any upper case alphabet symbol
		// [a-zA-Z] -------------Any alphabet symbol
		// [0-9] ----------------Any digit from o to 9
		// [a-zA-Z0-9] ----------Any alphanumeric character
		// [^a-zA-Z0-9] ---------Any special character
		// [a-z&&[^bc]] ---------a through z, except for b and c
		// [a-z&&[^m-p]] --------a through z, and not m through p
		
		// Regex Metacharacters:
		// The regular expression metacharacters work as shortcodes.
			// \\s-------space character
			// \\d-------Any digit from o to 9 [0-9]
			// \\w-------Any word character [a-zA-Zo-9]
			// .(Dot)---Any character including special characters.
			// \\S-------any character except for space character
			// \\D-------any character except for digit
			// \\W-------any character except for word character (special character)
		
		// RegEx Quantifiers:
		// The quantifiers specify the number of occurrences of a character.
		// re => Regular Expression Pattern String, append the symbols after it.
		
		// re* -------- 0 or any number of occurrences of the preceding expression.
		// re+ -------- 1 or more(at least) number of occurrences of the preceding expression.
		// re? -------- 0 or 1(at most l)number of occurrences of the preceding expression.
		// re{n} ------ exactly n number of occurrence of the preceding expression.
		// re{n,) ----- n or more occurrence of the preceding expression.
		// re{n, m} --- at least n and at most m.
		// a | b ------ either a or b occurrences.
	}
}
