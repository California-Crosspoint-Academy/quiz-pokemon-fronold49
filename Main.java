public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Pikachu", 100, "Growl", "ThunderShock", "Thunder Wave", "Quick Attack");
        Pokemon p2 = new Pokemon("Snorlax", 100, "Amnesia", "Headbutt", "Rest", "Body Slam");
        Pokemon p3 = new Pokemon("Charmander", 100, "Growl", "Scratch", "Ember", "Leer");
        Pokemon p4 = new Pokemon("Charizard", 100, "Ember", "Growl", "Leer", "Scratch");
        Pokemon p5 = new Pokemon("Squirtle", 100, "Tackle", "Tail Whip", "Bubble", "Water Gun");
        Pokemon p6 = new Pokemon("Venusaur", 100, "Growl", "Leech Seed", "Tackle", "Vine Whip");

        p1.attack1();
        p2.attack1();
        p3.attack1();
        p4.attack1();
        p5.attack1();
        p6.attack1();
    }
}
