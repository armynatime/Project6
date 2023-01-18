public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700,55,"Dagger");
        System.out.println("Boss - " + "health:" + boss.getHealth()
                + " damage:" + boss.getDamage() + " weapon name:" + boss.getWeaponName());

        System.out.println("Дз на сообразительность");

        Skeleton boss1 = new Skeleton(500,36,"spear",15);
        System.out.println(boss1.printInfo());
        System.out.println("******************");


        Skeleton skelet1 = new Skeleton(450,30,"arrow",10);
        System.out.println(skelet1.printInfo());
        System.out.println("**************");


        Skeleton skelet2 = new Skeleton(480,45,"knife",18);
        System.out.println(skelet2.printInfo());
        System.out.println("**************");

        Skeleton skelet3 = new Skeleton(350,35,"gun",12);
        System.out.println(skelet3.printInfo());




    }

}