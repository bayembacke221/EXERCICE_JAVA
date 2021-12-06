/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persionne.serialisee;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bayembacke
 */
public class TestPersonneSerialisee {
    public static void main(String [] args){
        Personne personne = new Personne("Fallou","Mbaye", 195);
        Personne personne2 = new Personne("Baye Lahad","Mbacke", 190);
        List<Personne> person = new ArrayList<>();
        person.add(personne);
        person.add(personne2);
        File file = new SerializerPersonne().SerializerUnePersonne((ArrayList<Personne>) person);
        new DeserializerPersonne().DeserializerUnePersonne(file);
    }
    
}
