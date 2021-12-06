/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listedoublementchainee;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author bayembacke
 */
public class ListeDoublementChainee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListIterator <String> iter = list.listIterator(list.size());
        while(iter.hasPrevious()){
            String s= iter.previous();
            System.out.println(s);
            if(s.equals("a")){
                 iter.remove();break;
            }
            
        }
        System.out.println("la liste"+list.toString());
    }
    
}
