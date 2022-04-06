Answers to questions:
A1
  Q1  github.com, youtube.com
  Q2  github collects usage info, registration info, payment info.
  Q3  The word delimited means having fixed boundaries or limits.
      Delimited is necessary because you don't want them to take everything.
  Q4  Look at the name of the column. In general... look at the data and determine the type??
  Q5  Programming. Physics.
  Q6  COME BACK TO IT!?!?!??!?!?!?!??!
  Q7  ^
  Q8  ^
  Q9  YouTube's recommended videos are cool. Probably negative impact in terms of productivity.
  Q10 We don't know for sure, but YouTube probably categorizes videos and then searches for similar types.
      Additionally, YouTube probably also tracks what other users who watched the same videos watched, and recommends these.
  Q11 Not really. It doesn't really benefit the user, it is generally for company gain.

A2
  Q1  Cereal
  Q2  NA
  Q3  public class Cereal {}
  Q4  15, one for each column in the data
  Q5  String name, String type, int calories, int protein, int fat, int sodium, int fiber, int carbohydrates, int sugar, int potassium, int vitamins, int shelf, float weight, float cups, float rating.
  Q6  See Cereal.java
  Q7  See Cereal.java
  Q8  What is the Vitamin to Volume (in cups) ratio
  Q9  What is the cost of this cereal?
  Q10 Add a new instance variable cost.

A3
  Q1  The temperature at Atlanta, Hartsfield - Jackson Atlanta International Airport, GA is 62.0F
  Q2  Q1 ID is KATL
      New ID is KHOE
      The temperature at Homerville Airport, GA is 64.0F
  Q3  Colder at KATL
  Q4  48 land stations NY
  Q5  We could filter weather stations by wind chill.
  Q6  Pago Pago, AS, Samoa
  Q7  What station has the lowest longitude?
  Q8  About the same length of code it took to answer Q6

A4
  Q1  What is the lowest housing price in NYC. We wanted to know because some of us plan on living in NYC in the future.
  Q2  We chose nyc-rolling-sales.csv from Kaggle.com. To find it, we went to Kaggle and searched for NYC prices.
  Q3  We essentially emulated the code in the Welcome files, with substantial help from Salaj.
  Q4  The class stored the Neighborhood, Address, and Price. We chose to store these three so that we could identify where the home was, and also so we could identify and compare the prices. 
  Q5  ```ArrayList<Home> allHomes = ds.fetchList("Home", "NEIGHBORHOOD", "ADDRESS", "SALE PRICE");

      Home minPrice = allHomes.get(0);
      for ( Home home : allHomes ) {
        if ( home.getPrice().length() > 2 && Long.parseLong( home.getPrice() ) < Long.parseLong( minPrice.getPrice() ) ) {
          minPrice = home;
        }
      }
      ```
      We stored data involving Neighborhood, Address, and Sale Price. Then we sorted data based on what had the lowest price.
      The first check in the if statement is to ensure that the price is at least 100 dollars, because as it turns out certain homes were sold for 0 dollars. We were informed that this is a way to avoid taxes, and so we avoided prices under 100 dollars.s
