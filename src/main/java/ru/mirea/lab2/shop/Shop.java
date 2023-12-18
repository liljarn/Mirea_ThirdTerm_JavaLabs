package ru.mirea.lab2.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopActions {

    private ArrayList<Computer> computers = new ArrayList<>();
    private static int computersAmount = 0;
    @Override
    public void add(Computer computer) {
        computers.add(computer);
        computersAmount++;
    }

    public int getComputersAmount() {
        return computersAmount;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    @Override
    public void remove(String name) {
        int num = search(name);
        if (num != -1) {
            computers.remove(num);
            computersAmount--;
        }
        else
            System.out.println("Такого компьютера не существует");
    }

    public int search(String name) {
        for (int i = 0; i < computers.size(); i++) {
            if (name.equals(computers.get(i).getName()))
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        System.out.println("Названия компьютеров: ");
        for (int i = 0; i < computersAmount - 1; i++)
            System.out.print(computers.get(i).getName() +", ");
        System.out.println(computers.get(computersAmount-1).getName() + ".");
        return "Количество компьютеров: " + computersAmount;
    }
}
