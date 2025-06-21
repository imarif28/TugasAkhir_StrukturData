package tubes_2_akhir;

public class Jalur {
	
	int bebanJalur;
	Jalur nextJalur;
	Simpul simpul;
	
	public Jalur(){
		bebanJalur = 0;
		nextJalur = null;
		simpul = null;
	}
	
	public Jalur(int beban){
		this.bebanJalur = beban;
		nextJalur = null;
		simpul = null;
	}
	
	public Jalur(int beban, Jalur next){
		this.bebanJalur = beban;
		this.nextJalur = next;
		simpul = null;
	}
	
	public Jalur(int beban, Jalur next, Simpul simpul){
		this.bebanJalur = beban;
		this.nextJalur = next;
		this.simpul = simpul;
	}
}
