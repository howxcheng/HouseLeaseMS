package cn.pojo;


public class House {

  private long hid;
  private String address;
  private String phone;
  private double size;
  private double rent;
  private long leased;


  public long getHid() {
    return hid;
  }

  public void setHid(long hid) {
    this.hid = hid;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }


  public double getRent() {
    return rent;
  }

  public void setRent(double rent) {
    this.rent = rent;
  }


  public long getLeased() {
    return leased;
  }

  public void setLeased(long leased) {
    this.leased = leased;
  }

}
