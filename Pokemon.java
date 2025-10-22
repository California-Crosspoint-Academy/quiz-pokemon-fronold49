public class Pokemon {

    String name;
    int level;

    String attack1;
    String attack2;
    String attack3;
    String attack4;

    Pokemon() {
        level = 1;
    }

    Pokemon(String name, int level, String attack1, String attack2, String attack3, String attack4) {
        this.name = name;
        this.level = level;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
    }

    void attack1() {
        System.out.println(name + " attacked with " + attack1);
    };

    void attack2() {
        System.out.println(name + " attacked with " + attack2);
    };

    void attack3() {
        System.out.println(name + " attacked with " + attack3);
    };

    void attack4() {
        System.out.println(name + " attacked with " + attack4);
    };
}