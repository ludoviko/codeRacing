package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.DoubleLetter;

public class DoubleLetterTest {
	DoubleLetter doubleLetter;
	
	@Before
	public void setUp() throws Exception {
		doubleLetter = new DoubleLetter();
	}

	@After
	public void tearDown() throws Exception {
		doubleLetter = null;
	}

	@Test
	public void testAbleToSolve() {
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("aabccb"));  	
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aabccbb"))  	;
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("abcddcba"));  	
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("abab"));  	
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("aaaaaaaaaa"));  	
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aababbabbaba"));  	
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("zzxzxxzxxzzx"));  	
	}
	
	@Test
	public void testAbleToSolveSysteTest() {
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("aabccb"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aabccbb"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("abcddcba"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("abab"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("aaaaaaaaaa"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("zzxzxxzxxzzx"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aababbabbaba"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("rxmxzwjmvuxdwvnzeuuyxnqerjyywwqeewsgsagdguwttyag"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("jczacqxvqzcvockopujxkauxxxhhpx"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("mccwrkydwkmyrd"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("nmbtptlyvonbvyllqfhryqhmrplfyo"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("bxwtqqbxsafiishwyaaxysabsftxhb"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("yrlzlcdnjbzrncydjb"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("rr"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("myrmyr"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("ampmkaqvndpdkvqn"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("dmtsdjglisjglhmkxgkclegglkcsgsktjbebthjtix"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("xhdyfhotyxtovdktadfvvaykatvayoyyod"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("pkdujjlussdanvkkjpanvlakaj"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("xyzxdgedymvzkolbelmgovkb"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("gqjowaognvsgwucjdsnuijdgxscpaipxsjvq"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("zzetimfuzuhzhdewfidwerrnment"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("zzvv"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ss"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("zphzhrrp"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("myjmnmrruuqmneoqgkekmyorvrjmgv"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("dngexedyubyvykhvyzkghxubzn"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("hvutuwnqddtquhnoeuznnzoewv"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("hotmqhvsstmvqo"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("wgbkmkliwndvvejnzedemkbqjlgnenzvvkdibqbd"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("pyvpnfpmnyfrpzppbyerqvfxfxmzybnqeddn"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("vutdtmvvihlmtdrecvhtlrceiwzhtuwthz"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("tttatooa"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("vtmedefvtgtrubjbybefjganmbndrjevawijwybvivbvtu"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("ffzfdppucafacduzff"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("hjwjwh"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("bkrcddbcrjbxdujrznxlvknklzhhcjrjbdqkhqhvcu"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("emkxilnedipbnqdeplxmnbndqsnxdsxken"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("rfqeqbzrinbdnfqifqzmnndmef"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("lplbflsyjpjsyfbl"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("uuxduuwwerfubrruexzbdnbyntrxbetfyddzxe"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("hhkhkinkknhi"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("nacanc"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("yhiiiiryhr"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("xpkhbunuxobhbyimuiyouknbpimi"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("bqatpsataaktpiftiktnlnwfkdqsnkiiablwdnta"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("wkmomsbcjdfoqbgkrgcmpdcfskooolpmqgoroqeoggwqlkcgej"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("jgjollllojgjgesoofnqbdmfbbfmdxcrpprcxbqnfooseg"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("kerxssxrekdfccfd"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("zvloolvzpnwwnptt"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("mzsdxxgddgdatmrrmapvvpaoohlqjjqlcchtazroorzszm"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("zrssrtjjtzaxwgzzgfqmmqfbbwxa"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("bsxqdfeggefgjjgdqzccwyrmkhhkmrywzxsb"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vcaiuppuilsoeeoslnnacv"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("fibbgvhhvgif"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("zxqbbqxz"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("uxwzxnjxooxjnvvxzwxu"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ibapovddvopabi"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vychiitthcyvjnfnnfnj"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("clyffffylcdbuubdktqtnaantqlwwltrxllxrkmnsoosnm"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("mm"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("awommowa"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("weewxiwavjsmmyysjvawigzisswwizgx"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("iiauuahhofxxfjjoxttx"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vkqqmzzmkvlcclqnvllvvlxddxaqqarrlvhzknyynkzhnq"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("arrabmmlvvlbtrrtccmmzkkiizwttw"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("nllnzxcclpbffbplxzduooudfmmxnnxfhsshlzzgjcgkkgcjgl"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("pljffsjjsssjllkarrakpplczzkbvvbkbbwbbwiicp"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("htvyhhyvth"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("hcvmrskpbggbpksrmvch"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("liafvatioswcwxcvvcxwcwsoitavfail"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vafkjjjjkfaccvwwkqqkemmejjuizziufjjf"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("uu"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("okkoppxxbbyehheybwksskwb"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("nwbdnndeyyezwzjjzwzbwjjnrmgxxaggaggmhfxxfhmgmr"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("xlpplx"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vjqqjzeezxxxscjjbzwwzbjjczbqdgvctgrssrgtcvgdqbzsxv"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ukqzohhotjjtzqku"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ljazsifhkriksdmkkmdskirkhfiszajl"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vmlbddbbblmbsccsbv"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("rhlfaakkaafeggeleedkkfqqfdccmhhmoccooohr"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ofuukicbbcddikfxbbxoxx"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("hiihehheuudllduu"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("dllcylfztfftzflrxuuxrqppaxrrxaqyclld"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("osjjhhso"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("vvrroeolnpptxxddugguttrrtnloeorrwlljjw"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("tzzt"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("nbbzzbbn"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ecpvbjaabuuooxxxxtlejfppfjeltbarqubejjebuqrajbvpce"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("iisbyxccngfhhzppzfgnjpillipttlljvvcaacxybsii"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("mlgssgwxpsspxwgslgcerqecimmiceqrecglsglm"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("fvwlgzbwggwbmhhmwddwzglwvf"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ftgziqqjjgeegqqiefmbysdeedsybmfyeeyezgtf"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("ywoyhlqltvvtlqlhyowy"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("bommohhaabbbsxwsswpttnnkkpwwxsrrhhsssxxfzhhzfffsvv"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("gxjjxjbgcttcgbjgjixxuddeeuijdkkd"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("izsyrvwbsxlwgvwdqwellewqdwvgwlxsbwvryszi"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("a"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aba"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("abc"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("abbc"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("aa"));
		Assert.assertEquals("Possible", doubleLetter.ableToSolve("abcdefghijklmnoonmlkjihgfedcba"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aaa"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("ab"));
		Assert.assertEquals("Impossible", doubleLetter.ableToSolve("aacdfdf"));
	}

}
