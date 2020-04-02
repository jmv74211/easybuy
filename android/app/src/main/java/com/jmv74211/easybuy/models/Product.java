package com.jmv74211.easybuy.models;

import java.io.Serializable;
import java.util.Map;

public class Product implements Serializable {

  private int id;
  private String name;
  private float price;
  private String quantity;
  private int section;

  // -----------------------------------------------------------------------------------------------

  public Product() { }

  // ---------------------------------------------------------------------------------------------

  public Product(int id, String name, float price, String quantity, int section) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.section = section;
  }

  // -----------------------------------------------------------------------------------------------

  public Product(Map<String, Object> data) {
    this.id = ((Long) data.get("id")).intValue();
    this.name = (String) data.get("name");
    this.price = ((Double) data.get("price")).floatValue();
    this.quantity = (String) data.get("quantity");
    this.section = ((Long) data.get("section")).intValue();
  }

  // ---------------------------------------------------------------------------------------------

  public int getId() {
    return id;
  }

  // ---------------------------------------------------------------------------------------------

  public void setId(int id) {
    this.id = id;
  }

  // ---------------------------------------------------------------------------------------------

  public String getName() {
    return name;
  }

  // ---------------------------------------------------------------------------------------------

  public void setName(String name) {
    this.name = name;
  }

  // ---------------------------------------------------------------------------------------------

  public float getPrice() {
    return price;
  }

  // ---------------------------------------------------------------------------------------------

  public void setPrice(float price) {
    this.price = price;
  }

  // ---------------------------------------------------------------------------------------------

  public String getQuantity() {
    return quantity;
  }

  // ---------------------------------------------------------------------------------------------

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  // ---------------------------------------------------------------------------------------------

  public int getSection() {
    return section;
  }

  // ---------------------------------------------------------------------------------------------

  public void setSection(int section) {
    this.section = section;
  }

  // ---------------------------------------------------------------------------------------------

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", quantity='" + quantity + '\'' +
            ", section=" + section +
            '}';
  }

  // -----------------------------------------------------------------------------------------------

}
