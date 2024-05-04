import java.util.Random;

public class Character {
  String name;
  Byte level;
  Byte strength;
  
  void showStatus() {
    System.out.format("Personagem: %s (lvl %d) com %d de força.", name, level, strength);
  }

  int calculateDamage() {
    Random generator = new Random();

    int damage = 1 + generator.nextInt(19);

    return damage + strength;
  }

  void attack(String target, String ability, int damage) {
    if (ability.length() == 0) {
      System.out.format("%s atacou %s e causou %d", name, target, damage);
    } else {
      System.out.format("%s atacou %s e causou %d de dano com um %s", name, target, damage, ability);
    }
  }
}
