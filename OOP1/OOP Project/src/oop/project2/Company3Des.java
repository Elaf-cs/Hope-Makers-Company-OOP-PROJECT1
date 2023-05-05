/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

/**
 * @author Hanan Faruqui
 * this class showing desighning company it's name is Dream
 * and it is return number of applicant and number of profit
 */
import java.util.*;

public class Company3Des extends Company {
    
    /**
     * @param args the command line arguments
     */
    static ArrayList<Applicant> appC3 = new ArrayList<Applicant>();

    public Company3Des() {
      this.setCompanyName("Dream");
      this.setTotalOfProfit(appC3.size() * 50);
    }
    
    /**
     * @return the result if the user enter correct company code
     */
    @Override
    public boolean ChooseApp(String codeOfApp) {
        if (codeOfApp.equalsIgnoreCase("1315") || codeOfApp.equalsIgnoreCase("1316") || codeOfApp.equals("1325")|| codeOfApp.equals("1326")|| codeOfApp.equals("2315")|| codeOfApp.equals("2316")|| codeOfApp.equals("2325")|| codeOfApp.equals("2326")) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * @return Company name, number of candidates for this company , Total of
     * profit and number of accepting peaple
     */
    @Override
    public String toString() {
   return "Company3\n" + "Company Name = " +this.getCompanyName() 
                 +"\nNumber Of Applicant Accepted in this company: "+ appC3.size() 
                 +"\nTotal Of Payments = " + this.getTotalOfProfit() 
                 +"\n\nAll Accepted for interview:\n\n" + appC3 ; 
 
     }
    
    
   
    @Override
    public void profit(Applicant appList) {
        int tc3 = this.getTotalOfProfit() * 50;
        this.setTotalOfProfit(tc3);
    }
    
}
