/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import beans.Professeur;
import beans.Specialite;
import dao.IDao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author imadeddine
 */
public class ProfesseurService implements IDao<Professeur> {

    @Override
    public boolean Create(Professeur o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(o);
            tx.commit();
            session.close();
            return true;

        } catch (HibernateException e) {
            tx.rollback();
            session.close();
            return false;

        }
    }

    @Override
    public Professeur getById(int id) {
        Professeur p = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        p = (Professeur)session.get(Professeur.class,id);
        session.getTransaction().commit();
        session.close();
        return p;
    }
    
    public List<Professeur> getBySpecialite(Specialite s) {
        List<Professeur> profs = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        profs = session.createQuery("From Professeur where specialite.id="+s.getId()).list();
        session.getTransaction().commit();
        session.close();
        return profs;
    }
    public List<Professeur> findAll() {
        List<Professeur> p = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        p = session.createQuery("From  Professeur  ORDER BY nom").list();
        session.getTransaction().commit();
        session.close();
        return p;
    }

}
