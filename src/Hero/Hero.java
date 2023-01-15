package Hero;

public class Hero {

    private int health;
    private int damage;
    private String skill;

    public Hero(int health, int damage, String skill) {
        this.health = health;
        this.damage = damage;
        this.skill = skill;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSkill() {
        return skill;
    }
}