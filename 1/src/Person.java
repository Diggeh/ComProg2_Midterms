// Define the Person class
class Person {
    // Attributes
    String name;
    int age;
    String address;

    // Constructor to initialize the attributes
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printNameAndAge() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void People() {
    	Person person1 = new Person("Alice", 30, "123 Main St");
        Person person2 = new Person("Bob", 25, "456 Elm St");
        Person person3 = new Person("Charlie", 35, "789 Oak St");
        Person person4 = new Person("David", 40, "101 Pine St");
        Person person5 = new Person("Eve", 28, "202 Maple St");
        
        person1.printNameAndAge();
        person2.printNameAndAge();
        person3.printNameAndAge();
        person4.printNameAndAge();
        person5.printNameAndAge();
    }
}
