/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author imadeddine
 */
@Entity
public class Professeur {
    @Id
    @GeneratedValue
    
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private Date dateEmbauche;
    private String telephone;
    private String email;
    
    @ManyToOne
    private Specialite specialite;

    public Professeur() {
    }

    public Professeur(String nom, String prenom, String sexe, Date dateEmbauche, String telephone, String email, Specialite specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.dateEmbauche = dateEmbauche;
        this.telephone = telephone;
        this.email = email;
        this.specialite = specialite;
    }
    
    

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
