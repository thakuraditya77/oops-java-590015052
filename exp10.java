class Parent {

    int value = 100;

    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {

    int value = 200;

    Child(int value) {
        this.value = value;
        System.out.println("Value of parent class variable using super: " + super.value);
        System.out.println("Value of child class variable using this: " + this.value);
    }
}

public class exp10 {
    public static void main(String[] args) {
        Child obj = new Child(300);
    }
}
