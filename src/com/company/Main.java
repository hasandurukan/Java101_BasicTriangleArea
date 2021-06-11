package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double firstEdge, secondEdge, thirdEdge;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type first edge's length :");
        firstEdge = input.nextDouble();

        System.out.print("Please type second edge's length :");
        secondEdge = input.nextDouble();

        System.out.print("Please type third edge's length :");
        thirdEdge = input.nextDouble();

        /*Formula >
                Perimeter of Triangle=2𝑢=a+b+c
                𝑢 = (a+b+c) / 2
                Area * Area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
        double variableU = (firstEdge + secondEdge + thirdEdge) / 2;
        double triangleArea = Math.sqrt(variableU * (variableU - firstEdge) * (variableU - secondEdge) * (variableU - thirdEdge));
        System.out.print("Area of triangle is "+triangleArea);
    }
}
