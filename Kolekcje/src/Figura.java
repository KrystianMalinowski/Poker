
public enum Figura {
	
	dwojka(0),
	trojka(1),
	czworka(2),
	piatka(3),
	szostka(4),
	siodemka(5),
	osemka(6),
	dziewiatka(7),
	dziesiatka(8),
	walet(9),
	dama(10),
	krol(11),
	as(12); 

	
	int sila;
	private Figura(int r) {
		
		this.sila=r;
		
	}

}
