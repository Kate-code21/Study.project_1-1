package com.company.Test10;

    public class Man {
        private String name;
        private int age;
        private String wife;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;

        }
        public Man(String name, int age, String wife) {
            this.name = name;
            this.age = age;
            this.wife = wife;
        }
        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }
        public void setWife(String wife) {
            this.wife = wife;
        }
}
