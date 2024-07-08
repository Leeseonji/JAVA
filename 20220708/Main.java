package sj4;

import java.util.Random;
import java.util.Scanner;

/*
 * 1. random으로 숫자 세 개를 (0~9) 뽑아 배열에 순서대로 넣기
 * 2. 사용자한테 한자리 정수3개를 입력받기
 * 3.for 문 돌려서 숫자를 하나씩 비교해보기
 * 4.숫자랑위치가 맞는 경우가 있으면 strike++  
 * -> else 비교해봤는데 숫자가 다르면 배열안에 있는 다른 숫자들중에 이 숫자가 포함되어잇는지 확인하고 있으면 boll++
 * 5. 다 검사를 해봤는데 boll과 strike 가 둘 다 여전히 0일 경우 OUT출력
 * 6.Strike=3이 되면 승리 게임종료
 * 6. 결과 출력후 다시 숫자를 맞춰볼수 있게 하기 (맞 출 수 있는 chance는 최대 9회로 설정해 while문 설정하기
 */

public class Main {
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	//숫자 랜덤으로 뽑기
	Random r=new Random();
	int[] comChoice=new int[3];
	
	for(int i=0;i<3;i++) {
		comChoice[i]=r.nextInt(9)+1;
		for(int j=0;j<i;j++) {
			if(comChoice[i]==comChoice[j])i--;
			break;
		}
	}
	//입력받기
	
	int[] userChoice=new int[3];
	
	while(true) {
		int strike=0;
		int boll=0;
		System.out.println("1~9중 숫자 하나씩 입력하시오(중복 안됨):");
		for(int i=0;i<3;i++) {
			
			userChoice[i]=scanner.nextInt();
			
		}
		
	for(int i=0;i<comChoice.length;i++) {
		for(int j=0;j<userChoice.length;j++) {
			if((comChoice[i]==userChoice[j])&&(i==j)) {
				strike++;
			}
			else if(comChoice[i]==userChoice[j]) {
				boll++;
			}
		}
		
	}
	System.out.println("boll 갯수"+boll+"strike 갯수:"+strike);	
	if(strike==3)
		break;
	else if((strike==0)&&(boll==0)) {
		System.out.println("아웃입니다.");
	}
	}
	
	
	
	}
}
