public class Skeleton extends Boss {
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public Skeleton(int health, int damage, String weaponName, int numberOfArrows){
        super(health,damage,weaponName);
        this.numberOfArrows = numberOfArrows;
    }
    public String printInfo(){
        return super.printInfo() + " number of arrows:" + numberOfArrows;
    }


}
