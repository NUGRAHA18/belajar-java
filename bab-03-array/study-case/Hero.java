class Hero{
    String name;
    int health;
    int armor;

    Hero(String name, int health, int armor){
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public String getName(){
        return name;
    }

    public String setName(String newName){
        return this.name = newName;
    }

    public void berjalan(){
        System.out.println("Hero " + name + " berjalan");
    }

    public void menyerang(){
        System.out.println("Hero " + name + " menyerang");
    }
    public void mengisiDarah(){
        System.out.println("Hero " + name + " mengisi Darah");
    }

    public void display(){
        System.out.println("Name Hero : " + name);
        System.out.println("Health    : " + health);
        System.out.println("armor    : " + armor);
    }

    public static int checkHealth(int damage, int health){
       return health = health - damage; 
    }

}