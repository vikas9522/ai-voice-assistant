package com.vikas.assistant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AIService aiService = new AIService();

        System.out.println("=================================");
        System.out.println("   AI Assistant Started 🚀");
        System.out.println("   Type 'exit' to quit");
        System.out.println("=================================");

        while (true) {

            System.out.print("\nYou: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Assistant: Goodbye 👋");
                break;
            }

            String response = aiService.getAIResponse(input);
            System.out.println("\nAssistant: " + response);
        }

        scanner.close();
    }
}