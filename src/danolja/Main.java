package danolja;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<'�����' ȣ�� ���� ����Ʈ�� ���Ű� ȯ���մϴ�!>");
		System.out.println("=====================================");
		
		while(true) {
			int idx = 0;
			
			System.out.println("1. ���� ��ȸ");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� Ȯ��");
			System.out.println("4. ���� ���");
			System.out.println("5. üũ��");
			System.out.println("6. üũ�ƿ�");
			System.out.println("7. ������ �޴�");
			System.out.println("8. ����");
			
			System.out.print("=> �޴� �Է� : ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			case "4":
				break;
				
			case "5":
				break;
				
			case "6":
				break;
				
			case "7":
				System.out.println("\n������ �޴��� �����ϼ̽��ϴ�.");
				System.out.print("������ ���̵� �Է� : ");
				String admId = sc.nextLine();
			
				System.out.print("������ ��ȣ �Է� : ");
				String admPw = sc.nextLine();
				
				break;
				
			case "8":
				idx = -1;
				break;
				
			default:
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n");
				break;
			}
			
			if (idx == -1) {
				System.out.println("ȣ�� ���� ���α׷��� �����մϴ�.");
			}
		}

	}

}
