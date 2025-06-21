package tubes_2_akhir;

public class Simpul {
	String infoSimpul;
	Simpul nextSimpul;
	Jalur jalur;
	
	public Simpul(){
		infoSimpul = null;
		nextSimpul = null;
		jalur = null;
	}
	
	public Simpul(String info){
		this.infoSimpul = info;
		nextSimpul = null;
		jalur = null;
	}
	
	public Simpul(String info, Simpul next){
		this.infoSimpul = info;
		this.nextSimpul = next;
		jalur = null;
	}
	
	public Simpul(String infoSimpul, Simpul nextSimpul, Jalur jalur){
		this.infoSimpul = infoSimpul;
		this.nextSimpul = nextSimpul;
		this.jalur = jalur;
	}
	
}