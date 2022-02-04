package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static int[] Switch(int a,int b){
        int[] array = {b,a};
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> a = new ArrayList<>(N);
        String [] a_ = scanner.nextLine().split(" ");
        for (int i =0; i<a_.length; i++)
        {
            a.add(Integer.parseInt(a_[i]));
        }
        for (int i =0; i<a.size()-2 ; i++){
            int temp=a.get(i);
            a.set(i,a.get(i+2));
            a.set(i+2,temp);
        }
        System.out.println(a);


    }



}



