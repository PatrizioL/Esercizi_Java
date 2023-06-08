package com;
import java.util.Scanner;

public class Esercizi_cicli_if {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		1. Scrivete un programma Java che accetti tre numeri e stampi 
	//	"Tutti i numeri sono uguali" se tutti e tre i numeri sono uguali, "Tutti i numeri sono diversi" 
	//  se tutti e tre i numeri sono diversi e "Nessuno dei due è uguale o diverso" in caso contrario.
//
//		Dati di test
//		Immettere il primo numero: 2564
//		Immettere il secondo numero: 3526
//		Immettere il terzo numero: 2456
//		Uscita prevista:
//
//		Tutti i numeri sono diversi
		Scanner s = new Scanner(System.in);
//		System.out.println("inserire tre numeri");
//		int a = s.nextInt();
//		int b = s.nextInt();
//		int c = s.nextInt();
		
//		if(a==b && b==c && c==a)
//		{
//			System.out.println("tutti i numeri sono uguali");
//		}
//		else if(a!=b && b!=c && c!=a)
//		{
//			System.out.println("tutti i numeri sono diversi");
//		}
//		else System.out.println("non sono tutti uguali");
		
//		2. Scrivete un programma che accetti tre numeri dall'utente e stampi 
		//"crescente" se i numeri sono in ordine crescente, "decrescente" se i numeri sono in ordine 
		//decrescente e "Né ordine crescente o decrescente" in caso contrario.
//
//		Dati di test
//		Immettere il primo numero: 1524
//		Immettere il secondo numero: 2345
//		Immettere il terzo numero: 3321
//		Uscita prevista: Ordine crescente
		
//		System.out.println("inserire tre numeri");
//		int a = s.nextInt();
//		int b = s.nextInt();
//		int c = s.nextInt();
//		
//		if(a>b && b>c)
//		{
//			System.out.println("ordine decrescente");
//			
//		}
//		else if(a<b && b<c)
//		{
//			System.out.println("ordine crescente");
//		}
//		else System.out.println("nessun ordine");
		
		
//		3. Scrivi un programma in Java per creare un modello come un triangolo ad angolo retto con numero aumentato di 1. Lo schema come:
//
//			1
//			2 3
//			4 5 6
//			7 8 9 10
		
//		int nRighe = 1;
//		
//		for(int i=1; i<=10; i++)
//		{
//			if(i==nRighe * (nRighe + 1) / 2)
//			{
//				System.out.print(i);
//				System.out.println();
//				nRighe++;
//			}
//			else System.out.print(i);
//		}
		
		// Metodo alternativo
		
//		int r = 4; //righe
//		int c = 1; //colonne
//		
//		for(int i=1;i<=r;i++)
//		{
//			for(int j=1;j<=i;j++) //il numero d'iterazioni del secondo ciclo, varia al variare dell'idice del primo
//			{
//				System.out.print(c+" ");
//				c++;
//			}
//			System.out.println();
//		}
		
		//4. Scrivete un programma java per generare un triangolo @ seguente.

//		Dati di test
//		Immettere il numero: 6
//		Uscita prevista:
//
//		@
//		@@
//		@@@
//		@@@@
//		@@@@@
//		@@@@@@
		
//		String a = "@";
//		
//		int r = 6;
//		
//		
//		for(int i=1; i<=r; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("@");
//			}
//			System.out.println();
//		}
		
//		5. Scrivere un programma Java per trovare il numero di giorni in un mese.
//
//		Dati di test
//		Immettere un numero di mese: 2
//		Input un anno: 2016
//		Uscita prevista:
//		Febbraio 2016 ha 29 giorni
		
//		System.out.println("inserire un mese");
//		int m = s.nextInt();
//		System.out.println("inserire un anno");
//		int a = s.nextInt();
//		
//		if(m==2 && a%4==0)
//		{
//			System.out.println("Febraio ha 29 giorni");
//		}
//		else if(m==2 && a%4!=0)
//		{
//			System.out.println("Febbraio ha 28 giorni");
//		}
//		else System.out.println("altro mese");
		
//		6. Scrivete un programma Java per visualizzare il triangolo di Pascal.
//
//		Dati di test
//		Immettere il numero di righe: 5
//		Uscita prevista:
//
//		Immettere il numero di righe: 5
//		1
//		1 1
//		1 2 1
//		1 3 3 1
//		1 4 6 4 1
		
//		int numRows = 5;
//
//        for (int i = 0; i < numRows; i++) {
//        	int number = 1; // number viene riassegnato
//        	// a 1 ad ogni ripetizione del primo ciclo, come si puó 
//        	// vedere dall'output
//            
//            for (int j = 0; j <= i; j++) {
//               System.out.print(number + " ");
//                number = number * (i - j) / (j + 1);
//                // number = 1 *(0-0)/(0+1)= 0/2=0 prima iter
//                // number = 1*(1-0)/(0+1)=1/1=1 seconda iter
//                // number = 1*(1-1)/(1+1)=0
//                // number = 1*(2-0)/(0+1)=2
//                // number = 1*(3-1)/(1+1)=1
//            }
//            
//            System.out.println();
//        }
/*		
	Per i=0 number = 1 >> j=0  sysout = 1 number=0>>il ciclo termina i=1 number riasegnato 1 sysout = 1>> 
*/		
//		7. Scrivi un programma in Java per creare un modello simile a una piramide con un numero che ripeterà il numero nella stessa riga.
//
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		int r =4;
//		int n =1;
//		for(int i=1;i<=r;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(n);
//			}
//			System.out.println();
//			n++;
//		}
		
//		8. Scrivi un programma in Java per visualizzare il motivo come un diamante.
//
//		Dati di test
//		Immettere il numero di righe (metà del diamante): 7
//		Uscita prevista:
//
//		*
//		***
//		*****
//		*******
//		*********
//		***********
//		*************
//		***********
//		*********
//		*******
//		*****
//		***
//		*
//		int n = 7;
//		String d = "*";
//		
//		for(int i=1;i<=n;i=i+2)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				
//				System.out.print(d);
//				
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i=n-2;i>=1;i=i-2)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				
//			System.out.print(d);
//				
//			}
//			
//			System.out.println();
//		}
//		
//		9. Scrivi un programma Java che legga un numero in virgola mobile. 
		// Se il numero è zero stampa "zero", altrimenti stampa "positivo" o "negativo". 
		//Aggiungi "piccolo" se il valore assoluto del numero è inferiore a 1 o "grande" se supera 1.000.000.
//
//		Dati di test
//		Immettere un numero: -2534
//		Uscita prevista:
//
//		Negativo
//		double v = -25.555;
//		if(v>0)
//		{
//			System.out.println("positivo");
//			if(v>1000000)
//			{
//				System.out.println("grande");
//			}
//			else if(v>0 && v<1)
//			{
//				System.out.println("piccolo");
//			}			
//			}
//		else
//		{
//			System.out.println("negativo");
//		}
//		
//		10. Scrivi un programma Java che, dato un numero in input, stampi un triangolo come nell'esempio.
//
//		Esempio:
//
//		Dati di test
//		Inserisci il numero: 6
//		Uscita prevista:
//		
//	      @                                                  
//	     @@                                                  
//	    @@@                                                  
//	   @@@@                                                  
//	  @@@@@                                                  
//	 @@@@@@
		
//		int row = 6; //numero di righe
//		
//		for(int i=1;i<=row;i++) //una ripetizione per ogni riga
//		{
//			for(int j=row-1; j>=i; j--) //crea una riga con spazi vuoti, che descresce di uno ad ogni iterazione
//			{							// del ciclo esterno
//				System.out.print(" ");//iterzione ciclo esterno 1, crea 5 spazi vuoti
//			}
//			for(int j=1; j<=i; j++) //somma riga per riga agli spazi vuoti @, che incrementa ad ogni iterazione
//			{						// del ciclo esterno di 1
//				System.out.print("@");// i 5 spazi vuoti, si sommano alla singola @ creata
//			}							//in quanto per i=1, questo ciclo si ripete una sola volta @
										// per i=2, avremo 4 spazi vuoti e 2 @ e cosi via
//			System.out.println(); //manda a capo la riga dopo averla creata
//			
//		}
		
//		11. Scrivi un programma in Java che preso in input un numero n visualizza un triangolo di numeri composto da n righe, come nell'esempio seguente:
//
//		Dati di test
//		Inserire il numero di righe: 10
//		Uscita prevista:
//
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		12345678910
		
//		int row = 10;
//		
//		for(int i=1; i<=row; i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		12. Scrivere un programma che legge dei numeri inseriti da tastiera.
//		Se si inserisce un  numero positivo  seguito da un numero negativo 
//		stampare ok, e uscire dal programma, altrimenti continuare con l'inserimento dei numeri.
		
//		boolean t = true;
//		while(t)
//		{	System.out.println("inserire un numero positivo");
//			int x = s.nextInt();
//			System.out.println("inserire un numero negativo");
//			int y = s.nextInt();
//			if(x>0 && y<0)
//			{	System.out.println("ok");
//			 t = false;
//			}	
//		}
		
//		13. Scrivi un programma Java che preso in input un numero dall'utente,  genera un numero intero compreso tra 1 e 7 e visualizza il nome del giorno della settimana corrispondente
//
//		Esempio
//		
//		Dati di test
//		Numero di input: 3
//		Uscita prevista:
//		mercoledì
		
//		int giorno = s.nextInt();
//		
//		if(giorno==1)System.out.println("lunedi");
//		else if(giorno==2)System.out.println("martedi");
//		else if(giorno==3)System.out.println("mercoledi");
//		else System.out.println("non me ne tiene di metterli tutti");
		
//		14. Scrivere un programma Java per ottenere un numero dall'utente e stampare se è positivo o negativo.
//
//		Dati di test
//		Numero di input: 35
//		Uscita prevista:
//		Il numero è positivo
		
//		int x = -35;
//		if(x>0) System.out.println("positivo");
//		else System.out.println("negativo");
//		
//		15. Scrivi un programma Java che dato un numero in input stampi di rombo di caratteri. vedi esempio seguente.
//
//		Esempio
//
//		Dati di test
//		Inserisci il numero: 7
//		Uscita prevista:
//
//		UN
//		ABA
//		ABCBA
//		ABCDCBA
//		ABCDEDCBA
//		ABCDEFEDCBA
//		ABCDEFGFEDCBA
//		ABCDEFEDCBA
//		ABCDEDCBA
//		ABCDCBA
//		ABCBA
//		ABA
//		UN
//		int r = 7;
//		
//		System.out.println("UN");
//		for(int i=2;i<=r;i++)
//		{	
//			for(int j=1; j<=i; j++)
//			{
//				char c = (char)(j+64);
//				System.out.print(c);
//			}
//			for(int j=i-1; j>=1;j--)
//			{
//				char c = (char)(j+64);
//				System.out.print(c);
//				
//			}
//				System.out.println();
//		}
//		
//		for(int i=r-1;i>=2;i--)
//		{	
//			for(int j=1; j<=i; j++)
//			{
//				char c = (char)(j+64);
//				System.out.print(c);
//			}
//			for(int j=i-1; j>=1;j--)
//			{
//				char c = (char)(j+64);
//				System.out.print(c);
//				
//			}
//				System.out.println();
//		}
//		System.out.println("UN");
		
		
//		16 Scrivete un programma Java che legga un numero intero positivo e contate il numero di cifre del numero (inferiore a dieci miliardi).
//
//		Dati di test
//		Immettere un numero intero inferiore a dieci miliardi: 125463
//		Uscita prevista:
//		
//		Numero di cifre nel numero: 6
		
//		int n = s.nextInt();
//		
//		String r = String.valueOf(n);
//		System.out.println(r.length());
//		
		
		
//		17  Scrivere un programma in Java per inserire 5 numeri dalla tastiera e trovare la loro somma e media.
//
//		Dati di test
//		Immettere i 5 numeri: 1 2 3 4 5
//		Uscita prevista:
//		
//		Inserisci i 5 numeri:
//		1
//		2
//		3
//		4
//		5
//		La somma di 5 no è: 15
//		La media è: 3.0
		
	
//		int sum = 0;
//		double media = 0;
//		
//		for(int i=1; i<=5; i++)
//		{
//			sum += s.nextInt();
//			
//			media = sum/i;  //non serve la conversione perché double contiene anche int
//			
//		}
//		
//		System.out.println("somma "+sum+" ; "+"media "+media);
		
		
//		18  Scrivi un programma Java per risolvere equazioni di secondo grado (usa if, else).
//
//		Esempio
		
//		double a = 2;
//		double b = 4;
//		double c = 2;
//		
//		double x1 = 0;
//		double x2 = 0;
//		double delta = (b*b) - (4*a*c);
//		
//		if(delta>0)
//		{
//			x1=(-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
//			x2=(-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
//			System.out.println("x1 = "+x1+ " "+";"+ " "+"x2 = "+x2);
//		}
//		else if(delta==0)
//		{
//			x1 = x2 = -b / (2*a);
//			System.out.println("x "+"="+x1);
//		}
//		else
//		{
//			System.out.println("non ha radici reali");
//		}
		
//		19. Scrivi un programma in Java per visualizzare i primi n  numeri naturali e la loro somma.  n è preso in input
//
//		Esempio
//
//		Dati di test
//		Inserisci il numero: 2
//		Uscita prevista:
//
//		Numero di input:
//		2
//		I primi n numeri naturali sono:
//		2
//		1
//		La somma del numero naturale fino a n termini:
//		2+3 = 5
//		
//		int n = s.nextInt();
//		int sum = 0;
//		for(int i =n; i>=1; i--)
//		{
//			System.out.println(i);
//			sum += +i;
//		}
//		
//		System.out.println(n+sum);
		
		
//		20. Inserire due numeri da tastiera. Il primo deve essere più piccolo 
//		del secondo, se così non fosse richiedere l'inserimento del secondo numero. 
//		Infine, stampare i numeri compresi tra quelli inseriti (estremi esclusi)
		
//		int a= s.nextInt();
//		int b = s.nextInt();
//		boolean t = true;
//		while(t)
//		{
//			
//			if(a<b)
//			{
//				t = false;
//			}
//			else
//			{
//				b=s.nextInt();
//				System.out.println("Numeri inseriti : "+b);
//			}
//		}
//		System.out.println("ok");
		
	}

}















