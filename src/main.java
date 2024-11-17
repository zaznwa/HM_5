public class main {
    public static void main(String[] args) {
        boss boss = new boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Magic");


        System.out.println("Info about boss");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defence:  " + boss.getDefenseType());


        hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Superpower: " + hero.getSuperPower());
        }
    }
    public static hero[] createHeroes() {
        hero hero1 = new hero(150, 30, "Physic");
        hero hero2 = new hero(100, 45, "Kinetic");
        hero hero3 = new hero(50, 20);
        return new hero[] { hero1, hero2, hero3 };
    }
}
