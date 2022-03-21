import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class karty {
	
	public static boolean pokerKrolewski(ArrayList<Karta> talia) {
		boolean tak = false; 
		int pik=0;
		int trefl=0;
		int karo=0;
		int kier=0; 
		int figury=0;
		boolean duzy=false;
		int ilosc=0;
		for(int i=0;i<5;i++) {
			
			if(talia.get(i).kolor.hierarchia==0)
				pik++;
			else if(talia.get(i).kolor.hierarchia==1)
				trefl++;
			else if(talia.get(i).kolor.hierarchia==2)
				karo++;
			else if(talia.get(i).kolor.hierarchia==3)
				kier++;
			
//			if(talia.get(i).figura.sila==7)
//				figury++;
//			else if(talia.get(i).figura.sila==8)
//				figury++;
//			else if(talia.get(i).figura.sila==9)
//				figury++;
//			else if(talia.get(i).figura.sila==10)
//				figury++;
//			else if(talia.get(i).figura.sila==11)
//				figury++;
			
			ilosc+=talia.get(i).figura.sila;
			
			
			
			
		}
		boolean kolor=false;
		if(pik==5||trefl==5||kier==5||karo==5)
			kolor=true;
		
		if(kolor==true&&ilosc==50)
			tak=true;
		
		
		
		return tak;
	}
	
	public static boolean poker(ArrayList<Karta> talia) {
		boolean tak=false;
		int[] tab = new int[14];
		
		int pik=0;
		int trefl=0;
		int karo=0;
		int kier=0;
		
		for(int i=0;i<5;i++) {
		
			
			if(talia.get(i).kolor.hierarchia==0)
				pik++;
			else if(talia.get(i).kolor.hierarchia==1)
				trefl++;
			else if(talia.get(i).kolor.hierarchia==2)
				karo++;
			else if(talia.get(i).kolor.hierarchia==3)
				kier++;
			
			tab[talia.get(i).figura.sila+1]=1;
			if(talia.get(i).figura.sila==12)
				tab[0]=1;
				
			
			
		}
		int ilosc=0;
		boolean streat=false;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==1) {
				ilosc++;
				if(ilosc==5)
					streat=true;	
			}
			else
				ilosc=0;
			
		}
			
		boolean kolor=false;
		if(pik==5||trefl==5||kier==5||karo==5)
			kolor=true;
		
		if(streat==true&&kolor==true)
			tak=true;
		
		return tak;
		
	}
	
	public static boolean kareta(ArrayList<Karta> talia) {
		boolean tak=false;
		int[] tab = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++)  
			if(tab[i]==4)
				tak=true;
		
		
		
		
		
		return tak;
		
	}
	
	public static boolean full(ArrayList<Karta> talia) {
		boolean tak=false;
		boolean trojka =false;
		boolean dwojka = false;
		int[] tab = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==3)
				trojka=true;
			if(tab[i]==2)
				dwojka=true;
		
		
		}
		
		if(dwojka==true&&trojka==true)
			tak=true;
		
		return tak;
		
	}
	
	public static boolean kolor(ArrayList<Karta> talia) {
		boolean tak=false;
		int tab[] = new int[4];
		
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).kolor.hierarchia]++;
		
		
		for(int i=0;i<tab.length;i++)
			if(tab[i]==5)
				tak=true;
		
		
		return tak;
	}
	
	
	public static boolean streat(ArrayList<Karta> talia) {
		boolean tak=false;
		int[] tab = new int[14];
		
		
	for(int i=0;i<5;i++) {
			tab[talia.get(i).figura.sila+1]=1;
			if(talia.get(i).figura.sila==12)
				tab[0]=1;
		}
	
		int ilosc=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==1) {
				ilosc++;
				if(ilosc==5)
					tak=true;	
			}
			else
				ilosc=0;
			
		}
		
		return tak;
	}
	
	public static boolean trojka(ArrayList<Karta> talia) {
		boolean tak=false;
		int[] tab = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++) 
			if(tab[i]==3)
				tak=true;
		
		
		
		
		
		return tak;
		
	}
	
	public static boolean dwiePary(ArrayList<Karta> talia) {
		boolean tak=false;
		int para=0;
		int[] tab = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==2)
				para++;
		
		
		}
		
		if(para==2)
			tak=true;
		
		return tak;
		
	}
	
	public static boolean para(ArrayList<Karta> talia) {
		boolean tak=false;
		int para=0;
		int[] tab = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==2)
				para++;
		
		
		}
		
		if(para==1)
			tak=true;
		
		return tak;
		
	}
	
	public static String check(ArrayList<Karta> talia) {
		String check="";
		
		 if(pokerKrolewski(talia)==true) 
			  check="Poker krolewski";
		  else if(poker(talia)==true)
			  check="Poker";
		  else if(kareta(talia)==true)
			  check="Kareta";
		  else if(full(talia)==true)
			  check="Full";
		  else if(kolor(talia)==true)
			  check="Kolor";
		  else if(streat(talia)==true)
			  check="Streat";
		  else if(trojka(talia)==true)
			  check="Trojka";
		  else if(dwiePary(talia)==true)
			  check="Dwie pary";
		  else if(para(talia)==true)
			  check="Para";
		  else
			  check="Najwyzsza karta";
		
		 System.out.println(check);
		 
		return check;
	}
	
	public static int wyzszaKarta(ArrayList<Karta> talia) {
		int wynik=0;
		int reka1=0;
		int reka2=0;
		
		for(int i=0;i<5;i++) 
			if(reka1<talia.get(i).figura.sila)
				reka1=talia.get(i).figura.sila;
		
		for(int i=51;i>46;i--) 
			if(reka2<talia.get(i).figura.sila)
				reka2=talia.get(i).figura.sila;
		if(reka1>reka2)
			wynik=2;
		if(reka1<reka2)
			wynik=1;
		else
			wynik=0;
		
		return wynik;
	}
	
	public static int wyzszyKolor(ArrayList<Karta> talia) {
		int wynik=0;
		
		int reka1=0;
		int reka2=0;
		
		for(int i=0;i<5;i++) 
			if(reka1<talia.get(i).kolor.hierarchia)
				reka1=talia.get(i).kolor.hierarchia;
		
		for(int i=51;i>46;i--) 
			if(reka2<talia.get(i).kolor.hierarchia)
				reka2=talia.get(i).kolor.hierarchia;
		if(reka1>reka2)
			wynik=2;
		else
			wynik=1;
		
		return wynik;
	}
	
	public static int wyzszeKarty(ArrayList<Karta> talia) {
		int wynik=0;
		int reka1=0;
		int reka2=0;
		
		int[] tab = new int[13];
		int[] tab2 = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++)  
			if(tab[i]>2)
				reka1=i;
		
		for(int i=51;i<46;i--) 
			tab2[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab2.length;i++)  
			if(tab2[i]>2)
				reka2=i;
		
		if(reka1>reka2)
			wynik=2;
		else
			wynik=1;
		
		return wynik;
	}
	
	public static int najwyzszaKartaDlaStritaIPokera(ArrayList<Karta> talia) {
		int wynik=0;
		int reka1=0;
		int reka2=0;
		int tab[] = new int[14];
		int tab2[] = new int[14];
		
		for(int i=0;i<5;i++) {
			tab[talia.get(i).figura.sila+1]=1;
			if(talia.get(i).figura.sila==12)
				tab[0]=1;
		}
		int ilosc=0;
		for(int i=0;i<tab.length;i++) {
			if(tab[i]==1) {
				ilosc++;
				if(ilosc==5)
					reka1=i;	
			}
		}	
		
		for(int i=51;i>46;i--) {
			tab2[talia.get(i).figura.sila+1]=1;
			if(talia.get(i).figura.sila==12)
				tab2[0]=1;
		}
		int ilosc2=0;
		for(int i=0;i<tab2.length;i++) {
			if(tab2[i]==1) {
				ilosc2++;
				if(ilosc2==5)
					reka2=i;	
			}
		}
		
		if(reka1>reka2)
			wynik=2;
		else if(reka1<reka2)
			wynik=1;
		else
			wynik=0;
		
		
		return wynik;
	}
	
	public static int rozstrzygniecieDwiePary(ArrayList<Karta> talia) {
		int wynik=0;
		int reka1=0;
		int reka2=0;
		int zapas1=0;
		int zapas2=0;
		
		int[] tab = new int[13];
		int[] tab2 = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++) {  
			if(tab[i]==2)
				if(reka1<i)
					reka1=i;
			if(tab[i]==1)
				zapas1=i;
			
		}
		
		for(int i=51;i<46;i--) 
			tab2[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab2.length;i++) {
			if(tab2[i]==2)
				if(reka2<i)
					reka2=i;
			if(tab2[i]==1)
				zapas2=i;
		}
		
		if(reka1>reka2)
			wynik=2;
		else if(reka1<reka2)
			wynik=1;
		else
			wynik=0;
		
		if(wynik==0)
			if(zapas1>zapas2)
				wynik=2;
			else if(zapas1<zapas2)
				wynik=1;
			else 
				wynik=0;
		
		
		return wynik;
	}
	
	public static int rozstrzygnieciePara(ArrayList<Karta> talia) {
		int wynik=0;
		int reka1=0;
		int reka2=0;
		int zapas1=0;
		int zapas2=0;
		
		int[] tab = new int[13];
		int[] tab2 = new int[13];
		
		for(int i=0;i<5;i++) 
			tab[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab.length;i++) {  
			if(tab[i]==2)
				if(reka1<i)
					reka1=i;
			if(tab[i]==1)
				if(zapas1<i)
					zapas1=i;
			
		}
		
		for(int i=51;i<46;i--) 
			tab2[talia.get(i).figura.sila]++;
		
		for(int i=0;i<tab2.length;i++) {
			if(tab2[i]==2)
				if(reka2<i)
					reka2=i;
			if(tab2[i]==1)
				if(zapas2<i)
					zapas2=i;
		}
		
		if(reka1>reka2)
			wynik=2;
		else if(reka1<reka2)
			wynik=1;
		else
			wynik=0;
		
		if(wynik==0)
			if(zapas1>zapas2)
				wynik=2;
			else if(zapas1<zapas2)
				wynik=1;
			else 
				wynik=0;
		
		
		return wynik;
	}
	
	public static int porownanieWygranych(String wynik1,String wynik2) {
		int wynik=0;
		int reka1=0;
		int reka2=0;
		for(int i=0;i<2;i++) {
			String wynikString="";
			if(i==0)
				wynikString=wynik1;
			if(i==1)
				wynikString=wynik2;
			if(wynikString.equals("Poker krolewski")) 	
				if(i==0)
					reka1=0;
				else
					reka2=0;
			else if(wynik1.equals("Poker"))
				if(i==0)
					reka1=1;
				else
					reka2=1;
			if(wynikString.equals("Kareta")) 
				if(i==0)
					reka1=2;
				else
					reka2=2;
			if(wynikString.equals("Full"))
				if(i==0)
					reka1=3;
				else
					reka2=3;
			if(wynikString.equals("Kolor"))
				if(i==0)
					reka1=4;
				else
					reka2=4;
			if(wynikString.equals("Streat")) 
				if(i==0)
					reka1=5;
				else
					reka2=5;
			if(wynikString.equals("Trojka"))
				if(i==0)
					reka1=6;
				else
					reka2=6;
			if(wynikString.equals("Dwie pary"))
				if(i==0)
					reka1=7;
				else
					reka2=7;
			if(wynikString.equals("Para"))
				if(i==0)
					reka1=8;
				else
					reka2=8;
			if(wynikString.equals("Najwyzsza karta"))
				if(i==0)
					reka1=9;
				else
					reka2=9;
	}
		
		if(reka1<reka2)
			wynik=1;
		else
			wynik=2;
		
		return wynik;
	}
	
	public static int rozstrzygniecie(ArrayList<Karta> talia,String wynik1) {
		
		int wynik=0;
		
		if(wynik1.equals("Poker krolewski")) 	
			wynik=wyzszyKolor(talia);
		if(wynik1.equals("Poker")) {
			wynik=najwyzszaKartaDlaStritaIPokera(talia);
			if(wynik==0)
				wynik=wyzszyKolor(talia);
		}
		if(wynik1.equals("Kareta")) 
			wynik=wyzszeKarty(talia);
		if(wynik1.equals("Full"))
			wynik=wyzszeKarty(talia);
		if(wynik1.equals("Kolor"))
			wynik=wyzszyKolor(talia);
		if(wynik1.equals("Streat")) 
			wynik=najwyzszaKartaDlaStritaIPokera(talia);
		if(wynik1.equals("Trojka"))
			wynik=wyzszeKarty(talia);
		if(wynik1.equals("Dwie pary"))
			wynik=rozstrzygniecieDwiePary(talia);
		if(wynik1.equals("Para"))
			wynik=rozstrzygnieciePara(talia);
		if(wynik1.equals("Najwyzsza karta"))
			wynik=wyzszaKarta(talia);
		
		
		return wynik;
	}
	
	


	public static void main(String[] args) {
		
		
		ArrayList<Karta> talia = new ArrayList<>();
		
		
		for(Kolor k : Kolor.values())
			for(Figura f: Figura.values())
				talia.add(new  Karta(k, f));
			
		


		
		
//		System.out.println(Arrays.toString(talia.to));
//		System.out.println(Arrays.deepToString(talia.toArray()));
//		System.out.println(talia);
		
//		  for (int i = 0; i < talia.size(); i++) { 
//	            System.out.println(talia.get(i).toString() + " ");
//	        }
//		  System.out.println(talia);
		  
		  
		  Collections.shuffle(talia);
		  
//		  for (int i = 0; i < talia.size(); i++) { 
//	            System.out.println(talia.get(i).toString() + " ");
//	        }
		  
		  System.out.println(talia.get(0));
		  System.out.println(talia.get(1));
		  System.out.println(talia.get(2));
		  System.out.println(talia.get(3));
		  System.out.println(talia.get(4));
		  
//		  System.out.println(talia.get(0).figura.sila);
		  
		  int ko1 = 0;
		  int ko2 = 0;
		  int ko3 = 0;
		  int ko4 = 0;
		  int kolor = 0;
		  
		 String wynik1=check(talia);
//		 System.out.println(talia.size());
		 talia.set(1,talia.get(51));
		 talia.set(2,talia.get(50));
		 talia.set(3,talia.get(49));
		 talia.set(4,talia.get(48));
		 talia.set(5,talia.get(47));
		 
		 for(int i=51;i>46;i--) {
			 System.out.println(talia.get(i));
		 }
		 String wynik2=check(talia);
		 int wynik=0;
		 if(wynik1.equals(wynik2)) {
			 wynik=rozstrzygniecie(talia,wynik1);
			 if(wynik==1)
				 System.out.println("Wygrywa reka 1");
			 else if(wynik==2)
				 System.out.println("Wygrywa reka 2");
			 else
				 System.out.println("Remis");
		 }
		 else {
			 wynik=porownanieWygranych(wynik1, wynik2);
			 if(wynik==1)
				 System.out.println("Wygrywa reka 1");
			 else if(wynik==2)
				 System.out.println("Wygrywa reka 2");
		 }
		 	
		 
		
		  
	}

}

class Karta{
	
	Kolor kolor;
	Figura figura;
	
	public Karta(Kolor kolor, Figura figura) {
		
		this.figura = figura;
		this.kolor = kolor;
		
	}

	@Override
	public String toString() {
		return "Karta [kolor=" + kolor + ", figura=" + figura + "]";
	}
	
	
}
