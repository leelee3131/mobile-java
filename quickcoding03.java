package quickcoding03;
import java.util.*;


public class quickcoding03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		String a=sc.nextLine();
		System.out.println("두번째 숫자를 입력하세요: ");
		String b=sc.nextLine();
		
		
		
		
		int result=0;
		try{
			int x=Integer.valueOf(a);
			int y=Integer.valueOf(b);
			result=x/y;
			if(x>=100||y>=100){
				throw new Exception();
				
			}
			System.out.println(result);
		}
		catch(ArithmeticException e){
			
				System.out.println("0으로 나눴습니다");
			}
		catch(NumberFormatException e)
		{
			System.out.println("정수 입력이 아닙니다.");
		}
		catch(Exception e){
			
			System.out.println("입력된 숫자가 3자리를넘었습니다");
			
			
		}
		
		
		
	}

	
	

	
}
