public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow("Bessie", "Male", 67.9, 5);
        Cow cow2 = new Cow("Brownie", "Male", 68.7, 5);
        Cow cow3 = new Cow("Dottie", "Famale", 67.3, 4);
        Cow cow4 = new Cow("Guinness", "Male", 100.9, 7);
        Cow cow5 = new Cow("Penny", "Male", 20.9, 0.1);
        Cow cow6 = new Cow("Sugar", "Male", 80.4, 4);
        Cow cows[] = {cow1, cow2, cow3, cow4, cow5,};
        Cow cow[] = {cow6};

        Horse horse1 = new Horse("Whiskey", "Male", 83.6, 3);
        Horse horse2 = new Horse("Tucker", "Famale", 75.1, 2);
        Horse horse3 = new Horse("Daisy", "Famale", 50.7, 1);
        Horse horses[] = {horse1, horse2};
        Horse horse[] = {horse3};

        Sheep sheep1 = new Sheep("Cloud", "Male", 34.5, 1);
        Sheep sheep2 = new Sheep("Wool", "Famale", 20.7, 3);
        Sheep sheep3 = new Sheep("Smoke", "Male", 29.9, 2);
        Sheep sheep4 = new Sheep("Blizzard", "Male", 25.1, 1);
        Sheep sheeps[] = {sheep1, sheep2, sheep3};
        Sheep sheep[] = {sheep4};

        Farm farm = new Farm("LLG-22", 5, 2, 3, "Fox Hollow",cows,horses,sheeps );
        Farm1 farm1 = new Farm1("LLG-23", 1, 1, 1, "Green Ranch",cow,horse,sheep );

        System.out.println(farm);
        System.out.println(farm1);


    }
}