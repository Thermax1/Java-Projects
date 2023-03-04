class Data {

  public String first;
  public String last;
  public int zip;

  Data() {

  }

  Data(String f, String l, int z) {
    first = f;
    last = l;
    zip = z;
  }

  public String toString() {
    return ("first=" + first + " last=" + last + " zip=" + zip);
  }

}