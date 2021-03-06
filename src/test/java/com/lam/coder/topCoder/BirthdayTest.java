package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Birthday;

import junit.framework.Assert;
import junit.framework.TestCase;

public class BirthdayTest extends TestCase {
	Birthday day;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		day = new Birthday();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		day = null;
	}

	@Test
	public void testGetNext() {
		Assert.assertEquals(
				"10/12",
				day.getNext("06/17", new String[] { "02/17 Wernie",
						"10/12 Stefan" }));
		Assert.assertEquals("10/12",
				day.getNext("06/17", new String[] { "10/12 Stefan" }));
		Assert.assertEquals(
				"02/17",
				day.getNext("02/17", new String[] { "02/17 Wernie",
						"10/12 Stefan" }));
		Assert.assertEquals("10/12",
				day.getNext("12/24", new String[] { "10/12 Stefan" }));
		Assert.assertEquals(
				"02/17",
				day.getNext("01/02", new String[] { "02/17 Wernie",
						"10/12 Stefan", "02/17 MichaelJordan",
						"10/12 LucianoPavarotti", "05/18 WilhelmSteinitz" }));
	}
	
	@Test
	public void testGetNextSystemTest() {
		Assert.assertEquals("01/31", day.getNext( "01/30", new String[] {"10/12 Stefan", "01/31 Barris"}));
		Assert.assertEquals("01/01", day.getNext( "09/13", new String[] {"09/12 Gunar", "01/01 Emily"}));
		Assert.assertEquals("09/13", day.getNext( "09/13", new String[] {"09/14 Loraine", "09/13 Gunther", "09/12 Gunar"}));
		Assert.assertEquals("10/12", day.getNext( "06/17", new String[] {"02/17 Wernie", "10/12 Stefan"}));
		Assert.assertEquals("10/12", day.getNext( "06/17", new String[] {"10/12 Stefan"}));
		Assert.assertEquals("02/17", day.getNext( "02/17", new String[] {"02/17 Wernie", "10/12 Stefan"}));
		Assert.assertEquals("10/12", day.getNext( "12/24", new String[] {"10/12 Stefan"}));
		Assert.assertEquals("02/17", day.getNext( "01/02", new String[] {"02/17 Wernie", "10/12 Stefan", "02/17 MichaelJordan", "10/12 LucianoPavarotti", "05/18 WilhelmSteinitz"}));
		Assert.assertEquals("09/14", day.getNext( "09/13", new String[] {"09/14 Loraine", "09/12 Gunar"}));
		Assert.assertEquals("02/28", day.getNext( "02/27", new String[] {"10/12 Stefan", "02/28 Carver"}));
		Assert.assertEquals("03/31", day.getNext( "03/30", new String[] {"10/12 Stefan", "03/31 Lowrance"}));
		Assert.assertEquals("04/30", day.getNext( "04/29", new String[] {"10/12 Stefan", "04/30 Maire"}));
		Assert.assertEquals("05/31", day.getNext( "05/30", new String[] {"10/12 Stefan", "05/31 Dalenna"}));
		Assert.assertEquals("06/30", day.getNext( "06/29", new String[] {"10/12 Stefan", "06/30 Katinka"}));
		Assert.assertEquals("07/31", day.getNext( "07/30", new String[] {"10/12 Stefan", "07/31 Jermaine"}));
		Assert.assertEquals("08/31", day.getNext( "08/30", new String[] {"10/12 Stefan", "08/31 Demetris"}));
		Assert.assertEquals("09/30", day.getNext( "09/29", new String[] {"10/12 Stefan", "09/30 Wadsworth"}));
		Assert.assertEquals("10/31", day.getNext( "10/30", new String[] {"10/12 Stefan", "10/31 Grayce"}));
		Assert.assertEquals("11/30", day.getNext( "11/29", new String[] {"10/12 Stefan", "11/30 Ian"}));
		Assert.assertEquals("12/31", day.getNext( "12/30", new String[] {"10/12 Stefan", "12/31 Derk"}));
		Assert.assertEquals("07/12", day.getNext( "12/26", new String[] {"07/12 Agneta"}));
		Assert.assertEquals("10/21", day.getNext( "10/15", new String[] {"04/27 Nataniel", "10/21 Avrom"}));
		Assert.assertEquals("11/20", day.getNext( "06/29", new String[] {"11/20 Dredi", "01/08 Karoly", "01/03 Fabian"}));
		Assert.assertEquals("12/01", day.getNext( "12/01", new String[] {"07/15 Lynn", "12/01 Christophorus", "12/22 Stefano", "04/08 Dahlia"}));
		Assert.assertEquals("08/14", day.getNext( "07/16", new String[] {"06/26 Gipsy", "05/20 Gilligan", "03/07 Meghann", "08/14 Emelita", "08/14 Perry"}));
		Assert.assertEquals("02/20", day.getNext( "11/28", new String[] {"08/30 Ashlan", "07/28 Edd", "11/23 Merrile", "02/20 Trista", "09/18 Junia", "08/10 Myrlene"}));
		Assert.assertEquals("09/22", day.getNext( "09/08", new String[] {"09/22 Helenelizabeth", "04/21 Nona", "03/16 Bunni", "01/28 Celinka", "01/13 Keen", "06/28 Humfried", "08/20 Jess"}));
		Assert.assertEquals("04/21", day.getNext( "04/11", new String[] {"04/21 Cassy", "11/26 Stephi", "08/03 Warren", "09/04 Carmelia", "11/16 Winfred", "11/06 Debbi", "06/29 Gisela", "09/12 Pavlov"}));
		Assert.assertEquals("03/24", day.getNext( "01/10", new String[] {"12/23 Christoper", "03/24 Caldwell", "09/08 Jessa", "10/06 Hale", "10/08 Lodovico", "11/25 Shari", "09/04 Brynn", "08/08 Tamara", "04/22 Marcel"}));
		Assert.assertEquals("03/29", day.getNext( "03/24", new String[] {"04/26 Mia", "07/17 Bran", "11/19 Hyacintha", "07/31 Doralyn", "03/12 Van", "03/12 Meghann", "03/29 Bent", "05/16 Heath", "12/03 Miguelita", "10/29 Cher"}));
		Assert.assertEquals("01/03", day.getNext( "11/22", new String[] {"11/05 Lelah", "07/18 Stillman", "05/09 Brooks", "05/23 Nolan", "06/04 Cyrillus", "07/02 Neville", "07/28 Goldie", "04/06 Rouvin", "01/03 Eal", "01/05 Christopher", "08/08 Hubey"}));
		Assert.assertEquals("11/29", day.getNext( "10/28", new String[] {"02/02 Lari", "08/31 Giacopo", "09/14 Justine", "10/07 Lucais", "06/21 Lisle", "04/22 Reilly", "07/01 Kippie", "07/02 Dalila", "10/05 Delly", "04/23 Janene", "11/29 Lanette", "07/03 Isac"}));
		Assert.assertEquals("05/08", day.getNext( "04/25", new String[] {"05/16 Bennett", "03/19 Garv", "05/08 Jaymee", "09/19 Ferrel", "05/22 Waiter", "02/17 Eudora", "11/08 Jim", "10/05 Shelden", "06/04 Michelle", "05/16 Barri", "09/12 Burty", "11/18 Fielding", "09/22 Bevin"}));
		Assert.assertEquals("11/11", day.getNext( "11/10", new String[] {"08/14 Brittaney", "12/19 Kyle", "12/31 Darice", "01/24 Bill", "04/24 Carmelle", "01/28 Rosalind", "11/11 Boote", "10/26 Correna", "03/03 Danika", "05/18 Clerc", "02/04 Merissa", "08/29 Corella", "03/10 Augustine", "08/21 Heywood"}));
		Assert.assertEquals("04/02", day.getNext( "03/04", new String[] {"09/24 Griswold", "02/06 Artair", "10/02 Brandyn", "06/15 Trstram", "05/31 Beulah", "01/12 Ruthanne", "04/02 Trevor", "11/06 Kippy", "05/31 Alethea", "03/02 Bernardine", "05/28 Turner", "10/16 Aluino", "02/03 Leshia", "08/19 Winfred", "08/03 Aleta"}));
		Assert.assertEquals("12/13", day.getNext( "12/02", new String[] {"06/11 Georgy", "02/02 Jolynn", "01/05 Bernette", "12/13 Leodora", "10/23 Baron", "09/04 Mannie", "06/03 Netti", "04/16 Merrili", "11/13 Lin", "10/05 Price", "09/12 Rourke", "03/26 Douglas", "08/24 Helyn", "12/21 Loydie", "03/19 Adriaens", "02/10 Dione"}));
		Assert.assertEquals("05/29", day.getNext( "03/18", new String[] {"01/06 Bayard", "08/26 Fanni", "08/23 Adams", "06/21 Selie", "05/29 Dorey", "09/23 Marlyn", "01/06 Ron", "08/24 Willette", "08/30 Jean", "09/27 Boot", "07/22 Nikolos", "12/13 Sybil", "03/15 Antoinette", "03/17 Rania", "03/02 Jermain", "06/15 Joshuah", "07/08 Ardine"}));
		Assert.assertEquals("04/30", day.getNext( "04/22", new String[] {"07/22 Lanni", "11/15 Diann", "06/12 Tricia", "12/31 Stesha", "06/05 Rae", "11/24 Georgi", "01/13 Shanon", "03/29 Erv", "09/10 Joly", "11/02 Winonah", "12/14 Margarete", "12/22 Tucky", "01/06 Taber", "09/19 Josh", "04/30 Rolland", "05/24 Blondelle", "09/02 Ed", "08/18 Montgomery"}));
		Assert.assertEquals("01/27", day.getNext( "11/10", new String[] {"05/11 Verne", "06/15 Sally", "06/11 Brigitte", "04/22 Maison", "07/25 Chiquita", "01/27 Demetris", "05/09 Phelia", "10/16 Talbert", "04/19 Stanislaw", "11/08 Millicent", "07/11 Darla", "04/28 Opalina", "05/16 Cary", "05/16 Shela", "05/19 Bob", "06/12 Tatum", "09/26 Letty", "01/31 Ximenez", "02/13 Liana"}));
		Assert.assertEquals("04/13", day.getNext( "01/17", new String[] {"07/13 Monroe", "10/23 Hervey", "11/30 Rowney", "05/10 Salvidor", "06/17 Welby", "05/19 Ettore", "05/28 Brigit", "04/24 Reinald", "01/13 Dilan", "01/12 Sergeant", "08/23 Lawry", "08/13 Marne", "12/09 Marley", "12/17 Roseanna", "04/13 Bartholemy", "05/18 Addison", "10/23 Leland", "04/23 Eden", "11/27 Haslett", "10/12 Flossie"}));
		Assert.assertEquals("10/29", day.getNext( "10/03", new String[] {"06/01 Russ", "06/02 Gerty", "08/09 Freddy", "02/03 Lorrie", "02/07 Alexandrina", "11/18 Marinna", "11/02 Arlen", "03/27 Marrilee", "04/16 Donnie", "05/31 Catharina", "01/28 Maureen", "04/08 Barbaraanne", "03/23 Onofredo", "02/24 Dominique", "08/02 Lefty", "10/29 Anett", "09/28 Marco", "12/02 Alon", "09/26 Bevvy", "04/12 Venita", "12/28 Ulrick"}));
		Assert.assertEquals("12/31", day.getNext( "12/28", new String[] {"05/15 Byram", "11/11 Marven", "07/19 Dorris", "12/31 Susan", "11/22 Gizela", "12/09 Wilbert", "08/29 Dermot", "07/10 Granthem", "10/17 Donall", "01/21 Ignacio", "04/23 Edouard", "05/27 Roseann", "03/14 Emmye", "08/02 Fredek", "10/16 Arlina", "08/12 Fenelia", "10/10 Sigismondo", "09/24 Starlene", "02/18 Bond", "07/10 Renee", "10/11 Alyss", "08/24 Nero"}));
		Assert.assertEquals("06/14", day.getNext( "05/29", new String[] {"12/07 Kennan", "12/20 Avril", "06/14 Trixie", "11/11 Yorker", "04/18 Reinold", "04/08 Kissee", "05/24 Minna", "06/25 Kenn", "03/15 Patin", "07/18 Fawnia", "02/09 Sacha", "07/18 Rosamund", "10/17 Jilly", "04/08 Josee", "07/14 Glad", "07/26 Persis", "04/30 Ardine", "07/02 Cate", "07/02 Stern", "03/23 Cooper", "07/11 Fania", "04/26 Ole", "04/03 Gerda"}));
		Assert.assertEquals("10/30", day.getNext( "09/30", new String[] {"02/28 Calley", "01/18 Brand", "06/10 Grier", "04/26 Idette", "11/29 Billi", "12/25 Valaree", "07/14 Fayette", "12/05 Clareta", "07/14 Jenine", "07/09 Fairlie", "10/30 Enid", "07/01 Redd", "11/24 Lorrie", "01/29 Zondra", "06/23 Donelle", "09/02 Faulkner", "02/14 Dennet", "06/01 Malchy", "06/23 Nichols", "08/23 Patrizio", "11/24 Mathian", "01/28 Lauren", "01/22 Bradford", "11/03 Stace"}));
		Assert.assertEquals("02/25", day.getNext( "02/20", new String[] {"03/29 Granville", "10/10 Averyl", "04/05 Letti", "08/03 Giovanni", "11/09 Edythe", "07/01 Kirbie", "01/17 Myrtice", "05/01 Elisha", "07/10 Hurley", "01/15 Eb", "09/06 Herve", "04/04 Bria", "05/18 Bernete", "12/07 Cody", "03/20 Nickolai", "02/11 Terri", "03/05 Craig", "08/14 Doyle", "02/13 Konstance", "09/03 Gladi", "02/25 Carilyn", "01/04 Alick", "11/15 Burty", "05/28 Courtnay", "09/27 Butch"}));
		Assert.assertEquals("05/26", day.getNext( "05/20", new String[] {"11/28 Shina", "05/28 Lauren", "07/13 Charin", "03/09 Colas", "11/20 Omar", "08/14 Mellisa", "12/31 Wilmar", "08/03 Colman", "12/10 Gardie", "02/06 Creigh", "01/24 Ketty", "03/13 Broddy", "05/15 Berne", "07/25 Duff", "10/05 Hanson", "02/26 Ricard", "06/15 Carter", "04/14 Thia", "03/30 Beverly", "06/14 Adrian", "09/07 Ruben", "12/26 Justus", "10/22 Birgit", "10/10 Paulo", "08/03 Carson", "05/26 Eda", "03/25 Elena", "11/04 Johnathan", "12/26 Corina", "02/21 Fairfax"}));
		Assert.assertEquals("10/25", day.getNext( "10/19", new String[] {"01/26 Dalenna", "08/11 Blane", "02/09 Elwin", "11/23 Pippy", "06/17 Garvy", "02/22 Reube", "07/10 Sandie", "04/14 Antonius", "07/13 Teresita", "03/09 Rianon", "08/23 Krystle", "03/29 Tabitha", "08/23 Abby", "10/25 Daryl", "11/20 Rollo", "08/27 Murry", "07/14 Tristam", "08/22 Chrotoem", "12/21 Paola", "06/14 Sacha", "01/28 Liana", "09/15 Alikee", "01/05 Clari", "05/24 Adrianna", "02/03 Imelda", "02/06 Idell", "07/08 Callida", "08/06 Arlen", "01/26 Dwayne", "05/05 Nessie", "02/17 Murdoch", "08/18 Cristiano", "06/07 Rafi", "10/14 Kennith", "01/28 Avictor"}));
		Assert.assertEquals("06/06", day.getNext( "06/02", new String[] {"11/30 Alta", "03/15 Corly", "06/06 Orrin", "01/13 Lucias", "01/04 Ami", "05/21 Addie", "05/18 Philip", "09/07 Cassandre", "06/25 Kettie", "08/08 Wendy", "07/11 Kleon", "08/23 Debor", "08/07 Melvin", "01/15 Westbrook", "10/28 Windy", "08/04 Tristan", "06/25 Krispin", "10/07 Kiley", "10/02 Bradley", "11/26 Susanetta", "09/08 Mellisent", "07/09 Elise", "07/23 Twyla", "12/03 Rosabel", "05/03 Mildred", "03/06 Julie", "09/16 Joann", "04/23 Faye", "11/15 Lyssa", "04/23 Perceval", "05/04 Curt", "10/25 Hanny", "11/18 Hewe", "04/09 Cammie", "02/27 Lemmy", "05/06 Hadleigh", "03/16 Ortensia", "03/15 Vinny", "06/24 Doralin", "01/26 Margalo"}));
		Assert.assertEquals("03/29", day.getNext( "03/21", new String[] {"01/21 Doro", "06/13 Alastair", "09/01 Sonnie", "11/03 Donn", "10/20 Almeda", "10/15 Court", "11/16 Leola", "06/17 Frederique", "12/09 Prudi", "01/27 Alex", "06/10 Clarette", "12/31 Dew", "09/29 Wat", "12/30 Marjy", "05/17 Lynne", "06/12 Cacilia", "09/04 Harriet", "02/22 Solomon", "04/07 Kennett", "06/01 Kenn", "10/17 Joy", "11/07 Carola", "08/15 Danya", "07/29 Aubert", "03/11 Benjamen", "02/06 Aloin", "03/15 Eliza", "05/12 Gayler", "07/22 Brandie", "03/29 Monica", "07/26 Olivie", "03/02 Brooks", "07/04 Elvin", "07/06 Georgine", "07/03 Norrie", "10/12 Kalle", "07/14 Johna", "12/05 Prudy", "05/18 Sybil", "03/29 Rolando", "04/26 Humbert", "07/18 Clay", "10/11 Wells", "01/21 Vonnie", "05/14 Shem"}));
		Assert.assertEquals("12/11", day.getNext( "12/08", new String[] {"05/11 Dorie", "02/18 Ailbert", "02/14 Elle", "01/01 Normand", "02/13 Timothy", "09/22 Scarlett", "07/15 Nevile", "02/19 Salvidor", "08/09 Vasilis", "12/11 Rasia", "02/15 Sidonnie", "10/13 Lou", "01/07 Ludvig", "08/19 Cherlyn", "10/28 Bobbye", "07/09 Andrei", "02/01 Michaella", "02/22 Therese", "06/06 Toddie", "07/05 Abie", "07/15 Grove", "11/09 Channa", "04/27 Darla", "07/09 Sandy", "07/12 Bob", "03/05 Malissa", "12/24 Georgeta", "02/16 Danila", "10/25 Arabel", "05/06 Benny", "02/13 Filberto", "05/08 Nonnah", "07/19 Jesse", "02/13 Tibold", "01/28 Archie", "09/17 Mohandas", "08/23 Jakie", "10/09 Rebecka", "10/19 Lorine", "11/11 Odille", "09/10 Englebert", "12/29 Noam", "05/06 Keri", "09/26 Brynne", "11/26 Belle", "08/28 Kippie", "02/04 Naoma", "06/17 Homerus", "01/18 Cly", "01/04 Ame"}));
		Assert.assertEquals("02/12", day.getNext( "02/10", new String[] {"02/13 klfdsdsa", "02/12 dsafdsafdsa"}));
		Assert.assertEquals("01/02", day.getNext( "01/02", new String[] {"01/02 Sree"}));
		Assert.assertEquals("02/02", day.getNext( "01/01", new String[] {"02/02 Bob"}));
		Assert.assertEquals("01/05", day.getNext( "01/30", new String[] {"01/05 Mike", "01/23 Kevin"}));
		Assert.assertEquals("01/24", day.getNext( "10/24", new String[] {"05/24 a", "01/24 b"}));
		Assert.assertEquals("01/05", day.getNext( "01/30", new String[] {"01/05 Brian", "01/23 Kevin"}));
		Assert.assertEquals("02/17", day.getNext( "01/02", new String[] {"02/17 wer", "10/12 ste", "02/17 mic", "10/12 luc", "05/18 wil"}));
		Assert.assertEquals("07/01", day.getNext( "06/01", new String[] {"07/15 John", "07/01 Justin"}));
		Assert.assertEquals("01/13", day.getNext( "12/24", new String[] {"02/15 h", "01/13 yo", "06/17 hey"}));
		Assert.assertEquals("01/18", day.getNext( "02/02", new String[] {"02/01 abc", "01/18 ace"}));
		Assert.assertEquals("02/17", day.getNext( "12/01", new String[] {"02/17 Z", "10/12 A", "02/18 Q", "10/12 P", "05/18 T"}));
		Assert.assertEquals("07/31", day.getNext( "07/15", new String[] {"07/31 A", "08/01 B"}));
		Assert.assertEquals("02/02", day.getNext( "01/01", new String[] {"03/03 Alex", "02/02 Bill"}));
		Assert.assertEquals("10/12", day.getNext( "12/24", new String[] {"10/12 James"}));
		Assert.assertEquals("12/31", day.getNext( "12/30", new String[] {"12/31 aa", "01/01 bb"}));
		Assert.assertEquals("02/02", day.getNext( "01/01", new String[] {"02/02 Foo"}));
		Assert.assertEquals("05/03", day.getNext( "05/02", new String[] {"05/03 Ashish"}));
		Assert.assertEquals("05/01", day.getNext( "02/02", new String[] {"05/15 hell", "05/14 ihope", "05/01 thisworks"}));
		Assert.assertEquals("02/12", day.getNext( "02/10", new String[] {"02/13 klfdsdsa", "02/12 dsafdsafdsa"}));
		Assert.assertEquals("01/02", day.getNext( "01/02", new String[] {"01/02 Sree"}));
		Assert.assertEquals("02/02", day.getNext( "01/01", new String[] {"02/02 Bob"}));
		Assert.assertEquals("01/05", day.getNext( "01/30", new String[] {"01/05 Mike", "01/23 Kevin"}));
		Assert.assertEquals("01/24", day.getNext( "10/24", new String[] {"05/24 a", "01/24 b"}));
		Assert.assertEquals("01/05", day.getNext( "01/30", new String[] {"01/05 Brian", "01/23 Kevin"}));
		Assert.assertEquals("02/17", day.getNext( "01/02", new String[] {"02/17 wer", "10/12 ste", "02/17 mic", "10/12 luc", "05/18 wil"}));
		Assert.assertEquals("07/01", day.getNext( "06/01", new String[] {"07/15 John", "07/01 Justin"}));
		Assert.assertEquals("01/13", day.getNext( "12/24", new String[] {"02/15 h", "01/13 yo", "06/17 hey"}));
		Assert.assertEquals("01/18", day.getNext( "02/02", new String[] {"02/01 abc", "01/18 ace"}));
		Assert.assertEquals("02/17", day.getNext( "12/01", new String[] {"02/17 Z", "10/12 A", "02/18 Q", "10/12 P", "05/18 T"}));
		Assert.assertEquals("07/31", day.getNext( "07/15", new String[] {"07/31 A", "08/01 B"}));
		Assert.assertEquals("02/02", day.getNext( "01/01", new String[] {"03/03 Alex", "02/02 Bill"}));
		Assert.assertEquals("10/12", day.getNext( "12/24", new String[] {"10/12 James"}));
		Assert.assertEquals("12/31", day.getNext( "12/30", new String[] {"12/31 aa", "01/01 bb"}));
		Assert.assertEquals("02/02", day.getNext( "01/01", new String[] {"02/02 Foo"}));
		Assert.assertEquals("05/03", day.getNext( "05/02", new String[] {"05/03 Ashish"}));
		Assert.assertEquals("05/01", day.getNext( "02/02", new String[] {"05/15 hell", "05/14 ihope", "05/01 thisworks"}));
	}
}
