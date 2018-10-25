/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Service.ProfesseurService;
import Service.SpecialiteService;
import beans.Professeur;
import beans.Specialite;
import java.util.Date;
import util.HibernateUtil;

/**
 *
 * @author imadeddine
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
        SpecialiteService ss = new SpecialiteService();
//         ss.Create(new Specialite("Jv","Java/JEE"));
//         ss.Create(new Specialite("net",".net"));
//         ss.Create(new Specialite("Gdp","Gestion de projet"));
//         ss.Create(new Specialite("cs","Cisco"));
//         ss.Create(new Specialite("php","PHP"));
        
        ProfesseurService ps = new ProfesseurService();
//        ps.Create(new Professeur("Nprof1", "Pprof1", "M", new Date(), "0658549485", "prof1@gmail.com",ss.getById(5)));
//        ps.Create(new Professeur("Nprof2", "Pprof2", "M", new Date(), "0658655995", "prof2@gmail.com",ss.getById(5)));
//        ps.Create(new Professeur("Nprof3", "Pprof3", "F", new Date(), "0658556685", "prof3@gmail.com",ss.getById(4)));
//        ps.Create(new Professeur("Nprof4", "Pprof4", "M", new Date(), "0652558985", "prof4@gmail.com",ss.getById(4)));
//    
//        for(Professeur p : ps.getBySpecialite(ss.getById(4))){
//            System.out.println(p.getNom());
//        }
        for(Professeur p : ps.findAll()){
            System.out.println("nom : "+p.getNom());
        }
    
    }
    
}
