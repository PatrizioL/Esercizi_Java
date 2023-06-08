package com;

import java.util.Arrays;

public class Esercizi_Array {

	public static void main(String[] args) {

//
//		1. Scrivete un programma Java per calcolare il valore medio di un array di numeri interi
//		eccetto i valori più grande e più piccolo.
//
//		int[] array = {4,5,7,1,10,9,15};
//
//		int[] array2 =  new int[array.length-2];
//
//		int min = array[0];
//
//		for (int i=0; i<array.length; i++)
//		{
//			if(array[i]<min)
//			{
//				min = array[i];
//			}
//		}
//
//		int max = array[0];
//
//		for (int i=0; i<array.length; i++)
//		{
//			if(array[i]>max)
//			{
//				max = array[i];
//			}
//		}
//
//		int pos = 0;
//		for (int i=0; i<array.length; i++)
//		{
//			if(array[i]!=min && array[i]!=max)
//			{
//				array2[pos]=array[i];
//				pos++;
//			}
//		}
//
//		int sum = 0;
//
//		for(int i = 0; i<array2.length; i++)
//		{
//			System.out.println("elemento "+i+" :"+array2[i]);
//			sum += array2[i];
//		}
//
//		double media = (double)sum/array2.length;
//		System.out.println(media);
//

//		Alternativo
//
//		int[] array = {4,5,7,1,10,9,15};
//
//		int min = array[0];
//
//		for (int i=0; i<array.length; i++)
//		{
//			if(array[i]<min)
//			{
//				min = array[i];
//			}
//		}
//
//		int max = array[0];
//
//		for (int i=0; i<array.length; i++)
//		{
//			if(array[i]>max)
//			{
//				max = array[i];
//			}
//		}
//
//		int sum = 0;
//
//		for(int i = 0; i<array.length; i++)
//		{
//			System.out.println("elemento "+i+" :"+array[i]);
//			if(array[i]!=min && array[i]!=max)
//			sum += array[i];
//		}
//		System.out.println(sum);
//		double media = (double)sum/(array.length-2);
//		System.out.println(media);


//		2. Dato un array di interi, scrivere un programma Java per trovare i due numeri, che possono essere positivi o negativi,
//		in ​​modo tale che la loro somma sia più vicina allo zero.



//		int[] array = {2,-5,-8,-3,6,3,15,-30};
//
//		int somma0 = Math.abs(array[0]+array[1]);
//		int count = 1;
//
//		for (int i = 0; i<array.length; i++)
//		{
//			for(int j = 0; j<array.length; j++)
//			{
//				if((Math.abs(array[i]+array[j]))<somma0 && array[i]!=array[j])
//				{
//					somma0 = (array[i]+array[j]);
//
//					System.out.println("i due numeri sono "+array[i]+" e "+array[j]);
//				}
//			}
//		}
//
//		System.out.println(somma0);


		// Alternativo

//		int[] array = {2,-5,-8,-3,6,3,15,-30};
//
//		int somma0 = (array[0]+array[1])<0?-(array[0]+array[1]):(array[0]+array[1]);
//
//
//		for (int i = 0; i<array.length; i++)
//		{
//			for(int j = 0; j<array.length; j++)
//			{
//				if( ((array[i]+array[j])<0?-(array[i]+array[j]):(array[i]+array[j]))<somma0 && (array[i]!=array[j]) )
//				{
//					somma0 = (array[i]+array[j]);
//
//					System.out.println("i due numeri sono "+array[i]+" e "+array[j]);
//				}
//			}
//		}

//		3. Scrivere un programma Java per ottenere la differenza tra i valori più grandi e più piccoli in un array di numeri interi.
//		La lunghezza della matrice deve essere 1 e superiore.

//
//		int [] array = {1,10,-5,2};
//
//
//		int [][] matrix = new int[array.length][array.length];
//		for(int i = 0; i<array.length; i++)
//		{
//			for(int j = 0; j<array.length; j++)
//			{
//				if(array[i]>array[j])
//				{
//					matrix[i][j]=array[i]-array[j];
//				}
//				System.out.print(matrix[i][j]+" ");
//			}
//
//			System.out.println();
//		}



//		4. Scrivere un programma Java per invertire un array di valori interi

//		int[] array = {20,10,5,4,3,2,1};
//
//		for(int i = 0; i<array.length; i++)
//		{
//			if(i<=3) // mi basta iterare solo 3 volte per scambiare di posizone gli elementi dell'array
//			{
//				int storeDati = array[array.length-(1+i)]; // durante il processo, uno degli elementi dell'array viene sovrascritto, prima che possa essere sovrascritto ed eliminato  bisogna salvarlo
//				// in una variabile, per poterlo poi inserie nella posizione opposta
//
//			    array[array.length-(1+i)]=array[i]; // sovrascivo l'elemento in ultima posizione a destra con il suo opposto a sinistra
//
//			    array[i]=storeDati; // sovrascrivo il valore in posizone i, con il valore dell'elemento suo opposto in posizone nell'array, che mi ero salvato prima che fosse sovrascritto
//
//			    // Nel complesso le istruzioni mi permettono di socrascrivere l'array
//
//			     // ad ogni iterzione la posiozione dell'elemento da scambiare in fondo all'array decresce di 1
//			}
//
//			System.out.println(array[i]); //stampo l'arrai con i valori invertiti
//		}
//

//		5. Scrivere un programma Java per separare i numeri pari da i dispari di un array di numeri interi, mettere prima i pari e poi i dispari.
//
//		int[] array = {3,4,7,10,30,37,5};
//
//		for (int i = 0; i<array.length; i++)
//		{
//			for (int j = i+1; j<array.length-1; j++)   //array.lenght-1 mi serve per evitare di generare un errore, sul bounds dell'array
//			{
//				if(array[i]%2!=0 && array[j]%2==0)
//				{
//					int store = array[j];
//					array[j]=array[i];
//					array[i]=store;
//				}
//			}
//
//			System.out.println(array[i]);
//		}


//		6. Scrivete un programma Java per trovare il piú piccolo e il secondo piú piccolo elemento di un dato array

//		int [] array = {3,5,-5,290,1};
//
//
//		//Ciclo per trovare il minimo e il massimo
//
//		int min = array[0];
//		int max = array[0];
//
//		for(int i = 0; i<array.length; i++)
//		{
//			if(array[i]<min)
//			{
//				min=array[i];
//			}
//			for(int j=0; j<array.length; j++)
//			{
//				if(array[i]>max)
//				{
//					max=array[i];
//				}
//			}
//		}
//
//		// ciclo per trovare il minimo 2
//		int min2 = array[0];
//		for(int i=0;i<array.length;i++)
//		{
//			if(array[i]!=min) // mi serve trovare il valore minimo diverso sa min
//			{
//				min2=array[i];
//			}
//
//			for(int j = 0; j<array.length; j++)
//			{
//				if(array[j]!=min && array[j]<min2)
//				{
//					min2=array[j];
//				}
//
//			}
//		}
//
//		System.out.println(min);
//		System.out.println(min2);
//		System.out.println(max);

//		7. Scrivere un programma Java per visializzare il triangolo di Pascal, numero righe 5, numero colonne uguale

//		int n = 6;
//		int[][] matrix = new int[n][n];  // La matrice é un array di array, in cui ogni elemento dell'array e a sua volta un array, i due paramentri rappresentano le coordinate di una cella
//
//		for (int i = 0; i<n; i++) //ogni ripetizione é una riga della matrice
//		{
//			for(int j = 0; j<=i; j++) // il numero di colonne per ogni riga incrementa di 1, ad ogni riga //N.B se non pongo j<=i, per j=0 e i =0, il ciclo non parte
//			{
//				if(j == 0 || j == i )//la prima e l'ultima colonna di ogni riga devono essere uguali a 1
//				{
//					matrix[i][j]=1;
//				}
//				else
//				{
//					matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j]; //Formula di Pascal, i medi e sono ottenuti dalla somma dei medi da j-1 a j della riga precendente(i-1)
//				}
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}

//		8. Stampare tutti i numeri compresi tra due numeri a e b, inseririli in un array e stamparli al contrario

//		int a = 10;
//		int b = 15;
//		int sizeArray = 0;
//
//		//Creazione array
//		for (int i = a; i<=b; i++)
//		{
//			sizeArray++;
//		}
//		int [] array = new int[sizeArray]; // siccome la size dell'array non é modificabile devo prima spettare che il ciclo for in cui viene creato temrmini per popolarlo
//
//		// Popola l'array e lo stampa
//		for (int i = a; i<=b; i++)
//		{
//			array[i-a]=i; //array[0]=10>>array[1]=11 ecc
//			System.out.println(array[i-a]);
//		}
//		// Stampa l'array in ordine inverito
//		for(int j = array.length-1; j>=0 ; j--)
//		{
//			System.out.println(array[j]);
//		}

//		9. Scrivere un programma Java per trovare gli elementi comuni tra due array di numeri interi.

//		int[] a = {1,2,3,4,5,6};
//		int[] b = {3,4,10,15,7};
//
//		for(int i = 0; i<a.length; i++)
//		{
//			for(int j = 0; j<b.length; j++)
//			{
//				if(a[i]==b[j])
//				{
//					System.out.println("gli elementi comuni tra i due array sono "+ a[i]+" e "+b[j]);
//				}
//			}
//		}
//
//		10. Scrivere un programma Java per ordinare un array numerico e un array di stringhe.

//		int [] a = {2,1,4,3};
//
//		String[] s = {"banana","autista","zanzara","death"};
//
//
//		for(int i = 0; i<a.length-1; i++)
//		{
//			if(a[i]>a[i+1])
//			{
//				int store=a[i];
//
//				a[i]=a[i+1];
//
//				a[i+1]=store;
//			}
//
//		}
//
//		Arrays.sort(s);
//
//		for(int i = 0; i<a.length; i++)
//		{
//
//			System.out.println(a[i]+" ");
//
//			System.out.println(s[i]);
//		}
//
//		11. Scrivere un programma Java per trovare il secondo elemento più grande in un array.

//		int[] a = {1,5,10,6,-8};
//
//        int max = a[0];
//
//        for (int i = 0; i<a.length; i++)
//        {
//        	if(a[i]>max)
//        	{
//        		max=a[i];
//        	}
//        }
//
//        int max2=a[0];
//
//        for(int i = 0; i<a.length; i++)
//        {
//        	if(a[i]!=max && a[i]>max2)
//        	{
//        		max2=a[i];
//        	}
//        }
//
//        System.out.println(max2);
////



//        12. Scrivere un programma Java per trovare la lunghezza della sequenza di elementi consecutivi più lunga da un dato array di numeri interi non ordinati.
//
//        esempio: [49, 1, 3, 200, 2, 4, 70, 5]
//        La sequenza di elementi consecutivi più lunga è [1, 2, 3, 4, 5], quindi il programma restituirà la sua lunghezza 5.
////
//		int[] array = {49, 1, 3, 200, 2, 4, 70, 5};
//		int count =1;
//
//		for(int i = 0; i<array.length; i++)
//		{
//			for(int j = i+1; j<array.length; j++)
//			{
//				if(array[i] > array[j])
//				{
//					int store = array[i];
//
//					array[i]=array[j];
//
//					array[j]=store;
//				}
//			}
//			System.out.print(array[i]+" ");
//		}
//
//
//
//		for (int i = 0; i<array.length-1; i++)
//		{
//			if(Math.abs(array[i]-array[i+1])==1)
//			{
//				count++;
//			}
//		}
//		System.out.println("contatore "+count);


//		13. Scrivere un programma Java per rimuovere gli elementi duplicati da un array.
//
//		int[] a = {3,4,5,5,6,8,10,2,10,11,14,13,2,2};
//
//		int bSize = 0;
//
//		// ciclo per le dimensioni del array b senza elementi duplicati
//		for(int i = 0; i<a.length; i++)
//		{
//			for(int j = i+1; j<a.length; j++)
//			{
//				if(a[i]==a[j])
//				{
//					bSize++;
//					 break;// interrompo il ciclo perché se un numero di ripete 3 volte conta pure i duplicati
//				}
//			}
//		}
//		int[] b = new int[a.length-bSize];
//
//
//		int pos = 0;
//
//		for(int i = 0; i<a.length; i++)
//		{
//			boolean duplicato = true; //di base ogni volta che l'elente iesimo di a non trova un duplicato nell'array lo pusha in b
//
//			for(int j = i+1; j<a.length; j++)
//				{
//					if(a[i]==a[j])
//					{
//						duplicato = false; //se trova un duplicato, non viene pushato nel nuovo array
//						 break;//blocco il ciclo quando trovo un duplicato per evitare che me lo conti piú volte, ad esempio il 2 si ripete 3 volte e manda il sistema in errore
//					}
//				}
//
//			if(duplicato) //se trova un duplicato, non viene pushato nel nuovo array
//			{
//				b[pos]=a[i];
//				pos++;
//			}
//		}
//
//
//		for(int i =0; i<b.length; i++)
//		System.out.println(b[i]);


		// 14. Scrivere un programma Java per verificare l'uguaglianza di due array.

		int[] a = {1,7,3,4,5};
		int[] b = {1,2,3,4,5};

		if(a.length==b.length)
		{

			boolean t = false;
			for (int i = 0; i<a.length; i++)
			{
				for( int j = i; j<a.length; j++)
				{
					if(a[i]==b[j])
					{
						System.out.println("in posizione " +i+ " "+a[i]+" = "+b[j]);

						break;
					}
					else
					{
						System.out.println("in posizione " +i+ " "+a[i]+" != "+b[j]);
						t = true;
						break;
					}
				}

			}
			if(t)
			{
				System.out.println("a e b sono diversi");


			}
			else
			{
				System.out.println("a e b sono uguali");

			}
		}
		else
		{
			System.out.println("i due array hanno differenti dimensioni non sono uguali");
		}














































	}

}
