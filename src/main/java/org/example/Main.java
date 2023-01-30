package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        main5();
        main6();
    }
    public static void main5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year =  scanner.nextInt();
        if(year % 400 == 0){
            System.out.println("Високосный год");
        }
        else if (year % 4 == 0 & year % 100 !=0){
            System.out.println("Високосный год");
        }
        else{
            System.out.println("Не високосный год");
        }
    }
    public static void  main6(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int days3;
        while (true){
            System.out.println("Введите год");
            int year2 = scanner.nextInt();
            System.out.println("Введите кол-во дней в году");
            int days2 = scanner.nextInt();
            if(year2 % 400 == 0){
                days3=366;
            } else if (year2 % 4 == 0 & year2 % 100 != 0) {
                days3=366;
            }
            else {
                days3=365;
            }
            if (days2 == days3){
                score = score + 1;
                System.out.println("Верно! Набрано очков +" +score);
            }
            else {
                System.out.println("Конец игры! В этом году " + days3 + "дней");
                System.out.println("Набрано очков"+score);
                break;
            }
        }
    }
}