package quickcoding03;
import java.util.*;


public class quickcoding03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���: ");
		String a=sc.nextLine();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���: ");
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
			
				System.out.println("0���� �������ϴ�");
			}
		catch(NumberFormatException e)
		{
			System.out.println("���� �Է��� �ƴմϴ�.");
		}
		catch(Exception e){
			
			System.out.println("�Էµ� ���ڰ� 3�ڸ����Ѿ����ϴ�");
			
			
		}
		
		
		
	}

	
	

	
}
