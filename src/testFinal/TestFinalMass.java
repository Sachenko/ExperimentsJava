package testFinal;

public class TestFinalMass {

    public int[] TestFinal() {
       final int mass[] = new int[10];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = x;
        }
       return mass;
     }

     public static void main(String[] args) {
        TestFinalMass testFinalMass = new TestFinalMass();
        for (int test: testFinalMass.TestFinal()) {
            System.out.println(test);}

         for (int x = 0; x < testFinalMass.TestFinal().length; x++) {
             int newX = 1111;
             testFinalMass.TestFinal()[x] = newX;
         }

         for (int test: testFinalMass.TestFinal()) {
             System.out.println(test);}

     }



}
