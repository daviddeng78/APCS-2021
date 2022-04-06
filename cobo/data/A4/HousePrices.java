import core.data.*;
import java.util.ArrayList;

public class HousePrices {
  public static void main(String[] args) {
    DataSource ds = DataSource.connect("nyc-rolling-sales.csv").load();
    ArrayList<Homes> allHomes = ds.fetchList("Homes", "NEIGHBORHOOD", "ADDRESS", "SALE PRICE");
  }
}
