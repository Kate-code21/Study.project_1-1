package com.company.Test10;

public class Woman {
        private String name;
        private int age;
        private String husband;

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }
    public Woman(String name, int age, String husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }
        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }
        public void setHusband(String husband) {
            this.husband = husband;
        }

}