package com.jmv74211.easybuy.models;

import com.jmv74211.easybuy.tools.Tools;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Cart implements Serializable {

  private List<ProductSelection> products = new ArrayList<ProductSelection>();

  // -----------------------------------------------------------------------------------------------

  public Cart() {}

  // -----------------------------------------------------------------------------------------------

  public Cart(List<ProductSelection> products) {
    this.products = products;
  }

  // -----------------------------------------------------------------------------------------------

  public Cart(HashMap<String, Object> data) {
    for(Object item: (ArrayList<Object>) data.get("products")){
      this.addProduct(new ProductSelection((HashMap<String, Object>) item));
    }
  }

  // -----------------------------------------------------------------------------------------------

  public List<ProductSelection> getProducts() {
    return products;
  }

  // -----------------------------------------------------------------------------------------------

  public void setProducts(List<ProductSelection> products) {
    this.products = products;
  }

  // -----------------------------------------------------------------------------------------------

  public float getCartPrice() {

    float totalPrice = 0f;

    for (ProductSelection p : products) {
      totalPrice += p.getPrice();
    }

    return totalPrice;
  }

  // -----------------------------------------------------------------------------------------------

  public void addProduct(ProductSelection p){
    if(p != null){
      this.products.add(p);
    }
  }

  // -----------------------------------------------------------------------------------------------

  @Override
  public String toString() {
    return "Cart{" +
            "products=" + products +
            '}';
  }

  // -----------------------------------------------------------------------------------------------

}
