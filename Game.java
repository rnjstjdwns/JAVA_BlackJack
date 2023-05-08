import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
class Game {
    User user = new User();
    Dealer dealer = new Dealer(); 
    
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    
    void GamePlay() {

        Game game = new Game();    
        Object[][] Deck = {
            {"A","♠", 1, 10},
            {"2","♠", 2},
            {"3","♠", 3},
            {"4","♠", 4},
            {"5","♠", 5},
            {"6","♠", 6},
            {"7","♠", 7},
            {"8","♠", 8},
            {"9","♠", 9},
            {"10","♠", 10},
            {"J","♠", 11},
            {"Q","♠", 11},
            {"K","♠", 11},
            
            {"A","◆", 1, 10},
            {"2","◆", 2},
            {"3","◆", 3},
            {"4","◆", 4},
            {"5","◆", 5},
            {"6","◆", 6},
            {"7","◆", 7},
            {"8","◆", 8},
            {"9","◆", 9},
            {"10","◆", 10},
            {"J","◆", 11},
            {"Q","◆", 11},
            {"K","◆", 11},
            
            {"A","♣", 1, 10},
            {"2","♣", 2},
            {"3","♣", 3},
            {"4","♣", 4},
            {"5","♣", 5},
            {"6","♣", 6},
            {"7","♣", 7},
            {"8","♣", 8},
            {"9","♣", 9},
            {"10","♣", 10},
            {"J","♣", 11},
            {"Q","♣", 11},
            {"K","♣", 11},
            
            {"A","♥", 1 ,10},
            {"2","♥", 2},
            {"3","♥", 3},
            {"4","♥", 4},
            {"5","♥", 5},
            {"6","♥", 6},
            {"7","♥", 7},
            {"8","♥", 8},
            {"9","♥", 9},
            {"10","♥",1},
            {"J","♥", 11},
            {"Q","♥", 11},
            {"K","♥", 11},    
        };
        List<List<Object>> list = new ArrayList<List<Object>>();
        for(int i=0;i<Deck.length;i++) {
            list.add(Arrays.asList(Deck[i]));
        }

        //===================================================================
        user.game_try++;
        if(user.game_try == 1) {
            game.GameSetting();
        } else {
            System.out.println("게임을 시작하도록 하겠습니다");
        }
        int randomIndex = random.nextInt(list.size());
        System.out.println(list.get(randomIndex)); 
        list.remove(randomIndex);
    }


    void Gamelog() {
        int[] win_lose_stack = {};
        int win = 0;
        int win_stack = 0;
        int tie = 0;
        int lose = 0;
        int lose_stack = 0;
    }


    void GameSetting() {
        while(true) {
            System.out.print("본인의 이름을 입력해주세요");
            user.name = scanner.next();
            System.out.print("기본 금액을 설정해주세요 : ");
            user.coin = scanner.nextInt();
            String select;
            System.out.println("이름 : "+user.name);
            System.out.println("금액 : "+user.coin);
            System.out.println("설정이 완료 되었습니다\n 이 설정으로 해도 괜찮겠습니까? (yes/no)");
            select = scanner.next();
            switch(select) {
                case "yes":
                    System.out.println("게임을 시작하도록 하겠습니다");
                    return;
                case "no":
                    System.out.println("설정을 다시 시작하도록 하겠습니다.");
                    break;
                default:
                    System.out.println("다시 입력해주세요");
            }
        }
    }
    
    void GameClose() {

    }


    void Win() {

    }


    void Lose() {

    }

    void Push() {

    }
    void Hit() {

    }
    void Stay() {

    }
    void Ace_cho() {

    }
    void blackjack() {
        
    }
}
