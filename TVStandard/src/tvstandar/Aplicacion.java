package tvstandar;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tv = new Televisor ();
		//tv.canal=3;
		Televisor tv1 = new Televisor();
			//System.out.println(tv1.getCanal());
			tv1.setCanal(7);
			System.out.println("VOLUMEN");
			tv1.setVolumen(3);
		Televisor tv2 = new Televisor();
		//System.out.println(tv2.getCanal());	
		
			for (int i=0; i<5 ;i++) {
				tv.subirCanal();
		//System.out.println(tv.canal);
			tv.subirColor();
			//tv.subirColorAyuda();
		}
	}
	}
