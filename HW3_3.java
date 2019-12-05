import java.util.Scanner;

class HW3_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String type;
		int height; //모든 도형 타입에서 높이
		int width, repeat; //사각형에서 가로와 반복횟수
		
		System.out.print("도형 타입: ");
		type = s.nextLine();
		
		switch(type){
		case "피라미드": //피라미드 높이는 10이하로 가정, 10이하로 제한하는 방법은 다음 수업에서 다루겠습니다. 
			System.out.print("높이: ");
			height = s.nextInt();
			
			for(int i=1; i<=height; i++){
				for(int j=0; j<height-i; j++) System.out.print(" ");
				for(int j=0; j<i; j++) System.out.format("%d", i-1-j);
				for(int j=1; j<i; j++) System.out.format("%d", j);
				System.out.println();
			}
			break;
		case "사각형":
			System.out.print("가로: ");
			width = s.nextInt();
			System.out.print("세로: ");
			height = s.nextInt();
			System.out.print("반복: ");
			repeat = s.nextInt();
			
			for(int i=0; i<height; i++){
				for(int j=0; j<repeat; j++){
					for(int k=0; k<width; k++)	System.out.print("*");
					System.out.print(" ");
				}
				System.out.println();
			}	
			break;
		case "다이아몬드": //다이아몬드의 높이는 홀수로 가정!, 짝수라면 모양이 제대로 잡히지 않습니다. 입력 제한 부분은 다음시간에 다루겠습니다!
			System.out.print("높이: ");
			height = s.nextInt();
			int half = height/2;
			
			for(int i=1; i<=half+1; i++){
				for(int j=0; j<half+1-i; j++) System.out.print(" ");
				for(int j=0; j<2*i-1; j++) System.out.print("*");
				System.out.println();
			}	//다이아몬드 상단
			for(int i=1; i<=half; i++){
				for(int j=0; j<i; j++) System.out.print(" ");
				for(int j=0; j<2*(half+1-i)-1; j++) System.out.print("*");
				System.out.println();
			}	//다이아몬드 하단
			break;
		default:
			System.out.println("[입력오류]도형 타입이 올바르지 않습니다");
		}
	}
}