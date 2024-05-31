package org.example;

import org.example.certificate.Certificate;
import org.example.student.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
      public static void main(String[] args) {
        System.out.println("Project started");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student1 = new Student();
        student1.setId(012);
        student1.setName("aashis  jha");
        student1.setCity("heerappur");

        Certificate certificate = new Certificate();
        certificate.setCourse("Java developer");
        certificate.setDuration("6 Months");
        student1.setCertificate(certificate);


        Student student2 = new Student();
        student2.setId(013);
        student2.setName("hero Tri");
        student2.setCity("Hampur");

        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Radiology");
        certificate1.setDuration("24 Months");
        student2.setCertificate(certificate1);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(student1);
        s.save(student2);

        tx.commit();                                             //line not written

        s.close();
        factory.close();
      }
}
