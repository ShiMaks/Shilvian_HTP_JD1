package javabegin.training.colect.uniquewords;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by HP Book on 09.10.2017.
 * Count the number of unique words in all java in the folder
 */
public class MyFilter implements FilenameFilter {
    private String afn;
    MyFilter(String afn){
        this.afn = afn;
    }
    @Override
    public boolean accept(File dir, String name) {
        String f = new File(name).getName();
        return f.indexOf(afn) != -1;
    }
}
