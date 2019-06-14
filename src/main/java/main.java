import model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class main {

    private static EntityManagerFactory entityManagerFactory;
    private  static EntityManager entityManager;

    static Client client;

    static   JFrame jFrame = new JFrame();

    public static void main(String[] args) throws IOException {

        MainForm mainForm = new MainForm();
        jFrame.setDefaultCloseOperation(3);
        jFrame.getContentPane().add(mainForm.mainPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);



//        entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.jpa" );
//        entityManager = entityManagerFactory.createEntityManager();
//
//        Client client = new Client();
//
//        client.setImie("Kamil");
//        client.setNazwisko("Malinowski");
//        client.setKodPocztowy("66-001");
//        client.setLogin("malina");
//        client.setNumerDomu("35");
//        client.setMiejscowosc("Zawada");
//        client.setUlica("Zawadowa");
//        client.setNumerTelefonu("530335264");
//        client.setPassword("malina123");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(client);
//        entityManager.getTransaction().commit();
//        entityManager.close();


    }



}
