/**
 * David Shim
 * Version #001
 * May 20 2022
 * 10 hours
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.io.FileWriter;

/**
 * Represents the high scores that has been saved within the game file
 */
public class highscores {
    ArrayList<String> updateScore = new ArrayList<>();

    /**
     * This method adds values to arraylist and write all the values of the arraylist in a file
     * @param score This is the score of the user that just played the game
     * @param name This is the name of the user that just played the game
     * if multiple of the same names are inputted, the name with the highest score will only be saved
     * saves all values in arraylist UpdateScore
     */
    public void addHighscore(int score, String name){
        int i = 0;
        int s = score;
        String n = name;
        boolean ifUsed = false;
        for(int k = 0; k < updateScore.size();k++) {
            if (updateScore.get(k).substring(0,updateScore.get(k).lastIndexOf(" ")).equals(n)) {
                int space = updateScore.get(k).lastIndexOf(" ");
                int original = Integer.parseInt(updateScore.get(k).substring(space+1));
                int newO = s;
                if(original < newO){
                    updateScore.remove(k);
                    updateScore.add(k,n+" "+s);
                    ifUsed = true;
                }else{
                    ifUsed = true;
                }
            }
        }
        if(ifUsed == true) {
            try {
                File addScore = new File("highscore.txt");
                FileWriter fos = new FileWriter(addScore);
                BufferedWriter addingScore = new BufferedWriter(fos);
                while (i < updateScore.size()) {
                    addingScore.write(updateScore.get(i));
                    addingScore.newLine();
                    i++;
                }
                addingScore.close();
            } catch (IOException e) {
            }
        }else {
            updateScore.add(n+" "+s);
            try {
                File addScore = new File("highscore.txt");
                FileWriter fos = new FileWriter(addScore);
                BufferedWriter addingScore = new BufferedWriter(fos);
                while (i < updateScore.size()) {
                    addingScore.write(updateScore.get(i));
                    addingScore.newLine();
                    i++;
                }
                addingScore.close();
            } catch (IOException e) {
            }
        }
    }

    /**
     * This method gets the score of a person that the user searches for by inserting an old players name
     * @param name This is the name used to search for the score that matches this user
     * Uses a HashMap to store the scores for each person and makes finding the value of the score much easier
     */
    public void getScore(String name){
        String n = name;
        String data;
        int score;
        int space;
        HashMap<String,Integer> scoreName = new HashMap<String,Integer>();
        for(int i = 0; i < updateScore.size();i++) {
            space = updateScore.get(i).lastIndexOf(" ");
            data = updateScore.get(i).substring(0, space);
            score = Integer.parseInt(updateScore.get(i).substring(space+1));
            scoreName.put(data, score);
        }
        System.out.println(n + "'s score is: " + scoreName.get(n));
    }

    /**
     * sorts the arraylist values from greatest to least
     * Uses the insertion sort to sort the arraylist
     * After sorting, prints all the values back into the file.
     */
    public void updateHighscores(){
        int space;
        for (int i = 1; i < updateScore.size(); i ++) {
            space = updateScore.get(i).lastIndexOf(" ");
            int key1 = Integer.parseInt(updateScore.get(i).substring(space+1));
            String key2 = updateScore.get(i);
            int j = i - 1;
            int space2 = updateScore.get(j).indexOf(" ");
            while ((j >= 0) && (j < updateScore.size()-1) && (Integer.parseInt(updateScore.get(j).substring(updateScore.get(j).indexOf(" ")+1)) < key1)){
                updateScore.set(j+1,updateScore.get(j));
                j = j - 1;
            }
            updateScore.set(j+1,String.valueOf(key2));
        }
        int i = 0;
        try {
            File addScore = new File("highscore.txt");
            FileWriter fos = new FileWriter(addScore);
            BufferedWriter addingScore = new BufferedWriter(fos);
            while(i < updateScore.size()){
                addingScore.write(updateScore.get(i));
                addingScore.newLine();
                i++;
            }
            addingScore.close();
        } catch (IOException e){
        }
    }
}