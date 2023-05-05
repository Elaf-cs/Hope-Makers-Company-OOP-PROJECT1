/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

import java.util.*;

/**
 * @author Elaf Haider 
 * this class showing engineering company it is name EHS5
 * and it is return number of applicant and number of profit
 */
public class Company1Eng extends Company {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Applicant> appC1 = new ArrayList<Applicant>();

    public Company1Eng() {
        this.setCompanyName("EHS5");
        this.setTotalOfProfit(appC1.size() * 50);
    }

    /**
     * @return the result if the user enter correct company code
     */
    public boolean ChooseApp(String codeOfApp) {
        if (codeOfApp.equalsIgnoreCase("1213") || codeOfApp.equalsIgnoreCase("1214") || codeOfApp.equals("1223") || codeOfApp.equals("1224") || codeOfApp.equals("1233") || codeOfApp.equals("1234") || codeOfApp.equals("2213") || codeOfApp.equals("2214") || codeOfApp.equals("2223") || codeOfApp.equals("2224") || codeOfApp.equals("2233") || codeOfApp.equals("2234")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return Company name, number of candidates for this company , Total of
     * profit and number of accepting peaple
     */

    public String toString() {
        return "Company1\n" + "Company Name = " + this.getCompanyName()
                + "\nNumber Of Applicant Accepted in this company: " + appC1.size()
                + "\nTotal Of Payments = " + this.getTotalOfProfit()
                + "\n\nAll Accepted for interview:\n\n" + appC1;
    }

    @Override
    public void profit(Applicant appList) {
        int tc1 = this.getTotalOfProfit() * 50;
        this.setTotalOfProfit(tc1);
    }

}
