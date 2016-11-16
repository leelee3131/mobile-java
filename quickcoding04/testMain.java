package quickcoding04;

public class testMain extends Thread {
   public static BankAccount account = new BankAccount();

   public static void main(String[] args) {
      Thread depositMan = new Thread() {
         @Override
         public void run() {
            for(int i=0; i<10; i++) {
               account.add(10);
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }
         }

      };

      Thread withdrawMan = new Thread() {
         @Override
         public void run() {
            for(int j=0; j<10; j++) {
              account.delete(10);
              
              try {

                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch bloc
            	   
                  e.printStackTrace();
               }
            }
         }

      };

      depositMan.start();
      withdrawMan.start();
      
      
   }
}
