import java.util.Scanner;
public class JavaLibs5026211117{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("buah kedondong buah manggis, kenalan dong manis. namanya siapa");
		String nama = input.nextLine();
		
		System.out.println("halo ngab, " +nama+ ". btw aku ihsan, salken ya. kalo kamu asal mana?");
		String kota = input.nextLine();
		
		System.out.println("gokil, terus2 kalo kamu hobinya apa?");
		String hobi = input.nextLine();
		
		System.out.println("btw kan disini banyak kuliner, kamu doyan makan apa?");
		String food = input.nextLine();
		
		System.out.println("kamu kalo disini sehari bisa habis berapa buat makan? (dlm ribuan)");
		int jajan = input.nextInt();
		int jantot = jajan*30;
		
		System.out.println("terus kalo sama kosan, bensin, dll. itu bisa kena berapa sebulan?");
		double diluarjajan = input.nextDouble();
		double fintot = diluarjajan + jantot;
		
		System.out.println("berarti kalo sebulan kira2 habis " +fintot+ " ya?");
		String iyainaja = input.nextLine();
		
		System.out.println("hmmm, tahun ini umurmu berapa btw? lupa nanya di awal WKWKWKWK");
		String umur = input.nextLine();
		
		System.out.println("tbh upmb ini susah bgt ga seh, dari kamu paling susah matkul apa?");
		String matkul = input.nextLine();
		
		System.out.println("WKWKWKWKKWKW SAMA, aku kan badut upmb ygy. boleh motivasiin aku biar semangat belajar ga?");
		String motivasi = input.nextLine();
		
		System.out.println("makasih bestie, walau kurang ampuh karena bukan disemangatin ayang xixixi");
		
		System.out.println("ya makasih pokoknya dah chitchat sama aku. goodluck kedepannya oke?");
		System.out.println("stay safe and jangan sampe jadi sarjana kopit kayak aku, oke?");
		System.out.println("ciao");
	}
}