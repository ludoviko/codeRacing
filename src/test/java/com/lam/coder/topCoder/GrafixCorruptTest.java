package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.GrafixCorrupt;

public class GrafixCorruptTest {
	GrafixCorrupt grafic;

	@Before
	public void setUp() throws Exception {
		grafic = new GrafixCorrupt();
	}

	@After
	public void tearDown() throws Exception {
		grafic = null;
	}

	@Test
	public void testSelectWord() {
		Assert.assertEquals(1,
				grafic.selectWord(new String[] { "cat", "cab", "lab" }, "dab"));
		Assert.assertEquals(2,
				grafic.selectWord(new String[] { "cat", "cab", "lab" }, "lag"));
		Assert.assertEquals(-1,
				grafic.selectWord(new String[] { "cat", "cab", "lab" }, "bic"));
		Assert.assertEquals(10, grafic
				.selectWord(new String[] { "zkv", "izs", "fed", "waa", "ttx",
						"bgt", "quy", "dtq", "dgo", "yrs", "cid", "nln", "pvz",
						"txt", "zun", "erd", "jen", "klh", "kxy", "emf", "mqt",
						"lza", "dzb", "ndx", "vfr", "jhs", "dkm", "elb" },
						"cwd"));
		Assert.assertEquals(36, grafic.selectWord(new String[] { "zhadjsg",
				"vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw",
				"ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck",
				"laclyin", "uqmdkfx", "dimswqo", "fojhetr", "grntrce",
				"obdtqwx", "bhojwcy", "zuuuvst", "mvqtoly", "aftmupx",
				"govuidx", "qklpret", "yptccki", "uxdnslh", "wudrusz",
				"uwxbvou", "ouytqun", "pjdexqe", "xraaqdw", "lxmoncl",
				"sjnjfgb", "qrlqgvc", "fgvoadm", "yohsrxw", "udpvrsr",
				"mklucgt" }, "vklikgf"));
		// Assert.assertEquals(, grafic.selectWord(new String[] , ));
	}
	
	@Test
	public void selectWordSystemTest() {
		Assert.assertEquals(1, grafic.selectWord(new String[] {"cat", "cab", "lab"}, "dab"));
		Assert.assertEquals(2, grafic.selectWord(new String[] {"cat", "cab", "lab"}, "lag"));
		Assert.assertEquals(-1, grafic.selectWord(new String[] {"cat", "cab", "lab"}, "dog"));
		Assert.assertEquals(4, grafic.selectWord(new String[] {"bobble", "bubble", "rubble", "hubble", "supple"}, "dimple"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"double", "bobble", "bubble", "rubble", "hubble", "supple"}, "dimple"));
		Assert.assertEquals(3, grafic.selectWord(new String[] {"wma", "rnq", "dpa", "aig", "uew", "ilz", "ora", "rzv", "mgt", "ymk", "shh", "vgl", "pkf", "fvd", "pcd", "vbx", "jsq", "coq", "zpx", "btj", "gjy", "gup", "jfg", "vnn", "nhq", "udv", "oyx", "ebb", "pqc", "nhe"}, "oip"));
		Assert.assertEquals(6, grafic.selectWord(new String[] {"quu", "vrt", "pov", "sqe", "npl", "woj", "ybw", "qkv", "gui", "hfq", "wus", "yuo", "xqv", "rxn", "tlw", "tqr", "tlg", "zhn", "xjg", "let", "aeg", "ily", "utd", "vai", "feo"}, "haw"));
		Assert.assertEquals(10, grafic.selectWord(new String[] {"zkv", "izs", "fed", "waa", "ttx", "bgt", "quy", "dtq", "dgo", "yrs", "cid", "nln", "pvz", "txt", "zun", "erd", "jen", "klh", "kxy", "emf", "mqt", "lza", "dzb", "ndx", "vfr", "jhs", "dkm", "elb"}, "cwd"));
		Assert.assertEquals(43, grafic.selectWord(new String[] {"iflijue", "lkbkeyj", "knthrfd", "xbcckbl", "vosveuq", "fwtnzkb", "fuzysrx", "ckktjle", "uvplgvi", "jedmqln", "ymxtswv", "oerctxu", "kswfgoe", "tzufcub", "opmiumf", "ylgrxnu", "esrzqds", "ayjbjps", "xkjqeut", "dcsyarp", "mlcbjqv", "lwovijf", "gcpttgm", "gcxhayy", "lxaimkc", "tvqnsdp", "jfzmdvo", "ziahtcc", "kypnkje", "lmejccc", "baxesfl", "uyojpar", "nuosxom", "pbkslld", "jgzkghd", "vqlaakw", "gauodcz", "nfmrxew", "amvafww", "ryggotp", "rshrunj", "epjicsf", "dibmcdi", "qeetuig"}, "qeetjig"));
		Assert.assertEquals(4, grafic.selectWord(new String[] {"vkgybsv", "uhjbxpl", "iamkddp", "vnzurft", "uumhfzg", "rnhenwg", "vsrdgkv", "kartbdc", "kymocef", "ubdvxec", "tmhevvo", "zputfma", "kdpshth", "arughbu", "tzyqgkg", "jwbpoxv", "odckizg", "lhjcvwj", "pdtepzk", "mcqaqpj", "uikudwo", "jeacfag", "hajuagu", "xhjxrxw", "juztuyi", "hwwhcpj", "pbkfzbm", "neshhxq", "xsiootq", "byamzrf", "kjcjoar", "sxbeqnw", "beybtrl", "lbjtopx", "yavbufk", "fxcyzjx", "gyvicko", "amfvvws", "ptncgqi"}, "rumhfzg"));
		Assert.assertEquals(6, grafic.selectWord(new String[] {"igrnsq", "ppzaol", "sbmgek", "fbigqu", "kjluzt", "udnvrj", "bqvpco", "iejrxl", "fnygzg", "aseugg", "psbvav", "qaisge", "pogdmt", "zpniwm", "onlaet", "ypxxuw", "rhtwrb", "bifzws", "eeymav", "combuu", "tbxwqk", "iccogo", "wjjguz", "zcqwqy", "uqqtkm", "ubbnri", "joskig", "weojwy", "mvudhd", "fkuxnm", "tuyjpz", "yruzcw", "fgzveu"}, "bqrpch"));
		Assert.assertEquals(5, grafic.selectWord(new String[] {"gvdhqhet", "xolckqwd", "soopyftk", "eusofrmk", "chtcdasc", "zbwyywfg", "vftkarfu", "sewvkgok", "vcbjrcit", "ozlvpzqx", "ptcatsll", "zvcadpxd", "fsllaczq", "mheweyjw", "jwqvrqkh", "zfhkbjcc", "btebdjkr", "nquulwpm", "bxfijaji", "wkowucmt", "swcunqiy", "bbubazlc", "dfwyencg", "bphxsrwa", "ouscyhuh", "ubgdwqet", "ivgkemlv", "clmykfym"}, "zbciywzg"));
		Assert.assertEquals(5, grafic.selectWord(new String[] {"hkqqht", "zfsfvy", "kazizw", "litsib", "gvbumv", "bjwdlz", "islbbz", "zlafiy", "nivadi", "waxptx", "tvodsu", "oztpwr", "vhqmfx", "ckfytn", "wgkenk", "rjlzxo", "pkymry", "uqsvpf", "uzgddm", "xlobwq", "rtanib", "wukcxi", "euxxta", "zjwfgw", "aaeqhs", "mczyqx", "qmrptp", "fnaejf"}, "bnwtlz"));
		Assert.assertEquals(3, grafic.selectWord(new String[] {"mpgiczg", "saakuxy", "rdhisdk", "ikexjrd", "mjiblob", "lskdwfo", "nvikaey", "dxpohdk", "ztcwjeg", "qofabqp", "ikepqyv", "zjdjkzs", "afiaahs", "wfgvibk", "kgfwkby", "zynsntp", "ansighy", "iaitlyh", "hfqbgat", "atiarjn", "aneneup", "mruwtmu", "toopmqn", "ugihztb", "jtliffb", "hnwhxbl", "gygctrn", "xiwgfmd"}, "ikexjru"));
		Assert.assertEquals(21, grafic.selectWord(new String[] {"yxbmrv", "whhyvc", "ldtimj", "zuemqp", "cygqyr", "zlrreb", "lebhrq", "zrgeyw", "hcebyn", "fjgrca", "uivmxq", "xrdxkn", "xiqfmh", "ocpkfq", "iyokfu", "cmtyda", "xawlep", "fsophv", "fzuefd", "ejnvdj", "vdiury", "cmirnp", "aqxdxx"}, "cpirap"));
		Assert.assertEquals(23, grafic.selectWord(new String[] {"shlsh", "bdghy", "gpirb", "dkxcp", "uuxub", "selup", "rbrxw", "hblpl", "kjkwn", "fxjfp", "csftb", "cogqq", "miqab", "gwion", "uobwh", "koxrn", "gjgvr", "xgvgf", "tvbpe", "lfivq", "axujq", "ejumi", "srbuu", "mgfvs", "grpts", "dyqcn", "fnnik", "yqtfe", "oehqd", "cmxxg", "nlssw", "jiipe", "mjkso"}, "ogfvn"));
		Assert.assertEquals(37, grafic.selectWord(new String[] {"sndam", "npabx", "dmdfi", "nzhsr", "jsfvg", "smsrv", "awkxg", "xiitf", "reyqh", "uqlxz", "ivvzt", "ngexp", "prgwi", "jfgnm", "ktzuo", "izvxn", "xqzfd", "ebetg", "nmtob", "lzlzl", "rabiw", "edkuz", "skcfj", "zpowk", "bqyry", "sgvhx", "bwnyg", "wxwvn", "wbbas", "tfmwi", "mplak", "wiqlc", "yasay", "twlrz", "oezul", "npisa", "msokh", "muaco", "jsamy", "sfhfd", "owtmc", "rlmyt", "tavqc"}, "mxaco"));
		Assert.assertEquals(24, grafic.selectWord(new String[] {"mm", "me", "uy", "dp", "qe", "fk", "je", "zl", "oh", "qr", "th", "zu", "by", "wz", "or", "er", "pc", "zf", "us", "os", "se", "kk", "ly", "or", "bi", "py", "rj", "ud", "bi", "dc", "vf", "qz", "tu", "nw"}, "ii"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"mdda", "ktua", "odsj", "aakk", "peef", "fmcg", "pcrp", "yikd", "mfup", "nfrt", "nvpw", "ioxy", "xtht", "ynyb", "dmmz", "vhxx", "wsjz", "qxnq", "oqtv", "atsq", "ruuc", "akfr"}, "mqda"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"ietcbyn", "cqkjdxw", "ihqvgon", "rrsgzry", "orcgvcj", "xsqsufg", "vpcckoe", "mowwqxo", "bmrhbac", "qredboc", "pcaqqyh", "vymszdy", "zlgdmwl", "bjjadjn", "zbavobm", "tnxmjza", "tpezatd", "qxxmyla", "rybpgpa", "plsoybu", "kfpbafi", "bsufquk", "pwlpnff", "rjwmcuw"}, "ietchnn"));
		Assert.assertEquals(36, grafic.selectWord(new String[] {"zhadjsg", "vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw", "ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck", "laclyin", "uqmdkfx", "dimswqo", "fojhetr", "grntrce", "obdtqwx", "bhojwcy", "zuuuvst", "mvqtoly", "aftmupx", "govuidx", "qklpret", "yptccki", "uxdnslh", "wudrusz", "uwxbvou", "ouytqun", "pjdexqe", "xraaqdw", "lxmoncl", "sjnjfgb", "qrlqgvc", "fgvoadm", "yohsrxw", "udpvrsr", "mklucgt"}, "vklikgf"));
		Assert.assertEquals(7, grafic.selectWord(new String[] {"qeww", "nhvs", "qlot", "mxov", "rago", "ttxt", "cddi", "xwjj", "sjyh", "ewhk", "xigp", "lgge", "vwjs", "eiss", "natd", "xnug", "epqv", "nyfy", "dkvs", "qxwt", "ecos", "pwsy", "pwhf", "htnz", "lhhc", "qdwu", "rhcu", "cfmy", "mtwl", "aeor", "aanj", "spjf", "rkxq", "osmd", "dybv", "pnip", "fgng", "fxoy", "mcpa", "zfzc", "smne", "yjgt", "fpzi", "vulm", "ylcd", "hdst", "utus", "rrdm"}, "cwgj"));
		Assert.assertEquals(4, grafic.selectWord(new String[] {"bzxldnnx", "pcvbjpsn", "jtehowcp", "zlvrqwdh", "oytrbokn", "azogglah", "udghslyc", "nlritiob", "zjstxaof", "ysghzwif", "ojxyyhzg", "viwjffvq", "xuobtpva", "tcwtssed", "agaqrdsp", "murzggym", "ielvhmrk", "llcgogzf", "fhlcygtp", "emxgdghw", "yuwkwrpo"}, "oymrbeka"));
		Assert.assertEquals(1, grafic.selectWord(new String[] {"fbgmh", "hfemy", "pisxc", "fpbud", "sqglo", "bmzvv", "flnsw", "mqxuc", "jtekj", "bhrbk", "ifjpg", "hpqty", "ognzq", "eaqkw", "lsyjm", "mvqsq", "tsrsi", "rdvtn", "mtrxp", "bhfnj", "skhxw", "iqwuu", "wzxqf", "uvxva", "ijykt", "fjocx", "pzvup", "wvjcu", "hebbe", "lgxue", "afpgv", "rpbbc", "uzuti"}, "qfcmy"));
		Assert.assertEquals(1, grafic.selectWord(new String[] {"qwjecwfm", "mffdrvqj", "warqpoly", "aivyzqwd", "qpyhxajo", "itfcvmop", "impxrlka", "ieioumpn", "xsabcpgv", "hhljebzy", "nsdercma", "ixbniqri", "emdhoqfq", "njquxlea", "migiacww", "mbnsjuja", "lkxxpvhu", "irpueiyk", "irekzgfg", "beaaduum", "wyhaehmx", "fngjxnty", "dvsjeyou", "ppnbvrps", "iscudrtb", "ueebjfhe", "buihmnhw", "imedvxam", "qmwwroup", "ehpkrihe", "mlgvfoge", "xqahosmx"}, "msfereqi"));
		Assert.assertEquals(27, grafic.selectWord(new String[] {"sajwpp", "tkazqr", "fffvry", "syvbdj", "nedjsa", "mhxjdp", "hxfjuv", "intkur", "untgxb", "criygm", "xglybf", "ihlnch", "auotob", "mxbptx", "hxonsy", "uzufen", "sqqwzb", "pwgggp", "coyiru", "odlhhz", "glmbqa", "jlgczo", "umevvt", "adjimo", "lixkbv", "otcbfc", "xqxror", "ihagvg", "oeuxjc", "gaskrf", "lvsuer", "woaehz"}, "qaalvg"));
		Assert.assertEquals(11, grafic.selectWord(new String[] {"blm", "phx", "lkk", "cjc", "rpr", "wzm", "ruh", "rdh", "rwt", "pnj", "dwq", "yqe", "ytr", "zgf", "jya", "wmg", "vkt", "nmf", "tzs", "osw", "wvm", "rpx", "nyn", "xlq", "tnz", "oam", "mxf", "pmg", "jwh", "vbm", "iis", "kyu", "etn", "msz", "mqm", "oxj", "fes", "suv"}, "gqv"));
		Assert.assertEquals(3, grafic.selectWord(new String[] {"jomz", "vwxw", "mone", "kkhm", "gzcb", "tcvg", "nnod", "wglu", "yikd", "topv", "yhti", "ljjs", "haqm", "nrsp", "vokg", "xzim", "bnho", "hfio", "nkjd", "lerd", "gtfz", "pbbl", "hwzq", "amtr", "pvrw", "fegx", "rzrf", "dzrk", "fjom", "clpt", "tekb", "ftta", "ffzu", "aiur", "ymgg", "uwla", "ukst"}, "ksrv"));
		Assert.assertEquals(13, grafic.selectWord(new String[] {"gd", "qc", "ko", "td", "gc", "qo", "gr", "hz", "tc", "yb", "zo", "rd", "eb", "im", "vh", "wp", "tp", "ds", "dl", "de", "gq", "ht", "uu", "hb", "ys", "kx", "kd", "gw", "dd", "gq", "cu", "cq", "xb", "om", "ey", "sh", "ee", "li", "yn", "vo", "kd", "hi"}, "lm"));
		Assert.assertEquals(5, grafic.selectWord(new String[] {"sa", "ku", "wj", "ot", "ds", "nj", "ks", "fb", "xn", "rj", "bt", "uv", "di", "ax", "jx", "sr", "aa", "bi", "xf", "mq", "fn", "gh", "xl", "so", "ea", "jk", "vr", "sx", "re", "lh", "zx", "dy", "xg", "cq", "dq", "qe", "ep", "ba", "xj", "ky", "ol", "rx", "th", "oy", "vq", "ix", "lq", "nz", "je"}, "nq"));
		Assert.assertEquals(15, grafic.selectWord(new String[] {"kwykmiv", "eshzxxe", "alxrgcn", "ldfixnz", "upczbsd", "odukcou", "tkxirbm", "ycwnudn", "ngdbtlf", "eyvtqkt", "oghtwjc", "oishzbc", "oergumy", "ydmvtoz", "frcdzwf", "xpyazdf", "jjhtkry", "jfyfqla", "kzusspy", "apswbqe", "trqqlre", "sqtqpmy", "wuythqc", "htphgwm", "yypiwpa", "hzmsnei", "ivxnkhd"}, "ypyzzpf"));
		Assert.assertEquals(17, grafic.selectWord(new String[] {"iwwdsbkg", "vierzvvk", "wqmapzop", "dsxsknpu", "utrassva", "qlbaszku", "oaqxszyh", "tfpesqny", "fkqepaps", "qqoqtklv", "fphtxhkj", "qvyamkhl", "owptsyxu", "yrrgggii", "anndjrss", "xcajcopy", "ythkuhlz", "dkczjyfx", "cwgkybdk", "qcopzcrz", "catntuff", "aafwffsv", "sbsjyshl", "ofxybmyz", "tqxjufde", "feaiuvts", "pdsnvbub", "ajuxsdhk", "hhckpsls", "dcluoijt", "cpztxkza", "mmiusgjp", "tsjdtkel", "pqhqdieb", "exbhjfim", "ppdvzxfs", "sizvmsev", "enlfrclo", "jvrjuutr", "oootnowp", "kpfzrwzg", "jgdrevyf", "ykpckehl", "awclgiha", "gdzcluge"}, "dokcjygd"));
		Assert.assertEquals(24, grafic.selectWord(new String[] {"vgl", "rhf", "hnq", "mbp", "qzm", "vyt", "jop", "ttg", "rqo", "oba", "xhw", "ope", "oro", "div", "fvm", "hwo", "xpg", "iws", "rgl", "ugv", "ehl", "xdq", "tts", "ijf", "gca", "hrx", "fuy", "rwj", "hgv", "jzc"}, "lch"));
		Assert.assertEquals(14, grafic.selectWord(new String[] {"dkylgdk", "tyclazv", "ictnrxs", "dtkjbnd", "zxhkwlu", "oggpcve", "raxxoav", "lqkiflw", "jjtkvij", "qlboidw", "bldvmgp", "qodkolt", "dobnxuk", "jdpvjps", "obeolcf", "owquaec", "vtrugbq", "xlooinv", "kqyhmpa", "ueyvovq", "mqoljly", "kiuwlln", "inaulgh", "kesudfr", "eilzdqy", "xxhjcla", "umvgkgu", "npfzazq", "hykipfd", "mlttaxe", "egfqgxl", "bbhxrcj"}, "fyeorsl"));
		Assert.assertEquals(16, grafic.selectWord(new String[] {"adklnswy", "qijlemsy", "prlumzys", "mruptofh", "vrvjgcxk", "jzjdjctj", "bmskntnr", "rwswpoqj", "yeqwthbq", "xhrkwbep", "zchiawma", "kdqyrbpz", "bsvdvuvm", "aoydmvwk", "cqopwfyz", "ooppwejl", "jaxeafqw", "fntthbrn", "qfdcvjho", "asyfsnyl", "htkkyexo", "xxcvqffn", "cftyyjlz", "ymgntenx", "hjsbpotd", "aukotrzl", "nyaygfbk", "vshhtgif", "ddjoxulg", "gpjtgvpo", "excnxbdi", "orioewpx", "upjbbekp", "qsarffxu", "wdniywxa", "diyluont"}, "jaxemfqc"));
		Assert.assertEquals(5, grafic.selectWord(new String[] {"flshsin", "sshzsfl", "ftpmdxi", "fugvsfl", "odmyzhi", "lgjsyhw", "bhifilq", "dchdcfn", "pvqxtql", "ddlrnnw", "gpvdmzc", "mwalbhb", "zsdnpaz", "qnuzcbt", "vecalpb", "vrygctn", "gwnehdq", "fnzrijl", "egpljgz", "kgbbuew", "zxqrufh", "yohqsas", "wdvqtyz", "fjuucln", "kwxybno", "nxnrmrd", "sfqoyvq", "pttmgbo", "ohsfowu", "ijurgro", "vhdgoll", "vmwbulf", "cgkdffu", "utddxur", "spkscnv", "ruezjvg", "iuwtxhu", "dcoqyzf", "pzlvedg", "kfhpaft", "mikdckw", "pzqgzkf"}, "igokhbg"));
		Assert.assertEquals(19, grafic.selectWord(new String[] {"wxcnwiis", "itbtvmnp", "aythipnc", "kcarboch", "eudxohxb", "odyuakyg", "ahtlqelx", "ytjnnnpx", "legiltkj", "kbplewxu", "auuegqtk", "nbbopmkw", "brclyrxx", "abqjixfr", "tnvcqibz", "zqjaarjs", "gjothkav", "ftwiuoih", "rtvruyfu", "ackzhxrl", "nakxkbxl", "tnwdosjt", "uifrsbdi", "illcgqgd", "pfjvtkne"}, "xckzqxrl"));
		Assert.assertEquals(8, grafic.selectWord(new String[] {"ggg", "xva", "upo", "rvj", "zto", "jmm", "upe", "csv", "bkg", "rqs", "ngd", "qgt", "nsi", "eyg", "jhv", "fjl", "xua", "kkx", "eyz", "yim", "szq", "hiq", "yvc", "yde", "ebk", "tfl", "ffl", "uft", "sgj", "bqg", "ypk", "jpu", "atv", "brl", "nyh", "iup", "ecz", "ers", "omb", "ifl", "ogi", "sak", "lnh", "gvi", "vmc", "rzg", "oex", "fhz", "blh", "xad"}, "bkg"));
		Assert.assertEquals(6, grafic.selectWord(new String[] {"kxymh", "tgdhu", "fiidb", "ycteu", "xsgvr", "ghdpv", "vejas", "wcqdx", "mscmk", "qsoub", "bbvbj", "rynys", "ldler", "qtawt", "aouna", "ymhgn", "ewnyw", "edddc", "hlhpa", "mmbtc", "cyeas", "qaphi", "vzccv", "ykluq", "iiwdf", "wfess", "lygjq", "vjsbt", "uzist", "jzgjc", "drpcn", "jcmte", "kilbj", "synpc", "hnbho", "vkeeo"}, "yepal"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"dblq", "wqtz", "geer", "zxkc", "hcrv", "ogqd", "tzpz", "qrzi", "acbf", "bdnf", "dlho", "owlp", "ekvr", "deka", "kmmi", "vcnf", "xlmu", "ooki", "rscd", "ivmk", "wmub", "vink", "pgrf", "paxz", "aqcy", "ncfh", "hgti", "vjgf", "petb", "dvjs", "qbaq", "bczi", "hqfi", "gjui", "qdvg", "bkhi", "bzwk", "ggqc", "strt", "lhee", "glms"}, "dbut"));
		Assert.assertEquals(20, grafic.selectWord(new String[] {"rfv", "nvu", "bwf", "asd", "akt", "ybu", "srk", "bld", "dwe", "ofl", "brg", "uyz", "kdj", "ngx", "pph", "vjb", "hdj", "dco", "bkb", "byh", "bfz", "dgh", "gif", "vid", "zlr", "xcl", "xtz", "sxt", "kys", "tmb", "qgg", "rle"}, "bfr"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"jg", "xw", "ow", "hu", "pi", "ii", "rk", "vs", "th", "eu", "qc", "nv", "kq", "sn", "is", "li", "cn", "kd", "ko", "mr", "lk", "hn"}, "vg"));
		Assert.assertEquals(7, grafic.selectWord(new String[] {"ir", "ns", "ro", "cb", "cl", "ta", "xw", "ny", "pf", "vq", "nk", "fd", "ah", "zs", "zp", "mh", "fl", "cl", "yq", "vz", "ek", "qb", "ol", "ph", "tq", "dl", "sf", "tt", "mp", "mz", "ps", "cz", "tr", "zl", "gj", "qq", "uk", "ii", "ap", "ga"}, "gy"));
		Assert.assertEquals(2, grafic.selectWord(new String[] {"dv", "aj", "rc", "rb", "bk", "cg", "za", "ll", "rd", "vn", "cs", "qb", "wf", "ui", "ka", "vq", "qy", "zy", "nb", "pv", "pb", "wi", "et", "rl", "fh", "eh", "qz", "lk", "aw"}, "rf"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"kv", "jr", "pq", "as", "sr", "ob", "wv", "zd", "jk", "oc", "rc", "ym", "tx", "ub", "td", "hu", "an", "hs", "zr", "cn", "cf", "bc", "wi", "zc", "nx", "gd", "ei", "mc", "pb", "zs", "by", "hg", "cj", "jc", "hz", "aj", "aj", "hi"}, "zv"));
		Assert.assertEquals(5, grafic.selectWord(new String[] {"fqhdwst", "gpetvkx", "cxkwhsi", "mdncppx", "mpdzvju", "agjezkk", "cjclubg", "mvfisln", "jicntqk", "ocgcxsk", "cedpkol", "otgkobz", "vlbznpj", "bggwenl", "yycjtpa", "dcddqog", "hmovvsz", "jdcdawf", "ebobsmk", "uxnyirq", "cubygfs", "imfyuao", "ecxqbgs", "kuscepq", "aoevabq", "vgychuo", "taeupcx", "smjbznd", "qiydbvm", "bddwtlh", "tndqjwc", "wvcqrxq", "vdnpniw", "ymdjftu", "bbmzzfw"}, "aglamkc"));
		Assert.assertEquals(25, grafic.selectWord(new String[] {"ldxzxvzz", "iiihfmwt", "ozmhcmxp", "fiofrzaw", "qcthqnxh", "dvmxzwxa", "nqszmaqj", "jkhdmase", "rcywawee", "yuqtezzd", "pnuqypsl", "zevrqgbf", "wbjniifd", "yzwdsdua", "btfowdjh", "cnweflhq", "ssdkfhqv", "ldleybci", "qcyaolfv", "xwccsclz", "tpswezoi", "szgqegoa", "glbnevbd", "rxixkvqh", "amwtplwp", "nhkvqvli", "apgdspug", "hrjdvvkh", "ofahkhsj", "bealcxxd", "qoqgkmwq", "yunavyxz", "lmshzqoq", "aomxyibm", "pqhomyjb", "neodmvee", "fbctjxhb", "dbidkxph", "fotfrats", "tvgmmnad", "vittbcub", "yqebqred"}, "evkvqslw"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"gi", "di", "fq", "af", "zg", "ne", "ux", "cu", "gf", "hd", "uy", "gc", "nd", "am", "pr", "dv", "dp", "cc", "tn", "nb", "cp", "cx"}, "hi"));
		Assert.assertEquals(22, grafic.selectWord(new String[] {"dzfiqak", "sfljfvu", "gjeaoda", "tzbrrlb", "eqpwoko", "xkfcdsz", "tvbkmhr", "hblgoai", "hynpltf", "nboqdfq", "osgimgd", "viddysi", "armfnrx", "idqwtwj", "flqpicw", "lakpwyr", "vddyvzk", "yhegnpu", "lbrvhwt", "ppxldce", "ujvndmt", "nwivwau", "wxgglux", "iozzrbj", "jiucgrj", "fdbuxnz", "crqnait", "mrtbyic", "finelwg"}, "wxgwlgs"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"dovvda", "ruzrdf", "crozgn", "nklymo", "pbgvkk", "eectyf", "drmgce", "zdphfw", "rrbumu", "sfmsqd", "sihado", "fzlpcq", "vyzebm", "kvbmfp", "hnelkl", "qqtkdb", "ywmmml", "omwdke", "ybutfm", "opxqhb", "hwyxrn", "qztipa", "xuatfo", "mjweub", "bmydpu", "lqzmze", "delhuc", "dbtwqj", "jvjxwl", "rqhrdm", "enxxuo"}, "duxmdl"));
		Assert.assertEquals(-1, grafic.selectWord(new String[] {"cat", "cab", "lab"}, "bic"));
		Assert.assertEquals(10, grafic.selectWord(new String[] {"zkv", "izs", "fed", "waa", "ttx", "bgt", "quy", "dtq", "dgo", "yrs", "cid", "nln", "pvz", "txt", "zun", "erd", "jen", "klh", "kxy", "emf", "mqt", "lza", "dzb", "ndx", "vfr", "jhs", "dkm", "elb"}, "cwd"));
		Assert.assertEquals(36, grafic.selectWord(new String[] {"zhadjsg", "vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw", "ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck", "laclyin", "uqmdkfx", "dimswqo", "fojhetr", "grntrce", "obdtqwx", "bhojwcy", "zuuuvst", "mvqtoly", "aftmupx", "govuidx", "qklpret", "yptccki", "uxdnslh", "wudrusz", "uwxbvou", "ouytqun", "pjdexqe", "xraaqdw", "lxmoncl", "sjnjfgb", "qrlqgvc", "fgvoadm", "yohsrxw", "udpvrsr", "mklucgt"}, "vklikgf"));
		Assert.assertEquals(2, grafic.selectWord(new String[] {"cat", "cab", "lab"}, "lag"));
		Assert.assertEquals(-1, grafic.selectWord(new String[] {"cat", "cab", "lab"}, "bic"));
		Assert.assertEquals(1, grafic.selectWord(new String[] {"abc", "abb", "def", "xyz"}, "aeb"));
		Assert.assertEquals(30, grafic.selectWord(new String[] {"zhadjsg", "vzptftx", "fbaslxs", "ejejncm", "xpxkeae", "ixrrtzw", "ovctbzx", "sfzekhh", "lxzixjk", "jixdpik", "bkianck", "laclyin", "uqmdkfx", "dimswqo", "fojhetr", "grntrce", "obdtqwx", "bhojwcy", "zuuuvst", "mvqtoly", "aftmupx", "govuidx", "qklpret", "yptccki", "uxdnslh", "wudrusz", "uwxbvou", "ouytqun", "pjdexqe", "xraaqdw", "lxmoncl", "sjnjfgb", "qrlqgvc", "yohurxw", "mklucgt"}, "vkmoncl"));
		Assert.assertEquals(0, grafic.selectWord(new String[] {"ba", "ab"}, "aa"));
	}
}
