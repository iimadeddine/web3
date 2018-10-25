/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import beans.Specialite;
import dao.IDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author imadeddine
 */
public class SpecialiteService implements IDao <Specialite>{

    @Override
    public boolean Create(Specialite o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        try{
        session.save(o);
        tx.commit();
        session.close();
        return true;
        
        }
        catch (Exception e){
            session.close();
            return false;
            
            
      }
        
                
        }

    @Override
    public Specialite getById(int id) {
        Specialite s = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        s = (Specialite)session.get(Specialite.class,id);
        session.getTransaction().commit();
        session.close();
        return s;
        }

  

   
    
}
