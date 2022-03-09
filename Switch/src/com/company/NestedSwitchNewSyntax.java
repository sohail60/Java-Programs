package com.company;

import java.util.Scanner;

public class NestedSwitchNewSyntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter empID:");
        int id = in.nextInt();
        System.out.println("Department:");
        String department = in.next();

        switch (id) {
            case 1 -> {
                System.out.println("Md Sohail Ansari");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Invalid Department");
                }
            }
            case 2 -> {
                System.out.println("Person XYZ");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Invalid Department");
                }
            }

            case 3 -> {
                System.out.println("Person ABC");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Invalid Department");
                }
                }
            default -> {
                System.out.println("Invalid empID");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Invalid Department");
                }
            }

            }
        }
    }

