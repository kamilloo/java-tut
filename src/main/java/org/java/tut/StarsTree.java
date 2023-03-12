package org.java.tut;

public class StarsTree {
    public static String[] draw (int level){
        String[] tree = new String[level];
        String star = "*";
        String emptyChar = " ";
        Integer columnNumbers = 2 * level -1 ;
        Integer starsNumbers = 0;
        Integer oneSideEmptyNumbers = 0;
        String range = new String();
        for (int i= 1; i <= level; i++){
            range = "";
            starsNumbers = 2 * i -1;
            oneSideEmptyNumbers = (int)((columnNumbers - starsNumbers) / 2.0);

            for (int j = 0; j<oneSideEmptyNumbers; j++){range += emptyChar;}

            for (int j = 0; j<starsNumbers; j++){range += star;}

            for (int j = 0; j<oneSideEmptyNumbers; j++){range += emptyChar;}
            tree[i-1] = range;
        }
        return tree;
    }
}
