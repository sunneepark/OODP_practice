package card;

import name.Name;

/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card 
 * and determine the price
 * 
 * @author 2016112105 박선희
 * @date 20/03/17
 *
 */
public class CardOrder {
	private Name name;  	//the name printed on the card
	private char border;    //the card border
	private int numCards;   //the number of cards to be printed
	
	private static final int CARD_LEN = 32;  //the length of the card in characters
	
	//initialises name from value in parameter
	//and sets other instance variables to suitable default values
	//you can create a Name from a single string after L5
      //If you want to start before then, just write name = new Name("A", "B", "C") in the constructor!
	public CardOrder(String fullName) {
		
		String[] arr = fullName.split(" ");
		
		if(arr.length == 2) //middle name이 없을때
			name = new Name(arr[0],"",arr[1]);
		else
			name = new Name(arr[0],arr[1],arr[2]);
		
		border='*';
		numCards=0;
	}
	
	///////////////////////////////////////////
	//accessor/mutator methods
	
	//returns the character used in the border
	public char getBorder() {
		return border;
	}
	
	//sets the character used in the border 
	//to that provided in the parameter
	public void setBorder(char ch) {
		border=ch;
	}
	
	//returns the name 
	public Name getName() {
		return name;
	}
	
	//sets the name used in the card
	//to that provided in the parameter
	public void setName(Name name) {
		this.name=name;
	}
	
	//returns the number of cards to be printed
	public int getNumCards() {
		return numCards;
	}
	
	//sets the number of cards to be printed 
	//to that provided in the parameter
	public void setNumCards(int n) {
		numCards=n;
	}
	///////////////////////////////////////////
	
	//returns a sample card, including a newline at the end of each line
	public String getSampleCard() {
		return getTopLine() + getBlankLine() + this.getLineWithName()
		       + getBlankLine() + getTopLine();
	}
	
	//returns a String containing the top or bottom line
	//of a card, including a newline character at the end
	private String getTopLine() {
		String topLine="";
		int idx=CARD_LEN;
		
		String init = name.getInits();
		idx -= 2*init.length();
		
		topLine += init;
		for(;idx>0;idx--) {
			topLine += border;
		}
		topLine += init;
		
		return topLine+"\n";
	}
	
	//returns a String containing the blank line
	//of a card, with a border char at each end
	//and including the newline character	
	private String getBlankLine() {	
		String blackLine = "";
		int idx=CARD_LEN;
		
		blackLine+=border;
		--idx; //border 추가
		
		for(;idx>1;--idx) //마지막 border 추가해야되기 때문에 1까지
			blackLine+=" ";
		
		blackLine+=border;
		
		return blackLine+"\n";
	}
	
	//returns a String containing the name line
	//of a card, including name, padding and border
	//and including the newline character	
	private String getLineWithName() {
		//use this value until more code written
		String nameLine = "";
		int idx=CARD_LEN;
		
		idx -= 2; //마지막 borer 문자 두개
		idx -= name.toString().length();
	
		nameLine += border;
		
		//글자수가 홀수 일때 글자앞에 공백 추가
		if(idx%2 != 0) {
			nameLine+=" ";
			idx--;
		}
		//이름 앞쪽 공백
		int mid=idx/2;
		for(;idx > mid ;idx--)
			nameLine+=" ";
		
		//이름추가
		nameLine+=name;
		
		//이름 뒤쪽 공백
		for(;idx>0;idx--)
			nameLine+=" ";
		
		nameLine += border;
			
		return nameLine+"\n";
	}
	
	//returns the price of one card
	//in pounds (i,e either 0.20 or 0.25)
	//based on the number of characters in the name to be printed
	//40 if <=12 otherwise 50
	public double getCardPrice() {
		if(name.toString().trim().length() <= 12) //12자 이내 일때
			return 40;
		else
			return 50;
	}

	//returns the final cost of the order
	//which is the number of cards multiplied by the card price
	//and reduced by 10% if >= 200 cards
    public double getFinalCost() {
    	double finalCost = numCards * getCardPrice();
    	
    	if(numCards >= 200)
    		return finalCost*0.9;
    	else
    		return finalCost;
    	
    }
    
    //returns true if number of cards >= 200, false otherwise
    public boolean hasDiscount() {
    	if(numCards >= 200)
    		return true;
    	else
    		return false;
    }
}
