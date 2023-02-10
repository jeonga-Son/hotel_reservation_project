package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
	List<Customer> customers = new ArrayList<Customer>();
	Scanner sc = new Scanner(System.in);
	
	public CustomerService() {}
	
	public void addCustomer() {
		// 고객 등록
		System.out.print("=> 이름을 입력하세요.(ex.홍길동) : ");
		String name = sc.nextLine();
		
		System.out.print("=> 휴대폰 번호를 입력하세요.(ex.01012345678) : ");
		String phoneNo = sc.nextLine();
		
		System.out.print("=> 생일을 입력하세요.(ex.990101) : ");
		String birth = sc.nextLine();
		
		System.out.print("=> 이메일을 입력하세요.(aaa@naver.com) : ");
		String email = sc.nextLine();
		
		Customer customer = new Customer(name, phoneNo, birth, email);
		
		customers.add(customer);
		
		System.out.println("\n\"" + name + "\"" + "님의 정보가 등록되었습니다.\n");
	}
	
}
