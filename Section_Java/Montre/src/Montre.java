public class Montre {
	private int heure;
	private int minute;
	public Montre(int h, int m) {
		this.heure=h;
		this.minute=m;
	}
	public Montre(Montre m) {
		this.heure=m.heure;
		this.minute=m.minute;
	}
	public void Avance() {
		if(this.minute==59) {
			if(this.heure==23)
				this.heure=0;
			else this.heure=this.heure++;
			this.minute=0;
		}
		else this.minute++;
	}

}
