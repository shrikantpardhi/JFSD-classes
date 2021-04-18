class ParentAnimal{
	public void eat(String name) {
		System.out.println("Name "+  name);
	}
}

class Animal extends ParentAnimal {
	String name;
	
	public Animal() {
		System.out.println("called contructor using super");
	}
	
	public Animal(String tommy) {
		System.out.println("super with arg "+ tommy);
	}
	
	public void eat() {
		System.out.println("I can dog eat");
	}
	public void eat(String name) {
		super.eat(name);
	}
	public void eate(int name) {
		
	}
} 

class Dog extends Animal{
	
	Dog(String tommy){
		super(tommy);
		
	}
	
	@Override
	public void eat() {
		super.eat();
//	    System.out.println("dog eat");
	}
} 

class Cat extends Animal{
	String str;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public void eat(String name) {
		super.eat(name);
	}
	public void eat(int name) {
		super.eate(name);
	}
	
}
class Main {
	  public static void main(String[] args) {
	    Dog labrador = new Dog("tommy");
	    labrador.eat();
	    Cat c = new Cat();
	    c.eat("Meu");
	  }
	}