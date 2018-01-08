package Inventory_Systems;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;





public class Product {
    
    private String desc;
    private String code;
    private double cost;
    Connection conn= new Connection();
    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
    
     
    
    public boolean addProduct(Product product)
    {
        try{
           String query = "INSERT INTO `products`(`productDescription`, `productCode`, `cost`) VALUES ('"+product.desc+"','"+product.code+"',"+product.cost+")";       
           PreparedStatement preparedStmt = conn.getConnection().prepareStatement(query); 
           preparedStmt.execute();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean updateProduct(Product product)
    {
        try{
           String query = "UPDATE `products` SET `productDescription`='"+product.desc+"',`cost`="+product.cost+" WHERE productCode='"+product.code+"'";
           PreparedStatement preparedStmt = conn.getConnection().prepareStatement(query); 
           preparedStmt.execute();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean deleteProduct(Product product)
    {
        try{
           String query = "DELETE FROM products WHERE productCode='"+product.code+"'";
           PreparedStatement preparedStmt = conn.getConnection().prepareStatement(query); 
           preparedStmt.execute();
            return true;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<Product> getProducts()
    {
        try{
            
          ArrayList<Product> products= new ArrayList<Product>();
           String query = "SELECT * FROM products";

            // create the java statement
            Statement st = conn.getConnection().createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
      
            // iterate through the java resultset
            while (rs.next())
            {
              Product product= new Product();
              product.desc=rs.getString("productDescription").toString();
              product.code=rs.getString("productCode").toString();
              product.cost=Double.parseDouble(rs.getString("cost"));
              
              products.add(product);
            }
             st.close();
     
             return products;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public Product getProducts(Product product)
    {
        try{
            
          Product product2= new Product();
           String query = "SELECT * FROM products WHERE productDescription='"+product.desc+"'";

            // create the java statement
            Statement st = conn.getConnection().createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
      
            // iterate through the java resultset
            while (rs.next())
            {
              product2.desc=rs.getString("productDescription").toString();
              product2.code=rs.getString("productCode").toString();
              product2.cost=Double.parseDouble(rs.getString("cost"));
            }
             st.close();
             
             return product2;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
}
