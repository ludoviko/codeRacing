package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.BloggoShortcuts;

public class BloggoShortcutsTest {
	BloggoShortcuts cut;
	
	@Before
	public void setUp() throws Exception {
		cut = new BloggoShortcuts();
	}

	@After
	public void tearDown() throws Exception {
		cut = null;
	}

	@Test
	public void testExpand() {
		Assert.assertEquals("", cut.expand(""));
		Assert.assertEquals("You <i>should</i> see the new walrus at the zoo!", cut.expand("You _should_ see the new walrus at the zoo!"));
		Assert.assertEquals("Move it from <b>Accounts Payable</b> to <b>Receiving</b>.", cut.expand("Move it from *Accounts Payable* to *Receiving*."));
		Assert.assertEquals("I saw <i>Chelydra serpentina</i> in <b>Centennial Park</b>.", cut.expand("I saw _Chelydra serpentina_ in *Centennial Park*."));
		Assert.assertEquals(" <i> </i> <i></i>  <i> yabba dabba </i>   <b>  dooooo  </b> <b></b><b></b>", cut.expand(" _ _ __  _ yabba dabba _   *  dooooo  * ****"));
		Assert.assertEquals("<i>now</i>I<i>know</i><b>my</b><i>ABC</i>next<i>time</i><b>sing</b>it<i>with</i>me", cut.expand("_now_I_know_*my*_ABC_next_time_*sing*it_with_me"));
	}
	
	@Test
	public void testExpandSystemTest() {
		Assert.assertEquals("You <i>should</i> see the new walrus at the zoo!", cut.expand("You _should_ see the new walrus at the zoo!"));
		Assert.assertEquals("Move it from <b>Accounts Payable</b> to <b>Receiving</b>.", cut.expand("Move it from *Accounts Payable* to *Receiving*."));
		Assert.assertEquals("I saw <i>Chelydra serpentina</i> in <b>Centennial Park</b>.", cut.expand("I saw _Chelydra serpentina_ in *Centennial Park*."));
		Assert.assertEquals(" <i> </i> <i></i> <i> yabba dabba </i> <b> dooooo </b> <b></b><b></b>", cut.expand(" _ _ __ _ yabba dabba _ * dooooo * ****"));
		Assert.assertEquals("<i>now</i>I<i>know</i><b>my</b><i>ABC</i>next<i>time</i><b>sing</b>it<i>with</i>me", cut.expand("_now_I_know_*my*_ABC_next_time_*sing*it_with_me"));
		Assert.assertEquals("<b></b>XU<i>h</i>bm .o QnmNI Y<i> -!</i> x<i></i><i>i vf</i>i<b></b><b>VL</b> s<b></b>", cut.expand("**XU_h_bm .o QnmNI Y_ -!_ x___i vf_i***VL* s**"));
		Assert.assertEquals("O z s(P <i>I</i><b></b> <b></b><i></i>hA v?qcGGgNX<b></b><b>Fm LL</b>o <i>w</i><i>Mt </i>", cut.expand("O z s(P _I_** **__hA v?qcGGgNX***Fm LL*o _w__Mt _"));
		Assert.assertEquals(" ThqV<b>i</b> a<b>E u-, Pa</b><i></i>yKp<i></i><b>c e </b><b></b><b>FW</b>q<b></b><b>vb</b> )", cut.expand(" ThqV*i* a*E u-, Pa*__yKp__*c e ****FW*q***vb* )"));
		Assert.assertEquals("<i>ay</i>) pO<i></i> <i> </i>CqZ<i>N X</i><b> </b>. <b> bqw</b> HW<i>W</i><i></i> ig<i>.u</i>", cut.expand("_ay_) pO__ _ _CqZ_N X_* *. * bqw* HW_W___ ig_.u_"));
		Assert.assertEquals("s zL I <i> m</i><b></b>-?<b> </b> jC<i> </i><b></b><i>F dVOO</i> Z<i></i>-<i>.</i> co Px", cut.expand("s zL I _ m_**-?* * jC_ _**_F dVOO_ Z__-_._ co Px"));
		Assert.assertEquals(" t<i>PlC,</i> <i></i><i></i>l V); <b> </b>Sb<b> </b>N Oh<b></b>X <i>p</i><i>k T</i> h<i></i>", cut.expand(" t_PlC,_ ____l V); * *Sb* *N Oh**X _p__k T_ h__"));
		Assert.assertEquals("J-<b></b><i>K </i><i>v</i>ZBn<i>m </i><i></i>jD<i>p </i><i>k</i>S<b></b>qK CF<b>XO-t </b>(uRa", cut.expand("J-**_K __v_ZBn_m ___jD_p __k_S**qK CF*XO-t *(uRa"));
		Assert.assertEquals("t I<i>vc</i>m<i></i>rf<i></i> q? <i>st</i><b></b><i> p</i> -<b></b><b></b><i>O </i> ul <i> </i>", cut.expand("t I_vc_m__rf__ q? _st_**_ p_ -****_O _ ul _ _"));
		Assert.assertEquals("<i></i><b>xsi;</b>SN<b></b> <b>;J</b> a<i>s</i><b></b>L<i></i>C s u<b>iP </b> ei;K <i>x</i>", cut.expand("__*xsi;*SN** *;J* a_s_**L__C s u*iP * ei;K _x_"));
		Assert.assertEquals("l<b>;w</b>j<b>! ZIYOm</b><i></i>?ROco p<i>c y-</i><i></i>j<b>COE</b> WB <i>Ce Z</i>", cut.expand("l*;w*j*! ZIYOm*__?ROco p_c y-___j*COE* WB _Ce Z_"));
		Assert.assertEquals("<i>q</i><i>!</i><i>m.sAU P</i>PS TuE<i>. </i> <i></i><b> RR</b>n;oT,, V <b>l,.</b>f", cut.expand("_q__!__m.sAU P_PS TuE_. _ __* RR*n;oT,, V *l,.*f"));
		Assert.assertEquals(" H <i> T</i>E <i>;(d d </i><b>(gT</b>FWlZM<i>uF</i><b>V?</b><b>;E</b>B<i> </i> ; <b></b>", cut.expand(" H _ T_E _;(d d _*(gT*FWlZM_uF_*V?**;E*B_ _ ; **"));
		Assert.assertEquals("widq;<i>L</i> ElLCP<b>;</b><i> nQ</i> <b></b>J<b></b><b>NJJF ,(YQD?</b><i></i><b></b><i>q </i>", cut.expand("widq;_L_ ElLCP*;*_ nQ_ **J***NJJF ,(YQD?*__**_q _"));
		Assert.assertEquals(" cnfG!<i>ZtM XQ,</i>TcW<i>p</i>-! dYb<b> </b>CH<b>oj Sv;c</b>w<i></i>F K<i></i>", cut.expand(" cnfG!_ZtM XQ,_TcW_p_-! dYb* *CH*oj Sv;c*w__F K__"));
		Assert.assertEquals("qh ?W<i>R</i>q i<b></b><i>H! </i><b></b><i></i>V<i></i>Bj<b>RgprA</b>GUh <i></i> X<b> </b>K(j", cut.expand("qh ?W_R_q i**_H! _**__V__Bj*RgprA*GUh __ X* *K(j"));
		Assert.assertEquals("z<i>l</i> <i>gv</i>N <b>z</b> a <b>c </b>Yb J k<b></b>! E<i></i>J<i> c</i>Dr", cut.expand("z_l_ _gv_N *z* a *c *Yb J k**! E__J_ c_Dr"));
		Assert.assertEquals("T<i></i>l<b>ghj</b>v <b></b>k<i>eO)</i>I<b> R! .AR</b>W<b>Xj</b><i></i><i>B</i>T MQ<i></i> A", cut.expand("T__l*ghj*v **k_eO)_I* R! .AR*W*Xj*___B_T MQ__ A"));
		Assert.assertEquals("<b></b>eCSbPB<i></i>f<b></b><i>Z</i><b></b> iGgM ,<i>x</i> <i>pmWC A,</i><b></b> O<i>iIsY </i>", cut.expand("**eCSbPB__f**_Z_** iGgM ,_x_ _pmWC A,_** O_iIsY _"));
		Assert.assertEquals("<b></b>pf<i> </i><i>b( VR</i>Dxnq<i>; k k </i>RKsQx<i>Gl?</i><i></i><i>- w f</i> <b>?</b>", cut.expand("**pf_ __b( VR_Dxnq_; k k _RKsQx_Gl?____- w f_ *?*"));
		Assert.assertEquals("<b></b><i>eW </i>o F p<i>)CZ M K d , wmnfX</i><b>vP</b> Y<b> </b><i>!V z</i><b></b>", cut.expand("**_eW _o F p_)CZ M K d , wmnfX_*vP* Y* *_!V z_**"));
		Assert.assertEquals(" M<i> K</i> X<i></i>j<i>U</i>qD Aj<b>c</b>lAV)<i> EwgK</i><b>DWmW</b><b></b><i></i>", cut.expand(" M_ K_ X__j_U_qD Aj*c*lAV)_ EwgK_*DWmW***__"));
		Assert.assertEquals("<b></b>Gl <b></b>ye<i>YFM</i> <i> jBRTbNB</i><i>sm</i>f<b></b>QMr <b>D</b>t <i> w</i>", cut.expand("**Gl **ye_YFM_ _ jBRTbNB__sm_f**QMr *D*t _ w_"));
		Assert.assertEquals("r<b>sb</b>w<i>Vn</i>vJ<b></b>gx<i>y </i>tX)j d<i></i> - MU <i></i>D?kE NZnP-L<b></b>", cut.expand("r*sb*w_Vn_vJ**gx_y _tX)j d__ - MU __D?kE NZnP-L**"));
		Assert.assertEquals("<b> </b>aYp<i></i>fF-<b></b> <i>je,Lj MYl</i><i></i><i></i> <b>)L</b>n<b></b>E?VmvI<i>)! </i>", cut.expand("* *aYp__fF-** _je,Lj MYl_____ *)L*n**E?VmvI_)! _"));
		Assert.assertEquals("?<b>c </b>t<b></b> <i>n</i>Bq<b></b>Dm<i></i><b></b><b>H</b> a <i>Z</i>,<i></i><i>Hz</i><i>R</i>w<b></b>,<i>v </i>", cut.expand("?*c *t** _n_Bq**Dm__***H* a _Z_,___Hz__R_w**,_v _"));
		Assert.assertEquals("<i> !</i>-.<b>s </b>rs;. J<i>n</i> Z<i> o-nvc)</i>Pf<b> </b><i> </i><i></i><b> </b>w,", cut.expand("_ !_-.*s *rs;. J_n_ Z_ o-nvc)_Pf* *_ ___* *w,"));
		Assert.assertEquals("<i>W</i>b,Js<b>Z</b> m<b>z</b>o <i></i> GT(ADX<b>C zuP</b>aZ<b> jfM</b>i<i></i>TA", cut.expand("_W_b,Js*Z* m*z*o __ GT(ADX*C zuP*aZ* jfM*i__TA"));
		Assert.assertEquals("qUjf<i>ehyN</i>qPT<b>z</b>uP<b>FQ </b>GW)<b> </b> <b>ZO(P</b><b> </b> <b>! </b>", cut.expand("qUjf_ehyN_qPT*z*uP*FQ *GW)* * *ZO(P** * *! *"));
		Assert.assertEquals(" d<i>I ?b.iiAFOZ </i><b>q Ne </b> A <i></i>ni<b></b><b> G p</b>GfQ<b> sF</b>", cut.expand(" d_I ?b.iiAFOZ _*q Ne * A __ni*** G p*GfQ* sF*"));
		Assert.assertEquals("<b> </b> Kj<b> </b><i>.</i><b> yCV</b><i></i><i>S .</i><b>p </b><i>DkU-ow</i>WYKv<i></i> <i> </i>", cut.expand("* * Kj* *_._* yCV*___S ._*p *_DkU-ow_WYKv__ _ _"));
		Assert.assertEquals(";;<b></b>nfy<b></b><b></b>-<b>M? vNu</b> <i>l</i> <i>!HB</i><b> </b><b></b>h j<b> </b>L<b></b><b>yx</b>", cut.expand(";;**nfy****-*M? vNu* _l_ _!HB_* ***h j* *L***yx*"));
		Assert.assertEquals(" eI<b>Cc </b>Z <i> j</i><i>? </i><i>K </i><b>H </b>M<b></b>f b<b></b><b>A </b>x F m<i></i>y", cut.expand(" eI*Cc *Z _ j__? __K _*H *M**f b***A *x F m__y"));
		Assert.assertEquals("it?<b></b>l<i> p</i>bi <i> Z</i>lYb I<i>x </i>?<i> </i>JN<i></i> <i>v ,xM</i>eSa <i></i>", cut.expand("it?**l_ p_bi _ Z_lYb I_x _?_ _JN__ _v ,xM_eSa __"));
		Assert.assertEquals("<i>m sg </i><b>)</b><b>D </b>W<i> </i><b>h</b>w<i></i>XjI lH?a fi<i>C f I</i>uh -r", cut.expand("_m sg _*)**D *W_ _*h*w__XjI lH?a fi_C f I_uh -r"));
		Assert.assertEquals("m <i>Tnp</i><i>C</i> (Jl<i></i><b>;</b>jXk<i></i><b>tjeK</b> <b>I</b>?h<i></i><i>kI</i> F<b> </b><b></b>", cut.expand("m _Tnp__C_ (Jl__*;*jXk__*tjeK* *I*?h___kI_ F* ***"));
		Assert.assertEquals("Wz<i>b</i>tDN<b> jag </b> A<i>lF</i>q <b></b>Q; E ZE<b>X;,y(!J</b>U<b>B</b><i></i>", cut.expand("Wz_b_tDN* jag * A_lF_q **Q; E ZE*X;,y(!J*U*B*__"));
		Assert.assertEquals("<b>BO.</b>P<i>QhBp</i>x<b></b> AXR<i></i>V<b>FV</b>Ken!.<b></b><i>VL</i> <b>HQ-UMYAx</b>", cut.expand("*BO.*P_QhBp_x** AXR__V*FV*Ken!.**_VL_ *HQ-UMYAx*"));
		Assert.assertEquals(" <i>w</i>y<b>Ek</b>EclQ<b>o -W</b><i> ?mL</i>zq<b>R</b>i<b>i</b><b>C </b>m <i></i>oqn", cut.expand(" _w_y*Ek*EclQ*o -W*_ ?mL_zq*R*i*i**C *m __oqn"));
		Assert.assertEquals(" <i>H</i> <i>uJ S </i> ko <b>IvrNBF</b> ejy<i> </i>m<i>uc</i><b></b>xyK<i> fZy</i>", cut.expand(" _H_ _uJ S _ ko *IvrNBF* ejy_ _m_uc_**xyK_ fZy_"));
		Assert.assertEquals("<b>,G</b><i></i>. Q<b>NV</b> <i>I</i><b> T </b><i>L Q,iY</i> l Gni<i>d</i>mX<i> h</i>", cut.expand("*,G*__. Q*NV* _I_* T *_L Q,iY_ l Gni_d_mX_ h_"));
		Assert.assertEquals("<i>Bw-k, cm </i><b></b>sN;<i></i>V<b>J(</b>FU-<b></b><i> </i>!<i>! </i>XpmbF<b></b><b>t</b>", cut.expand("_Bw-k, cm _**sN;__V*J(*FU-**_ _!_! _XpmbF***t*"));
		Assert.assertEquals("<i>nLbZ</i>uS<i>d P</i> sl <b>(</b><b></b><i>mV</i> V<i> .H</i>s<i></i><b></b><b>knR</b>,<i></i>", cut.expand("_nLbZ_uS_d P_ sl *(***_mV_ V_ .H_s__***knR*,__"));
		Assert.assertEquals(")sB<b>e?z</b>GQ f<b></b><b> C </b> <b></b>Isd<b>bOs</b>uN<b>N BqWZK bC</b>zz<b> </b>", cut.expand(")sB*e?z*GQ f*** C * **Isd*bOs*uN*N BqWZK bC*zz* *"));
		Assert.assertEquals(" i<i> </i>T<i>R</i><b>c</b>Hf<b></b> p<b></b><b>dL n</b>?<b></b> X,?<i>X</i>W<b></b> <i>L </i> b<b></b>", cut.expand(" i_ _T_R_*c*Hf** p***dL n*?** X,?_X_W** _L _ b**"));
		Assert.assertEquals("q<i>WJ RK q C CZ</i>F<b>sDhk!R</b><b>i</b><i>UY cM OaW</i>a<b>DPd L j</b>", cut.expand("q_WJ RK q C CZ_F*sDhk!R**i*_UY cM OaW_a*DPd L j*"));
		Assert.assertEquals("<i>now</i>I<i>know</i><b>my</b><i>ABC</i>next<i>time</i><b>sing</b>it<i>with</i>me", cut.expand("_now_I_know_*my*_ABC_next_time_*sing*it_with_me"));
		Assert.assertEquals("<i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i><i></i>", cut.expand("__________________________________________________"));
		Assert.assertEquals("You <i>should</i> see the new walrus at the zoo!", cut.expand("You _should_ see the new walrus at the zoo!"));
		Assert.assertEquals("<i>now</i>I<i>know</i><b>my</b><i>ABC</i>next<i>me</i><b></b>sing<b></b>it<i>with</i>me", cut.expand("_now_I_know_*my*_ABC_next_me_**sing**it_with_me"));
		Assert.assertEquals("Move it from <b>Accounts Payable</b> to <b>Receiving</b>.", cut.expand("Move it from *Accounts Payable* to *Receiving*."));
		Assert.assertEquals("<b>test;</b>", cut.expand("*test;*"));
		Assert.assertEquals("fdg dd<i> sdfs</i> , sdfsdf ,", cut.expand("fdg dd_ sdfs_ , sdfsdf ,"));
		Assert.assertEquals("<b></b>", cut.expand("**"));
		Assert.assertEquals("<b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b><b></b>", cut.expand("**************************************************"));
		Assert.assertEquals("a<i></i>", cut.expand("a__"));
		Assert.assertEquals("<i></i><i></i>", cut.expand("____"));
	}

}
