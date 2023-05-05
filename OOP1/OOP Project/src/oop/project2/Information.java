/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

/**
 *
 * @author samar
 */
public class Information {

    private int numOfApp;
    private int totalAppc1;
    private int totalAppc2;
    private int totalAppc3;
    private int numOfCo;
    private String nameCo1;
    private String nameCo2;
    private String nameCo3;
    private Advertisement Ad = new Advertisement();

    public Information() {
    }

    public Information(int numOfApp, int totalAppc1,
            int totalAppc2, int totalAppc3, int numOfCo,
             String nameCo1, String nameCo2, String nameCo3) {
        
        this.totalAppc1 = totalAppc1;
        this.totalAppc2 = totalAppc2;
        this.totalAppc3 = totalAppc3;
        this.numOfCo = numOfCo;
        this.nameCo1 = nameCo1;
        this.nameCo2 = nameCo2;
        this.nameCo3 = nameCo3;
    }

    public void setNumOfApp(int numOfApp) {
        this.numOfApp = numOfApp;
    }

    public void setTotalAppc1(int totalAppc1) {
        this.totalAppc1 = totalAppc1;
    }

    public void setTotalAppc2(int totalAppc2) {
        this.totalAppc2 = totalAppc2;
    }

    public void setTotalAppc3(int totalAppc3) {
        this.totalAppc3 = totalAppc3;
    }

    public void setNumeOfCo(int numOfCo) {
        this.numOfCo = numOfCo;
    }

    public void setNameCo1(String nameCo1) {
        this.nameCo1 = nameCo1;
    }

    public void setNameCo2(String nameCo2) {
        this.nameCo2 = nameCo2;
    }

    public void setNameCo3(String nameCo3) {
        this.nameCo3 = nameCo3;
    }

    public int getNumOfApp() {
        return numOfApp;
    }


    public int getTotalAppc1() {
        return totalAppc1;
    }

    public int getTotalAppc2() {
        return totalAppc2;
    }

    public int getTotalAppc3() {
        return totalAppc3;
    }

    public int getNumOfCo() {
        return numOfCo;
    }

    public String getNameCo1() {
        return nameCo1;
    }

    public String getNameCo2() {
        return nameCo2;
    }

    public String getNameCo3() {
        return nameCo3;
    }

    public String toString() {
        return "              Company Information" + "\n"
                + "                ( Hope Makers )" + "\n"
                + "Ad Views : " + Ad.getCounterViews() + "\n"
                + "Number of all applicants : " + numOfApp + "\n"
                + "Number of Companes : " + numOfCo + "\n"
                + "The number of all applicants nominated for " + nameCo1 + " company : " + totalAppc1 + "\n"
                + "The number of all applicants nominated for " + nameCo2 + " company : " + totalAppc2 + "\n"
                + "The number of all applicants nominated for " + nameCo3 + " company : " + totalAppc3 + "\n"
                + "The profit From The all applicants :" + numOfApp * 100 + "\n"
                + "The profit From ((" + nameCo1 + ")) company : " + totalAppc1 * 50 + "\n"
                + "The profit From ((" + nameCo2 + ")) company : " + totalAppc2 * 50 + "\n"
                + "The profit From ((" + nameCo3 + ")) company : " + totalAppc3 * 50 + "\n"
                + "\n>>>>> All Applicant Information :\n";

    }

}
