package org.example.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.certificate.Certificate;


    @Entity
    public class Student {
        @Id
        private int id;
        private String name;
        private String city;
        private Certificate certificate;

        public Student (int id, String name, String city){
            super();
            this.id = id;
            this.name = name;
            this.city = city;
        }

        public Student(){
            super();
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Certificate getCertificate() {
            return certificate;
        }

        public void setCertificate(Certificate certificate) {
            this.certificate = certificate;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

