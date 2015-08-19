package com.lam.coder.rosalind;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	// C
	ComplementingDNATest.class, 
	CountingDNANucleotidesTest.class,
	CountingPointMutationsTest.class,
	// F
	FromDNAintoRNATest.class,
	// T
	TranslateRNAintoProteinTest.class 
	})
public class AllTests {

}
