package com.lam.coder.topCoder;

import org.junit.*;

import com.lam.coder.topCoder.FizzBuzzTurbo;

@Ignore
public class FizzBuzzTurboTest {
	FizzBuzzTurbo fb;
	
	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzzTurbo();
	}

	@After
	public void tearDown() throws Exception {
		fb = null;
	}

	@Test
	public void testCounts() {
		Assert.assertArrayEquals(new long[] {1, 0, 0 }, fb.counts(1, 4));
		Assert.assertArrayEquals(new long[] {2, 1, 0 }, fb.counts(2, 6));
		Assert.assertArrayEquals(new long[] {4,2,2}, fb.counts(150, 165));
		Assert.assertArrayEquals(new long[] {72728, 36363, 18182 }, fb.counts(474747, 747474));
//		Assert.assertArrayEquals(new long[] , fb.counts(, ));
	}

    @Ignore
	@Test
	public void countsSystemTest() {
		Assert.assertArrayEquals( new long[] {1, 0, 0} 	, fb.counts(1, 4));
		Assert.assertArrayEquals( new long[] {2, 1, 0} 	, fb.counts(2, 6));
		Assert.assertArrayEquals( new long[] {4, 2, 2} 	, fb.counts(150, 165));
		Assert.assertArrayEquals( new long[] {72728, 36363, 18182} 	, fb.counts(474747, 747474));
		Assert.assertArrayEquals( new long[] {0, 0, 0} 	, fb.counts(1, 1));
		Assert.assertArrayEquals( new long[] {0, 0, 0} 	, fb.counts(2, 2));
		Assert.assertArrayEquals( new long[] {1, 0, 0} 	, fb.counts(3, 3));
		Assert.assertArrayEquals( new long[] {0, 1, 0} 	, fb.counts(10, 10));
		Assert.assertArrayEquals( new long[] {0, 0, 1} 	, fb.counts(15, 15));
		Assert.assertArrayEquals( new long[] {0, 0, 0} 	, fb.counts(29, 29));
		Assert.assertArrayEquals( new long[] {0, 0, 1} 	, fb.counts(30, 30));
		Assert.assertArrayEquals( new long[] {0, 0, 0} 	, fb.counts(31, 31));
		Assert.assertArrayEquals( new long[] {0, 1, 0} 	, fb.counts(40, 40));
		Assert.assertArrayEquals( new long[] {0, 0, 0} 	, fb.counts(47, 47));
		Assert.assertArrayEquals( new long[] {7506790733778563L, 3753395366889281L, 1876697683444641L}	, fb.counts(664219828511882442L, 692370293763552053L));
		Assert.assertArrayEquals( new long[] {256419927753996501L, 128209963876998250L, 64104981938499125L} 	, fb.counts(1, 961574729077486878L));
		Assert.assertArrayEquals( new long[] {258584198929486760L, 129292099464743380L, 64646049732371690L} 	, fb.counts(1, 969690745985575352L));
		Assert.assertArrayEquals( new long[] {248686065277530231L, 124343032638765116L, 62171516319382557L} 	, fb.counts(2, 932572744790738365L));
		Assert.assertArrayEquals( new long[] {251331664414485011L, 125665832207242506L, 62832916103621252L} 	, fb.counts(2, 942493741554318791L));
		Assert.assertArrayEquals( new long[] {254976354967490992L, 127488177483745496L, 63744088741872748L} 	, fb.counts(2, 956161331128091222L));
		Assert.assertArrayEquals( new long[] {244438574123456436L, 122219287061728218L, 61109643530864109L} 	, fb.counts(3, 916644652962961635L));
		Assert.assertArrayEquals( new long[] {240969252367419747L, 120484626183709874L, 60242313091854936L} 	, fb.counts(1, 903634696377824051L));
		Assert.assertArrayEquals( new long[] {266105899992345172L, 133052949996172586L, 66526474998086292L} 	, fb.counts(1, 997897124971294393L));
		Assert.assertArrayEquals( new long[] {245461623153040840L, 122730811576520420L, 61365405788260209L} 	, fb.counts(2, 920481086823903147L));
		Assert.assertArrayEquals( new long[] {257082166789304147L, 128541083394652074L, 64270541697326037L} 	, fb.counts(4, 964058125459890556L));
		Assert.assertArrayEquals( new long[] {248441003304585536L, 124220501652292768L, 62110250826146384L} 	, fb.counts(3, 931653762392195762L));
		Assert.assertArrayEquals( new long[] {254785198222200121L, 127392599111100061L, 63696299555550030L} 	, fb.counts(4, 955444493333250458L));
		Assert.assertArrayEquals( new long[] {37863246979264819L, 18931623489632410L, 9465811744816204L} 	, fb.counts(397478970173037155L, 539466146345280224L));
		Assert.assertArrayEquals( new long[] {99114750516908400L, 49557375258454200L, 24778687629227100L} 	, fb.counts(419288862274313963L, 790969176712720462L));
		Assert.assertArrayEquals( new long[] {168283924961824223L, 84141962480912112L, 42070981240456056L} 	, fb.counts(161780629001183449L, 792845347608024286L));
		Assert.assertArrayEquals( new long[] {2653549849542919L, 1326774924771459L, 663387462385730L} 	, fb.counts(434696931263743538L, 444647743199529483L));
		Assert.assertArrayEquals( new long[] {87534951195656774L, 43767475597828388L, 21883737798914193L} 	, fb.counts(321413177499911855L, 649669244483624756L));
		Assert.assertArrayEquals( new long[] {192363449123220002L, 96181724561610000L, 48090862280805001L} 	, fb.counts(139242337281418962L, 860605271493493969L));
		Assert.assertArrayEquals( new long[] {47861896789332845L, 23930948394666422L, 11965474197333212L} 	, fb.counts(167206637142521893L, 346688750102520063L));
		Assert.assertArrayEquals( new long[] {44564918158863712L, 22282459079431857L,11141229539715928L} 	, fb.counts(290368704958546069L,457487148054284990L));
		Assert.assertArrayEquals( new long[] {75501216726985022L,37750608363492511L,18875304181746255L} 	, fb.counts(359791099760826346L,642920662487020178L));
		Assert.assertArrayEquals( new long[] {50387553532843277L, 25193776766421638L, 12596888383210819L} 	, fb.counts(722912705312276976L, 911866031060439261L));
		Assert.assertArrayEquals( new long[] {7056197100334821L, 3528098550167410L, 1764049275083706L} 	, fb.counts(853427743008756103L, 879888482135011683L));
		Assert.assertArrayEquals( new long[] {13073513699607210L, 6536756849803605L, 3268378424901803L} 	, fb.counts(299387440688073929L, 348413117061600967L));
		Assert.assertArrayEquals( new long[] {155498311289211526L, 77749155644605762L, 38874577822302882L} 	, fb.counts(326580842749285661L, 909699510083828883L));
		Assert.assertArrayEquals( new long[] {197532209325125813L, 98766104662562906L, 49383052331281454L} 	, fb.counts(192441344361172571L, 933187129330394372L));
		Assert.assertArrayEquals( new long[] {119879243253544888L, 59939621626772444L, 29969810813386222L} 	, fb.counts(314629682787953603L, 764176844988746931L));
		Assert.assertArrayEquals( new long[] {8117109330169090L, 4058554665084545L, 2029277332542272L} 	, fb.counts(267545852315582004L, 297985012303716089L));
		Assert.assertArrayEquals( new long[] {72468107634509831L, 36234053817254916L, 18117026908627457L} 	, fb.counts(142081782556603160L, 413837186186015024L));
		Assert.assertArrayEquals( new long[] {7506790733778563L, 3753395366889281L, 1876697683444641L} 	, fb.counts(664219828511882442L, 692370293763552053L));
		Assert.assertArrayEquals( new long[] {102223016157634008L, 51111508078817004L, 25555754039408502L} 	, fb.counts(378563365237109259L, 761899675828236788L));
		Assert.assertArrayEquals( new long[] {117090946762529467L, 58545473381264734L, 29272736690632367L} 	, fb.counts(49151622844844413L, 488242673204329915L));
		Assert.assertArrayEquals( new long[] {56754129977033208L, 28377064988516604L, 14188532494258302L} 	, fb.counts(306007182394072344L, 518835169807946873L));
		Assert.assertArrayEquals( new long[] {75543065656807469L, 37771532828403734L, 18885766414201868L} 	, fb.counts(195616889028066345L, 478903385241094354L));
		Assert.assertArrayEquals( new long[] {148977818222983923L, 74488909111491961L, 37244454555745980L} 	, fb.counts(67445786431842557L, 626112604768032264L));
		Assert.assertArrayEquals( new long[] {101201143583464288L, 50600571791732144L, 25300285895866072L} 	, fb.counts(101238876615718648L, 480743165053709728L));
		Assert.assertArrayEquals( new long[] {88766483741812758L, 44383241870906379L, 22191620935453190L} 	, fb.counts(82451605275412784L, 415325919307210627L));
		Assert.assertArrayEquals( new long[] {43832317893602511L, 21916158946801256L, 10958079473400627L} 	, fb.counts(208223567685839269L, 372594759786848683L));
		Assert.assertArrayEquals( new long[] {24650702053104198L, 12325351026552099L, 6162675513276050L} 	, fb.counts(838740078257909273L, 931180210957050015L));
		Assert.assertArrayEquals( new long[] {64846527457792213L, 32423263728896107L, 16211631864448053L} 	, fb.counts(252361299542933329L, 495535777509654126L));
		Assert.assertArrayEquals( new long[] {33479855923796770L, 16739927961898385L, 8369963980949192L} 	, fb.counts(709302378159832689L, 834851837874070572L));
		Assert.assertArrayEquals( new long[] {11046538730895138L, 5523269365447568L, 2761634682723784L} 	, fb.counts(487924215477189966L, 529348735718046729L));
		Assert.assertArrayEquals( new long[] {121464874150212648L, 60732437075106324L, 30366218537553162L} 	, fb.counts(21857780802393468L, 477351058865690896L));
		Assert.assertArrayEquals( new long[] {148198346715717935L, 74099173357858967L, 37049586678929484L} 	, fb.counts(186632354130213084L, 742376154314155338L));
		Assert.assertArrayEquals( new long[] {102675663716026048L, 51337831858013025L, 25668915929006512L} 	, fb.counts(539640619758087395L, 924674358693185075L));
		Assert.assertArrayEquals( new long[] {12126239760394474L, 6063119880197237L, 3031559940098619L} 	, fb.counts(700317928484694715L, 745791327586173994L));
		Assert.assertArrayEquals( new long[] {59664113491536728L, 29832056745768364L,  14916028372884182L} 	, fb.counts(13173508402927929L,  236913933996190656L));
		Assert.assertArrayEquals( new long[] {18944273951745733L,  9472136975872866L,  4736068487936434L} 	, fb.counts(668230156617098997L,  739271183936145495L));
		Assert.assertArrayEquals( new long[] {107804796651847937L,  53902398325923968L,  26951199162961985L} 	, fb.counts(479061995247225973L,  883329982691655739L));
		Assert.assertArrayEquals( new long[] {136653656062590639L,  68326828031295320L,  34163414015647660L} 	, fb.counts(254595297271140395L,  767046507505855292L));
		Assert.assertArrayEquals( new long[] {70438589152811372L,  35219294576405686L,  17609647288202842L} 	, fb.counts(662315051377427551L,  926459760700470193L));
		Assert.assertArrayEquals( new long[] {9262942439480222L,  4631471219740110L,  2315735609870056L} 	, fb.counts(279550177551909522L,  314286211699960353L));
		Assert.assertArrayEquals( new long[] {94854444512288924L,  47427222256144462L,  23713611128072231L} 	, fb.counts(63524787742327251L,  419228954663410715L));
		Assert.assertArrayEquals( new long[] {46788527809518766L,  23394263904759383L,  11697131952379691L} 	, fb.counts(474896471944502178L,  650353451230197547L));
		Assert.assertArrayEquals( new long[] {24889561509269519L,  12444780754634760L,  6222390377317379L} 	, fb.counts(502596589167164656L,  595932444826925350L));
		Assert.assertArrayEquals( new long[] {39203727505258230L,  19601863752629115L,  9800931876314557L} 	, fb.counts(560240637400990012L,  707254615545708373L));
		Assert.assertArrayEquals( new long[] {22786915665669626L,  11393457832834813L,  5696728916417406L} 	, fb.counts(59447034043076949L,  144897967789338044L));
		Assert.assertArrayEquals( new long[] {20135107100794212L,  10067553550397106L,  5033776775198553L} 	, fb.counts(510327613223700161L,  585834264851678456L));
		Assert.assertArrayEquals( new long[] {28629849953778529L,  14314924976889265L,  7157462488444632L} 	, fb.counts(669372155538435004L,  776734092865104488L));
		Assert.assertArrayEquals( new long[] {16164630239276404L,  8082315119638202L,  4041157559819101L} 	, fb.counts(395501921694716987L,  456119285092003500L));
		Assert.assertArrayEquals( new long[] {76784586287101738L,  38392293143550869L,  19196146571775435L} 	, fb.counts(151606123488146145L,  439548322064777662L));
		Assert.assertArrayEquals( new long[] {239088930764054L,  119544465382027L,  59772232691013L} 	, fb.counts(996287155999621052L,  997183739489986253L));
		Assert.assertArrayEquals( new long[] {266666666666666667L,  133333333333333334L,  66666666666666666L} 	, fb.counts(1L,  1000000000000000000L));
		Assert.assertArrayEquals( new long[] {266400000000000000L,  133200000000000001L,  66600000000000000L} 	, fb.counts(1000000000000000L,  1000000000000000000L));
		Assert.assertArrayEquals( new long[] {266666666666666664L,  133333333333333332L,  66666666666666666L} 	, fb.counts(1L,  999999999999999990L));
		Assert.assertArrayEquals( new long[] {26666666666666667L,  13333333333333334L,  6666666666666666L} 	, fb.counts(1L,  100000000000000000L));
		Assert.assertArrayEquals( new long[] {266666666667L,  133333333334L,  66666666666L} 	, fb.counts(1L,  1000000000000L));
		Assert.assertArrayEquals( new long[] {2666666666667L,  1333333333334L,  666666666666L} 	, fb.counts(1L,  10000000000000L));
		Assert.assertArrayEquals( new long[] {266666666666666663L,  133333333333333332L,  66666666666666666L} 	, fb.counts(15L,  1000000000000000000L));
		Assert.assertArrayEquals( new long[] {329218104032922L,  164609052016461L,  82304526008230L} 	, fb.counts(3L,  1234567890123456L));
		Assert.assertArrayEquals( new long[] {266666666666666662L,  133333333333333331L,  66666666666666666L} 	, fb.counts(7L,  999999999999999991L));
		Assert.assertArrayEquals( new long[] {2666666666666667L,  1333333333333334L,  666666666666666L} 	, fb.counts(1L,  10000000000000000L));
		Assert.assertArrayEquals( new long[] {26666666667L,  13333333334L,  6666666666L} 	, fb.counts(2L,  100000000000L));
		Assert.assertArrayEquals( new long[] {4938271564938271L,  2469135782469136L,  1234567891234567L} 	, fb.counts(5L,  18518518368518518L));
		Assert.assertArrayEquals( new long[] {1L,  0L,  0} 	, fb.counts(150000000000000003L,  150000000000000003L));
		Assert.assertArrayEquals( new long[] {266666667L,  133333334L,  66666666} 	, fb.counts(1L,  1000000000));
		Assert.assertArrayEquals( new long[] {26666666667L,  13333333334L,  6666666666L} 	, fb.counts(1L,  100000000000L));
		Assert.assertArrayEquals( new long[] {266666666666667L,  133333333333334L,  66666666666666L} 	, fb.counts(1L,  1000000000000000L));
		Assert.assertArrayEquals( new long[] {266666666666L,  133333333334L,  66666666667L} 	, fb.counts(1000000000000L,  2000000000000L));
		Assert.assertArrayEquals( new long[] {266666666666666667L,  133333333333333333L,  66666666666666666L} 	, fb.counts(1L,  999999999999999999L));
		Assert.assertArrayEquals( new long[] {2399999999999996L,  1199999999999998L,  600000000000000L} 	, fb.counts(15L,  9000000000000000L));
		Assert.assertArrayEquals( new long[] {26666666666667L,  13333333333334L,  6666666666666L} 	, fb.counts(1L,  100000000000000L));
		Assert.assertArrayEquals( new long[] {66708726798666272L,  33354363399333136L,  16677181699666569L} 	, fb.counts(15L,  250157725494998535L));
		Assert.assertArrayEquals( new long[] {266666666666666663L,  133333333333333332L,  66666666666666665L} 	, fb.counts(17L,  1000000000000000000L));
		Assert.assertArrayEquals( new long[] {2666666667L,  1333333334L,  666666666} 	, fb.counts(1L,  10000000000L));
		Assert.assertArrayEquals( new long[] {32921810432922L,  16460905216461L,  8230452608230L} 	, fb.counts(1L,  123456789123456L));
		Assert.assertArrayEquals( new long[] {1L,  0L,  0} 	, fb.counts(7L,  9));
		Assert.assertArrayEquals( new long[] {2666664000L,  1333332001L,  666666000} 	, fb.counts(10000L,  10000000000L));
		Assert.assertArrayEquals( new long[] {263374485863374484L,  131687242931687242L,  65843621465843621L} 	, fb.counts(7L,  987654321987654321L));
		Assert.assertArrayEquals( new long[] {26666666666666667L,  13333333333333333L,  6666666666666666L} 	, fb.counts(1L,  99999999999999999L));
		Assert.assertArrayEquals( new long[] {296296296296296L,  148148148148148L,  74074074074074L} 	, fb.counts(1L,  1111111111111111L));
		Assert.assertArrayEquals( new long[] {1775111111111111L,  887555555555556L,  443777777777778L} 	, fb.counts(10000000000000L,  6666666666666666L));
		Assert.assertArrayEquals( new long[] {6L,  2L,  1} 	, fb.counts(21L,  39));
		Assert.assertArrayEquals( new long[] {1066666666666L,  533333333334L,  266666666667L} 	, fb.counts(1000000000000L,  5000000000000L));
		Assert.assertArrayEquals( new long[] {1L,  1L,  0} 	, fb.counts(3L,  5));
		Assert.assertArrayEquals( new long[] {0L,  0L,  1} 	, fb.counts(15L,  16));
		Assert.assertArrayEquals( new long[] {2L,  1L,  0} 	, fb.counts(3L,  7));
		Assert.assertArrayEquals( new long[] {5L,  3L,  2} 	, fb.counts(15L,  35));
		Assert.assertArrayEquals( new long[] {266637007048530015L,  133318503524265007L,  66659251762132504L} 	, fb.counts(1234567890L,  999888777666555444L));
		Assert.assertArrayEquals( new long[] {22909411693383280L,  11454705846691640L,  5727352923345820L} 	, fb.counts(5546L,  85910293850192845L));
		Assert.assertArrayEquals( new long[] {266666666666666667L,  133333333333333334L,  66666666666666666L} 	, fb.counts(3L,  1000000000000000000L));
		Assert.assertArrayEquals( new long[] {4L,  2L,  1} 	, fb.counts(1L,  15));
		Assert.assertArrayEquals( new long[] {13333L,  6667L,  3334} 	, fb.counts(10000000000000L,  10000000050000L));
		Assert.assertArrayEquals( new long[] {240000000000000000L,  120000000000000001L,  60000000000000000L} 	, fb.counts(100000000000000000L,  1000000000000000000L));
		Assert.assertArrayEquals( new long[] {4, 2, 2} 	, fb.counts(15, 31));
		Assert.assertArrayEquals( new long[] {4, 2, 2} 	, fb.counts(30, 46));
		Assert.assertArrayEquals( new long[] {2, 1, 0} 	, fb.counts(3, 8));
		Assert.assertArrayEquals( new long[] {1888324693280476L, 944162346640238L, 472081173320119L} 	, fb.counts(351435665634543L, 7432653265436326L));
		Assert.assertArrayEquals( new long[] {266666666666666667L, 133333333333333334L, 66666666666666666L} 	, fb.counts(2, 1000000000000000000L));
		Assert.assertArrayEquals( new long[] {1, 1, 0} 	, fb.counts(10, 12));
		Assert.assertArrayEquals( new long[] {1, 1, 1} 	, fb.counts(10, 15));
		Assert.assertArrayEquals( new long[] {266640000000000001L, 133320000000000000L, 66660000000000000L} 	, fb.counts(99999999999999L, 999999999999999999L));
		Assert.assertArrayEquals( new long[] {1, 0, 0} 	, fb.counts(3, 4));
		Assert.assertArrayEquals( new long[] {4, 2, 1} 	, fb.counts(15, 29));
		Assert.assertArrayEquals( new long[] {4, 2, 2} 	, fb.counts(14, 31));
		Assert.assertArrayEquals( new long[] {1, 0, 1} 	, fb.counts(15, 18));
		Assert.assertArrayEquals( new long[] {1, 0, 1} 	, fb.counts(222, 225));
		Assert.assertArrayEquals( new long[] {3, 2, 0} 	, fb.counts(1, 11));
		Assert.assertArrayEquals( new long[] {1, 1, 0} 	, fb.counts(4, 6));
		Assert.assertArrayEquals( new long[] {80000000000000000L, 40000000000000000L, 20000000000000000L} 	, fb.counts(2, 300000000000000000L));
		Assert.assertArrayEquals( new long[] {89657454476667872L, 44828727238333936L, 22414363619166967L} 	, fb.counts(1242543221516688L, 337457997509021202L));
		Assert.assertArrayEquals( new long[] {2666666666666701L, 1333333333333350L, 666666666666675L} 	, fb.counts(1, 10000000000000129L));
		Assert.assertArrayEquals( new long[] {142, 71, 36} 	, fb.counts(2119855817433555L, 2119855817434086L));
	}

}
