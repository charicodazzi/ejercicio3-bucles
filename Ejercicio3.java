//En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
//Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
//String[] nombres = {"", "", "", ""}

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres= {"Pepe", "Miriam", "Carla" };

        String resultado="";
        for(int i=0; i<nombres.length; i++){

            System.out.println(resultado + " " + nombres[0] + " " + nombres [1] + " " + nombres[2]);
        }
    }
}
