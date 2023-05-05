/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project2;

/**
 *
 * @author Sara hasan
 * this class to view the advertisements of the Hope Makers Company
 * and count the number of people who viewed the advertisements
 */ 
public class Advertisement {

    static int counterViews = 0;

    public Advertisement() {
    }
    
    /**
     * @return How many people saw the advertisement
     */ 
     public static int getCounterViews() {
        return counterViews;
    }
/**
 * 
 * @param counterViews Enter the number of people who viewed the advertisements to 
 * increase them each time
 */
    public void setCounterViews(int counterViews) {
        if (counterViews > 0) {
            Advertisement.counterViews++;
        }
     }
    /**
    * @return The advertisements
    */
    public String toString() {
        return "\n****************************************************************\n**  Welcome to Hope Makers Company                            **\n**  we are specialized to benefits both parties, the job      **\n**  applicants, and the companies that needed employees, In   **\n**  we get fees from our services.                            **\n**  By submitting their CVs we tell them that there is no     **\n**  guarantee that you may or may not get the job, and after  **\n**  you get nominated we arrange a personal interview to one  **\n**  of our affiliate companies.                               **\n****************************************************************\n";
 
    }

}
