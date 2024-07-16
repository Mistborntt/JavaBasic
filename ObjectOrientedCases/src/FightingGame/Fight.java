package FightingGame;

public class Fight {
    public static void main(String[] args) {
        Role player1 = new Role("吕布", 8000, '男');
        Role player2 = new Role("老夫子", 7500, '男');

        player1.showRoleInfo();
        player2.showRoleInfo();

        while (true) {
            player1.attack(player2);
            if (player2.getHP() == 0) {
                System.out.println(player1.getName() + "K.O." + player2.getName());
                break;
            }

            player2.attack(player1);
            if (player1.getHP() == 0) {
                System.out.println(player2.getName() + "K.O." + player1.getName());
                break;
            }
        }
    }
}
