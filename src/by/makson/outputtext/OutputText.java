package javabegin.training.colect.outputtext;

import java.io.*;
import java.util.TreeSet;

/**
 * Created by HP Book on 09.10.2017.
 * Print all lines of the current file in alphabetical order.
 */
public class OutputText {

    public static void main(String[] args) {
        File file = new File("D:\\Lesson8\\sourse\\Text.txt");
        BufferedReader read = null;
        TreeSet<String> list = new TreeSet<String>();
        String s;
        try {
            read = new BufferedReader(new FileReader(file));
            while((s = read.readLine()) != null){
                list.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(read != null){
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for( String text: list){
            System.out.println(text);
        }

    }
}
