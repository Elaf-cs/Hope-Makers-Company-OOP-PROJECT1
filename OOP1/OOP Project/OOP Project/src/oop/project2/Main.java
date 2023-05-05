/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

import java.util.*;

/**
 *@author 
 * Elaf haider
 * Samar 
 * 
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String loopAnswer = "Yes";
        String answer1 = null;
         
         ArrayList<Applicant> AllApp = new ArrayList<>();

         ArrayList<Applicant> appC1copy = new ArrayList<Applicant>();     
         Company1Eng.appC1 = appC1copy;
         ArrayList<Applicant> appC2copy = new ArrayList<Applicant>();
         Company2Prog.appC2 = appC2copy; 
         ArrayList<Applicant> appC3copy = new ArrayList<Applicant>();
         Company3Des.appC3 = appC3copy; 

         Applicant obj = new Applicant();

        do {
            System.out.println("\nWelcome to Hope Makers Company ");
            System.out.print("Do you want to see the Advertisement ? ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("yes")) {
               Advertisement adv = new Advertisement();
                adv.setCounterViews(1);
                System.out.println(adv);
            }
            System.out.println("Choose one of these Categories: \n 1: Job applicant \n 2: Company \n 3: Manager");
            int answer2 = input.nextInt();
            switch (answer2) {
                case 1:
                    System.out.println("If you want to put your so that we can show it to companies looking for employees,"
                            + "\nplease pay the registration amount of 100 RS to the account number shown in front of you 1123462289,"
                            + "\nIf you do the operation, enter the code sent to you."
                            + "Please.\nif you did not, enter a zero (0)");

                    int answer3 = input.nextInt();
                    if (answer3 >= 1000 & answer3 <= 9999) {
                        System.out.println("\nFull the information of your CV:");

                        System.out.print("Enter your name : ");
                        String name = input.next();

                        System.out.print("Enter your national ID : ");
                        int national_ID = input.nextInt();
                        Applicant obj1 = new Applicant();
                        obj1.setnID(national_ID);
                        Integer national_ID_obj = national_ID;
                        
                        if (obj1.equals(national_ID_obj)) {
                        Applicant.arry_NID.add(national_ID_obj);
                        System.out.println("Enter your age \n1: 20 - 30 years \n2: 30 - 40 years \n3: more than 40 years:");
                        int age1 = input.nextInt();

                         if (age1 == 1) {
                            age1 = 20;
                        } else {
                            if (age1 == 2) {
                                age1 = 30;
                            } else {
                            if (age1 == 3) {
                                age1 = 40;
                            } 
                               else{
                               System.out.println(" It isn't one of chosses ");
                               break;
                              }
                            }
                        }

                        System.out.println("Choose your major \n1:Computer science\n2:Information Systems"
                                + "\n3:Architectural Engineering\n4:Industrial engineering"
                                + " \n5:Graphic Design\n6:Infographic");
                        String major = input.next();
                     if (major.equalsIgnoreCase("1")) {
                            major = "Computer science";
                        } else {
                            if (major.equalsIgnoreCase("2")) {
                                major = "Information Systems";
                            } else {
                            if (major.equalsIgnoreCase("3")) {
                                major = "Architectural Engineering";
                            } else{
                            if (major.equalsIgnoreCase("4")) {
                                major = "Industrial engineering";
                              }else{
                            if (major.equalsIgnoreCase("5")) {
                                major = "Graphic Design";
                              }else{
                            if (major.equalsIgnoreCase("6")) {
                                major = "Infographic";
                              }
                               else{
                               System.out.println(" It isn't one of chosses ");
                               break;
                              }
                            }
                        }
                     }
                   }
                 }
                  
                        System.out.println("Which course of these courses did you take?\n1:Paython\n2:Engineering Drawing\n3:Adobe System");
                            String course = input.next();
                        if (course.equalsIgnoreCase("1")) {
                            course = "paython";
                        } else {
                            if (course.equalsIgnoreCase("2")) {
                                course = "Engineering Drawing";
                            } else {
                            if (course.equalsIgnoreCase("3")) {
                                course = "Adobe System";
                            } 
                               else{
                               System.out.println(" It isn't one of chosses ");
                               break;
                             }
                           }
                        }


                        System.out.println("Choose your years of experience: \n1: 0-5 years \n2: 6-10 years \n3: more than 10 years");
                        int years = input.nextInt();
                            if (years == 1) {
                               years = 0;
                        } else {
                            if (years == 2) {
                                years = 6;
                            } else {
                            if (years == 3) {
                                years = 10;
                            } 
                               else{
                               System.out.println(" It isn't one of chosses ");
                               break;
                               }
                            }
                        }
                        System.out.println("Enter 3 of your skills: ");
                        CV.skills = "1- "+ input.next()+", 2- "+input.next() +", 3- "+ input.next();

                        

                         System.out.println("Sending your CV to companies >>>>>> ");
                          CV cv1 = new CV();                       
                          Applicant obj2 = new Applicant();
                          cv1.setVerificationCode(answer3);
                          cv1.setUniversityMajor(major);
                          cv1.setCourseName(course);
                          cv1.setYearsOfExperience(years);
                          cv1.setCounterApp(1);
                          obj2.setName(name);
                          obj2.setnID(national_ID);
                          obj2.setAge(age1);
                          obj2.Choose(major, course, age1, years); 
                          AllApp.add(obj2);                               
                         
                            Company1Eng eng = new Company1Eng();
                            Company2Prog prog = new Company2Prog();
                            Company3Des des = new Company3Des();

                           if(eng.ChooseApp(obj2.getCodeOfApp())){
                              System.out.println(">>>>>>>>...You have been nominated for a job interview in "+"EHS5 Engineering Company"+"\nEmail: EHS5.ENG.Company@gmail.com \nIBAN CODE: 1123462289");
                               appC1copy.add(obj2);
                              }else{
                            if(prog.ChooseApp(obj2.getCodeOfApp())){
                              System.out.println(">>>>>>>>...You have been nominated for a job interview in "+ prog.getCompanyName()+" Company");
                                appC2copy.add(obj2);
                               }else{
                            if(des.ChooseApp(obj2.getCodeOfApp())){
                              System.out.println(">>>>>>>>...You have been nominated for a job interview in "+ des.getCompanyName()+" Company");
                                appC3copy.add(obj2);
                            }else{
                              System.out.println(">>>>>>>>...Sorry you didn't pass");
                              }
                             } 
                            }
                           }
                          }
                         
                    break;
        
                case 2:
                    System.out.println("Enter your company number ");
                    
                    int answer10 = input.nextInt();
                    if (answer10 == 1) {
                        System.out.println(new Company1Eng());
                    } else {
                        if (answer10 == 2) {
                            System.out.println(new Company2Prog());
                        } else {
                            if (answer10 == 3) {
                                System.out.println(new Company3Des());
                            } else {
                                System.out.println("The number is false ");
                            }
                        }
                    }
                    break;

                case 3:
                        CV cv1 = new CV();                       
                        Information info = new Information();
                        info.setNumOfApp(cv1.getCounterApp());
                        info.setNumeOfCo(3);

                        info.setTotalAppc1(new Company1Eng().appC1.size());
                        info.setTotalAppc2(new Company2Prog().appC2.size());
                        info.setTotalAppc3(new Company3Des().appC3.size());

                        info.setNameCo1(new Company1Eng().getCompanyName());
                        info.setNameCo2(new Company2Prog().getCompanyName());
                        info.setNameCo3(new Company3Des().getCompanyName());

                        System.out.println(info);
                        System.out.println(AllApp);

                    break;

                default:
                    System.out.println("It isn't one of chosses ");
            }
            
            System.out.println("\nAre you a new user ?");
            answer1 = input.next();
        } while (loopAnswer.equalsIgnoreCase(answer1));
    }
}
        