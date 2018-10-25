/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author imadeddine
 */
public interface IDao <T>{
    boolean Create(T o);
    T getById(int id);
    
}
