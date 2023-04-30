
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static String[] game;
    static String Winner;
    static String Player;

    public static String whoIsWinner(){

        for (int i=0; i<8; i++){

            String check = null;

            switch (i){

                case 0: check = game[0] + game[1] + game[2];
                        break;

                case 1: check = game[3] + game[4] + game[5];
                        break;

                case 2: check = game[6] + game[7] + game[8];
                        break;

                case 3: check = game[0] + game[3] + game[6];
                        break;

                case 4: check = game[1] + game[4] + game[7];
                        break;

                case 5: check = game[2] + game[5] + game[8];
                        break;

                case 6: check = game[0] + game[4] + game[8];
                        break;

                case 7: check = game[2] + game[4] + game[6];
                        break;

            }

            if(check.equals("XXX"))
                return "X";
            else if (check.equals("OOO"))
                return "O";

        }

        for (int i=0; i<9; i++){

            if(Arrays.asList(game).contains(String.valueOf(i+1)))
                break;
            else if(i == 8)
                return "Tie";

        }

        System.out.println("Its " + Player + " Chance:-");

        return null;

    }

    public static void showBoard(){

       
        System.out.println("----------------");
        System.out.println("| " + game[0] + " | " + game[1] + " | " + game[2] + " |");
        System.out.println("| " + game[3] + " | " + game[4] + " | " + game[5] + " |");
        System.out.println("| " + game[6] + " | " + game[7] + " | " + game[8] + " |");
        System.out.println("----------------");
        

    }

    public static void main(String[] args) {

        Winner = null;
        Player = "X";
        game = new String[9];

        for(int i=0; i<9; i++){
            game[i] = String.valueOf(i+1);
        }

        showBoard();
        
        System.out.println("Its --> X <--Chance:- ");

        Scanner sc = new Scanner(System.in);

        while(Winner == null){

            int input;
            input = sc.nextInt();

            if(input > 0 && input <= 9){

                if(game[input-1].equals(String.valueOf(input))){

                    game[input-1] = Player;

                    showBoard();

                    if(Player == "X")
                        Player = "O";
                    else
                        Player = "X";

                    Winner = whoIsWinner();
                } else {
                    System.out.println("Entered value  is already taken ");
                }

            }

        }

        if (Winner == "Tie")
            System.out.println("---> Its a Tie <---");

        else{
            System.out.println("\n******Congratulations " + Winner + " Wins***********");
        }

    }
}
