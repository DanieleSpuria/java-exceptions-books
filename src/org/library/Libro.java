package org.library;

public class Libro {
	private String titolo;
	private int    pagine;
	private String autore;
	private String editore;
	
	public Libro (String titolo, int pagine, String autore, String editore) {
		setTitolo(titolo);
		setPagine(pagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	public String getTitolo() {
		return titolo;
	}
	public int getPagine() {
		return pagine;
	}
	public String getAutore() {
		return autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public void setEditore(String editore) {

		this.editore = editore;
	}
	
	@Override
	public String toString() {
		return "°°Libro°°\n" + 
			   "\nTitolo: "  + getTitolo()  + "\n" +
			   "Autore: "    + getAutore()  + "\n" + 
			   "Editore: "   + getEditore() + "\n" +
			   "Pagine :"    + getPagine(); 
	}
}
