package com.company;
import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter email: ");
        String email=s.nextLine();
        Author a = new Author("Edgar", "default", 'm');
        a.setEmail(email);
        System.out.println(a.toString());
    }
}
