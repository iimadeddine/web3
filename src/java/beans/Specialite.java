/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author imadeddine
 */
@Entity
public class Specialite{
    @Id
    @GeneratedValue
     private int id;
     private String code;
     private String libelle;
     
     @OneToMany(mappedBy = "specialite", fetch = FetchType.EAGER)
     private List<Professeur> professeurs;

    public Specialite() {
    }

    public Specialite(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }
    

    public List<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

   
     
    
}
