import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*;


class Kodilla4_1 {
        public static void main (String[] args) {
            ArrayList<String> companies = new ArrayList<String>();
            companies.add("DELL");
            companies.add("APPLE");
            companies.add("SAMSUNG");
            companies.add("SONY");
            companies.add("ALCATEL");
            for(String i  : companies);

            System.out.println("\n" + companies.get(0) + ", " + companies.get(1) + ", " + companies.get(2) + ", " + companies.get(3) + ", " + companies.get(4));
        }
    }

