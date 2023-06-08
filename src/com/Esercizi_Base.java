package com;
public class Esercizi_Base {

	public static void main(String[] args) {
		
//		Esercizio 1 
//		Scrivi un programma Java per stampare la somma di due numeri presi in input da tastiera.
//
//		Esempio:
//		74 + 36
//
//		Somma:
//		110
		
//		Scanner s = new Scanner(System.in);
//		
//		int a = s.nextInt();
//		int b = s.nextInt();
//		
//		int sum = a+b;
//		
//		System.out.println(sum);
		
		
//		EX 2
//		
//		Scrivete un programma Java per calcolare l'area di un poligono.
//		Area di un poligono = (n * s ^ 2) / (4 * tan (π / n))
//		dove n è un poligono con n lati e s è la lunghezza di un lato
//		Dati in ingresso:
//		Immettere il numero di lati sul poligono: 7
//		Immettere la lunghezza di uno dei lati: 6
//		Uscita prevista
//
//		L'area è: 130.82084798405722
//		
		
//		double nl = 7;
//		
//		double l = 6;
//		
//		double area = (nl * l*l) / (4 * Math.tan(Math.PI / nl));
//		
//		
//		System.out.println(area);
		
//		 Ex 3 
		
//		 Scrivi un programma Java che scrive in maiuscolo tutte le parole in una frase. La frase è presa in input da tastiera:
//
//			Esempio
//
//			Inserisci una frase: ciao come stai
//			CIAO COME STAI
//		
//		4. Scrivete un programma Java per calcolare la somma dei primi 100 numeri primi.
//		Output di esempio:
//
//		Somma dei primi 100 numeri primi: 24133
		
//		
//		int count = 100;
//		int nPrimi = 1;
//		int index = 2;  // 2 é il primo numnero primo divisibile solo per 1 e per se stesso
//		int sum = 0;
//		
//		while(nPrimi<=count) //quando ho trovato 100 numeri primi il ciclo si ferma
//		{
//			boolean isPrime = true;
//			
//			for(int i = 2; i < index; i++)
//			{
//				
//				if(index % i == 0 ) // i numeri primi sono divisibili solo per 1 e se stessi, ho impostato il ciclo per far si
//					//  che 1 e se stesso non venga considerati, se il ciclo for trova un altro numero per cui é divisibile il numero
//					// in esame riassegna isprime a false interrompe il ciclo
//				{
//					isPrime=false; // 
//					break;
//				}
//			}
//			
//			if(isPrime) // se il ciclo for non trova numeri per cui index é divisibile isPrime rimane true e somma index a sum
//			{
//				sum+=index;
//				nPrimi++; //questo contatore tiene traccia del numero totale di numeri primi trovati
//
//			}
//			
//			index++; // alla fine del ciclo index incrementa sempre di 1, per analizzare un numero diverso nella prossima iterazione
//			
//		}
//		
//		System.out.println(sum);
//		
		
//		5. Scrivi un programma Java e calcola la somma delle cifre di un numero intero dato in input da tastiera.
//
//		Esempio
//		Immettere un numero intero: 25
//		La somma delle cifre è: 7
		
//		int n =25;
//		
//		String s = String.valueOf(n);
//		String[] a = s.split(""); 
//		
//		
//		int pCifra = Integer.parseInt(a[0]);
//		int sCifra = Integer.parseInt(a[1]);
//		
//		int c = pCifra+sCifra;
//		
//		System.out.println(c);
		
		
//		6. Scrivi un programma Java per confrontare due numeri.
//		Dati in ingresso:
//		Immettere il primo numero intero: 25
//		Immettere il secondo numero intero: 39
//		Uscita prevista
//		
//		25! = 39
//		25 <39
//		25 <= 39
//		
//		int a = 25;
//		int b = 39;
//		
//		if(a!=b && a<b && a<=b)
//		{
//			System.out.println(a+"!="+b);
//			System.out.println(a+"<"+b);
//			System.out.println(a+"<="+b);
//		}
//		else if(a==b)
//		{
//			System.out.println("uguali");
//		}
//		else {
//			System.out.println("b minore di a");
//		}
		
//		7. Scrivere un programma Java per suddividere un intero in una sequenza di singole cifre.
//
//		Dati di test
//		Immettere sei cifre non negative: 123456
//		Uscita prevista:
//		1 2 3 4 5 6

//		int n = 123456;
//		
//		String b = Integer.toString(n);
//		
//		String[] a = b.split("");
//		
//		for(int i = 0; i<a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
		
	
//		8. Scrivere un programma Java per invertire una parola.
//		Output di esempio:
//
//		Immettere una parola: dsaf
//		Parola al contrario: fasd
		
//		String i = "dsaf";
//		
//		StringBuilder sb = new StringBuilder(i);
//		
//		String reverse = sb.reverse().toString();
//		
//		System.out.println(reverse);
		
		// Alternativo
		
//		String a = "dsaf";
//		String r = "";
//		
//		for(int i = a.length()-1; i>=0; i-- )
//		{
//			r += a.charAt(i); // Creo la stringa vuota sommando carattere per carattere 
//		}
//		
//		System.out.println(r);
//		
			
//		9. Scrivere un programma Java per invertire una stringa.
//		Dati in ingresso:
//		Immettere una stringa: The quick brown fox
//		Uscita prevista
//
//		Stringa inversa: xof nworb kciuq ehT

//		String i = "The quick brown fox";
//		
//     	StringBuilder sb = new StringBuilder(i);
//		
//		String reverse = sb.reverse().toString();
//		
//		System.out.println(reverse);
//		
//		10. Scrivere un programma Java per contare le lettere, gli spazi, i numeri e altri caratteri di una stringa di input.
//		Uscita prevista
//		
//		String a = "La mamma ha cucinato";
//		
//		System.out.println(a.length());
		
//		11. Scrivere un programma Java per prendere l'utente per una distanza (in metri) e il tempo è stato preso 
//		(come tre numeri: ore, minuti, secondi) e visualizzare la velocità, in metri al secondo, chilometri all'ora e miglia per ora
//		(suggerimento: 1 miglio = 1609 metri).
//
//		Dati di test
//		Distanza di ingresso in metri: 2500
//		Ora di input: 5
//		Minuti di input: 56
//		Secondi di input: 23
//		Uscita prevista:
//		La tua velocità in metri / secondo è 0,11691531
//		La tua velocità in km / h è 0,42089513
//		La tua velocità in miglia / h è 0,26158804
		
//		double d = 2500;
//		double h = 5;
//		double m = 56;
//		double s= 23;
//		
//		double m_s =  d/(h*(60*60)+m*(60)+s);
//		
//		double k_h =  (d/1000)/(h+(m/60)+s/(60*60));
//		
//		double mph_h =  (d/1609)/(h+(m/60)+s/(60*60));
//		
//		System.out.println("La tua velocitá in m/s é "+m_s);
//		System.out.println("La tua velocitá in km/h é "+k_h);
//		System.out.println("La tua velocitá in km/h é "+mph_h);
//		
		
		
		
//		12. Scrivere un programma Java per creare una nuova stringa che prenda il primo e l'ultimo carattere di due stringhe date.
//		Se la lunghezza di una delle stringhe è 0 usa "#" per il carattere mancante.
//		Dati di test: str1 = "Python"
//		str2 = ""
//		Output di esempio:
//
//		P #
		
		String a = "Python";
		String b = "";
		char first = 'a';
		char last = 'b';
		
		
		if(a.equals(""))
		{
			 first = '#';
			 last = b.charAt(b.length()-1);
				
			 
		}
		else if(b.equals(""))
		{
			last = '#';
			first = a.charAt(0);
		}
		else
		{
		first = a.charAt(0);
		last = b.charAt(b.length()-1);
		
		}
		
		String c = ""+first + last;
		
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
