/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.classes.Tache;
import java.util.Date;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;

/**
 *
 * @author PC
 */
public class TestTache {
    public static void main(String[] args) {
        TacheService ts = new TacheService();
        ProjetService ps = new ProjetService();
       ts.create(new Tache("fiare exercice 1", new Date(), new Date("2023/11/01"), 1001, ps.findById(1)));
        ts.create(new Tache("fiare exercice 1", new Date(), new Date("2023/11/01"), 1000, ps.findById(1)));
         ts.create(new Tache("fiare exercice 1", new Date(), new Date("2023/11/01"), 1000, ps.findById(1)));
        
    }
}
