package com.cqgas.dynamicds;

public class CustomerContextHolder {   
    private static final ThreadLocal contextHolder =    
        new ThreadLocal();   
       
    public static void setCustomerType(String customerType) {  
    	
      contextHolder.set(customerType);   
      //System.out.println("customerType= : "+customerType);
    }   
       
    public static String getCustomerType() {   
      return (String) contextHolder.get();   
    }   
       
    public static void clearCustomerType() {   
      contextHolder.remove();   
    }   
  
} 

