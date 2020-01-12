package SabloanePriectare;

public class mainClass {

	public static void main(String[] args) throws Exception {
		
		/**Carte DesignPatterns = new Carte ("Disco Patterns");
		Autor autor = new Autor ("Andrei Zadic");
		DesignPatterns.adaugaAutor(autor);
		*/
		
		/**int indexCapitolUnu = DesignPatterns.CreazaCapitol("Capitolul 1");
		Capitol cap1 = DesignPatterns.getCapitol(indexCapitolUnu);
		int indexSubcapitolUnu = cap1.CreazaSubCapitol("Subcapitol 1.1");
		SubCapitol subCapIndex = cap1.getSubCapitol(indexSubcapitolUnu);
		*/
		
		/**subCapIndex.createNewParagraf("Paragraf 1");
		subCapIndex.createNewParagraf("Paragraf 2");
		subCapIndex.createNewParagraf("Paragraf 3");
		subCapIndex.createNewImagine("Imagine 1");
		subCapIndex.createNewParagraf("Paragraf 4");
		subCapIndex.createNewTabel("Tabelul 1");
		subCapIndex.createNewParagraf("Paragraf 5");
		*/
		
		
		/** LABORATOR 3
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subcapitol 1.1.1.1");
		DesignPatterns.addContent(new Paragrafe("Multumesc celor care au fost posibila....."));
		DesignPatterns.addContent(cap1);
		cap1.add(new Paragrafe("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragrafe("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragrafe("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Imagine("Image subchapter 1.1.1.1"));
		
		DesignPatterns.print();*/
		
		/** LABORATOR 4
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Pamela Anderson");
		ImageProxy img2 = new ImageProxy("Kim Katalanamama");
		ImageProxy img3 = new ImageProxy("Blueprint UnrealEngine 4");
		
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		
		Carte playboy = new Carte("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took" + (endTime - startTime) + "milliseconds");
		
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		
		System.out.println("Printing of the section 1 took : " + (endTime-startTime) + "milliseconds");
		
		startTime = System.currentTimeMillis();
		playboyS2.print();
		endTime = System.currentTimeMillis();
		
		System.out.println("Printing of the section 2 took : " + (endTime-startTime) + "milliseconds");
		*/
		
		/** LABORATOR 5
		Section cap1 = new Section("Capitolul 1");
		Paragrafe p1 = new Paragrafe("Paragraf 1");
		cap1.add(p1);
		Paragrafe p2 = new Paragrafe("Paragraf 2");
		cap1.add(p2);
		Paragrafe p3 = new Paragrafe("Paragraf 3");
		cap1.add(p3);
		Paragrafe p4 = new Paragrafe("Paragraf 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		
		p1.SetStrategy(new AlignCenter());
		p2.SetStrategy(new AlignRight());
		p3.SetStrategy(new AlignLeft());
		
		System.out.println();
		System.out.println("Printing with alignment");
		System.out.println();
		cap1.print();*/
		
		/** LABORATOR 6
		Section cap1 = new Section("Capitolul 1");
		Paragrafe p1 = new Paragrafe("Paragraf 1");
		cap1.add(p1);
		Paragrafe p2 = new Paragrafe("Paragraf 2");
		cap1.add(p2);
		Paragrafe p3 = new Paragrafe("Paragraf 3");
		cap1.add(p3);
		Paragrafe p4 = new Paragrafe("Paragraf 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Imagine("ImageTwo"));
		cap1.add(new Paragrafe("Some text right here!"));
		cap1.add(new Tabel("Tabel 1"));
		
		BookStatistics stats = new BookStatistics();
		cap1.Accept(stats);
		stats.printStats();
		*/
		
		/** LABORATOR 7
		Builder jsonBuilder = new JSONBuilder();
		jsonBuilder.build();
		Elements mybook = jsonBuilder.getResult();
		mybook.print();
		*/
		
		/** LABORATOR 8
		Comanda cmd1 = new ComandaOpen("M:\\EclipseWorkspace\\SabloaneProiectare\\book.json");
		cmd1.execute();
		Comanda cmd2 = new StatisticsCommand();
		cmd2.execute();
		DocumentManager.getInstance().getBook().print();
		*/
		
		
		Section cap1 = new Section("Capitolul 1");
		Paragrafe p1 = new Paragrafe("Paragraf 1");
		cap1.add(p1);
		Paragrafe p2 = new Paragrafe("Paragraf 2");
		cap1.add(p2);
		Paragrafe p3 = new Paragrafe("Paragraf 3");
		cap1.add(p3);
		Paragrafe p4 = new Paragrafe("Paragraf 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Imagine("ImageTwo"));
		cap1.add(new Paragrafe("Some text right here!"));
		cap1.add(new Tabel("Tabel 1"));
		
		First_Observer firstObs = new First_Observer();
		Second_Observer secondObs = new Second_Observer();
		
		cap1.AddObserver(firstObs);
		cap1.AddObserver(secondObs);
		
		p1.AddObserver(firstObs);
		p1.AddObserver(secondObs);
		p1.AddObserver(firstObs);
		
		cap1.SetNewValue("CHAPTER 1");
		p1.SetNewValue("PARAGRAPH 2");
		p2.SetNewValue("PARAGRAPH 3");
		
		cap1.RemoveObserver(firstObs);
		cap1.SetNewValue("CHAPTER 1.1");
		
		cap1.print();
		
		
		
	}

}
