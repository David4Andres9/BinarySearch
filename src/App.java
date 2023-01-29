import java.util.Scanner;

public class App {
    public static void main(String[] args){
        /**
         * Calls the class Array to define the array and Search to define the binarySearch
         * Finally request to the user the length of the array and the number to search
         */
        Scanner teclado=new Scanner(System.in);
        Array arr= new Array();
        Search search=new Search();
        int dimension;
        System.out.println("Cual es la dimension del arreglo");
        dimension=teclado.nextInt();
        System.out.println("Ingresa el dato a buscar");
        int busqueda= teclado.nextInt();
        if(search.binarySearch(arr.defineArray(dimension), busqueda)==true){
            System.out.println("!!Felicidades "+ busqueda +" si se encuentra");
        }else{
            System.out.println("!!Ohh no "+ busqueda +" no se encuentra");
        }
        
    }
}