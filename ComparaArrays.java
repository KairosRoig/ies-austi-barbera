import java.util.Scanner;

public class ComparaArrays {

    static Scanner scan = new Scanner(System.in);

    public static int[] readNumbers() {
        System.out.print("Introduzca el tamaño del array: ");
        int tam = scan.nextInt();
        
        while(tam<=0) {
            System.out.print("El array debe tener al menos un valor, introduzca un tamaño superior a 0: ");
            tam=scan.nextInt();
        }
        int[] numbers = new int[tam];

        for(int i = 0 ; i < tam ; i++) {
            numbers[i] = scan.nextInt();
        }

        return numbers;
    }

    public static boolean isValueInArray(int[] array, int value) {
        boolean found = false;
        for(int arrayNumber: array) {
            if(arrayNumber == value) {
                found = true;
                break;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int number = 0;
        int[] array1 = readNumbers();
        int[] array2 = readNumbers();

        for(int i = 0 ; i < array1.length ; i++) {
            number = array1[i];
            if(isValueInArray(array2, number)) {
                System.out.println(number);
            }
        }
    }
}
