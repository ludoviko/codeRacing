package com.lam.coder.usaco;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.usaco.CalfFlac;

public class CalfFlacTest extends TestCase {
	CalfFlac pali;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		pali = new CalfFlac();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
		pali = null;
	}

	@Test
	public void testFind() {
		Assert.assertArrayEquals(new String[] {"5", "Madam"}, pali.find("ConMadam"));
		Assert.assertArrayEquals(new String[] {"11", "MadamImAdam"}, pali.find("ConfuciussayMadamImAdam"));
		Assert.assertArrayEquals(new String[] {"11", "Madam, I'm Adam"}, pali.find("Madam, I'm Adam."));
		Assert.assertArrayEquals(new String[] {"11", "Madam, I'm Adam"}, pali.find("Confucius to the Madam says : Madam, I'm Adam."));
		
		String string = "oVWQdDOCVvYDkddLvOvKjXMuMkgXUXjmNuefqh{hOUCIqRnCDhzSMqZxNGGJTtCeqKwdBTQmFqFGXCsc" +
				"qwOSqnZhPOVQRqWpdViEWDoxgWcRd[XJzqQfjFqZMwgfsFUOr{wrLbXwTUDFeJXr[Tu{dEZHqP[nEBRN" +
				"imnEmpHCVPlXWnPDEX[hIVQkNFyKZFwKvQGfS{wtHfZXmlJhZytqBSzfgjybhRFsUiRWNoXrBHfhT[Ub" +
				"hZFPieTHsRUhuJybRBVoRhkc[YpfkxWlxJBUM[nxTexrvOKekyHBqodODD[GGMRVBki[m[XJgze{yY[P" +
				"[pgNtDJeBjnxDxkdKTyGhMF{pinIdypWSOUfCqFLWuvYFKvsuczNxgRvHuOZmmouJucHj[DlhLwnSocm" +
				"crMCltuwhvqjEnDpeIeKjbFdCNEzsNkZhepYP[uD[mlkVwXt[NiLjoNxgPTSVSivgWtjRdNQjjePpQrE" +
				"RjGKobNUvWdXqnWbqWbSSpizKcDDKyGTIruwbqSmioKDG{YiGMhlSroLOFpRHhIjMMCBWdsdlDPUK[nF" +
				"DsMyjPOG{XClqcsBWzKOxsVIejVqCMyOebKeRqRFc[GgHbDxCtMrrnEdfbsRXCGgWrvjOTOWXBCMIynt" +
				"cQRgUvUYMePMdJnXljKfNkpWGNPRHGbgOMD[qwQERqoXgoEQipSzXmLiGHeofoubFLcEELFqPD[bRoTM" +
				"MToRb[DPqFLEEcLFbuofoeHGiLmXzSpiQEogXoqREQwq[DMOgbGHRPNGWpkNfKjlXnJdMPeMYUvUgRQc" +
				"tnyIMCBXWOTOjvrWgGCXRsbfdEnrrMtCxDbHgG[cFRqReKbeOyMCqVjeIVsxOKzWBscqlCX{GOPjyMsD" +
				"Fn[KUPDldsdWBCMMjIhHRpFOLorSlhMGiY{GDKoimSqbwurITGyKDDcKzipSSbWqbWnqXdWvUNboKGjR" +
				"ErQpPejjQNdRjtWgviSVSTPgxNojLiN[tXwVklm[Du[PYpehZkNszENCdFbjKeIepDnEjqvhwutlCMrc" +
				"mcoSnwLhlD[jHcuJuommZOuHvRgxNzcusvKFYvuWLFqCfUOSWpydInip{FMhGyTKdkxDxnjBeJDtNgp[" +
				"OLebjbJLTfpDgTRylEkXJUngwpTKcQXywvExPfuHU{mkKgnndozu[PIjrnRpWgWR{FOLViUdYMmoUQmo" +
				"LJQmSmJveThW{qrxvzzVdbVRcnpIT{BKbGSPGGLyeUtiyUdtMcYygDYbLvvOirlOI{Gi{BkZVWujRmJY" +
				"PUtGlQGogRTcyknwDVRpgwrMtxCUkGkxRjSI{INnxQhZmNgHBDmpOBQfXlctnIOPEGC[QpOsnMmBjRxj";
		
		Assert.assertArrayEquals(new String[] {"776", "pgNtDJeBjnxDxkdKTyGhMF{pinIdypWSOUfCqFLWuvYFKvsuczNxgRvHuOZmmouJucH" +
				"j[DlhLwnSocmcrMCltuwhvqjEnDpeIeKjbFdCNEzsNkZhepYP[uD[mlkVwXt[NiLjoNxgPTSVSivgWtjRdNQjjePpQrERjG" +
				"KobNUvWdXqnWbqWbSSpizKcDDKyGTIruwbqSmioKDG{YiGMhlSroLOFpRHhIjMMCBWdsdlDPUK[nFDsMyjPOG{XClqcsB" +
				"WzKOxsVIejVqCMyOebKeRqRFc[GgHbDxCtMrrnEdfbsRXCGgWrvjOTOWXBCMIyntcQRgUvUYMePMdJnXljKfNkpWGNPRHG" +
				"bgOMD[qwQERqoXgoEQipSzXmLiGHeofoubFLcEELFqPD[bRoTMMToRb[DPqFLEEcLFbuofoeHGiLmXzSpiQEogXoqREQwq" +
				"[DMOgbGHRPNGWpkNfKjlXnJdMPeMYUvUgRQctnyIMCBXWOTOjvrWgGCXRsbfdEnrrMtCxDbHgG[cFRqReKbeOyMCqVjeIVs" +
				"xOKzWBscqlCX{GOPjyMsDFn[KUPDldsdWBCMMjIhHRpFOLorSlhMGiY{GDKoimSqbwurITGyKDDcKzipSSbWqbWnqXdWvUN" +
				"boKGjRErQpPejjQNdRjtWgviSVSTPgxNojLiN[tXwVklm[Du[PYpehZkNszENCdFbjKeIepDnEjqvhwutlCMrcmcoSnwLhl" +
				"D[jHcuJuommZOuHvRgxNzcusvKFYvuWLFqCfUOSWpydInip{FMhGyTKdkxDxnjBeJDtNgp"}, pali.find(string));
			}
}
