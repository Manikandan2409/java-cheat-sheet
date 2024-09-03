package threads;

import java.util.HashMap;

public class Resource{
    private HashMap<String,Long> products = new HashMap<>();
    
    private static  Resource rs=null;
    private Resource(){
        products.put("Watermelon", 3000l);
        products.put("Pomegranate", 2000l);
    }

    public static Resource getInstance(){
        if (rs == null) {
            rs= new Resource();
        }
        return rs;
    }
    

    public HashMap<String, Long> getProducts() {
        return products;
    }
    public String[] getProductName(){
       return products.keySet().toArray(new String[0]);
    }

    public void setProducts(HashMap<String, Long> products) {
        this.products = products;
    }
}
