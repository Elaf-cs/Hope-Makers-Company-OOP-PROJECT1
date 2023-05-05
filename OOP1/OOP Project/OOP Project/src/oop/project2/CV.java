/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

/**
 *
 * @author elafh
 */
public class CV {

    private int verificationCode;
    static int counterApp = 0;
    private String universityMajor;
    private String courseName;
    static String skills = null ;
    private int yearsOfExperience;

    public CV() {
        this.verificationCode = 0;
        this.universityMajor = null;
        this.courseName = null;
        this.yearsOfExperience = 0;
    }

    public CV(int verificationCode,String universityMajor, String courseName, String skills, int yearsOfExperience) {
        this.verificationCode = verificationCode;
        this.universityMajor = universityMajor;
        this.courseName = courseName;
        this.skills = skills;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setVerificationCode(int verificationCode) {
            this.verificationCode = verificationCode;
        }

    public int getVerificationCode() {
        return verificationCode;
    }

    public void setCounterApp(int counterApp) {
        if (verificationCode > 0) {
            CV.counterApp++;
         }
    }  
    public static int getCounterApp() {
        return counterApp;
    }

    public void setUniversityMajor(String universityMajor) {
            this.universityMajor = universityMajor;
    }

    public String getUniversityMajor() {
        return universityMajor;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }  

    public String getCourseName() {
        return courseName;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

     public int getYearsOfExperience() {
            return yearsOfExperience;
     }

    @Override
    public String toString() {
        return "\n" +  "UniversityMajor = " + universityMajor + ", CourseName = " + courseName
                       + "\n Skills = " + skills + ", yearsOfExperience = " + yearsOfExperience + "}";
    }


}
