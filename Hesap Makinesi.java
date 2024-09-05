import java.util.*;
import javax.swing.JOptionPane;
import java.lang.*;
import java.security.MessageDigest;

import static java.lang.System.in;
import static java.lang.System.out;

public class Merhaba {
static void menu()  {
		out.println("[1] Toplama");
		out.println("[2] çıkarma");
		out.println("[3] çarpma");
		out.println("[4] bölme");
		
	}
static double Hesapla(double a, double b, int op) {
	double s=0;
	switch(op) {
	case 1: s=a+b; break;
	case 2: s=a-b; break;
	case 3: s=a*b; break;
	case 4: s=a/b; break;
	}
	return s;
}
	
	public static void main(String[] args) {
		
		double a,b,sonuc;
		int işlem;
		char cevap;
		Scanner tara=new Scanner(System.in);
		do {
			menu();
			out.print("Sayı gir:");
			a=tara.nextInt();
			b=tara.nextInt();
			out.print("işlem...:");
			işlem=tara.nextInt();
			sonuc=Hesapla(a,b,işlem);
			out.print("sonuc="+sonuc);
			out.print("Devam mı[E/H]?");
			cevap=tara.next().charAt(0);
		}
		while(cevap=='e'||cevap=='E');
	}

}