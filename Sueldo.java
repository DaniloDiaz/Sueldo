import java.io.*;
public class Ejercicio02
{
public static void main(String args[])
{
// Declaraciones
// Definicion de objetos para entrada de datos por el teclado
InputStreamReader entrada = new InputStreamReader(System.in);
BufferedReader flujoEntrada = new BufferedReader(entrada);

// Variable para tomar los datos leidos del flujo de entrada
String datoEntrada;

// Variables
String nombreEmp="";

int tipoEmp = 0;
float sueldoincrem = 0;
float sueldo=0;

try
{

System.out.print("Nombre de empleado: ");
datoEntrada = flujoEntrada.readLine();
nombreEmp = datoEntrada;

System.out.print("Tipo de empleado: ");
datoEntrada = flujoEntrada.readLine();
tipoEmp = Integer.parseInt(datoEntrada);

System.out.print("Sueldo: ");
datoEntrada = flujoEntrada.readLine();
sueldo = Float.parseFloat(datoEntrada);
}
catch (IOException error)
{
System.err.println("Error " + error.getMessage());
}

// Calcular

if (tipoEmp == 1)
sueldoincrem = (sueldo * 0.05F);
if (tipoEmp == 2)
sueldoincrem = (sueldo * 0.07F);
if (tipoEmp == 3)
sueldoincrem = (sueldo * 0.09F);
if (tipoEmp == 4)
sueldoincrem = (sueldo * 0.12F);
if (tipoEmp == 5)
sueldoincrem = (sueldo * 0.15F);
// Imprimir salida
System.out.println("Nombre = " + nombreEmp);
System.out.println("Incremento del Sueldo = " + sueldoincrem);
System.out.println("Sueldo Total = " + sueldo + sueldoincrem);
}
}
