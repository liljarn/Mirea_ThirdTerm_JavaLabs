package ru.mirea.lab4.atelie;

public class Atelier {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing cloth = (MenClothing) item;
                cloth.dressMan();
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing cloth = (WomenClothing) item;
                cloth.dressWoman();
            }
        }
    }

}
