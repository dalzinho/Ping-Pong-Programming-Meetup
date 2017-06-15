
public class PlateInput {
	
	String plate; 
	int year = 17; 
	
	public PlateInput(String number){
		
		this.plate = number; 
		
	}
	
	
	public int getAge(){
		String temp = plate.substring(2,4); 
		int fifty = year - Integer.parseInt(temp) ; 
	
		return fifty; 
		
	} 
	
	public int getYear(){
		String temp = plate.substring(2, 4);
		int tempInt = Integer.parseInt(temp); 
		
		if (tempInt - 50 > 0){
			
			tempInt -= 50;
		}
		return 2000 + tempInt;
	}
	
	public String getScotland(){
		char mnemonic = plate.charAt(0);
		
		String isScotland = "Not Scotland";
//		
		if (mnemonic == 'S' || mnemonic == 'T'){
			isScotland = "Scotland";
		}
		
		return isScotland;
	}
	
	public String getLocalOffice(){
		String town =""; 
		char mnemonic = plate.charAt(1);
		
		if (mnemonic > 64 &&  mnemonic < 75){
			town = "Glasgow"; 
			
		} else if (mnemonic == 88 || mnemonic == 89) {
			town = "Inverness";
		}
		
		return town; 
		
	}
	
	public boolean isValid(){
		 for (int i = 4; i < 7 ;i++){
			 if (plate.charAt(i) == 'I' || plate.charAt(i) == 'Q'){
				 return false;
			 }
		 }
		
		 return true; 
	}

}
