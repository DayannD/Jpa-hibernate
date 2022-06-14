package fr.m2i.crm;

import fr.m2i.crm.dao.CustomerDAO;
import fr.m2i.crm.helper.SessionHelper;
import fr.m2i.crm.model.Customer;
import fr.m2i.crm.state.CustomerState;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = SessionHelper.getEntityManager();
        CustomerDAO customerDAO = new CustomerDAO();
        Customer customer1 = new Customer("cedex 50","Paris","GrandParis","France","dayann@gmail.com","dayann","deshayes","05040304","75000", CustomerState.ACTIVE);
        Customer customer2 = new Customer("cedex 50","Paris","GrandParis","France","dayann@gmail.com","dayann","deshayes","05040304","75000", CustomerState.ACTIVE);
        Customer customer3 = new Customer("cedex 50","Paris","GrandParis","France","dayann@gmail.com","dayann","deshayes","05040304","75000", CustomerState.ACTIVE);
        Customer customer4 = new Customer("cedex 50","Paris","GrandParis","France","dayann@gmail.com","dayann","deshayes","05040304","75000", CustomerState.ACTIVE);

        customerDAO.create(customer1);
        customerDAO.create(customer2);
        customerDAO.create(customer3);
        customerDAO.create(customer4);


        long idUpdate = 1L;
        String adresse = "80000";

        customerDAO.update(idUpdate,adresse);

        long idDelete = 3L;
        customerDAO.delete(idDelete);

        long idRead = 4L;
        Customer customer = customerDAO.findByID(idRead);

        System.out.println(customer.toString());

        em.close();
    }
}
