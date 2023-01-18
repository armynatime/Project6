public class Boss extends GameEntity {
    private String weaponName;


    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Boss(int health, int damage, String weaponName) {
        super(health, damage);
        this.weaponName = weaponName;
    }

    public String printInfo() {
        return "Boss - " + "health:" + getHealth() + " damage:" + getDamage() + " weapon name:" + weaponName;
    }
}
