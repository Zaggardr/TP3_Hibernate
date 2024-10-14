/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.classes.Employe;
import ma.projet.service.EmployeService;

/**
 *
 * @author PC
 */
public class TestEmploye {
    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        es.create(new Employe("Yousfi", "Mohamed", "0620901283"));
         es.create(new Employe("Maafry", "Rachid", "0672737672"));
          es.create(new Employe("Dradi", "Mehdi", "0778138381"));
           es.create(new Employe("Douadi", "Taha", "0702117930"));
           
    }
    
}
