package tvstandar;

public class Televisor {

		
	private	int canal;
	private int color;
	
	
		public int getColor() {
			return color;
		}
		public void setColor(int color) {
			this.color = color;
		}

	private int volumen;
	
		
		public int getVolumen() {
		return volumen;
		}
		public void setVolumen(int volumen) {
			this.volumen = volumen;
		}
		
		public void subirVolumen(int volumen) {
			if (volumen >10) {
			setVolumen(volumen=10);
			}
			else {
				setVolumen(volumen +1);
			}
		}
		public Televisor() {
			setCanal(0);
			setVolumen(5);
		}
		public Televisor(int c,int v) {
			setCanal(c);
			setVolumen(v);
		}
		
		public void subirCanal() {
			if (canal>10){
				setCanal(canal=0);
			}
			else {
				setCanal(canal+1);
			}
			}
		public void bajarCanal() {
			if (canal==0){
				setCanal(canal=10);
			}
			else {
				setCanal(canal-1);
			}
		}
		public int getCanal() {
			return canal;
		}
		public void setCanal(int c) {
			if (c<0) {
				canal =0;
				}
			else{
				canal = c;
			}
		}
		public void subirColor() {
			setColor(color +1);
			subirColorAyuda();
		}
		private void subirColorAyuda() {
			System.out.println("Subiendo el color");
		}
		private void bajarColor() {
			setColor(color -1);
			bajarColorAyuda();
		}
		private void bajarColorAyuda() {
			System.out.println("Bajando el color");
		}
		
		Persona a = new Persona ("mompo");
		
}
