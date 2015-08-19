package com.lam.coder.topCoder;


import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.WordForm;

public class WordFormTest  {
	WordForm word; 
	
	@Before
	public void setUp() throws Exception {
		word = new WordForm();
	}

	@After
	public void tearDown() throws Exception {
		word = null;
	}

	@Test
	public void testGetSequence() {
		Assert.assertEquals("CVCVCVC", word.getSequence("WHEREABOUTS"));
		Assert.assertEquals("CVCVC", word.getSequence("yoghurt"));
		Assert.assertEquals("CVCV", word.getSequence("YipPy"));
		Assert.assertEquals("VCVCVCV", word.getSequence("AyYyEYye"));
		Assert.assertEquals("C", word.getSequence("yC"));
	}

	@Test
	public void testGetSequenceSystemTest() {
		Assert.assertEquals("CVCVCVC", word.getSequence("WHEREABOUTS"));
		Assert.assertEquals("CVCVC", word.getSequence("yoghurt"));
		Assert.assertEquals("CVCV", word.getSequence("YipPy"));
		Assert.assertEquals("VCVCVCV", word.getSequence("AyYyEYye"));
		Assert.assertEquals("C", word.getSequence("y"));
		Assert.assertEquals("C", word.getSequence("YggggggggggggggggggggggGGgggGGggg"));
		Assert.assertEquals("V", word.getSequence("aeiouaoeuaoeuoauoeuoEOAuouOAEuoEUOAUEOUAoEUO"));
		Assert.assertEquals("VCV", word.getSequence("ayya"));
		Assert.assertEquals("VCVCV", word.getSequence("ayYya"));
		Assert.assertEquals("CVCVCVCVC", word.getSequence("dyyyZYUYgzYY"));
		Assert.assertEquals("VCVCVCV", word.getSequence("oAuwAUOtAIfA"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("ObyNKiboYEXsYYAyAelCgoTljImYnYuhkPyRCOj"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("yyyhYYYUYYYYFyYuYyYIYYCycyyYaYyGYyTeYpaYbY"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("YYIyYiYAyeyAYyEyayoUYYFyYyyYyYyYyYY"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("yAqSjuZCQuNPYmXTIiyORwyYoyupliOUAaiYAYi"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCV", word.getSequence("tGPtHmqRUVmZyYnNRvWXZjhjyyrFFfoPTpTyQcZtABazQYZnqY"));
		Assert.assertEquals("VC", word.getSequence("uOOOY"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("YEyyIyyyUyYAYYyuyEyeyYuyYYyi"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("mvIiOJanymuofPIpypkXBojhyIYyoobanfEP"));
		Assert.assertEquals("CVCV", word.getSequence("yOUPnOUuo"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVC", word.getSequence("oidOOvoiJUoAIOPEaooIoEuQougaaauEoSeoEeeIoIZtEYaYum"));
		Assert.assertEquals("VCVCVCV", word.getSequence("AaAeEiqYOUUYUjUi"));
		Assert.assertEquals("CVCVCVCVCVCVCVC", word.getSequence("YYYYbYyYYYyaAyay"));
		Assert.assertEquals("CVCVCVCVCVCVCV", word.getSequence("YYYYYYyyYYyyyy"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCV", word.getSequence("TQZnEJhWYYfpeaYikgCjRhUPkbXytyzVyHAZPuo"));
		Assert.assertEquals("VCVCVCVCV", word.getSequence("eUeIYOYEsiYyeiI"));
		Assert.assertEquals("VC", word.getSequence("el"));
		Assert.assertEquals("V", word.getSequence("U"));
		Assert.assertEquals("CVC", word.getSequence("lsYwR"));
		Assert.assertEquals("CVCVC", word.getSequence("YgIwHUT"));
		Assert.assertEquals("V", word.getSequence("IO"));
		Assert.assertEquals("CVCVCVCVCVC", word.getSequence("yYnyXuYUhEIyPRR"));
		Assert.assertEquals("VCVCVCV", word.getSequence("eaaouyieUyIIUOYiUao"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("eyAgOYeAgiyYyEQiAqUOIyUxCEUUOuyY"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVC", word.getSequence("seyYIyEYyiYoYyYyHYyj"));
		Assert.assertEquals("CVCVCVC", word.getSequence("xMDLcmmKRNOlJHZLfwNtRdVcprilGcQghwXZsgRKMiuC"));
		Assert.assertEquals("CVCV", word.getSequence("YgIoYy"));
		Assert.assertEquals("VCVCVCVCVCV", word.getSequence("iAIUOEeyIOaYuyOaUaaYioYaEA"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("yYeyuYEUUYYYoYUyYYyeAyOYOiAOyYeYIoYoyx"));
		Assert.assertEquals("VCV", word.getSequence("IxA"));
		Assert.assertEquals("VCV", word.getSequence("uAYaI"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCV", word.getSequence("tyYyYYyrYnyYEoEyIAYYYY"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("AyfyYAOoYYaYazuCEYuyyOyyuoYIyyayyYNy"));
		Assert.assertEquals("VCVCVCVCVC", word.getSequence("uouEyXOfKodaIEyuAY"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("yhMyyYYYYYyyfYYYyyYyyYYYYdpypYyYYyYMyyYyyYyyyyyYYq"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVC", word.getSequence("aYYYyQYQcUUiDHIjjyHoxaYyyOY"));
		Assert.assertEquals("CVCVCVCVCVCVC", word.getSequence("MYYnoOYYaOSDyuLeUIonaEEuEuAN"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("yIYAeYEYDyaYiEuayyyyYBuYeYUkYAYeYYuyyy"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("YuvYyYYYDayuAnYyOYOOIUNTyIyYYYiIyYSyyaYYpyEyyyiYYY"));
		Assert.assertEquals("VCVCVCVCVCV", word.getSequence("EAeokCaEPYIuOieeoOYfaiiYIyaea"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("NantaYuXByYjxRpishgYYosqEgoYOZoIOEEeMiuqaDIo"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVC", word.getSequence("UYyYyYYoYzyeYJzyYzYYyYeYwYyYy"));
		Assert.assertEquals("CVCVC", word.getSequence("yEqywf"));
		Assert.assertEquals("V", word.getSequence("uauOO"));
		Assert.assertEquals("CVCVCVCVC", word.getSequence("YYoLOsuyeRc"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCV", word.getSequence("yoeeUiYAaYyyuIIEEuyYAYOoYoeouOuOYIYaOyo"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("ASyxyyeoJyyYWyYNYYeYYyUyYeyYueyyyyYYyYyypyYYYO"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVC", word.getSequence("TyHyFYkcYaLPyYmeZGyidyDyUYYfcoNyYjyOzOYYYyF"));
		Assert.assertEquals("CVCVCVCVCVCVCVC", word.getSequence("BYxfGYNvySYYyltByyqrPYdlx"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCVCV", word.getSequence("YYYYYyyyyyYYYYYyyyyyYYYYYyyyyyYYYYYyyyyyYYYYYyyyyy"));
		Assert.assertEquals("C", word.getSequence("yC"));
		Assert.assertEquals("C", word.getSequence("yC"));
		Assert.assertEquals("V", word.getSequence("a"));
		Assert.assertEquals("V", word.getSequence("aaaaaaaaaaaa"));
		Assert.assertEquals("CV", word.getSequence("yyo"));
		Assert.assertEquals("CVCVCVCVCVCVCVCV", word.getSequence("dYeYddYeeyYYYyyYaoopopo"));
		Assert.assertEquals("C", word.getSequence("y"));
		Assert.assertEquals("V", word.getSequence("aAaA"));
		Assert.assertEquals("CVC", word.getSequence("toy"));
		Assert.assertEquals("C", word.getSequence("RRRRRRRR"));
		Assert.assertEquals("CVCV", word.getSequence("YipPy"));
		Assert.assertEquals("CVCVCVCVCVCVCVCVCV", word.getSequence("YeeeYyYeeYeyEYghihiEeeIhYyy"));
		Assert.assertEquals("V", word.getSequence("aeiou"));
		Assert.assertEquals("VCVCVCV", word.getSequence("AyYyEYye"));
		Assert.assertEquals("VCV", word.getSequence("ICE"));
		Assert.assertEquals("VCVCVCVCVCVCVCVCVCVCV", word.getSequence("AYYYYYYYYYYYYYYYYYYYY"));
		Assert.assertEquals("VC", word.getSequence("AY"));
		Assert.assertEquals("CVCVCVC", word.getSequence("yyyyyyy"));
		Assert.assertEquals("CVCV", word.getSequence("BEBA"));
	}

	
	
}
