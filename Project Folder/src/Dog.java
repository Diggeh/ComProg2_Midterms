class Dog {
    private String Breed;
    private String Name;

    public Dog(String name, String breed) {
        this.Name = name;
        this.Breed = breed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        this.Breed = breed;
    }

    public void printDog() {
        System.out.println("Name: " + Name + ", Breed: " + Breed);
    }

    public static void createAndManageDogs() {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        System.out.println("\nInitial Details:");
        dog1.printDog();
        dog2.printDog();

        dog1.setName("Rocky");
        dog1.setBreed("Labrador");

        dog2.setName("Charlie");
        dog2.setBreed("Bulldog");

        System.out.println("\nUpdated Details:");
        dog1.printDog();
        dog2.printDog();
    }
}

