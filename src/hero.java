class hero {
    private int health;
    private int damage;
    private String superPower;

    public hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public hero(int health, int damage) {
        this(health, damage, "Nothing");
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}


