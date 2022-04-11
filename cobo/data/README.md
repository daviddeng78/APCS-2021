# Ruawatrain
\~ Ben Belotser \~ \
\~ David Deng \~ \
\~ Josiah Moltz \~

# Our experience
The lab started off well. The first day we were decently productive (however we focused more on reviewing the previous HW).

The second day class went well. Then panic ensued. We never actually made a conscious note of the due date, and thus were left scrambling to complete it by 5:00. We went to the dojo, but it closed at 4:30 (we thought it closed at 5:00), and so the final few steps that would have happened in the last 30 minutes were thrown off track.

Ignoring the panic, it was OK. It was a bit frustrating using tools whose mechanics we had no clue about. Additionally, completing Activity 4 with the data set we chose wasn't fun, since we ended up getting caught in peoples tax-evasion plans (0$ HOUSESSSSS WHAT).

Also a HUGE thanks to Salaj who helped us at the dojo, without him A4 would have been MUCH harder.
# Answers to questions
## A1
  * Q1  github.com, youtube.com
  * Q2  github collects usage info, registration info, payment info.
  * Q3  The word delimited means having fixed boundaries or limits.
      Delimited is necessary because you don't want them to take everything.
  * Q4  Look at the name of the column. In general... look at the data and determine the type??
  * Q5  Programming. Physics.
  * Q6  Programming: What were the most interesting topics of students over the past year? Physics: What were the most interesting topics of students over the past year?  
  * Q7  There aren't any online datasets but we can poll current students across different classes in different schools. There are about 1000 students in different CS courses in Stuy right now? Not all classes have a heading implemented so, maybe, 75000 homework files are available for parsing using an algorithm that looks for positivity, like in the sentiment lab?
  * Q8  Using a larger dataset with more records is better as it allows us to draw more accurate conclusions. It also lowers the effect that outliers have on the final data.
  * Q9  YouTube's recommended videos are cool. Probably negative impact in terms of productivity.
  * Q10 We don't know for sure, but YouTube probably categorizes videos and then searches for similar types.
      Additionally, YouTube probably also tracks what other users who watched the same videos watched, and recommends these.
  * Q11 Not really. It doesn't really benefit the user, it is generally for company gain.

## A2
  * Q1  Cereal
  * Q2  NA
  * Q3  public class Cereal {}
  * Q4  15, one for each column in the data
  * Q5  String name, String type, int calories, int protein, int fat, int sodium, int fiber, int carbohydrates, int sugar, int potassium, int vitamins, int shelf, float weight, float cups, float rating.
  * Q6  See Cereal.java
  * Q7  See Cereal.java
  * Q8  What is the Vitamin to Volume (in cups) ratio
  * Q9  What is the cost of this cereal?
  * Q10 Add a new instance variable cost.

## A3
  * Q1  The temperature at Atlanta, Hartsfield - Jackson Atlanta International Airport, GA is 62.0F
  * Q2  Q1 ID is KATL
      New ID is KHOE
      The temperature at Homerville Airport, GA is 64.0F
  * Q3  Colder at KATL
  * Q4  48 land stations NY
  * Q5  We could filter weather stations by wind chill.
  * Q6  Pago Pago, AS, Samoa
  * Q7  What station has the lowest longitude?
  * Q8  About the same length of code it took to answer Q6

## A4
  * Q1  What is the lowest housing price in NYC. We wanted to know because some of us plan on living in NYC in the future.
  * Q2  We chose nyc-rolling-sales.csv from Kaggle.com. To find it, we went to Kaggle and searched for NYC prices.
  * Q3  We essentially emulated the code in the Welcome files, with substantial help from Salaj.
  * Q4  The class stored the Neighborhood, Address, and Price. We chose to store these three so that we could identify where the home was, and also so we could identify and compare the prices.
  * Q5  ```ArrayList<Home> allHomes = ds.fetchList("Home", "NEIGHBORHOOD", "ADDRESS", "SALE PRICE");```

      Home minPrice = allHomes.get(0);
      for ( Home home : allHomes ) {
        if ( home.getPrice().length() > 2 && Long.parseLong( home.getPrice() ) < Long.parseLong( minPrice.getPrice() ) ) {
          minPrice = home;
        }
      }
      ```
      We stored data involving Neighborhood, Address, and Sale Price. Then we sorted data based on what had the lowest price.
      The first check in the if statement is to ensure that the price is at least 100 dollars, because as it turns out certain homes were sold for 0 dollars. We were informed that this is a way to avoid taxes, and so we avoided prices under 100 dollars.s
