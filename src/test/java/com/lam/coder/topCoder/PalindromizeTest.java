package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Palindromize;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PalindromizeTest extends TestCase {
	Palindromize pali;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		pali = new Palindromize();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
		pali = null;
	}

	@Test
	public void testMinAdds() {
		Assert.assertEquals("cigartragic", pali.minAdds("cigartragic"));
		Assert.assertEquals("adda", pali.minAdds("add"));
		Assert.assertEquals("redocpotopcoder", pali.minAdds("redocpot"));
		Assert.assertEquals("acabaca", pali.minAdds("acaba"));
		Assert.assertEquals("abczyxyzcba", pali.minAdds("abczyxyz"));
	}

	@Test
	public void testMinAddsSystemTest() {
		Assert.assertEquals("adda", pali.minAdds("add"));
		Assert.assertEquals("cigartragic", pali.minAdds("cigartragic"));
		Assert.assertEquals("redocpotopcoder", pali.minAdds("redocpot"));
		Assert.assertEquals("acabaca", pali.minAdds("acaba"));
		Assert.assertEquals("z", pali.minAdds("z"));
		Assert.assertEquals("fgf", pali.minAdds("fg"));
		Assert.assertEquals("aa", pali.minAdds("aa"));
		Assert.assertEquals("plwlp", pali.minAdds("plw"));
		Assert.assertEquals("qccq", pali.minAdds("qcc"));
		Assert.assertEquals("ibi", pali.minAdds("ibi"));
		Assert.assertEquals("mmzmm", pali.minAdds("mmz"));
		Assert.assertEquals("abczyxyzcba", pali.minAdds("abczyxyz"));
		Assert.assertEquals(
				"gmekkywzhoaqytntskrczvcnjoojncvzcrkstntyqaohzwykkemg",
				pali.minAdds("gmekkywzhoaqytntskrczvcnjoojncvzcr"));
		Assert.assertEquals(
				"cxbmzhzqyrfituraaghzkqmmzsjevssvejszmmqkzhgaarutifryqzhzmbxc",
				pali.minAdds("cxbmzhzqyrfituraaghzkqmmzsjevssve"));
		Assert.assertEquals("ypyelbxwwtisundqyjttlcclttjyqdnusitwwxbleypy",
				pali.minAdds("ypyelbxwwtisundqyjttlcclttjyq"));
		Assert.assertEquals(
				"tnfxecyhmvpnseokabfrbrqpnzdphmfwdwfmhpdznpqrbrfbakoesnpvmhycexfnt",
				pali.minAdds("tnfxecyhmvpnseokabfrbrqpnzdphmfwdw"));
		Assert.assertEquals(
				"ruvsrwrklmxfiyxusvbaojvklsjzgoqflhbxikrcwipgrmvaavmrgpiwcrkixbhlfqogzjslkvjoabvsuxyifxmlkrwrsvur",
				pali.minAdds("ruvsrwrklmxfiyxusvbaojvklsjzgoqflhbxikrcwipgrmvaa"));
		Assert.assertEquals("jsqpxbdntndbxpqsj", pali.minAdds("jsqpxbdntndbxp"));
		Assert.assertEquals(
				"lxgkfbtxupxbogrddlzbgroocvssvcoorgbzlddrgobxpuxtbfkgxl",
				pali.minAdds("lxgkfbtxupxbogrddlzbgroocvssvcoorgbz"));
		Assert.assertEquals("oetomccyeppqglbaauoejeouaablgqppeyccmoteo",
				pali.minAdds("oetomccyeppqglbaauoejeouaablgqppey"));
		Assert.assertEquals(
				"uolhcqbmsbmhyordofaqjhagsxvxzdmowtftwomdzxvxsgahjqafodroyhmbsmbqchlou",
				pali.minAdds("uolhcqbmsbmhyordofaqjhagsxvxzdmowtftwomdzxvxsg"));
		Assert.assertEquals(
				"zmoymxhlilfedhtgjdefgxyqoishvebgiigbevhsioqyxgfedjgthdeflilhxmyomz",
				pali.minAdds("zmoymxhlilfedhtgjdefgxyqoishvebgiigbevhsioqyxgfedj"));
		Assert.assertEquals(
				"ftvejqxlmphklftactrhydltmmtldyhrtcatflkhpmlxqjevtf",
				pali.minAdds("ftvejqxlmphklftactrhydltmmtl"));
		Assert.assertEquals("wvsklbifgyccvvadimfxffxfmidavvccygfiblksvw",
				pali.minAdds("wvsklbifgyccvvadimfxffxfmidavvccygfib"));
		Assert.assertEquals("ogszbrdzkgttgkzdrbzsgo",
				pali.minAdds("ogszbrdzkgttgkzdrbzsg"));
		Assert.assertEquals("thrreplwfsvsfwlperrht",
				pali.minAdds("thrreplwfsvsfwl"));
		Assert.assertEquals(
				"faocdvvdmgpfzzfducxlikrjhbsxyhkacrwkharnaqqqqanrahkwrcakhyxsbhjrkilxcudfzzfpgmdvvdcoaf",
				pali.minAdds("faocdvvdmgpfzzfducxlikrjhbsxyhkacrwkharnaqqqqanra"));
		Assert.assertEquals("fcaxegypczzcpygexacf",
				pali.minAdds("fcaxegypczzcpy"));
		Assert.assertEquals("pypefvfepyp", pali.minAdds("pypefvfep"));
		Assert.assertEquals("bchhyijngruooefeoourgnjiyhhcb",
				pali.minAdds("bchhyijngruooefeoourgn"));
		Assert.assertEquals(
				"zebreejoosuncrmdlpxjrnjsmglhnytjkekgafhlyibiylhfagkekjtynhlgmsjnrjxpldmrcnusoojeerbez",
				pali.minAdds("zebreejoosuncrmdlpxjrnjsmglhnytjkekgafhlyibiylhfag"));
		Assert.assertEquals(
				"fusuabieseokwjsfuwzomfbqlqcxpxwwixqzbscppcsbzqxiwwxpxcqlqbfmozwufsjwkoeseibausuf",
				pali.minAdds("fusuabieseokwjsfuwzomfbqlqcxpxwwixqzbscppcsbzqxiww"));
		Assert.assertEquals("zaradspnbhiwaezzeawihbnpsdaraz",
				pali.minAdds("zaradspnbhiwaezzeaw"));
		Assert.assertEquals("blbftnqrkqcxoiyjjofspyzzypsfojjyioxcqkrqntfblb",
				pali.minAdds("blbftnqrkqcxoiyjjofspyzzypsfo"));
		Assert.assertEquals(
				"leqhifitcwkhfvtwryynevzpeiqqiepzvenyyrwtvfhkwctifihqel",
				pali.minAdds("leqhifitcwkhfvtwryynevzpeiqqiepzvenyyrwtvfhkwc"));
		Assert.assertEquals("lccwwhjzjsekefjgxxgjfekesjzjhwwccl",
				pali.minAdds("lccwwhjzjsekefjgxxgjf"));
		Assert.assertEquals(
				"zixxlfeyjtplwqvugbpzxtexhvxudljrbdnvezvzevndbrjlduxvhxetxzpbguvqwlptjyeflxxiz",
				pali.minAdds("zixxlfeyjtplwqvugbpzxtexhvxudljrbdnvezvzevndbrjld"));
		Assert.assertEquals(
				"taenhdefqpuwwgjmoxwdkkxnxxpqyhjhxsmigeyhqndbzwauuawzbdnqhyegimsxhjhyqpxxnxkkdwxomjgwwupqfedhneat",
				pali.minAdds("taenhdefqpuwwgjmoxwdkkxnxxpqyhjhxsmigeyhqndbzwauua"));
		Assert.assertEquals(
				"tnamglzfkopmrfrkdisulusvicggpkgvmiocgxfxrrxfxgcoimvgkpggcivsulusidkrfrmpokfzlgmant",
				pali.minAdds("tnamglzfkopmrfrkdisulusvicggpkgvmiocgxfxrrxfx"));
		Assert.assertEquals("ieluwjsonobzdoibslblsbiodzbonosjwulei",
				pali.minAdds("ieluwjsonobzdoibslbl"));
		Assert.assertEquals("mdujqrmoznyzozynzomrqjudm",
				pali.minAdds("mdujqrmoznyzo"));
		Assert.assertEquals("ysyzqkteljrepqxptyfqkuzzukqfytpxqperjletkqzysy",
				pali.minAdds("ysyzqkteljrepqxptyfqkuzzukqfytpxqper"));
		Assert.assertEquals(
				"gtlhptwszqicucwmmbchzuhiqklnsddqqsltdijvvtxuhfiifhuxtvvjidtlsqqddsnlkqihuzhcbmmwcuciqzswtphltg",
				pali.minAdds("gtlhptwszqicucwmmbchzuhiqklnsddqqsltdijvvtxuhfiif"));
		Assert.assertEquals(
				"ykrnbunmnmqhagzixnxapzgrprrprgzpaxnxizgahqmnmnubnrky",
				pali.minAdds("ykrnbunmnmqhagzixnxapzgrprrprgzpaxnxizgahqmnmnubnr"));
		Assert.assertEquals("xlnalvarbvvbravlanlx",
				pali.minAdds("xlnalvarbvvbravlanl"));
		Assert.assertEquals("tascoocsat", pali.minAdds("tascoocsa"));
		Assert.assertEquals("hjqgvlixqyhfwwocldjsbbsjdlcowwfhyqxilvgqjh",
				pali.minAdds("hjqgvlixqyhfwwocldjsbbsjdlcowwfhyqx"));
		Assert.assertEquals("zenxcyveazewufjfuwezaevycxnez",
				pali.minAdds("zenxcyveazewufjfuwezaevycxn"));
		Assert.assertEquals(
				"wvsuwunwarfstvvgtdwfrhxdmjbjmdxhrfwdtgvvtsfrawnuwusvw",
				pali.minAdds("wvsuwunwarfstvvgtdwfrhxdmjbjmdxhrfwdtgvvtsfrawnuw"));
		Assert.assertEquals(
				"frbibaivpihswtrluptitbunmjacjxeapkpkjwuxzwwmqktxbtbxtkqmwwzxuwjkpkpaexjcajmnubtitpulrtwshipviabibrf",
				pali.minAdds("frbibaivpihswtrluptitbunmjacjxeapkpkjwuxzwwmqktxbt"));
		Assert.assertEquals(
				"hbyxnzlkynagtkrkwprhggrqeiunagxffyfghuygkgyuhgfyffxganuieqrgghrpwkrktganyklznxybh",
				pali.minAdds("hbyxnzlkynagtkrkwprhggrqeiunagxffyfghuygk"));
		Assert.assertEquals("gukfcbdwdbcfkug", pali.minAdds("gukfcbdw"));
		Assert.assertEquals("srhhtdhanutovotunahdthhrs",
				pali.minAdds("srhhtdhanutov"));
		Assert.assertEquals("kjkxrduzgxscjsbmnqegzqrqzgeqnmbsjcsxgzudrxkjk",
				pali.minAdds("kjkxrduzgxscjsbmnqegzqr"));
		Assert.assertEquals(
				"rokidabyrlozrmvdpfdduwopfyqymsaeotehqykmreojycamxmacyjoermkyqhetoeasmyqyfpowuddfpdvmrzolrybadikor",
				pali.minAdds("rokidabyrlozrmvdpfdduwopfyqymsaeotehqykmreojycamx"));
		Assert.assertEquals(
				"avxsfzskfcapvvcrmtzgcqmwoowmqcgztmrcvvpacfkszfsxva",
				pali.minAdds("avxsfzskfcapvvcrmtzgcqmwoowmqcgztmrcvvpacfkszfsxva"));
		Assert.assertEquals("bopiposetkmjubehhaphblrcrlbhpahhebujmktesopipob",
				pali.minAdds("bopiposetkmjubehhaphblrcrlbhpahhebujmktesopipob"));
		Assert.assertEquals("xpcwjkqqkjwcpx", pali.minAdds("xpcwjkqqkjwcpx"));
		Assert.assertEquals("dcwuzzuwcd", pali.minAdds("dcwuzzuwcd"));
		Assert.assertEquals("dyaoyvameahjhaemavyoayd",
				pali.minAdds("dyaoyvameahjhaemavyoayd"));
		Assert.assertEquals(
				"dwdzrozjzjixjqmrumblzvglylgvzlbmurmqjxijzjzorzdwd",
				pali.minAdds("dwdzrozjzjixjqmrumblzvglylgvzlbmurmqjxijzjzorzdwd"));
		Assert.assertEquals(
				"hnakhtuvjmyjoqvoyqeazqfamccpgljgssjxxjssgjlgpccmafqzaeqyovqojymjvuthkanh",
				pali.minAdds("hnakhtuvjmyjoqvoyqeazqfamccpgljgssjxxjssgjlgpccmaf"));
		Assert.assertEquals("redocpotopcoder", pali.minAdds("redocpot"));
		Assert.assertEquals("adda", pali.minAdds("add"));
		Assert.assertEquals("ababbaba", pali.minAdds("ababba"));
		Assert.assertEquals("a", pali.minAdds("a"));
		Assert.assertEquals(
				"abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxyxwvutsrqponmlkjihgfedcbayxwvutsrqponmlkjihgfedcba",
				pali.minAdds("abcdefghijklmnopqrstuvwxyabcdefghijklmnopqrstuvwxy"));
		Assert.assertEquals("abcacba", pali.minAdds("abca"));
		Assert.assertEquals("abcdcba", pali.minAdds("abcdcb"));
		Assert.assertEquals("abcba", pali.minAdds("abc"));
		Assert.assertEquals("adbbda", pali.minAdds("adbbd"));
		Assert.assertEquals(
				"fgwlehfasdkjlhcewhfkewhfkhfkljdshkldshfkldhlksklhdlkfhsdlkhsdjlkfhkfhwekfhwechljkdsafhelwgf",
				pali.minAdds("fgwlehfasdkjlhcewhfkewhfkhfkljdshkldshfkldhlks"));
		Assert.assertEquals("abbacabba", pali.minAdds("abbacabba"));
		Assert.assertEquals("abcdeffedcba", pali.minAdds("abcdeff"));
		Assert.assertEquals("aaabaaa", pali.minAdds("aaab"));
		Assert.assertEquals("adddda", pali.minAdds("adddd"));
		Assert.assertEquals("araara", pali.minAdds("araa"));
	}

}
