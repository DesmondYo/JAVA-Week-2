

public class Week2 {

	public static void main(String[] args) {

		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello" .charAt(0) == 'h');
  
  	boolean isHotOutside = true;
  
  	boolean isWeekday = false; 
  
  	boolean hasMoneyInPocket = true; 
  
  	double costOfMilk = 2.69; 
  		System.out.println(costOfMilk);
 
 	double moneyInWallet = 32.89;
 		System.out.println(moneyInWallet);
 
 	int thirstLevel = 4;
 		System.out.println(thirstLevel);
 
 	boolean shouldBuyIcecream = hasMoneyInPocket && isHotOutside;
 	
 	boolean willGoSwimming = isHotOutside && !isWeekday;
 	
 	boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
 	
 	boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >=2 * costOfMilk;
 	
 	
 	
 	
 
 
  
	}

}
