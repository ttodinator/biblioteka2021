package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;



public class Bublioteka implements BibliotekaInterface {

	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga==null)
			throw new NullPointerException("Knjiga ne sme biti null");
		if(knjige.contains(knjiga))
			throw new RuntimeException("Knjiga vec postoji");
	
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String izdavac,String naslov) {
		if(autor==null && isbn==null && naslov==nu;; && izdavac==null)
			return knjige;
		LinkedList<Knjiga> rezultat=new LinkedList<Knjiga>();
		for(Knjiga knjiga:knjige) {
			if(knjiga.getNaslov().contains((naslov))
					rezultat.add(knjiga);
		}
	}

}
