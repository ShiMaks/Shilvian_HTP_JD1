package javabegin.training.colect.uniquewords;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Created by HP Book on 09.10.2017.
 */
public class UniqueWords {
    public static void main(String[] args) {
        BufferedReader reader = null;
        HashSet<String> set = new HashSet<String>();
        String line;
        MyFilter myFilter = new MyFilter("java");
        File[] list = new File("D:\\Lesson8\\sourse\\").listFiles(myFilter);
        for( File file: list){
            try {
                reader = new BufferedReader(new FileReader(file));
                while((line = reader.readLine()) != null){
                    StringTokenizer st = new StringTokenizer(line," \t\n\r,.");
                    while(st.hasMoreTokens()) {
                        set.add(st.nextToken());
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                if(reader != null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(set.size());
        for(String text: set){
            System.out.println(text);
        }
    }
}
