package Clase10;
import javax.swing.*;

public class TransMa {
    private int matriz[][];

    private int fila;

    private int m[][];

    private int columna;

    private int valores;


    public TransMa()
    {
        do{
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 1"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 1"));

        this.matriz = new int[fila][columna];

        m = new int[columna][fila];

        }while(fila<=0 || columna<=0);
    }

    public void agregarMatriz1()
    {
        for (int fila=0; fila < this.matriz.length; fila++)
        {
            for (int columna=0; columna < this.matriz[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 1"));

                this.matriz[fila][columna] = this.valores;
            }
        }
    }

    public void mostrarMatriz1()
    {
        System.out.println("matriz 1");
        for(int fila=0; fila < this.matriz.length; fila++)
        {
            for(int columna=0; columna < this.matriz[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz[fila][columna]);
            }
            
            System.out.println();
        }
    }

   
    

    public void mostrarTranspuesta()
    {
        System.out.println("resultado");
        for (int fila=0; fila < this.matriz.length; fila++)
          {
            for (int columna=0; columna < this.matriz[fila].length; columna++)
              {
                m[fila][columna]= matriz[columna][fila];
                System.out.printf("%d ", m[fila][columna]);
              }
              System.out.println();
        }   
    }

    public static void main(String args[])
    {
        TransMa matriz02 = new TransMa();

        matriz02.agregarMatriz1();
        matriz02.mostrarMatriz1();
        matriz02.mostrarTranspuesta();

}
}
