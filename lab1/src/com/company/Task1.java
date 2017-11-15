package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;
import java.io.FileWriter;



public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        TreeSet<Integer> ts = new TreeSet<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i=0; i<100; i++){
            al.add(i);
            ll.add(i);
            ts.add(i);
            hs.add(i);
        }
        long start, total;

        try (FileWriter output = new FileWriter("outputTask1.txt")){
            output.write("Add time:\n");

            start = System.nanoTime();
            al.add(100);
            total = System.nanoTime() - start;
            output.write("ArrayList: "+total+"\n");

            start = System.nanoTime();
            ll.add(100);
            total = System.nanoTime() - start;
            output.write("LinkedList: "+total+"\n");

            start = System.nanoTime();
            ts.add(100);
            total = System.nanoTime() - start;
            output.write("TreeSet: "+total+"\n");

            start = System.nanoTime();
            hs.add(100);
            total = System.nanoTime() - start;
            output.write("HashSet: "+total+"\n");

            output.write("\nFind time:\n");

            start = System.nanoTime();
            al.contains(50);
            total = System.nanoTime() - start;
            output.write("ArrayList: "+total+"\n");

            start = System.nanoTime();
            ll.contains(50);
            total = System.nanoTime() - start;
            output.write("LinkedList: "+total+"\n");

            start = System.nanoTime();
            ts.contains(50);
            total = System.nanoTime() - start;
            output.write("TreeSet: "+total+"\n");

            start = System.nanoTime();
            hs.contains(50);
            total = System.nanoTime() - start;
            output.write("HashSet: "+total+"\n");

            output.write("\nRemove time:\n");

            start = System.nanoTime();
            al.remove(51);
            total = System.nanoTime() - start;
            output.write("ArrayList: "+total+"\n");

            start = System.nanoTime();
            ll.remove(51);
            total = System.nanoTime() - start;
            output.write("LinkedList: "+total+"\n");

            start = System.nanoTime();
            ts.remove(50);
            total = System.nanoTime() - start;
            output.write("TreeSet: "+total+"\n");

            start = System.nanoTime();
            hs.remove(50);
            total = System.nanoTime() - start;
            output.write("HashSet: "+total+"\n");

            output.close();
        }catch (IOException e){
            System.out.println("IOException");
        }
    }
}
