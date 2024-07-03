package sj1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*1.scanner 받기
2. 0  게임 끝   1 가위   2 바위   3 보
3. random 함수 사용
4. else if if
 */
/*
 * 1.RoundResult 클래스 생성- 각 라운드를 저장한다고 한다. Getter,Setter  Setter는 데이터를 저장하는 도구,Getter는 데이터를 가져오는 도구
 * 2. ArrayList 사용 -배열과 비슷 상세정보를 입별할 수 있는 특징이 있음
 * 
 * 
 */
public class Main {
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
		    Random random=new Random();
		    
		    List<RoundResult>roundResults=new ArrayList<>();  //<RoundResult>  RoundResult클래스에 저장한다 .ArrayList에 roundresult 값을 저장하기 위해서 선언
		    int count=0;
			while(true) {
			String result;  //결과값을 RoundResult에 저장하기 위해서 선언
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
				
				result="이겼습니다";
				
			}
			else if(userChoice==computerChoice  ) {
				
				System.out.println("비겼습니다..");
				result="비겼습니다";
			}
			else {
				System.out.println("당신이 졌네요");
				result="졌습니다.";
			}
			RoundResult roundResult= new RoundResult(String.valueOf(userChoice),String.valueOf(computerChoice),result); 
			roundResults.add(roundResult);
			count++;
			}
			System.out.print("\n");
			System.out.println("게임결과 입니다.");
			for(int i=0;i<roundResults.size();i++) {
				RoundResult roundResult=roundResults.get(i);
				System.out.printf("라운드 %d - 사용자:%s,컴퓨터:%s,결과:%s\n"
						,i+1,roundResult.getUserChoice(),roundResult.getComputerChoice(),roundResult.getResult());
			}
			
			
			
		}
}
