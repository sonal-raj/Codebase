// Rubriks Interview Question on Coderpad
// =======================================

import java.io.*;
import java.util.*;

// Question: You are given file (a list of words). Given a query comprising of 3 words, find the smallest contiguous sub-list containing all 3 words.
// Example:

// File: w1 w2 w3 w4 w5 w6 w7 w8 w1 w9 w10 w3
//       0  1  2  3  4  5  6  7  8  9  10  11
  
// Query: w1 w3 w8
// Answer: 5


class Solution {
  
  private String[] file;
  private HashMap<String, ArrayList<Integer>> countMap;
  
  Solution( String[] file ){
    this.file = file;
    countMap = new HashMap<String, ArrayList<Integer>>();
    processFile();
  }
  
  private static int queryString(int[] w1, int[] w2, int[] w3) {
    // Sorted Lists already  
    int indw1 = 0, indw2 = 0, indw3 = 0;
    
    // Size check
    if(wi.length == 0 || w2.length == 0 || w3.length == 0 ) return -1;
    
    int minLength = file.length;
    
    while( indw1 < w1.length && indw2 < w2.length && indw3 < w3.length ) {

      int MinIndexVal = 0;
      int MaxIndexVal = Math.max(w3[indw3], Math.max(w1[indw1], w2[indw2]));
      
      if(w1[indw1] < w2[indw2]) {
        if(w1[indw1] < w3[indw3])
        {
        MinIndexVal = w1[indw1];
        indw1++;
        }
        else {
          MinIndexVal = w3[indw3];
          indw3++;
        }
      }
      else {
        if(w2[indw2] < w3[indw3])
        {
        MinIndexVal = w2[indw2];
        indw2++;
        }
        else {
          MinIndexVal = w3[indw3];
          indw3++;
        }
      }
      
      int len = MaxIndexVal - MinIndexVal;                   
      
      if(len < minLength) minLength = len;
    }
    return minLength;
      
  }
  
  public static int getMinLength(String a, String b, String c) {
     int[] w1, w2, w3;
     if(countMap.containsKey(a))
       w1 = countMap.get(a).toArray(); //check
     else
       return -1;
    
    if(countMap.containsKey(b))
       w2 = countMap.get(b).toArray(); //check
     else
       return -1;
    
    if(countMap.containsKey(c))
       w3 = countMap.get(c).toArray(); //check
     else
       return -1;
    
    return queryString(w1, w2, w3);    
  }
         
  private void processFile() {
    for(int ind = 0; ind < file.length; ind++ ) {
      if(countMap.containsKey(file[ind])) 
        countMap.put(file[ind], countMap.get(file[ind]).add(ind));
      else
      {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(ind);
        countMap.put(file[ind], temp);
      }
    }
  }
    
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");

    for (String string : strings) {
      System.out.println(string);
    }
  }
}

