/**
 * 
 */
package com.lam.coder.betterProgrammer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lazuajemolle
 *
 */
public class ExchangeMoney {
	public static int ToDollar = 100;
	public static int ToQuarter = 25;
	public static int ToDime = 10;
	public static int ToNickel = 5;
	public static int ToCent = 1;
	
	public static String Dollar = "Dollar";
	public static String Quarter = "Quarter";
	public static String Dime = "Dime";
	public static String Nickel = "Nickel";
	public static String Cent = "Cent";
	
    public static Change getCorrectChange(int cents) {
    	int coins;
        /*
          Please implement this method to
          take cents as a parameter
          and return an equal amount in dollars and coins using the minimum
number of coins possible.
          For example: 164 cents = 1 dollar, 2 quarters, 1 dime and 4
cents.          */

    	Map<String, Integer> map = new HashMap<String, Integer>();
        List<Coin> list = new ArrayList<Coin>();
          list.add(new Coin( Dollar, new Integer(ToDollar)));
          list.add(new Coin( Quarter, new Integer(ToQuarter)));
          list.add(new Coin( Dime, new Integer(ToDime)));
          list.add(new Coin( Nickel, new Integer(ToNickel)));
          list.add(new Coin( Cent, new Integer(1)));
        
    	map.put(Dollar , new Integer(0));
    	map.put(Quarter, new Integer(0));
    	map.put(Dime, new Integer(0));
    	map.put(Nickel, new Integer(0));
    	map.put(Cent, new Integer(0));
    	
    	for ( int i = 0; i < list.size(); i++ ) {
    	    	coins = cents / list.get(i).getRate() ;
    	    	map.put(list.get(i).getName(), new Integer (coins) );
    	    	cents = cents % list.get(i).getRate();
    	    	if (cents == 0) { 
    	    		break; 
    	    	} else {
    	    	//	go on 
    	    	};
    	   };
    	   
    	   Change change = new Change( map.get(Dollar), map.get(Quarter), map.get(Dime), map.get(Nickel), map.get(Cent)  );
    	
        System.out.println(change);   	
        return change;
    };
    
    public static void main(String[] args ) {
    	ExchangeMoney.getCorrectChange(177);
    	ExchangeMoney.getCorrectChange(164);
    }
    
    public static class Coin {
    	String name;
    	Integer rate;
    	
    	public Coin(String name, Integer rate) {
    		this.name = name;
    		this.rate = rate;
    	};
    	
    	private Integer getRate() {
    		return this.rate;
    	}
    	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((rate == null) ? 0 : rate.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Coin other = (Coin) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (rate == null) {
				if (other.rate != null)
					return false;
			} else if (!rate.equals(other.rate))
				return false;
			return true;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Coin [name=" + name + ", rate=" + rate + "]";
		};
    }

    // Please do not change this class
    static class Change {
        private final int _dollars;
        private final int _quarters; //25 cents
        private final int _dimes; // 10 cents
        private final int _nickels; // 5 cents
        private final int _cents; // 1 cent


        public Change(int dollars, int quarters, int dimes, int nickels,
                int cents) {
            _dollars = dollars;
            _quarters = quarters;
            _dimes = dimes;
            _nickels = nickels;
            _cents = cents;
        }


        public int getDollars() {
            return _dollars;
        }


        public int getQuarters() {
            return _quarters;
        }


        public int getDimes() {
            return _dimes;
        }


        public int getNickels() {
            return _nickels;
        }


        public int getCents() {
            return _cents;
        }


		@Override
		public String toString() {
			return "Change [_dollars=" + _dollars + ", _quarters=" + _quarters
					+ ", _dimes=" + _dimes + ", _nickels=" + _nickels
					+ ", _cents=" + _cents + "]";
		}
        
    }
}