package sj1;

public class RoundResult {
	public String getUserChoice() {
		return userChoice;
	}//데이터베이스에서 데이터를 받아올 때 get

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}  //데이터베이스에서 데이터를 저장할 때

	public String getComputerChoice() {
		return computerChoice;
	}

	public void setComputerChoice(String computerChoice) {
		this.computerChoice = computerChoice;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	private String userChoice;                   //private 사용 이유 - roundResult class 에서만 사용할 것임 보안성이 더 좋음 
	private String computerChoice;   //public 은 보안성이 낮지만 다른 클레스에서 사용 가능
	private String result;
	
	public RoundResult(String userChoice,String computerChoice,String result) {
		this.userChoice=userChoice;
		this.computerChoice=computerChoice;
		this.result=result;
		
	}

	
}
