class Person {
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1); 

       
        p1.displayDetails();
      
        p2.displayDetails();
    }
}
