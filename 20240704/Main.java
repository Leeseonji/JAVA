package sj3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<User> users=new ArrayList<>();
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		
		while(true) {
			System.out.println("(1)회원가입 (2)로그인 (3)종료");
			int choice=scanner.nextInt();
			scanner.nextLine();
			
			if(choice==1) {     //회원가입
				System.out.println("이름을 입력해주세요");
				String name=scanner.nextLine();
				
				System.out.println("비밀번호를 입력해주세요(5개 이상으로 입력해주세요)");
				String password=scanner.nextLine();
				register(name,password);
			}
			else if(choice==2) {
				System.out.println("이름을 입력해주세요");
				String name=scanner.nextLine();
				
				System.out.println("비밀번호를 입력해주세요(5개 이상으로 입력해주세요)");
				String password=scanner.nextLine();
				login(name,password);
				
			}
			
		}
	}
	public static void login(String name,String password) {
		for(int i=0;i<users.size();i++) {
			System.out.println(users.get(i).getUsername());
			System.out.println(users.get(i).getPassword());
			// 숫자는 == 사용 가능 String형은 equals를 사용해야함
			if((users.get(i).getUsername().equals(name))&&(users.get(i).getPassword().equals(password))) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("아이디 혹은 비밀번호가 틀렸습니다");
			}
		}
	}
	
	public static void register(String name,String password) {
		if(password.length()>=5) {
			users.add(new User(name,password));
			//System.out.println(users.get(0).getPassword());
		}
		else {
			System.out.println("비밀번호는 5자 이상이어야합니다.");
		}
		
	}
}
