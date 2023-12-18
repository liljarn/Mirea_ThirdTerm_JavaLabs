package ru.mirea.lab4.atelie;

public class Test {
    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        Pants pants = new Pants(Size.S, 10000, "blue");
        TShirt tshirt = new TShirt(Size.M, 4000, "white");
        Tie tie = new Tie(Size.M, 2000, "black");
        Skirt skirt = new Skirt(Size.S, 5000, "red");
        Clothes[] clothes = new Clothes[] {pants, tshirt, tie, skirt};
        atelier.dressWoman(clothes);
        atelier.dressMan(clothes);
    }
}
