package sj1;

import java.util.Random;
import java.util.Scanner;

/*1.scanner 받기
2. 0  게임 끝   1 가위   2 바위   3 보
3. random 함수 사용
4. else if if
 */
public class Main {
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
		    Random random=new Random();
		    int count=0;
			while(true) {
			
			System.out.println("가위(1)  바위(2)  보(3)  종료(0)");
			int userChoice=scanner.nextInt();
			
			if(userChoice==0) {
				System.out.println("게임이 종료되었습니다.");
				System.out.println(count+"번 게임을 실행하셨습니다.");
				break;    //continue 하면 while 문 새로 반복
			}
			
			int computerChoice=random.nextInt(3)+1;   //괄호 안은 숫자 max를 표시  기본이 0이므로 +1
			System.out.println(computerChoice);
			
			if(((userChoice==1)&&(computerChoice==3))||((userChoice==2)&&(computerChoice==1))
						||((userChoice==3)&&(computerChoice==2)) ) {
				System.out.println("당신이 이겼습니다!");
				
			}
			else if(userChoice==computerChoice  ) {
				
				System.out.println("비겼습니다..");
			}
			else {
				System.out.println("당신이 졌네요");
			}
			count++;
			}
			
			
			
			
		}
}
