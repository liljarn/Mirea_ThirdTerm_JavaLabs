package ru.mirea.lab2.shop;

import java.util.Scanner;

public class Tester {
    public static void output(Shop shop) {
        System.out.print("Имеющиеся компьютеры: ");
        for (int i = 0; i < shop.getComputersAmount() - 1; i++) {
            System.out.print(shop.getComputers().get(i).getName() + ", ");
        }
        System.out.println(shop.getComputers().get(shop.getComputersAmount() - 1).getName() + ".");
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");
        int n = scanner.nextInt();
        String compName;
        System.out.print("Введите названия компьютеров: ");
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            compName = scanner.next();
            Computer computer = new Computer(compName);
            shop.add(computer);
        }
        int move = 10;
        while (move != 0) {
            System.out.print("Введите действие, которое хотите осуществить: 1 - добавить компьютер, 2 - удалить компьютер" +
                    ", 0 - завершить программу: ");
            move = scanner.nextInt();
            scanner.nextLine();
            if (move == 1) {
                System.out.print("Введите название компьютера: ");
                compName = scanner.nextLine();
                Computer computer = new Computer(compName);
                shop.add(computer);
                output(shop);
            }
            else if (move == 2) {
                System.out.print("Введите навзание компьютера, который хотите удалить: ");
                compName = scanner.nextLine();
                shop.remove(compName);
                output(shop);
            }
            else {
                System.out.println("Программа выполнена успешно!");
                break;
            }
        }
    }

}
