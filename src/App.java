import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        MetodosBusqueda metBus = new MetodosBusqueda();

        int [] arreglo = {10,20,30,40,50,60,70,80,90,100};
        int valorBuscado = 50;
        // Crear el arreglo con valores del 1 al 100000
        int[] arreg = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arreg[i] = i + 1;  // Llena el arreglo con valores de 1 a 100000
        }

        // Mostrar primer y último elemento
        System.out.println("Primer elemento: " + arreg[0]);
        System.out.println("Último elemento: " + arreg[arreg.length - 1]);

        // Solicitar valor a buscar
        System.out.println("Ingrese el valor que desea buscar: ");
        int valorBuscar = src.nextInt();

        //Mostrar el arreglo (solo si lo deseas, aunque es muy grande)
        //System.out.println(Arrays.toString(arreg));

        // Llamar al método para imprimir el arreglo (considera no imprimir los 100000 valores)
    
        metBus.printtArreglo2(arreg);

        int posicion = metBus.busquedaSecuencial(arreg, valorBuscar);
        System.out.println("El valor se encuentra en la posicion " + posicion);
        if (posicion != -1){
            System.out.println("Valor no encontrado");
        }

        //metBus.printtArreglo(arreglo);

        //int posicion = metBus.busquedaSecuencial(arreglo, 50);
        //System.out.println("El valor se encuentra en la posicion " + posicion);
        //if (posicion != -1){
            //System.out.println("Valor no encontrado");
        //}

    

    }
}
