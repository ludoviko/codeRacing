package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.Rochambo;

public class RochamboTest {
	Rochambo rochambo;
	
	@Before
	public void setUp() throws Exception {
		rochambo = new Rochambo();
	}

	@After
	public void tearDown() throws Exception {
		rochambo = null;
	}

	@Test
	public void testWins() {
		Assert.assertEquals(1, rochambo.wins("PS"));
		Assert.assertEquals(3, rochambo.wins("PSRRPS"));
		Assert.assertEquals(7, rochambo.wins("PSRPSRPRSR"));
		Assert.assertEquals(16, rochambo.wins("SRPSRPSPRSPRPSRPSRP"));
		Assert.assertEquals(18, rochambo.wins("RPPPRRPSSSRRRSRSPPSSPRRPSRRRRSPPPPSSPSSSSSRSSSRPRR"));
	}
	
	@Test
	public void winsSystemTest() {
		Assert.assertEquals(1, rochambo.wins("PS"));
		Assert.assertEquals(3, rochambo.wins("PSRRPS"));
		Assert.assertEquals(7, rochambo.wins("PSRPSRPRSR"));
		Assert.assertEquals(16, rochambo.wins("SRPSRPSPRSPRPSRPSRP"));
		Assert.assertEquals(18, rochambo.wins("RPPPRRPSSSRRRSRSPPSSPRRPSRRRRSPPPPSSPSSSSSRSSSRPRR"));
		Assert.assertEquals(14, rochambo.wins("SRPPPRPSPSPSSPPRPPRRPSRRRSSSRRRSRPPPRRPSSRSSSRSRPR"));
		Assert.assertEquals(20, rochambo.wins("RPPSPRPPRRRSSRSPSPSPSRRRRSPPRRRSPRSPRSSSSPPRPSPRSP"));
		Assert.assertEquals(20, rochambo.wins("SRSSSRSRSRPSPSRRSSRPSSSSRPRSRRRRSRSSSSRSRPSRPRPRPS"));
		Assert.assertEquals(16, rochambo.wins("PRRSSRSSSSSPRPPSSPSRPRRRPPSRRRSPPRRPRSPSPRSPPRRSRP"));
		Assert.assertEquals(11, rochambo.wins("PPPSPPSSPRPPSRRPSSSPPRSSSPSPSSRSSPPRPPSSSSPRPRRRPR"));
		Assert.assertEquals(19, rochambo.wins("SRRPRSPSRSRPRSPSPSPRSPSRPPRRRSRRPSSRRSPSPPRPSPPPPP"));
		Assert.assertEquals(17, rochambo.wins("RSPRPPPPRRSRRPPRPSPSRSSPRPSSSRRSRPPSPPRPSPRSSSRRRR"));
		Assert.assertEquals(14, rochambo.wins("RRPRSSRRSSPRSRSRPPRPSSPSPPRSPRSSPSPPRSRRSPSRRRSRPP"));
		Assert.assertEquals(15, rochambo.wins("PRSSRRSSSRSRSSSPPRSPPRSRRPPPPSPRSPPRRRSRSPRRSPPSPS"));
		Assert.assertEquals(19, rochambo.wins("SPPSPRRSPRRRRSPSSRSPRPRSRRRPPPSSSSSRRSRPRRRSRPRSSP"));
		Assert.assertEquals(19, rochambo.wins("SRRSPPPSSSPRRRPRRRPRPSRRPRPPPSRSSPPPPSRSPRSPPSPPPS"));
		Assert.assertEquals(18, rochambo.wins("SRRPPPRSSSRRRSPPRRRRRRSSRSSSRPRSRSPRPPRSRRRSRRSPSP"));
		Assert.assertEquals(13, rochambo.wins("RRPPSPPSSRSSRRRPSRRSPPSPSPRPRSSPRSSRRRSRSSPRSRPSPP"));
		Assert.assertEquals(17, rochambo.wins("RPSPSPRSPSRSRRRRSPSPSRRSPSRSSRPRRSSSRSPRRSRPPSPRPR"));
		Assert.assertEquals(15, rochambo.wins("SRSPPPSSRPRPPPSRSRSSPRPRSRRRRSRPSPSSRSPPSPPSRSPPSP"));
		Assert.assertEquals(16, rochambo.wins("SSRRSPRPPSSSRPSRRPPSSPPPSPRRSRSRPSSPSSSRRPPSSRRRRR"));
		Assert.assertEquals(20, rochambo.wins("PSPRPPSRPSSPPPRSSSSRPRRPSRSSRSSRRRRRPSSPRPRSRSPPPR"));
		Assert.assertEquals(13, rochambo.wins("RRSSRRRPRRRSRPRSRSPRPRRRPRSRPPRRRSSRSSRRSRRSSPRRRR"));
		Assert.assertEquals(16, rochambo.wins("SSPRRPSSSSSRPSSSRPRSSPPSPSPSPPSPPSRPRPRRSRRSRPRPSS"));
		Assert.assertEquals(14, rochambo.wins("SPRPPRRSSPSRSPRRSSSPPRRSRRRSPRSPRPPRRSSRRSRRSPSSPR"));
		Assert.assertEquals(19, rochambo.wins("RRRRRRRRPSPSSPSPRRSPRPSPSRRPPPRSRSRPSSPRPRPSSSPSSP"));
		Assert.assertEquals(18, rochambo.wins("RPPSRRPSPSRPRPRRSRPSSPSSRPSRPPSPSSPPPRSRPSRSPRPPPR"));
		Assert.assertEquals(11, rochambo.wins("PSRRPPRPRSRRSSPPRRSSPRPSRRSSRSRSPRPPSPRRPRPPPPRPRR"));
		Assert.assertEquals(18, rochambo.wins("RRRPPPPRSSRSSSRRSRSSPPPSPRSRPRPRSPRSRRRSSSSPPRSPPS"));
		Assert.assertEquals(16, rochambo.wins("SRPRPRRSPSRSPSPPRPRRRPPPSRPPSSPPRSPPPSRSSRRRSPSRSR"));
		Assert.assertEquals(17, rochambo.wins("SRRSPPRPSSRPRPSSSPRSPSSSPSPPPSPSSRRPSRRRSSPPRPRSPR"));
		Assert.assertEquals(14, rochambo.wins("RSRRSPPRPPSPRSSPSPPPSSPPSSRRPSSSSRSPSPRPPRSRSPPPPS"));
		Assert.assertEquals(18, rochambo.wins("PRRSRPPSRSRPSSPRPPSPPSPSRRPRSPSRSRRSPRPPPSSSSSSSRP"));
		Assert.assertEquals(14, rochambo.wins("SRRSSPPSPPRSPSPPSSPRPRPSSRRRRSRPSSRSPPPPPSPRPRRPPR"));
		Assert.assertEquals(19, rochambo.wins("PPPSPRPRSSPRRPRPRSRPPRSSSSSRPSPRSRSRSPSRSSRPSPPSRR"));
		Assert.assertEquals(17, rochambo.wins("PPRRPSSPPPPSRSPRSRSSRPSRPRRRPRRSRPSSPPRRSPRRPRSRSR"));
		Assert.assertEquals(12, rochambo.wins("PRSSPSSPSRSPPSPPRRSSPRRSPPPRRPSPSSRPPSPPPPPSPSSRRR"));
		Assert.assertEquals(14, rochambo.wins("SSSPPSSRRSSPRRSPSRSRSRRSRSPPRSSRRSPSPPPSPRRRRSSPRP"));
		Assert.assertEquals(13, rochambo.wins("RRSPSSRRPPRPRSPRRRSRRPSSPSRSPPPSRSSRPSSRRSSRSSSRRS"));
		Assert.assertEquals(20, rochambo.wins("SSSPPRPSSRPPSSPRRRPRSRPRSPRSRRRPRPRRSSSSSSRSSRRPSR"));
		Assert.assertEquals(12, rochambo.wins("RRPPPSPSSPPRRPPSRPPRSRPSRSSPSPRPSPPRPSPSSPPSRRPSPP"));
		Assert.assertEquals(17, rochambo.wins("PSPSPRSSRSSSRSRSSPRPRRSPPSSPPPPSRPSRRPPPRRSPRPRSPP"));
		Assert.assertEquals(13, rochambo.wins("RPPSSRRRSSRRPPSSPSPRRSPPSRRPRSPRSPPRSRPPRRRSSSRRPR"));
		Assert.assertEquals(22, rochambo.wins("SSSRRRSSSSSRPRSSSRRRPRSSRRRSSPSPSRSSSSSPSSSPRSPPPS"));
		Assert.assertEquals(19, rochambo.wins("SRPSPPSSSSPRRPSPPRPRSSSSRSPRRPRRSRPRPSPSRPRPRSRPRS"));
		Assert.assertEquals(13, rochambo.wins("RPSSPRPSSPPSPPRSSSRSSPSRRSPSSSPPSPPSPRSPRPRRRSRRPR"));
		Assert.assertEquals(18, rochambo.wins("RRSSSSRRPPPSRRSPRRSPRPRSPRPRRPRRSSSPPPPPPSRPRRPPRR"));
		Assert.assertEquals(16, rochambo.wins("RRRSRRSRPSRSRPSRPPSRSRSRRRRSSRSSRRPSPRSRRSSPSRPRRP"));
		Assert.assertEquals(15, rochambo.wins("SRSRPRSRRRPPSSPSPRSSRSSRPPPSRPPSSSSRSRSRPRPSPRPRPR"));
		Assert.assertEquals(12, rochambo.wins("RRSSPSPRSSPSSPSRRPRRPSSRSRPRPSSSRSSPSRSPPSPSPRSPSS"));
		Assert.assertEquals(16, rochambo.wins("PPSSSSPRSSSRPSPSPPPPSPPRRSPSSRPRRSPRRPRSSSPPRPPSPR"));
		Assert.assertEquals(12, rochambo.wins("SPSRRRSSRRPRPPSRRPSPRSSPPRRSSSRPSPPSSRPPRRPRSSPSSR"));
		Assert.assertEquals(18, rochambo.wins("RRSPRRRRRPSRRSRSRPRPSSSRSRSPSPPPRSPPRSSPPRPSSRPSPP"));
		Assert.assertEquals(22, rochambo.wins("SPSSRSPRPRSPRRSSSPRRPSPPPPSRPPPRSPPPPSPRRPPPPRPRPS"));
		Assert.assertEquals(18, rochambo.wins("SRRPRSPRSRSPSRRRPPPSSRSRPSSSPRSRRSSRPPRPPRPRSSSPSR"));
		Assert.assertEquals(15, rochambo.wins("RSSRSRSSSSPRSPRPRRPPPSRSRRPSPPSRRPRSPSRRPPRPSPSPSS"));
		Assert.assertEquals(19, rochambo.wins("SPRRSPRRSSSRRSPPSPSRPRSSSPPSPSRRRSSSPRSRPPSRPSPSPP"));
		Assert.assertEquals(16, rochambo.wins("RPRSRSRSSSPPRRSRPRRRPSPPSPPRSPSRSSSRSRSPRRRRRRPPPS"));
		Assert.assertEquals(19, rochambo.wins("PRSRRRPRSPPPSPPSRRRSRRRRPSPPPPPRRSPRRRPPRRPPSPRPSR"));
		Assert.assertEquals(15, rochambo.wins("PPSRSRPPRSRRSRPPSPRRSRPRPSRRRPRPRRRPPRSSPPPSPRSRSP"));
		Assert.assertEquals(14, rochambo.wins("PRRRRSSRSRPSSSSPPPPSPPSRPRRPPPPRPSSRRPSSPPSSPSPSPP"));
		Assert.assertEquals(17, rochambo.wins("PPPPRPSRRPPPPSRRSRSPRRRRPRSSPSPPRPSPPRRSRRPRRPSRPS"));
		Assert.assertEquals(20, rochambo.wins("SSRRSRPSPRSSPPSSPSPRRRPRPPSSPRSPPSRRPRRRPSRSPRSRPS"));
		Assert.assertEquals(21, rochambo.wins("PSRPSPRRRSSRPPPRSSPRSPPPPPSPPRPRPSRRRRSSRSSRPPRSRR"));
		Assert.assertEquals(17, rochambo.wins("RPPRPPRRRSPRRRSPPPRPSSSRRPSPPSRSRRPSSPRSRSRPSSPRSR"));
		Assert.assertEquals(14, rochambo.wins("SRPSSPPSRPPPSSSPSPPSPPSRSRSSSPSRRSPSSSRPRRPPRRPRPS"));
		Assert.assertEquals(18, rochambo.wins("PSPRPPPSRRPPPSRPPSRSPRRRPSSRRRPRSPSSPSRSSSSPSPSPPS"));
		Assert.assertEquals(16, rochambo.wins("PPPRPSSRSPSPRSPRSPPSPPSSSRRRSPSPSPPRRRPSPRPRPRRPPP"));
		Assert.assertEquals(13, rochambo.wins("PPRSSRPSRSSRPRSRSSRSRRSSSPSSPPSPRRPPSPRPSPPSRRRRSR"));
		Assert.assertEquals(18, rochambo.wins("SPPRSSSRSRRPSSSRPRRPSRPSRSSSPRPPPSRRSRPRRPRSRRRPRP"));
		Assert.assertEquals(10, rochambo.wins("SRSRRSRPRRPPRSSSSRRRPRRSSRSSPPPSRRPRRSRSRSRSRPPRSS"));
		Assert.assertEquals(13, rochambo.wins("RPSPSRPRSSRSPPSSRRSPSPPPSPSSPPPPRRPPRSRRSSPSSRSPRS"));
		Assert.assertEquals(14, rochambo.wins("PPRSSRPSRRSSSPSRPPRSRRSPRSPSPPRPPPRPRRPPRRRSRSRSSP"));
		Assert.assertEquals(15, rochambo.wins("RPSRPPSSRRSSSSSPPPPRPPRRSRRRPRSSRPRRPRPSRSRRSSSRPR"));
		Assert.assertEquals(20, rochambo.wins("SSSRRSSSPRSSSRSPPRPSRRRSPPPRSRPRRPPRRRRRPPSPRPRRRS"));
		Assert.assertEquals(21, rochambo.wins("RPSPPPPSRRSPRPRSPRPSRSRSSRPSRSPPRSPPSRRPPSRRRRSSPS"));
		Assert.assertEquals(18, rochambo.wins("SPSSSSRPPSRPPPSRRPRPPPPPSSRPRRSSRSSRSRRRRRPSRPPSSP"));
		Assert.assertEquals(22, rochambo.wins("PSSSPPSRPPSSPRSPRSPRRSPRSRRRPRPPPPRRSSPPRRRPSSSSPR"));
		Assert.assertEquals(16, rochambo.wins("PSRRSSSRSRPRRSRSRRRPPSSRRPPSRRRRSPRSPSRPSPPSPPSPSR"));
		Assert.assertEquals(14, rochambo.wins("RRPRPPRPPPPSSPSPSSSPSRPSSRSPPPSRSPRPPRPRRSRPSRRSRR"));
		Assert.assertEquals(19, rochambo.wins("RRPPSRPPPRSRPPRPSRSRPPPRSRRSPSRPPRRPSRSPPPSPRRPPPS"));
		Assert.assertEquals(16, rochambo.wins("RSPPPSRPSRRRPPSSPPSPRRSPRPSPPPRPPPRSRSSRRSRRRPRRPP"));
		Assert.assertEquals(13, rochambo.wins("SRSSSSSRRPRPSPRRPRRRPRPPRPSSPSSRSRPSRRSSRRSRSPSPPP"));
		Assert.assertEquals(21, rochambo.wins("RSSRRRSPRPRSRPSSPSPPPSRRSRRPRSPPPSPPPSPRSSSSPPPPPP"));
		Assert.assertEquals(15, rochambo.wins("PRPPRRSRPPSPPSPRPPRPPPPSRRPRRPSRSSSPPPSRRRRPSRPPSP"));
		Assert.assertEquals(18, rochambo.wins("RSRPPPSSSPRSPRRRSSPPRSRRPRSPSPPPRSSRRSSRPRRPSPRRSP"));
		Assert.assertEquals(21, rochambo.wins("PRSSPPPRSPPRPPSRRPSRRRRSPPRRPRSPRPSPSRSPRPPRSSSPRS"));
		Assert.assertEquals(21, rochambo.wins("RSRPSRPSPPRPRSRSSPPRRRRSSSSRPPRSPRSPSRPPSSPSRSPSPS"));
		Assert.assertEquals(13, rochambo.wins("SRRPPSSRSPSRRRRSPSRRSRPPSPPSRRPSSSPPSPSSPPPSSPPSPR"));
		Assert.assertEquals(13, rochambo.wins("SSPSPPSRRPPSSRPRSSRRPSRSSPSSRSSSSSPPRSSPPPSPSRSSPP"));
		Assert.assertEquals(18, rochambo.wins("PPPRRSRPPRSPSPPSPSPSPRPRSPPRRRRSRPSSSSSRSRPSRSSSRR"));
		Assert.assertEquals(14, rochambo.wins("SRRSRSSPRPPPSSRSPSRSPPRRPSPPPRSSSPPPRSSPPSSRPSSPPS"));
		Assert.assertEquals(18, rochambo.wins("SPRRPPRRSSPSSPRSRRRSRPPRRRPSSRPPSPPPSRPRPSRRRRPSPR"));
		Assert.assertEquals(22, rochambo.wins("RRSSSSSRPPPRSPPPRPPPPSPRRPPRRRRRPRRPPPRSPPPPPPRSSP"));
		Assert.assertEquals(15, rochambo.wins("SRSPRSSRRPRSSRRRRSSSPRRPRRSPPSSSPPSSPPRRPSPRRRPRRR"));
		Assert.assertEquals(16, rochambo.wins("RSRSRPRRSRPRPPPSRRPPPRSSPSPSRPPRPPPSSSSPRPSSSRPRRS"));
		Assert.assertEquals(23, rochambo.wins("SRPSRRSRPSRPRSPRPSRRSSRSSRPRPPSSRPPPPSPRPSRPPSRPPR"));
		Assert.assertEquals(11, rochambo.wins("PPRRSRSRSPRPRSRPSPPPPSPSPSSPPRPSPSSRRSRPRPSPPSSPRR"));
		Assert.assertEquals(8, rochambo.wins("SRSRRPRPSRSSPPSSPPRRRSRSRPRPRSSRRRSRRPSSRRSRSRSRRS"));
		Assert.assertEquals(15, rochambo.wins("PSSRSSSRSRSRRPPPPSPRPSSPRPSRPPSRPRPSSPPSRRSSRRSPSS"));
	}
}
