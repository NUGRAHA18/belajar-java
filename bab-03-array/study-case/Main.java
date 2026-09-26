import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Hero hero1 = new Hero("Otong", 100, 50);
        Hero hero2 = new Hero("Jana", 100, 60);
        Hero hero3 = new Hero("Saprudin", 100, 80);
        Hero hero4 = new Hero("Bagong", 100, 60);
        
        ArrayList<Hero> listHero = new ArrayList<Hero>();
        listHero.add(hero1);
        listHero.add(hero2);
        listHero.add(hero3);
        listHero.add(hero4);
        System.out.println("==========================");
        System.out.println("blok loopign");

        for(Hero h:listHero){
            System.out.println(h.name);
        }
        System.out.println("==========================");

        Agility agility1 = new Agility("Totong", 100, 50, 200, 200);
        System.out.println("Ini penerapan tanpa static");
        hero1.display();
        System.out.println("===========================");
        System.out.println("Nama hero : " + hero1.getName());
        System.out.println("Ubah nama hero : " + hero1.setName("Lancelot"));
        System.out.println("Nama hero : " + hero1.getName());
        hero1.berjalan();
        hero1.menyerang();
        hero1.mengisiDarah();

        System.out.println("===========================");
        System.out.println("Ini dengan static");
        System.out.println(Hero.checkHealth(50, 200));

        agility1.dash();
        agility1.berjalan();

        System.out.println("==========================");


    }
}