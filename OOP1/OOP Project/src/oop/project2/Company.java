/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

/**
 *
 * @author shatha
 * it is abstract class and it implements the interface class and other classes extend it 
 * it also uses the method in the interface and it is own methods .
 */
public abstract class Company implements CompanyModel {
/**
 * here i used the private modifier so that it can be access only by the set and get or special method 
 */
    private int totalOfProfit;
    private static String companyName;
/**
 * it is an empty constructor 
 */
    public Company() {
    }
/**
 * it is constructor that takes 
 * @param companyName to assign the companyName to it 
 * @param totalOfProfit  to assign the totalOfProfit to it 
 */
    public Company(String companyName, int totalOfProfit) {
        this.companyName = companyName;
        this.totalOfProfit = totalOfProfit;
    }
/**
 * 
 * @return here it return totalOfProfit 
 */
    public int getTotalOfProfit() {
        return totalOfProfit;
    }
/**
 * 
 * @param totalOfProfit  it takes the same name so i use (this) and a assign to it 
 */
    public void setTotalOfProfit(int totalOfProfit) {
        this.totalOfProfit = totalOfProfit;
    }
/**
 * 
 * @return companyNmae that i call it when i need it 
 */
    public String getCompanyName() {
        return companyName;
    }
/**
 * 
 * @param companyName it takes the same name so i use (this) and a assign to it 
 */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
/**
 * 
 * @param codeOfApp it is an abstract method so i only need to write the header 
 * @return there is no return for the same reason 
 */
    public abstract boolean ChooseApp(String codeOfApp);

    @Override
    public String toString() {
        return " ";
    }

}
