package com.mitzitec;

public class primos {
    public void iniciar(int limite)
    {
        System.out.println("Numeros Primos");
        for(int i=2;i<=limite;i++)

        {

            if(esPrimo(i))



            {

                System.out.print(i + " ,");

            }

        }

    }



    public boolean esPrimo(int numero)

    {

        int aux;

        for(int cont=2;cont<numero;cont++)

        {

            aux=numero%cont;

            if(aux==0)

                return false;

        }

        return true;

    }

}