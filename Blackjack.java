import java.util.*;
public class Blackjack {
    public static void main(String[] args) {
        //블랙잭 카드 class
        //♠, ♥, ♣, ◆
        System.out.println("!!!블랙잭 게임에 오신것을 환영합니다!!!");
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        int user_select_num;
        while(true) {
            System.out.println("1. 게임 시작");
            System.out.println("2. 게임 설정");
            System.out.println("3. 기록");
            System.out.println("4. 게임 종료");
            user_select_num = sc.nextInt();
            switch(user_select_num) {
                case 1:
                    game.GamePlay();
                    break;
                case 2:
                    game.GameSetting();
                    break;
                case 3:
                    game.Gamelog();
                    break;
                case 4:
                    game.GameClose();
                    break;
            }
        }

    }
}
// 사고 회로
//1. Card를 class로 만들고 그걸 ArrayList에 넣자
//2. Card 이차원 배열을 ArrayList로 변환하자 => 성공