/*Juan Carlos Ortiz de  Montellano Bochelen
  Triangulo.java
  Eeste programa recibira 3 datos de un usurario "numericos" y en base a estos identificara que tipo de triangulo es el correspondiente */
import java.util.Scanner;
public class Triangulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a 'Identifica tu triangulo' \nintroduzca los valores de los lados de su triangulo"); //con \n puedes brincar lineas
        //estos son los valores dado por el usuario que sera guardado para mas tarde
        int X; 
        int Y;
        int Z;
        //En esta seccion de codigo se analizan los datos que no da el usuario, y no permite avanzar si el valor que nos da es menor o igual a 0

        //primer lado
            System.out.println("Introduzca su primer lado");
            do{
                 System.out.println("Ingrese un numero mayor a 0");
                 X = sc.nextInt();  
            }
             while (X<=0);
        
            //segundo lado
            System.out.println("Introduzca su segundo lado");
            do{
                System.out.println("Ingrese un numero mayor a 0");
                Y = sc.nextInt(); 
            }
            while (Y<=0);

            //tercer lado 
            System.out.println("Introduzca su tercer lado ");
            do{
                System.out.println("Ingrese un numero mayor a 0");
                Z = sc.nextInt(); 
            }
            while (Z<=0);
            
            //Esta seccion es la encargada de determinar que tipo de triangulo es basado en los datos proporcionados por el usuario
            if (X==Y && X==Z ) { // esta determina si el triangulo es equilatero 
                System.out.println("Su triangulo es equilatero");
                
            }
            //Esta seccion se encarga de determinar si con las medidas dadas por el usuario el triangulo es isoceles.
            else{
                if (X == Y || X == Z || Y==Z) { //esta parte identifica si dos de los datos que nos dio el usuario son iguales
                    if ((X==Y)&&((X+Y)>Z)) { //Analiza los dos datos iguales y comprueba que sean mayores al tercero 
                        System.out.println("Su triangulo es Isoceles"); 
                    }
                    else{
                        if ((X==Z)&&((X+Z)>Y)) { //Analiza los dos datos iguales y comprueba que sean mayores al tercero 
                            System.out.println("Su triangulo es Isoceles");   
                        }
                        else{
                            if ((Y==Z)&&((Y+Z)>X)) { //Analiza los dos datos iguales y comprueba que sean mayores al tercero 
                                System.out.println("Su triangulo es Isoceles"); 
                        }
                            else{
                             System.out.println("No es un triangulo"); //Si ninguna de las opciones de arriba es valida quiere decir que no se puede generar un triangulo
                            }
                        }
                    }
                } 
                else{
                    if (((X>Y) && (X>Z)) &&((Y+Z)>X)) { //analiza los tres datos diferentes dados por el usuario  y  comprueba el mas grande de ellos, despues de esto revisa si los otros dos sumados son mas grandes que este, en caso contrario el triangulo es falso
                        System.out.println("Su triangulo es Escaleno");
                    }
                    else{
                        if (((Y>X) && (Y>Z)) &&((X+Z)>Y)) { //analiza los tres datos diferentes dados por el usuario  y  comprueba el mas grande de ellos, despues de esto revisa si los otros dos sumados son mas grandes que este, en caso contrario el triangulo es falso
                            System.out.println("Su triangulo es Escaleno");
                        }
                        else{
                            if (((Z>X) && (Z>Y)) &&((X+Y)>Z)) { //analiza los tres datos diferentes dados por el usuario  y  comprueba el mas grande de ellos, despues de esto revisa si los otros dos sumados son mas grandes que este, en caso contrario el triangulo es falso
                                System.out.println("Su triangulo es Escaleno");
                            }
                            else{
                                System.out.println("Su triangulo es invalido"); //Si ninguna de las opciones de arriba es valida quiere decir que no se puede generar un triangulo 
                            }
                        }
                    }
                }
            }
    }
}
