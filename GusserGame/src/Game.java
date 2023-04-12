import java.util.Scanner;
class Guesser{
    int guessNum;
    int guessNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Empire please pick the number between 1 to 20:");
        guessNum=sc.nextInt();
        if(guessNum>0 && guessNum<=20) {
            return guessNum;
        }
        else {
            System.out.println("Invalid, Try again");
            return 0;
        }

    }
}
class Player{
    int guessNum;
    int guessNum1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 please guess the number b/w 1 to 20:");
        guessNum=sc.nextInt();
        if(guessNum>0 && guessNum<=20) {
            return guessNum;
        }
        else {
            System.out.println("Invalid, Try again");
            return 0;
        }
    }
    int guessNum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 2 please guess the number b/w 1 to 20");
        guessNum=sc.nextInt();
        if(guessNum>0 && guessNum<=20) {
            return guessNum;
        }
        else {
            System.out.println("Invalid, Try again");
            return 0;
        }
    }
    int guessNum3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 3 please guess the number b/w 1 to 20");
        guessNum=sc.nextInt();
        if(guessNum>0 && guessNum<=20) {
            return guessNum;
        }
        else {
            System.out.println("Invalid, Try again");
            return 0;
        }
    }
}

class Umpire{
    int numFromEmpire;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromEmpire() {
        do {
            Guesser g = new Guesser();
            numFromEmpire = g.guessNum();
        }while(numFromEmpire==0);
    }
    void collectNumFromPlayer() {
        do{
            Player p = new Player();
            numFromPlayer1 = p.guessNum1();
        }while(numFromPlayer1==0);
        do{
            Player p = new Player();
            numFromPlayer2 = p.guessNum2();
        }while(numFromPlayer2==0);
        do{
            Player p = new Player();
            numFromPlayer3 = p.guessNum3();
        }while(numFromPlayer3==0);
    }
    void collectNumFromPlayer12() {
        do{
            Player p = new Player();
            numFromPlayer1 = p.guessNum1();
        }while(numFromPlayer1==0);
        do{
            Player p = new Player();
            numFromPlayer2 = p.guessNum2();
        }while(numFromPlayer2==0);
    }
    void collectNumFromPlayer13() {
        do{
            Player p = new Player();
            numFromPlayer1 = p.guessNum1();
        }while(numFromPlayer1==0);
        do{
            Player p = new Player();
            numFromPlayer3 = p.guessNum3();
        }while(numFromPlayer3==0);
    }
    void collectNumFromPlayer23() {
        do{
            Player p = new Player();
            numFromPlayer2 = p.guessNum2();
        }while(numFromPlayer2==0);
        do{
            Player p = new Player();
            numFromPlayer3 = p.guessNum3();
        }while(numFromPlayer3==0);
    }

    int compare(){
        if(numFromEmpire == numFromPlayer1) {
            if(numFromEmpire == numFromPlayer2 && numFromEmpire == numFromPlayer3) {
                System.out.println("Tied between 1 & 2 & 3, Try again to become winner");
                return 0;
            }
            else if(numFromEmpire == numFromPlayer2) {
                System.out.println("Tied between Player 1 & 2, Player 1 & 2  Try again to become winner");
                collectNumFromEmpire();
                collectNumFromPlayer12();
                if(numFromEmpire==numFromPlayer1 && numFromEmpire==numFromPlayer2) {
                    System.out.println("Again tied, keep trying");
                    collectNumFromEmpire();
                    collectNumFromPlayer12();
                    compare();
                }
                else if(numFromEmpire==numFromPlayer1) {
                    System.out.println("Player 1 has won the game");
                }
                else if(numFromEmpire==numFromPlayer2) {
                    System.out.println("Player 2 has won the game");
                }
                else {
                    System.out.println("No body from player 1 and 2 guessed it correctly, please try again");
                    collectNumFromEmpire();
                    collectNumFromPlayer12();
                    compare();
                }
            }
            else if(numFromEmpire == numFromPlayer3) {
                System.out.println("Tied between player 1 & 3, Player 1 & 3  Try again to become winner");
                collectNumFromEmpire();
                collectNumFromPlayer13();
                if(numFromEmpire==numFromPlayer1 && numFromEmpire==numFromPlayer3) {
                    System.out.println("Again tied, keep trying");
                    collectNumFromEmpire();
                    collectNumFromPlayer13();
                    compare();
                }
                else if(numFromEmpire==numFromPlayer1) {
                    System.out.println("Player 1 has won the game");
                }
                else if(numFromEmpire==numFromPlayer3) {
                    System.out.println("Player 3 has won the game");
                }
                else {
                    System.out.println("No body from player 1 and 3 guessed it correctly, please try again");
                    collectNumFromEmpire();
                    collectNumFromPlayer13();
                    compare();
                }
            }
            else {
                System.out.println("Player 1 has won the game");
            }
            return 1;
        }
        else if(numFromEmpire == numFromPlayer2) {
            if(numFromEmpire == numFromPlayer3) {
                System.out.println("Tied between 2 & 3, Player 2 & 3 Try again to become winner");
                collectNumFromEmpire();
                collectNumFromPlayer23();
                if(numFromEmpire==numFromPlayer2 && numFromEmpire==numFromPlayer3) {
                    System.out.println("Again tied, keep trying");
                    collectNumFromEmpire();
                    collectNumFromPlayer23();
                    compare();
                }
                else if(numFromEmpire==numFromPlayer2) {
                    System.out.println("Player 2 has won the game");
                }
                else if(numFromEmpire==numFromPlayer3) {
                    System.out.println("Player 3 has won the game");
                }
                else {
                    System.out.println("No body from player 2 and 3 guessed it correctly, please try again");
                    collectNumFromEmpire();
                    collectNumFromPlayer23();
                    compare();
                }
            }
            else {
                System.out.println("Player 2 has won the game");
            }
            return 1;
        }
        else if(numFromEmpire == numFromPlayer3) {
            System.out.println("Player 3 has won the game");
            return 1;
        }
        else {
            System.out.println("No body has won the game , Try again");
            return 0;
        }
    }
}
public class Game {
    public static void main(String[] args) {
        int x;
        do {
            Umpire u = new Umpire();
            u.collectNumFromEmpire();
            u.collectNumFromPlayer();
            x=u.compare();
        }while(x==0);
    }
}