/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

import java.util.*;

/**
 *
 * @author elafh
 */
public class Company2Prog extends Company {
//Appc2 meaning applicant of eng com
    //Array list form type app2 

    static ArrayList<Applicant> appC2 = new ArrayList<Applicant>();
    //empty constructor

    public Company2Prog() {
      this.setCompanyName("code");
      this.setTotalOfProfit(appC2.size() * 50);
    }




    public boolean ChooseApp(String codeOfApp) {
        if (codeOfApp.equalsIgnoreCase("1111") || codeOfApp.equalsIgnoreCase("1112") || codeOfApp.equalsIgnoreCase("2111") || codeOfApp.equalsIgnoreCase("2112")|| codeOfApp.equals("1121")|| codeOfApp.equals("1122")|| codeOfApp.equals("2121") || codeOfApp.equals("2122")) {
          return true;
        } else {
            return false;
        }

    }

    public String toString() {
   return "Company2\n" + "Company Name = " +this.getCompanyName() 
                 +"\nNumber Of Applicant Accepted in this company: "+ appC2.size() 
                 +"\nTotal Of Payments = " + this.getTotalOfProfit() 
                 +"\n\nAll Accepted for interview:\n\n" + appC2 ;   
   
    }

    @Override
    public void profit(Applicant appList) {
        int tc2 = this.getTotalOfProfit() * 50;
        this.setTotalOfProfit(tc2);
    }

}

  

