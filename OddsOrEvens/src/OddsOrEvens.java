import java.util.*;
import java.util.Scanner;
public class OddsOrEvens {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name?");
        String name = imput.nextLine();
        System.out.println("Hi" + name + " , which do you choose? (O)dds or (E)vens?");
        String choise = imput.next();
        if (choise.equals("odds")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else if (choise.equals("evens")) {
            System.out.println(name + " has picked evens! The computer will be odds.");
        } else {
            System.out.print("Wrong imput");
        }
        System.out.println("----------------------------------------------");


        System.out.print("How many “fingers” do you put out?");
        int fingers=imput.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays "+ computer +" fingers.");
        System.out.println("----------------------------------------------");
        int sumoffingers;
        sumoffingers=fingers+computer;
        System.out.println(fingers+" + "+computer+" = "+sumoffingers);
        if (sumoffingers%2==0){
            System.out.println("The sum is even");
          if(choise.equals("even")){
              System.out.println(name+" wins the game.");
          }
          else{
              System.out.println("The computer wins!");
          }
        }
        else if(sumoffingers%2==1){
            System.out.println("The sum is odd");
            if(choise.equals("odd")){
                System.out.println(name+" wins the game.");
            }
            else{
                System.out.println("The computer wins!");
            }
        }
        System.out.println("----------------------------------------------");

    }
    }



