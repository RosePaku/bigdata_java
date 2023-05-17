package j0516;

import java.util.Scanner;

public class C0516_05 {

	public static void main(String[] args) {
		//리모콘
		// 1,2,3,4,5,6,7,8,9
		// channelUp, channelDown,이전보기,자막
		// volumeUp,volumeDown,음소거,
		// 전원
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int tempVolume = 0; //임시볼륨 저장변수
		//객체선언
		Tv t = new Tv();
		
		while(true) {
			System.out.println("[ 리모콘 프로그램 ]");
			System.out.println("1. 전원 on/off");
			System.out.println("2. 채널Up");
			System.out.println("3. 채널Down");
			System.out.println("4. 볼륨Up");
			System.out.println("5. 볼륨Down");
			System.out.println("6. 음소거");
			System.out.println("-----------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				t.power(); //객체사용방법 : 참조변수명.메소드명
				if(t.power==true) {
					System.out.println("전원 On되었습니다.");
				}else {
					System.out.println("전원 Off되었습니다.");
				}
			    System.out.println();
				break;
			case 2:
				if(t.power==false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				
				t.channelUp();
				System.out.println("현재채널 : "+t.channel);
				System.out.println();
				break;
				
			case 3:
				if(t.power==false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				
				t.channelDown();
				System.out.println("현재채널 : "+t.channel);
				System.out.println();
			    break;
			case 4:
				if(t.power==false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				
				t.volumeUp();
				System.out.println("현재볼륨 : "+t.volume);
				System.out.println();
			    break;
			case 5:
				if(t.power==false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				
				t.volumeDown();
				System.out.println("현재볼륨 : "+t.volume);
				System.out.println();
			    break;
			case 6:
				if(t.power==false) {
					System.out.println("전원을 On해야 기능이 구동됩니다.");
					break;
				}
				
				if(t.volume==0) {
					t.volume = tempVolume; // 임시볼륨높이를 입력
					System.out.println("음소거 해제");
					System.out.println("현재볼륨 : "+t.volume);
				}else {
					tempVolume = t.volume; //현재 볼률높이를 저장
					t.volume=0;
					System.out.println("음소거 실행");
					System.out.println("현재볼륨 : "+t.volume);
				}
				break;
			}//switch
		}//while
		
		
		

	}

}