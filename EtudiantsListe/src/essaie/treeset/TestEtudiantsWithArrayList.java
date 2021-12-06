/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaie.treeset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author bayembacke
 */
public class TestEtudiantsWithArrayList {
    public static void main(String []arg){
    List <Etudiant> etudiant = new ArrayList<>();
    etudiant.add(new Etudiant("Mbaye", "Baye Mbacke", "201808JGF"));
    etudiant.add(new Etudiant("Seck", "Baye Serigne", "201808WAZ"));
    etudiant.add(new Etudiant("Dioum", "Serigne Mbacke", "201808RJF"));
    etudiant.add(new Etudiant("Mbacke", "Baye Lahad", "201808ZWQ"));
    etudiant.add(new Etudiant("Toure", "Mouhamet", "201808KHZ"));
    etudiant.add(new Etudiant("Faye", "Mouhamet", "201808LOL"));
    etudiant.add(new Etudiant("Faye", "Mouhamet", "201808LOL"));
    Iterator <Etudiant> iterator = etudiant.iterator();
    while(iterator.hasNext()){
        Etudiant etudiants = iterator.next();
        System.out.println(etudiants.getPrenom()+"->"+etudiants.getNom());
    }
    }
}
