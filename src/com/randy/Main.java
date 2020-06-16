package com.randy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This codes below provides the total of Blocks of a building

        int count = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Block Size: ");
            int number = scanner.nextInt();

            if (blockInches(number)) {
                System.out.println("Block " + number + " inches Selected..........Proceed Now");
            } else {
                System.out.println("Error the block type should be either 5 or 6 inches");
            }
            if ((number == 5) || (number == 6)) {
                break;
            }
            count++;
            if (count == 5) {
                break;
            }

        } while (true);


        System.out.println("FROM FOUNDATION LEVEL TO DPC");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total length of foundation wall in  millimetres: ");
        double totalLengthOfFoundationWalls = scanner.nextInt();
        totalLengthOfFoundationWalls /= 1000;
        System.out.println("The total length of foundation wall in meters is " + totalLengthOfFoundationWalls + " metres");
        System.out.println();
        System.out.println("Enter the height from the foundation to DPC in millimetres: ");
        double theHeightOfWallOfFoundationToDPc = scanner.nextInt();
        theHeightOfWallOfFoundationToDPc /= 1000;
        System.out.println("The height from the foundation to DPC is " + theHeightOfWallOfFoundationToDPc + " metres");
        System.out.println();
        double totalAreaOfFoundationToDpcWall = totalLengthOfFoundationWalls * theHeightOfWallOfFoundationToDPc;
        System.out.println("Therefore the total Area of the foundation wall = " + totalAreaOfFoundationToDpcWall + " metre square");
        System.out.println();
        int totalNumberOfFoundationBlocks = (int) (totalAreaOfFoundationToDpcWall * 10);
        System.out.println("Total number of blocks required for foundation to DPC = " + totalNumberOfFoundationBlocks + " blocks");


        System.out.println("*******************************************************");
        System.out.println("FROM DPC TO LINTEL");
        System.out.println();
        System.out.println("Enter the total length of DPC to Lintel wall(Excluding areas with no walls like Verandahs) in  millimetres: ");
        double totalLengthOfDpcToLintelWall = scanner.nextInt();
        totalLengthOfDpcToLintelWall /= 1000;
        System.out.println("The total length of DPC to Lintel wall in meters is " + totalLengthOfDpcToLintelWall + " metres");
        System.out.println();
        System.out.println("Enter the height from DPC to Lintel in millimetres is : ");
        double theHeightOfWallOfDpcToLintel = scanner.nextInt();
        theHeightOfWallOfDpcToLintel /= 1000;
        System.out.println("The height from the foundation to DPC is " + theHeightOfWallOfDpcToLintel + " metres");
        System.out.println();
        System.out.println("Enter the total area of all doors in millimetres is: ");
        double totalAreaOFAllDoors = scanner.nextInt();
        totalAreaOFAllDoors /= 1000;
        System.out.println("The total area of all doors in metres is " + totalAreaOFAllDoors + " metres");
        System.out.println();
        System.out.println("Enter the total area of all windows in millimetres: ");
        double totalAreaOFAllWindows = scanner.nextInt();
        totalAreaOFAllWindows /= 1000;
        System.out.println();
        System.out.println("The total area of all windows in metres is " + totalAreaOFAllWindows + " metres");
        System.out.println();
        double totalAreaOfDpcToLintelWall =((totalLengthOfDpcToLintelWall * theHeightOfWallOfDpcToLintel) - (totalAreaOFAllDoors + totalAreaOFAllWindows));
        System.out.println("Therefore the total Area of rooms wall = " + totalAreaOfDpcToLintelWall + " metre square");
        System.out.println();
        int totalNumberOfDpcToLintelBlocks = (int) (totalAreaOfDpcToLintelWall * 10);
        System.out.println("Total number of blocks required for DPC to Lintel = " + totalNumberOfDpcToLintelBlocks + " blocks");
        System.out.println("*******************************************************");

        System.out.println("*******************************************************");
        System.out.println("FROM LINTEL TO ROOF");
        System.out.println();
        System.out.println("Enter the total length of Lintel to roof wall: ");
        double totalLengthOfLintelToRoofWall = scanner.nextInt();
        totalLengthOfLintelToRoofWall /= 1000;
        System.out.println("The total length of Lintel to roof wall in meters is " + totalLengthOfLintelToRoofWall + " metres");
        System.out.println();
        System.out.println("Enter the height from Lintel to roof in millimetres is : ");
        double theHeightOfWallOfLintelToRoof = scanner.nextInt();
        theHeightOfWallOfLintelToRoof /= 1000;
        System.out.println("The height from Lintel to roof is " + theHeightOfWallOfLintelToRoof + " metres");
        System.out.println();
        double totalAreaOfLintelToRoofWall =totalLengthOfLintelToRoofWall * theHeightOfWallOfLintelToRoof ;
        System.out.println("Therefore the total Area of roof wall = " + totalAreaOfLintelToRoofWall + " metre square");
        System.out.println();
        int totalNumberOfLintelToRoofBlocks = (int) (totalAreaOfLintelToRoofWall * 10);
        System.out.println("Total number of blocks required for Lintel to roof = " + totalNumberOfLintelToRoofBlocks + " blocks");
        System.out.println("*******************************************************");
        System.out.println();
        System.out.println("***************************************************************");
        int theTotalNumberOfBlocksRequiredForTheConstruction = totalNumberOfFoundationBlocks + totalNumberOfDpcToLintelBlocks + totalNumberOfLintelToRoofBlocks;
        System.out.println("The total number of blocks required to complete the construction is " + theTotalNumberOfBlocksRequiredForTheConstruction);

    }

    public static boolean blockInches(int number) {
        if ((number == 5) || (number == 6)) {
            return true;
        } else {
            return false;
        }

    }
//    public static double conversion(int conversion){
//
//    }


}



