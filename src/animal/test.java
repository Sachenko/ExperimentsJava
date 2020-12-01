package animal;

public class test {
    public static void main(String[] args) {
        catBowl catBowl = new catBowl();
        Cat tom = new Cat();
        Tiger tig = new Tiger();

        tom.eat();

        Cat maxCat = new Tiger();
        /*Tiger miniCat = new Cat();*/ // wrong


        Cat jim = (Tiger) tig;
        System.out.println(jim == tig);
        tig.eatZebra();
        jim.eat();
        maxCat.eat();
        catBowl.feedCat(tom);
        catBowl.feedCat(tig); // Везде где используется родительский класс можно использовать родительский







    }



    }
/*        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Crow();

        List<Animal> collectionAnimal = new ArrayList<>();

        collectionAnimal.add(animal1);
        collectionAnimal.add(animal2);
        collectionAnimal.add(animal3);

        for (int i = 0; i < 10; i++ ) {
            collectionAnimal.add(new Dog());
        }


//      for (ТИП переменная : коллекция) оператор
        for (Animal someAnimal  : collectionAnimal) {
            print(someAnimal);
        }
//

    }

    static void print (Animal animal) {
        animal.say();
        animal.eat();
        System.out.println("==========");
    }
}*/
