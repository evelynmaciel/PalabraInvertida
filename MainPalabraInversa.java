import java.util.Scanner;

class MainPalabraInversa{
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);


        String palabra;

        System.out.print("Dame una palabra: ");
        palabra = fn.nextLine();

        PalabraInversa p1 = new PalabraInversa();

        p1.setPalabra(palabra);

        p1.invertir();
        p1.mostrarRes();

        System.out.println(p1.toString());





    }
}
