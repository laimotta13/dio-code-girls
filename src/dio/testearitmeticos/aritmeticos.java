package dio.testearitmeticos;

public class aritmeticos {
    public static void main(String[] args) {

        System.out.println("Prepos");
        prePos();
        System.out.println("Aritmeticos");
        aritmeticos();
        System.out.println("Atribuicao");
        atribuicao();
        System.out.println("Precedencia");
        precedencia();
    }


        private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i" + i);
        System.out.println("j" + j);
        System.out.println("x" + k);

    }

    private static void aritmeticos() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a=b " + r1);
        System.out.println("c-a " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);
    }

    private static void atribuicao(){

        int i = 1500;
        short j = 11;
        long l = 500;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d " + f);

        i +=5;
        l *=3;

        System.out.println("i " + i);
        System.out.println("l " + l);
    }

    private static void precedencia(){

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j + k;

        System.out.println("i++ + --j + k: " + a);

        System.out.println("i: " + i);


    }
}