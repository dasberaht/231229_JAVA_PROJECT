package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤 수를 생성하여 맞추는 게임
		 * 
		 * 컴퓨터가 1~50사이의 랜덤 수를 생성 : 23 			
		 * 입력하세요. > 10 
		 * up~!
		 * 입력하세요. > 20
		 * up~!
		 * 입력하세요. > 30
		 * down~!
		 * 입력하세요. > 23
		 * 정답!
		 * 종료
		 */

		
		Scanner ran = new Scanner(System.in);
		System.out.println("[UP/DOWN 게임]");

		
		int random = (int)(Math.random()*50)+1;
		//System.out.println(random);
		System.out.println("숫자를 입력하세요. >");
		int a = ran.nextInt();
		int count = 0;
			while(a <= 50) { 		// 조건식이 true가 되도록 설정 ex) a != random	 / count <= 5 등등
				count++;
				if(a == random) {
					System.out.println("정답");
					break;
				} else if(a > random){
							System.out.println("Down  " + count + "회");
							System.out.println("다시입력하세요. >");
							a = ran.nextInt();
				} else if(a < random) {
							System.out.println("Up  " + count + "회");
							System.out.println("다시입력하세요. >");
							a = ran.nextInt();
				} if(count >= 5) {
							System.out.println("5회 초과 실패!");
							break;
				}

			}
				
			ran.close();
		
			
		}
						
	}

		/* int num = 0;
		 * int count = 0;
		 * while( num != random) { 
		 * sysout~ ("입력");
		 * num = scan.nextInt();
		 * count++;											//게임 횟수 증가
		 * if() { sysout("up" + count + "회") }
		 * else if() { sysout("up" + count + "회") }
		 * else() { sysout("up" + count + "회") } 
		 * }
		 */


