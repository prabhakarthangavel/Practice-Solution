package com.company.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmailApplication {

    public static final Scanner scan = new Scanner(System.in);
    public static List<String> emails = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter No of users:");
        int no = scan.nextInt();
        for (int i = 0; i < no; i++) {
            System.out.println("Enter First Name:");
            String firstName = scan.next();
            System.out.println("Enter Last Name:");
            String lastName = scan.next();
            System.out.println("Enter Department (number): ");
            System.out.println("1. GCB\n 2. ICG\n 3. CCC\n 4. none");
            int deptNo = scan.nextInt();
            String department =  deptNo == 1 ? "gcb" : deptNo == 2 ? "icg" : deptNo == 3 ? "ccc" : null;
            System.out.println(generateEmailId(firstName, lastName, department));
            System.out.println(generatePassword());
        }
    }

    public static String generateEmailId(String firstName, String lastName, String dept) {
        int i = 0;
        StringBuilder email;
        do {
            email = new StringBuilder();
            email.append(firstName).append(".").append(lastName);
            if (i == 0) {
                email.append("@");
                i++;
            } else {
                email.append(i).append("@");
                i++;
            }
            if (dept != null) email.append(dept).append(".");
            email.append("citi.com");
        } while (emails.contains(email.toString()));
        emails.add(email.toString());
        return email.toString();
    }

    public static String generatePassword() {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String splChars = "!@#$%^&*()";
        String numbers = "1234567890";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (i < 4) {
                password.append(chars.charAt((int) (Math.random() * chars.length())));
            } else if (i > 3 && i > 4) {
                password.append(splChars.charAt((int) (Math.random() * numbers.length())));
            } else {
                password.append(numbers.charAt((int) (Math.random() * splChars.length())));
            }
        }
        return password.toString();
    }
}
