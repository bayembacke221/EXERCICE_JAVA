/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import static java.lang.System.out;
import java.util.*;
/**
 *
 * @author bayembacke
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HashMap <Integer, String> table = new HashMap <> ( );
    table.put( new Integer(1), "Livre Java") ;table.put( new Integer(2), "Livre Oracle") ;
    table.put( new Integer(3), "Livre C++") ;table.put( new Integer(4), "Livre Reseaux") ;
    Set <Map.Entry<Integer, String>> entrees = table.entrySet ( ) ; //ensemble de paires
    Iterator <Map.Entry<Integer, String>> iter = entrees.iterator ( ) ; // iterateur sur les paires
    while (iter.hasNext ( ) )
    {
        Map.Entry<Integer, String> entree = iter.next ( ) ; // on est sur la paire courante
        Integer cle = entree.getKey ( ) ;
        String valeur = entree.getValue ( ) ;
        if (cle!= null && cle. toString(). equals ( new Integer(2).toString() ))
        { 
            table.put (new Integer(2), "Revue Technical Report" ) ;
        }
        System.out .print(table.get( new Integer(2)) );
        }
    }
}
