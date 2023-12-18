package ru.mirea.lab4.seasons;

public enum Seasons {
    WINTER ("Зима", -25.6) ,
    SPRING ("Весна", 15.3){
        @Override
        public String getDescription(){
            return "Тёплое время года";
        }
    },
    SUMMER ("Лето", 26.4){
        @Override
        public String getDescription(){
            return "Жаркое время года";
        }
    },
    AUTUMN ("Осень", 9.3){
        @Override
        public String getDescription(){
            return "Прохладное время года";
        }
    };

    private final double temperature;
    private final String season;

    Seasons(String season, double temperature) {
        this.season = season;
        this.temperature = temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public static void getPreference(Seasons season){
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            default:
                System.out.println("Я ничего не люблю...");
                break;
        }
    }
    public static double getTempearture(Seasons season){
            double temperature = 0.0;
            temperature = season.temperature;
            return temperature;
    }

    @Override
    public String toString() {
        return "Сезон: " + season + ", " +
                "средняя темпретаруа = " + temperature +
                ", информация: " + getDescription();
    }
}
