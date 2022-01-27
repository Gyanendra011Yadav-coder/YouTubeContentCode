package sevenDaysStrategySolutionLoveBabbarBhaiyaSheet;

/**
 * @author Gyanendra Yadav
 * @created 23/01/2022- 3:28 PM
 * @project YouTubeContent
 */
public class rainWaterTrappingProblemQuestionNumber3 {
    //Main Method
    public static void main(String[] args) {
        int []buildingsHeights= {1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(totalWaterTrapped(buildingsHeights));
    }
    private static int totalWaterTrapped(int []buildingsHeight){
        //length of the array that we have passed that stores the heights of the Buildings
        int numberOfBuildings=buildingsHeight.length;
        //Array-> That will Store the Maximum Height Building Available At Left
        int []leftMaxBuilding= new int[numberOfBuildings];
        //Array-> That will Store the Maximum Height Building Available At Right
        int []rightMaxBuilding= new int [numberOfBuildings];
        //Filling the 1st
        leftMaxBuilding[0]=buildingsHeight[0];
        for (int i = 1; i <numberOfBuildings ; i++) {
            leftMaxBuilding[i]=Math.max(leftMaxBuilding[i-1],buildingsHeight[i]);
        }
        rightMaxBuilding[numberOfBuildings-1]=buildingsHeight[numberOfBuildings-1];
        for (int i = numberOfBuildings-2; i >=0 ; i--) {
            rightMaxBuilding[i]=Math.max(rightMaxBuilding[i+1],buildingsHeight[i]);
        }
        int countWater=0;
        for (int i = 0; i <numberOfBuildings ; i++) {
            countWater=countWater+Math.min(leftMaxBuilding[i],rightMaxBuilding[i])-buildingsHeight[i];
        }

        return countWater;
    }
}
