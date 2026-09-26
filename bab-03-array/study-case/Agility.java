public class Agility extends Hero{
    int attackSpeed;
    int criticalChange;

    Agility(String name, int health, int armor, int attackSpeed, int criticalChange){
        super(name, health, armor);
        this.attackSpeed = attackSpeed;
        this.criticalChange = criticalChange;
    }

    public void dash(){
        System.out.println("Hero " + name + " melakukan dash");
    }

    public void invisiblelity(){
        System.out.println("Hero " + name + " menghilang.");
    }

    @Override 
    public void menyerang(){
        System.out.println("Menyerang dengan sangat cepat.");
    }

}