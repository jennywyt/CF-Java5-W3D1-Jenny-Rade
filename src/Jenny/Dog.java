package Jenny;

public class Dog {

        private String name;
        private int age;
        private int weight;
        private String race;

        public Dog() {

        }


        public void doWoof() {
            System.out.println("Woof!");

        }



        private int getAge() {
            return age;

        }

        private void setAge(int newAge) {
            this.age = newAge;

        }

}
