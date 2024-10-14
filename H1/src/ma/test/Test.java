/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.test;

import java.util.Date;
import java.util.List;
import ma.entity.Produit;
import ma.service.ProduitService;

/**
 *
 * @author HP
 */
public class Test {
    
    public static void main(String[] args) {
     
        ProduitService ps = new ProduitService();
        
        
         Produit p1 = new Produit("Apple", "A123", new Date(2024,6,1), 1500.0, "Laptop");
        Produit p2 = new Produit("Samsung", "S456", new Date(2024,5,8), 800.0, "Smartphone");
        Produit p3 = new Produit("Hp", "K123", new Date(2023,6,19), 1500.0, "Probook");
        Produit p4 = new Produit("Samsung", "A456", new Date(), 1000.0, "Smartphone");
        Produit p5 = new Produit("BlueSmart", "V123", new Date(), 50.0, "kits");
        ps.create(p1);
        ps.create(p2);
        ps.create(p3);
        ps.create(p4);
        ps.create(p5);
        
        // afficher tous les produits
        System.out.println("\n--------------------------------affichage des produits-------------------------\n");
     int s = 1;
       for(Produit p : ps.findAll(null)){
          System.out.println("Produit " + String.valueOf(s) + ": " + p.getMarque());
     }
        
        
        // afficher les infos sur le produit 2
        System.out.println("\n---------------------------affichage des infos du produit 2-----------------------------------------------\n");
        p2 = ps.findById(2);
        System.out.println("Margue: " + p2.getMarque());
        System.out.println("Referenc: " + p2.getReference());
        System.out.println("DateAchat: " + p2.getDateAchat());
        System.out.println("Prix: " + p2.getPrix());
        System.out.println("Designation: " + p2.getDesignation());
        
        // supprimer le produit 3
        ps.delete(ps.findById(3));
        
        
        // modifier les info du produit 1
        p1 = ps.findById(1);
        p1.setDesignation("updated Destin 1");
        ps.update(p1);
        
        // affichier la list des produits dont le prix > 100
        System.out.println("\n--------------liste produit done le pris >100---------------------------------------------\n");
       
        for(Produit p : ps.findAll(null)){
            if(p.getPrix() > 100){
                System.out.println(p.getMarque());
            }
        }
        
        // Afficher la liste des produits Commander entre deux dates lus au clavier.
        
        System.out.println("\nLa liste des produits commander entre 01/03/2024 et 01/11/2024\n");
        Date minDate = new Date(2024, 4, 1);
        Date maxDate = new Date(2024, 11, 1);
        
        for(Produit p : ps.findAll(null)){
            if( (maxDate.compareTo(p.getDateAchat()) == 1 || maxDate.compareTo(p.getDateAchat()) == 0)&& 
                    (minDate.compareTo(p.getDateAchat()) == -1 || minDate.compareTo(p.getDateAchat()) == 0)
        )
            {
                System.out.println(p.getMarque() + ", " + p.getDateAchat());
            }
        }
   
    }
}
