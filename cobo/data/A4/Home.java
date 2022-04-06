public class Home{
  private String neighborhood;
  private String address;
  private String price;
  public Home( String nickneighborhood, String nickaddress, String nickprice) {
    neighborhood = nickneighborhood;
    address = nickaddress;
    price = nickprice;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public String getAddress() {
    return address;
  }

  public String getPrice() {
    return price;
  }

  public String toString() {
    return address + " in " + neighborhood + " costs " + price;
  }
}
