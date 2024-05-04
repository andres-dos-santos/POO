public class App {
    public static void main(String[] args) throws Exception {
        Character hero = new Character();

        hero.name = "Hercules";
        hero.level = 2;
        hero.strength = 18; 

        hero.attack("Hydra", "kick", hero.calculateDamage());
    }
}
