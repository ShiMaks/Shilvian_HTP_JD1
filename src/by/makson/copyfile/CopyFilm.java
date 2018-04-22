package javabegin.training.colect.copyfile;

import java.io.*;

/**
 * Created by HP Book on 09.10.2017.
 * Copy a large file (movie) to another file. After copying the file size must match.
 */
public class CopyFilm {
    public static void main(String[] args){
        File file = new File("D:\\Lesson8\\sourse\\Film.avi");
        File copyFile = new File("D:\\Lesson8\\out\\CopyFilm.txt");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int i;
        try {
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(new FileOutputStream(copyFile));
            byte[] buffer = new byte[1024];
            while((i = bis.read(buffer)) > 0){
                bos.write(buffer, 0 , i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          finally{
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
        }

    }
}
