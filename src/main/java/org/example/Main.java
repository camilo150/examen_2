package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*La tienda de ropa "Moda Express" te ha contratado para desarrollar
una aplicación en Java que opere en consola. Esta aplicación debe
gestionar descuentos para sus clientes basados en la cantidad de
artículos comprados y en el tipo de cliente. Los descuentos se
aplican sobre el total de la compra y se definen de la siguiente
manera:
Cliente Regular:
1 a 3 artículos: 5% de descuento.
4 a 6 artículos: 10% de descuento.
Más de 6 artículos: 15% de descuento.
Cliente VIP:
1 a 3 artículos: 10% de descuento.
4 a 6 artículos: 15% de descuento.
Más de 6 artículos: 20% de descuento.
El programa debe solicitar al usuario los siguientes datos:
Nombre y apellidos del cliente.
Tipo de cliente (Regular o VIP).
Cantidad de artículos comprados.
Precio total de la compra (sin descuento).
Después, el programa debe calcular el total de la compra aplicando
el descuento correspondiente y mostrar al usuario la cantidad que
se ha descontado y el total a pagar.*/

        String nombre, cc, tipoCliente, claseCliente;
        double descuento=0.0, cantidadProductos, cantidadCompra, cantidadTotal=0.0;
        Scanner leerDato = new Scanner(System.in);
        System.out.println("vienvenido a moda express por favor ingrese el nombre del cliente");
        nombre = leerDato.nextLine();
        System.out.println("ingrese la cedula de identificacion del cliente");
        cc = leerDato.nextLine();
        System.out.println("ingrese la cantidad de la compra");
        cantidadCompra = leerDato.nextDouble();
        System.out.println("ingrese la cantidad de pr9oductos comprasdos");
        cantidadProductos = leerDato.nextDouble();
        System.out.println("ingrese la clase del cilente regular o VIP");
        leerDato.nextLine();
        claseCliente = leerDato.nextLine();
        if (claseCliente.equals("regular") & cantidadProductos == 1 || cantidadProductos == 2 || cantidadProductos == 3) {
            descuento = cantidadCompra * 0.05;
            cantidadTotal = cantidadCompra - descuento;
        } else if (claseCliente.equals("regular") & cantidadProductos == 4 || cantidadProductos == 5 || cantidadProductos == 6) {
            descuento = cantidadCompra * 0.10;
            cantidadTotal = cantidadCompra - descuento;
        } else if (claseCliente.equals("regular") & cantidadProductos == 6 || cantidadProductos > 5) {
            descuento = cantidadCompra * 0.15;
            cantidadTotal = cantidadCompra - descuento;
        } else if (claseCliente.equals("VIP") & cantidadProductos == 1 || cantidadProductos == 2 || cantidadProductos == 3) {
            descuento = cantidadCompra * 0.10;
            cantidadTotal = cantidadCompra - descuento;
        } else if (claseCliente.equals("VIP") & cantidadProductos == 4 || cantidadProductos == 5 || cantidadProductos == 6) {
            descuento = cantidadCompra * 0.15;
            cantidadTotal = cantidadCompra - descuento;
        } else if (claseCliente.equals("VIP") & cantidadProductos > 6) {
            descuento = cantidadCompra * 0.20;
            cantidadTotal = cantidadCompra - descuento;
        } else {
            System.out.println("porfavor ingrese un caracter valido");
        }
        System.out.println(nombre + "con cedula " + cc + "hizo una compra de "+ cantidadCompra + "su clase es" + claseCliente + "la cantudad de productos comprados fue de" + cantidadProductos + " y su respectivo descuento es de "  + descuento + "el total a pagar es de " + cantidadTotal);
    }
}

