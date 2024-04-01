package inheritance;
//은행계좌클래스(국민은행)
public class Account {
	//맴버변수
	String accountNo; // 계좌번호
	String ownerName; // 예금주
	int balance;	  // 잔액
	
	//생성자(기본생성자는 ctrl+space로 생성가능)
	public Account() {
		
	}
	//매개변수 3개 생성자 source - Generate constructor using fields로 자동 생성 가능
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//예금한다 매서드
	void  deposit(int amount) { //amount=예금액 or인출액
		balance+=amount; //balance=balance+amount;
	}
	
	//인출한다 메서드 (찾은 금액을 돌려줘야하므로 return쓴다)
	int withdraw(int amount) throws Exception {
		if(balance<amount) {
			throw new Exception("잔액이 부족합니다");
		}
		balance-=amount;
		return amount;
		}
	}

