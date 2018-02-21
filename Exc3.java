package Exc3;

import java.util.LinkedList;

public class Exc3
{
    public static void main(String[] args) {

        LinkedList<Integer> liste = new LinkedList<Integer>();

        for (int i = 0; i <= 20; i++){
            liste.add(i);
        }

        System.out.println(removeEvenInRange(liste,2,10));
    }

    public static LinkedList<Integer> removeEvenInRange(LinkedList<Integer> liste, int startIndex, int endingIndex){

        LinkedList<Integer> removeEven = new LinkedList<Integer>();

        removeEven.addAll(liste);

        while (endingIndex > startIndex){
            // benytter modulus til at fjerne hele tal fra det givne index og frem til det givne slut index
            if (removeEven.get(startIndex) % 2 == 0){
                removeEven.remove(startIndex);
                startIndex++;
            } else {
                startIndex++;
            }
        }
        return removeEven;
    }
}
