package Week5;


import java.util.*;

public class TheMostWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the words: ");
        theMostWord(input.nextLine());
    }

    static void theMostWord(String input) {
        Map<String,Integer> hashMap = new HashMap<>();
        String[] words = input.split(" ");
        for (String word:words) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word,hashMap.get(word)+1); //If key contains then count++;
            } else {
                hashMap.put(word,1); //For every key equals 1
            }
        }
        System.out.println(hashMap); //Print the hashmap
        int max=0;
        String theMostWord="";
        for (String key:hashMap.keySet()) {
            if (hashMap.get(key)>max) { //if value>max then new max equal to value.
                max = hashMap.get(key);
                theMostWord = key;
            }
        }
        if (hashMap.size()!=1&&max==1) { //If hashmap size equals to 1 then, the most used word is this.
            theMostWord = "None";
        }
        System.out.println("The most word is: "+theMostWord+", count is: "+max);
    }

}
