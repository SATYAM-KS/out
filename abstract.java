abstract class Animal{
  abstract void sound();
  
  public static void main(String[] args){
      Dog d = new Dog();
      d.sound();
  }
}
class Dog extends Animal{
  void sound(){
    System.out.println("Dog barks.");
  }
}
