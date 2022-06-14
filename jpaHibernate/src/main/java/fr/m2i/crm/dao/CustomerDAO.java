package fr.m2i.crm.dao;

import fr.m2i.crm.helper.SessionHelper;
import fr.m2i.crm.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CustomerDAO {

    public void create(Customer customer){
        EntityManager em = SessionHelper.getEntityManager();

        try{
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(customer);
            tx.commit();
        }catch (Exception e){
            System.out.println("Une erreur est survenue lors de la création de votre entité");
        }
    }
    public void update(Long id,String address) {
        EntityManager entityManager = SessionHelper.getEntityManager();
        Customer customerToUpdate = entityManager.find(Customer.class, id);

        if (customerToUpdate == null) {
            System.out.println("Le customer avec l'id:" + id + " n'existe pas");
            return;
        }

        if(address != null)
            customerToUpdate.setAddress(address);


        try {
            EntityTransaction tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(customerToUpdate);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur est survenu lors de la création");
        }
    }

    public void delete(long id){
        EntityManager em = SessionHelper.getEntityManager();

        try{
            EntityTransaction tx  = em.getTransaction();
            Customer customerDelete = em.find(Customer.class,id);
            tx.begin();
            em.remove(customerDelete);
            tx.commit();
        }catch (Exception e){
            System.out.println("Une erreur est survenue lors de la suppresion de votre entité");
        }
    }

    public Customer findByID(long id){
        EntityManager em = SessionHelper.getEntityManager();
        Customer customer = em.find(Customer.class,id);

        return customer;
    }
}
