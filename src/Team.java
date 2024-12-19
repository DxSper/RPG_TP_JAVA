import java.util.List;
import java.util.ArrayList;

public class Team {
    public String name;
    public List<Battler> battlersList = new ArrayList<Battler>();

    // Ajouter le battler a la liste
    public void new_battler(Battler battler){
        battlersList.add(battler);
    }

    // Vérifie si la team a perdu
    public boolean isLoose() {
        for (Battler battler : battlersList) {
            if (battler.hp > 0) {
                return false; // Au moins un battler est encore vivant
            }
        }
        return true; // Tous les battlers sont morts
    }
}