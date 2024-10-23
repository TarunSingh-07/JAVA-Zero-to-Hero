package com.company;

public class String_methods_14 {
    public static void main(String[] args) {
//        String a1 = new String("Tarun");
        String name = "Tarun";
        System.out.println(name);

//      return length of string
        System.out.println(name.length());
//      Converts all the character to the lower case
        System.out.println(name.toLowerCase());
//      Converts all the characters to upper case
        String uppercase = name.toUpperCase();
        System.out.println(uppercase);

//      Returns a new string after removing all the leading and trailing spaces
        String nonTrimmedString = "    Tarun     ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

//      Return a substring from the start index to end index
        System.out.println(name.substring(2));

//      Return a substring, the start index is included and end is excluded
        System.out.println(name.substring(1,4));

//      Return a new string after replacing 'a' with 'm'
        String replace = name.replace('a','m');
        System.out.println(replace);
        System.out.println(name.replace("aru","ani"));

//      Returns true if the name start with the string i enter
        System.out.println(name.startsWith("Ta"));
        System.out.println(name.startsWith("na"));

//      Returns true if the name end with the string i enter
        System.out.println(name.endsWith("un"));

//      Returns the character at a given index position
        System.out.println(name.charAt(2));

//      Returns the index of the first occurrence of the specified char in the given strings
        System.out.println(name.indexOf("u"));
        System.out.println(name.indexOf("a"));
        String name2 = "harry";
        System.out.println(name2.indexOf("r"));

//      Returns  last index of the specified character from the string
        System.out.println(name.lastIndexOf("u"));
        System.out.println(name2.lastIndexOf("r"));

//      Returns true if the given string is equal to that string i enter
        System.out.println(name.equals("Tarun"));
        System.out.println(name.equals("rainy"));

//      Returns true if two strings are equal, ignore the case of character
        System.out.println(name.equalsIgnoreCase("tarun"));
        System.out.println(name.equalsIgnoreCase("tARun"));


//      Escape sequence character
        System.out.println("I am escape sequence \"double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");
        System.out.println("I am escape sequence \\ double quote");

    }
}
