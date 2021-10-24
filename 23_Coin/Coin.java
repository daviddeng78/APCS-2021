/**
 *TNPG: DIY (David Deng, Yat Long Chan)
 *APCS
 *HW23 -- What Does Equality Look Like? / Comparing Variables from Different Objects
 *2021-10-22
 *Time Spent: 11 minutes
 *
 *DISCOS
 *If a variable in another class is named exactly the same as a variable in your current class, use the Java keyword `this` to refer to the local variable.
 *QCC
 *No unresolved questions.
 **/

public class Coin {

  //attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
	bias = 0.5;
	upFace = "heads";
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
	if (s.equals("penny") || s.equals("nickel") || s.equals("dime") || s.equals("quarter") || s.equals("half dollar") || s.equals("dollar")) {
		bias = 0.5;
		name = s;
		upFace = "heads";
	}
	else {
		System.out.println("Please enter a valid coin name.");
	}
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
	bias = 0.5;
	name = s;
	upFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
	return upFace;
  }

  public int getFlipCtr() {
	return flipCtr;
  }

  public double getValue() {
	return value;
  }

  public int getHeadsCtr() {
	return headsCtr;
  }

  public int getTailsCtr() {
	return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	if (s == "penny")
	{
		value = 0.01;
		return value;
	}
	else if (s == "nickel")
	{
		value = 0.05;
		return value;
	}
	else if (s == "dime")
	{
		value = 0.10;
		return value;
	}
	else if (s == "quarter")
	{
		value = 0.25;
		return value;
	}
	else if (s == "half dollar")
	{
		value = 0.50;
		return value;
	}
	else if (s == "dollar")
	{
		value = 1.0;
		return value;
	}
	else {
		System.out.println("Enter valid coin name in lowercase");
		return 0;
	}
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
  	if ((s == "heads" || s == "tails") && (d >= 0.0 && d <= 1.0)){
  		upFace = "";
  		bias = 0.5;
  	}
  	else{
  		System.out.println("Preconditions not satisfied.");
  	}
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
	if (bias >= 0.0 && bias <= 1.0) {
		flipCtr += 1;
		bias = Math.random();
		double prob = Math.random();
	  	if (prob <= bias) {
			upFace = "heads";
			headsCtr += 1;
			return upFace;
	  	}

		else {
			upFace = "tails";
			tailsCtr += 1;
			return upFace;
		}
	}

	else {
		System.out.println("Bias is not on interval 0.0 and 1.0");
		return "";
	}
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
	if (other.name == null) {
		System.out.println("Other coin does not have name");
		return false;
	}

	if (other.upFace.equals(upFace)) {
		return true;
	}
	else {
		return false;
	}
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
	return name + " -- " + upFace;
  }

}//end class
