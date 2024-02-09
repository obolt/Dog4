// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************

import java.util.*;
public class Main
{
    public static void main(String[] args)
   {
//        Dog dog = new Dog("Spike");
//        System.out.println(dog.getName() + " says " + dog.bark());
//
//        Labrador lab = new Labrador("Happy", "golden");
//        System.out.println(lab.getName());
//        System.out.println(lab.bark());
//        //it gets bark() from the dog class, inheritance
//
//        Yorkshire york = new Yorkshire("NewYork", 5);
//        york.waddle();
//        // lab.waddle(); doesn't work! waddle is in Yorkshire, not Dog, and Lab+York are siblings
//        lab.waddle(); //fixed!
//
//        Dog[] dogs = new Dog[3];
//        Dog yogi = new Yorkshire("Yogi", 7);
//        dogs[1] = yogi;
//        Dog doug = new Dog("Dodger");
//        dogs[0] = doug;
//        Dog cherby = new Labrador("Cherry", "black");
//        dogs[2] = cherby;
//
////        for (int x = 0; x < 3; x++) {
////            System.out.println(dogs[x].bark());
////        }
//
//
////        for (Dog goobs: dogs) {
////            System.out.println(goobs.bark());
////        }
//        //dont have to cast to call bark bc its in Dog and everyone has a bark method in the parent class.
//        //you have to cast the labrador to a labrador because you're calling it from the array, and it's currently being stored as a dog to make it fit into the dog array
//        ((Labrador)dogs[2]).waddle();
//
//        ArrayList<Dog> doggies = new ArrayList<Dog>();
//        doggies.add(new Dog("Charlie Puth"));
//        doggies.add(new Yorkshire("Ed Sheeran", 5));
//        doggies.add(new Labrador("Golden Freddy", "gold"));
//        for(int x = 0; x < 3; x++){
//           // System.out.println(doggies[x].bark()); this did not work. obviously.
//            System.out.println(doggies.get(x).bark());
//        }
//
//        for(Dog goobs: doggies){
//            System.out.println(goobs.bark());
//        }
//        ((Labrador)doggies.get(2)).waddle();
//        // had to put parenthasis around everything before waddle() because labrador was in the array as a dog.
//

ArrayList<Animal> stuff = new ArrayList<Animal>();
    stuff.add(new Dog("Jake"));
    stuff.add(new Labrador("Sundae", "black"));
    stuff.add(new Yorkshire("little guy", 2));
    stuff.get(0).setAge(7);
    stuff.get(1).setAge(2);
    stuff.get(2).setAge(13);
        for(Animal slayers: stuff){
            System.out.println(slayers.getAge());
            slayers.eat();
            System.out.println(slayers.bark()); //wouldn't work bc there's no bark in the animal class. time to fix that!
            // it also wouldn't work bc
        }
    }
}
