package animal;

public class Tiger extends Cat {
    @Override
    public void eat() {
        System.out.println("Tiger eat meat");
    }

    @Override
    public void say() {
        System.out.println("Tiger say RRRR");
    }

    public void eatZebra() {
        System.out.println("Zebra eaten");
    }
}
