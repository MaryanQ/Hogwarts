package edu.generic;

import edu.hogwarts.data.HouseEnum;




    public class HogwartsStudent extends Student {
        private HouseEnum house;

        public HogwartsStudent(String firstName, String middleName, String lastName, int age, HouseEnum house) {
            super(firstName, middleName, lastName, age, house);
            this.house = house;
        }

        public HouseEnum getHouse() {
            return house;
        }

        public void setHouse(HouseEnum house) {
            this.house = house;
        }

        @Override
        public String toString() {
            return "HogwartsStudent{" +
                    "name='" + getFirstName() + " " + getLastName() + '\'' +
                    ", age=" + getAge() +
                    ", house=" + house +
                    '}';
        }
    }