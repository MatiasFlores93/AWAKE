package cl.awakelab.abpro;

public class Huevo {

	private int lanzamientoEnFila;
	private int lanzamientoEnColumna;
	private int puntajeObtenido;
	private int puntajeBonus;

	public Huevo(int lanzamientoEnFila, int lanzamientoEnColumna) {
		this.lanzamientoEnFila = lanzamientoEnFila;
		this.lanzamientoEnColumna = lanzamientoEnColumna;
	}

	public int getLanzamientoEnFila() {
		return lanzamientoEnFila;
	}

	public void setLanzamientoEnFila(int lanzamientoEnFila) {
		this.lanzamientoEnFila = lanzamientoEnFila;
	}

	public int getLanzamientoEnColumna() {
		return lanzamientoEnColumna;
	}

	public void setLanzamientoEnColumna(int lanzamientoEnColumna) {
		this.lanzamientoEnColumna = lanzamientoEnColumna;
	}

	public int getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setPuntajeObtenido(int puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	public int getPuntajeBonus() {
		return puntajeBonus;
	}

	public void setPuntajeBonus(int puntajeBonus) {
		this.puntajeBonus = puntajeBonus;
	}

	@Override
	public String toString() {
		return "Huevo [lanzamientoEnFila=" + lanzamientoEnFila + ", lanzamientoEnColumna=" + lanzamientoEnColumna + "]";
	}

}
