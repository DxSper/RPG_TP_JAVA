import javax.print.attribute.standard.RequestingUserName;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    // initialiser les données
    public Team playerTeam;
    public Team enemyTeam;

    // lancer le jeu
    public void play() {
    // choisir qui joue en premier
        System.out.println("GAME STARTED");

        playerTeam = new Team();
        playerTeam.name = "Team1";
        playerTeam.new_battler(new Battler("Battler team 1"));

        enemyTeam = new Team();
        enemyTeam.name = "Team2";
        enemyTeam.new_battler(new Battler("Battler team 2"));

        while (getWinnerTeam() == null) {
            playerTeam.battlersList.get(0).attack(enemyTeam.battlersList.get(0));
            System.out.println("HP restant : " + playerTeam.battlersList.get(0).hp + " hp au "+ playerTeam.battlersList.get(0).name);
            enemyTeam.battlersList.get(0).attack(playerTeam.battlersList.get(0));
            System.out.println("HP restant : " + enemyTeam.battlersList.get(0).hp + " hp au "+ enemyTeam.battlersList.get(0).name);
        }
        Team winner_team = getWinnerTeam();
        System.out.println(winner_team.name + " a gagné la partie");
    }

    public Team getWinnerTeam(){
        if (playerTeam.isLoose()){
            return enemyTeam;
        }
        if (enemyTeam.isLoose()){
            return playerTeam;
        }
        return null;
    }
}
