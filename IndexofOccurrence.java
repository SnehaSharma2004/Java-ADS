package Class;

import java.util.*;
import java.io.*;

public class IndexofOccurrence {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        IndexofOccurrence index = new IndexofOccurrence();
        System.out.println(index.strStr("hello", "ll")); 
    }
}
