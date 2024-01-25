abstract class Animal {
    protected String kind;
    public Animal()  { 
    }
    public abstract String speak();   // Abstract method
}

class Cat extends Animal {
    public Cat() {
        kind = "cat";
        System.out.println("I am a " + kind + " and I go " + speak());
    }
    public String speak() {
        return "meow";
    }
}

class Dog extends Animal {
    public Dog() {
        kind = "dog";
        System.out.println("I am a " + kind + " and I go " + speak());
    }
    public String speak() {
        return "woof";
    }
}
