import java.util.Scanner;
public class binaria_scambio
{	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
		System.out.println("Inserire il numero di valori casuali che comporranno il vettore.");
		int n=input.nextInt();
		int confronti=0;
		int[] a=new int[n];
		for (int i=0;i<a.length;i++) a[i]=(int)(Math.random()*10000);	//generazione casuale dei valori del vettore
		int min=0;
		int max=a.length;
		System.out.println("Gli elementi del vettore sono:");
		for (int j=0;j<a.length;j++) System.out.print(a[j]+" ");
		System.out.print("\r");
		boolean ordinato=false;
		while(!ordinato)	//ordinamento
		{	ordinato=true;
			for(int i=0;i<a.length-1;i++)
			if (a[i]>a[i+1])
			{	int v=a[i];
				a[i]=a[i+1];
				a[i+1]=v;
				ordinato=false;
			}
			confronti++;
		}
		System.out.println("Gli elementi del vettore a ordinato sono:");
		for (int j=0;j<a.length;j++) System.out.print(a[j]+" ");
		System.out.print("\r");
		System.out.println("Il numero di confronti eseguiti per l'ordinamento del vettore � " + confronti + ".");
		System.out.println("Inserire il valore da ricercare.");
		int v=input.nextInt();	//valore da confrontare
		int k=(min+max)/2;	//posizione da confrontare
		int contatore=0;	//contatore del numero di cicli eseguiti
		while (v!=a[k])
			{	if (v<a[k]) max=k-1;
					{	if (min<=max) k=(min+max)/2;
						else {System.out.println("Elemento non presente."); System.exit(0);}
						contatore++;
					}
				if (v>=a[k])
					{	min=k+1;
					}
			}
		System.out.println("L'elemento " + v + " si trova alla posizione " + k + ".");
		System.out.println("Il numero di confronti eseguiti per l'ordinamento del vettore � " + confronti + ".");
		System.out.println("Il numero di confronti eseguiti per la ricerca � " + contatore + ".");
	}
}