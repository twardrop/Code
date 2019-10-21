package com.example.helloworld;

public class HelloWorld
{
    public static void main(String[] args) {
        LetterToNumberTests2 l= new LetterToNumberTests2();
        EasyReader console = new EasyReader();
        String s="";
        System.out.println("hello world");

        //String s = "abcdefThis will be the input from the user";
        System.out.print("Please enter a string of text:");
        s = console.readLine();
        System.out.println("here is string s:" + s);
        s = s.replace(" ", "");
        char[] c = s.toCharArray();
        System.out.println("here is string s after removing spaces:" + s);


        for (Character ss : c)
        {
            System.out.println(ss - 'a' + 1);
            l.applyhashmap(ss);
        }
     }
}
