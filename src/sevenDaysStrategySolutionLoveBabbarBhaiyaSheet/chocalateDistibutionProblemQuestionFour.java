package sevenDaysStrategySolutionLoveBabbarBhaiyaSheet;

import java.util.Arrays;

/**
 * @author Gyanendra Yadav
 * @created 03/02/2022- 10:28 PM
 * @project YouTubeContent
 */
public class chocalateDistibutionProblemQuestionFour {
    public static void main(String[] args) {
        int []array={3,4,1,9,56,7,9,12};
        System.out.println(count(array,8,5));
    }

    private static int count(int []chocalatesPacket, int numberOfPackets, int numberOfStudents){
        // Step-1 to sort
        Arrays.sort(chocalatesPacket);
        //Base Cases To Handle
        // If Number pf Students and Chocaltes are 0
        if(numberOfPackets==0 || numberOfStudents==0){
            return 0;
        }
        //If Number of Students is equal to number Of Packets of Chocaltes
        if(numberOfPackets==numberOfStudents){
            return ((chocalatesPacket[numberOfPackets-1])-chocalatesPacket[0]);
        }
        //If Number of Students are greater than then the number of Choclates Packet
        if(numberOfStudents> numberOfPackets){
            return -1;
        }
//Variable to store Minimum value
        int min_Diffrence=Integer.MAX_VALUE;//6
        for (int i = 0; i+numberOfStudents-1<numberOfPackets ; i++) {
            min_Diffrence=Math.min(min_Diffrence,chocalatesPacket[i+numberOfStudents-1]-chocalatesPacket[i]);
        }


        return min_Diffrence;
    }
}
