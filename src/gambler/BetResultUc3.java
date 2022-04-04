package gambler;

import java.util.Random;

public class BetResultUc3 {
private byte amount = 100 ;
private byte bets = 1;
private byte won = 0;
private byte loss = 0 ;
private byte checkvalue ;


              public void betresults()
              {
            		  Random random = new Random(); 
            		  checkvalue = (byte)random.nextInt(2);  //gets a random value which can be either 1 or 0
            		  
            		  if (checkvalue == 0) {        //checks if the randomvalue obtained is 0
            			  won++;
            			  System.out.println("amount gambler has :"+(amount+bets));  //
            			  System.out.println("gambler won");
            		  }
            		 else	
            		 { loss++;
            		     System.out.println("amount gambler has : "+(amount-bets));
            		     System.out.println("gambler lost");
            	  }
              }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BetResultUc3 result = new BetResultUc3();
		
		result.betresults();
	}

}
