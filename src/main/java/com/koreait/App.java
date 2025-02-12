package com.koreait;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("Todo App 시작");
        
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("명령어) ");
            String cmd = sc.nextLine().trim();
            
            System.out.println();
        }
        System.out.println("Todo App 끝");
    }
}
