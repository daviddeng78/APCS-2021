import core.data.*;
import java.util.ArrayList;

public class HousePrices {
  public static void main(String[] args) {
    DataSource ds = DataSource.connect("nyc-rolling-sales.csv").load();
    ArrayList<Home> allHomes = ds.fetchList("Home", "NEIGHBORHOOD", "ADDRESS", "SALE PRICE");

    Home minPrice = allHomes.get(0);
    for ( Home home : allHomes ) {
      if ( home.getPrice().length() > 2 && Long.parseLong( home.getPrice() ) < Long.parseLong( minPrice.getPrice() ) ) {
        minPrice = home;
      }
    }
    System.out.println( minPrice );
  }
}
