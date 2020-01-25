package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainlist = new ArrayList<Integer>();
        /*ArrayList<Integer> secondlist = new ArrayList<Integer>();
        ArrayList<Integer> thirdlist = new ArrayList<Integer>();
        ArrayList<Integer> otherlist = new ArrayList<Integer>();*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            mainlist.add(number);
        }

      /*  secondlist = Solution.divideByThree(mainlist);
        thirdlist = Solution.divideByTwo(mainlist);
        otherlist = Solution.divideByOther(mainlist);
        Solution.printList(secondlist);
        Solution.printList(thirdlist);
        Solution.printList(otherlist);*/

        Solution.divideByThree(mainlist);
        Solution.divideByTwo(mainlist);
        Solution.divideByOther(mainlist);


    }


    public static void divideByThree(ArrayList<Integer> list) {
        ArrayList<Integer> thirdlist = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                thirdlist.add(list.get(i));
            }
        }
        printList(thirdlist);
    }

    public static void divideByTwo(ArrayList<Integer> list) {
        ArrayList<Integer> secondlist = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                secondlist.add(list.get(i));
            }
        }
        printList(secondlist);
    }

    public static void divideByOther(ArrayList<Integer> list) {
        ArrayList<Integer> otherlist = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) % 3 == 0) && !(list.get(i) % 2 == 0)) {
                otherlist.add(list.get(i));
            }
        }
        printList(otherlist);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
