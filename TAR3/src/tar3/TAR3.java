/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tar3;

import java.util.Date;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.HommeFemmePK;
import ma.projet.beans.Mariage;
import ma.projet.service.*;

/**
 *
 * @author DZ5
 */
public class TAR3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HommeService hs = new HommeService();
        FemmeService fs = new FemmeService();
        
        hs.create(new Homme("h1","H1","06xxxxxxx0","El Jadida",new Date()));
        
        fs.create(new Femme("f1","F1","06xxxxxxx1","El Jadida",new Date()));
        
        hs.create(new Homme("h2","H2","06xxxxxxx2","El Jadida",new Date()));
        
        fs.create(new Femme("f2","F2","06xxxxxxx3","El Jadida",new Date()));
        
        hs.create(new Homme("h3","H3","06xxxxxxx4","El Jadida",new Date()));
        
        fs.create(new Femme("f3","F3","06xxxxxxx5","El Jadida",new Date()));
        
        MariageService ms = new MariageService();
        
        Mariage mariage1 = new Mariage(hs.findById(1),fs.findById(2),new Date(),0);
        mariage1.setPk(new HommeFemmePK(1,2,new Date()));
        ms.create(mariage1);
        Mariage mariage2 = new Mariage(hs.findById(1),fs.findById(2),new Date(),0);
        mariage2.setPk(new HommeFemmePK(3,4,new Date()));
        ms.create(mariage2);
        Mariage mariage3 = new Mariage(hs.findById(1),fs.findById(2),new Date(),0);
        mariage3.setPk(new HommeFemmePK(1,4,new Date()));
        ms.create(mariage3);
    }
    
}
