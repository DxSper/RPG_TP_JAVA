import java.util.Random;

public class Battler {
    public String name;
    public int hp;
    public int power;

    // Instancier mon battler
    public Battler(String name) {
        this.name = name;
        this.hp = 100; // HP est toujours à 100
        this.power = generateRandomPower(); // Initialisation de la puissance aléatoire;
    }
    // Méthode pour générer une puissance aléatoire entre 1 et 10
    private int generateRandomPower() {
        Random random = new Random();
        return random.nextInt(10) + 1; // Génère un nombre entre 1 et 10
    }

    // function attack qui retire des hp
    public void attack(Battler opponent) {
        opponent.looseHP(this.power);
        System.out.println(this.name + " attaque " + opponent.name + " HP restants" + opponent.hp);
    }

    // function looseHP qui retire des hp
    public void looseHP(int damage) {
        this.hp -= damage;
    }
}
