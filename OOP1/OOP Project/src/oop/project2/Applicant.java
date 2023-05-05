/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

import java.util.*;

/**
 * @author Elaf haider
 */
public class Applicant {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int nID;
    private int age;
    
    private String codeOfApp;
    private CV cvInfo = new CV();
    static ArrayList<Integer> arry_NID = new ArrayList<Integer>();

    public Applicant() {
        codeOfApp = "";
    }

    public Applicant(String name, int nID, int age, String codeOfApp, CV cvInfo) {
        this.name = name;
        this.nID = nID;
        this.age = age;
        this.codeOfApp = codeOfApp;
        this.cvInfo = cvInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setnID(int nID) {
        this.nID = nID;
    }

    public int getnID() {
        return nID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCodeOfApp(String codeOfApp) {
        this.codeOfApp = codeOfApp;
    }

    public String getCodeOfApp() {
        return codeOfApp;
    }

    public void setCvInfo(CV cvInfo) {
        this.cvInfo = cvInfo;
    }

    public CV getCvInfo() {
        return cvInfo;
    }

    /**
     * This method takes three parameters Major, subject taken, and years of
     * experiences.As then
     * @return the right company’s code will be displayed as result of the data
     * entered
     */
    public String Choose(String universityMajor, String courseName, int age, int yearsOfExperiences) {
        this.age = age;
        cvInfo.setCourseName(courseName);
        cvInfo.setYearsOfExperience(yearsOfExperiences);
        cvInfo.setUniversityMajor(universityMajor);

        if (getAge() == 20) {
            codeOfApp = codeOfApp + "1";
        }
        if (getAge() == 30) {
            codeOfApp = codeOfApp + "2";
        }
        if (getAge() == 40) {
            codeOfApp = codeOfApp + "3";
        }

        if (cvInfo.getCourseName().equalsIgnoreCase("Paython")) {
            codeOfApp = codeOfApp + "1";
        }
        if (cvInfo.getCourseName().equalsIgnoreCase("Engineering Drawing")) {
            codeOfApp = codeOfApp + "2";
        }
        if (cvInfo.getCourseName().equalsIgnoreCase("Adobe System")) {
            codeOfApp = codeOfApp + "3";
        }

        if (cvInfo.getYearsOfExperience() == 0) {
            codeOfApp = codeOfApp + "1";
        }
        if (cvInfo.getYearsOfExperience() == 6) {
            codeOfApp = codeOfApp + "2";
        }
        if (cvInfo.getYearsOfExperience() == 10) {
            codeOfApp = codeOfApp + "3";
        }

        if (cvInfo.getUniversityMajor().equalsIgnoreCase("Computer science")) {
            codeOfApp = codeOfApp + "1";
        }
        if (cvInfo.getUniversityMajor().equalsIgnoreCase("Information Systems")) {
            codeOfApp = codeOfApp + "2";
        }
        if (cvInfo.getUniversityMajor().equalsIgnoreCase("Architectural Engineering")) {
            codeOfApp = codeOfApp + "3";
        }
        if (cvInfo.getUniversityMajor().equalsIgnoreCase("Industrial engineering")) {
            codeOfApp = codeOfApp + "4";
        }
        if (cvInfo.getUniversityMajor().equalsIgnoreCase("Graphic Design")) {
            codeOfApp = codeOfApp + "5";
        }
        if (cvInfo.getUniversityMajor().equalsIgnoreCase("Infographic")) {
            codeOfApp = codeOfApp + "6";
        }
        return codeOfApp;
    }

    @Override
    /**
     *  هنا رح يجيني اوبجكت من النشونال اي دي اذا كان الاري فاضي خلاص اخرج من هذا الميثود وكمل البرنامج 
     * اما اذا كان ماهو فاضي هذا الاري سويت فور ثانية عشان ادور جوا هذا الاري  اندكس اندكس كل مرة ياخذ الاي دي ذا ويقارنة مع اللي حطيته
     * اذا يساوي بعض تظهرلي  عبارة انو هو موجود اساسا اما اذا ما كان موجود ضيفه
     */
    public boolean equals(Object obj) {
        Integer ob = (Integer) obj;
        for (int i = 0; i < arry_NID.size(); i++) {
            if (arry_NID.isEmpty()) {
                break;
            } else {
                for (int j = 0; j < arry_NID.size(); j++) {
                    int num_1 = arry_NID.get(i);
                    int num_2 = ob;
                    if (num_1 != num_2) {
                        break;
                    } else {
                        System.out.println(">>>>>>>>Your national ID already exists...\n");
                        return false;
                    }
                }
            }
        }
        return true;

    }

    /**
     * @return information of applicant
     */
    @Override
    public String toString() {
        cvInfo.toString();
        return "Applican Name = " + name
                + ", NID = " + nID + ", Age = " + age + cvInfo;
    }

}
