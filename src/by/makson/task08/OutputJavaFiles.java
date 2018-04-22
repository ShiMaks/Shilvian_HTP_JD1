package javabegin.training.colect.task08;

import java.io.*;

/**
 * Created by HP Book on 09.10.2017.
 */
public class OutputJavaFiles {
    public static void main(String[] args) {
        BufferedReader reader = null;
        String s;
        MyFilter myFilter = new MyFilter("java");
        File[] list = new File("D:\\Lesson8\\sourse\\").listFiles(myFilter);
        for( File file: list){
            System.out.println(file);
            try {
                reader = new BufferedReader(new FileReader(file));
                int i = 0;
                while((s = reader.readLine()) != null && i < 3 ){
                    System.out.println(s);
                    i++;
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
        }

}
