package org.library;

public class Libro {
	private String titolo;
	private String pagine;
	private String autore;
	private String editore;
	
	public Libro (String titolo, String pagine, String autore, String editore) throws Exception {
		setTitolo(titolo);
		setPagine(pagine);
		setAutore(autore);
		setEditore(editore);
	}
	
	public String getTitolo() {
		return titolo;
	}
	public String getPagine() {
		return pagine;
	}
	public String getAutore() {
		
		return autore;
	}
	public String getEditore() {
		return editore;
	}
	public void setTitolo(String titolo) throws Exception {
		if (titolo == "") throw new Exception("Inserire titolo!\n");
		this.titolo = titolo;
	}
	public void setPagine(String pagine) throws Exception {
		if (pagine == "") throw new Exception("Inserire pagine!\n");
		if (Integer.valueOf(pagine) <= 0) throw new Exception("Inserire un numero diverso da 0 e non negativo!\n");
		this.pagine = pagine;
	}
	public void setAutore(String autore) throws Exception {
		if (autore == "") throw new Exception("Inserire autore!\n");
		this.autore = autore;
	}
	public void setEditore(String editore) throws Exception {
		if (editore == "") throw new Exception("Inserire editore!\n");
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		return "\nTitolo: "  + getTitolo()  + "\n" +
			   "Autore: "    + getAutore()  + "\n" + 
			   "Editore: "   + getEditore() + "\n" +
			   "Pagine :"    + getPagine(); 
	}
}
