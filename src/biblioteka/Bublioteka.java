package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterface;



public class Bublioteka implements BibliotekaInterface {

	//Privatna lista sa svim knjigaam u biblioteci
	private LinkedList<Knjiga> knjige=new LinkedList<Knjiga>();
	//Nepotreban komentar 2
	@Override
	public void dodajKnjigu(Knjiga knjiga) {

		if(knjiga==null || knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne sme biti null ili duplikat");
		
		knjige.add(knjiga);



	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		if(knjiga==null || !knjige.contains(knjiga))
			throw new RuntimeException("Knjiga ne sme biti null i mora postojati u biblioteci");
		knjige.remove(knjiga);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		
		return knjige;
	}

	@Override

	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String izdavac, String naslov) {
		if(autor==null && isbn==null && naslov==null && izdavac==null)
			throw new RuntimeException("Morate uneti barem jedan kriterijum pretrage");
		
		LinkedList<Knjiga> rezultat=new LinkedList<Knjiga>();
		for (Knjiga knjiga:knjige) {
			if(knjiga.getNaslov().contains(naslov))
				rezultat.add(knjiga);
		}
		
		return rezultat;

	}

}
