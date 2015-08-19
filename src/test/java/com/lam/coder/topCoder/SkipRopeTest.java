package com.lam.coder.topCoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.SkipRope;

public class SkipRopeTest {
	SkipRope rope;
	
	@Before
	public void setUp() throws Exception {
		rope = new SkipRope();
	}

	@After
	public void tearDown() throws Exception {
		rope = null;
	}

	@Test
	public void testPartners() {
		Assert.assertArrayEquals(new int[] { 99,  102 }, rope.partners(new int[] {102, 99, 104}, 100));
		Assert.assertArrayEquals(new int[] { 97,  102 }, rope.partners(new int[] {102, 97, 104}, 100));
		Assert.assertArrayEquals(new int[] { 100,  101 }, rope.partners(new int[] {101, 100, 99}, 100));
		Assert.assertArrayEquals(new int[] {170, 170}, rope.partners(new int[] {75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170}, 169));
		Assert.assertArrayEquals(new int[] { 79,  86 }, rope.partners(new int[] {134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137, 127, 130, 121, 
		 93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103, 149, 110, 156}, 82));
	}
	
	@Test
	public void partnersSystemTest() {
		Assert.assertArrayEquals(new int[] {99, 102}, rope.partners(new int[] {102, 99, 104}, 100));
		Assert.assertArrayEquals(new int[] {97, 102}, rope.partners(new int[] {102, 97, 104}, 100));
		Assert.assertArrayEquals(new int[] {100, 101}, rope.partners(new int[] {101, 100, 99}, 100));
		Assert.assertArrayEquals(new int[] {170, 170}, rope.partners(new int[] {75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170}, 169));
		Assert.assertArrayEquals(new int[] {79, 86}, rope.partners(new int[] {134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137, 127, 130, 121, 93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103, 149, 110, 156}, 82));
		Assert.assertArrayEquals(new int[] {136, 137}, rope.partners(new int[] {129, 167, 153, 121, 81, 123, 170, 108, 116, 156, 137, 81, 155, 145, 111, 136, 98, 100, 160}, 137));
		Assert.assertArrayEquals(new int[] {162, 165}, rope.partners(new int[] {162, 133, 143, 140, 148, 94, 81, 165, 86, 140, 160, 100, 129, 77, 142, 125, 108, 112}, 164));
		Assert.assertArrayEquals(new int[] {169, 172}, rope.partners(new int[] {119, 87, 89, 98, 137, 118, 158, 172, 92, 117, 122, 142, 129, 141, 169, 141, 140}, 166));
		Assert.assertArrayEquals(new int[] {122, 137}, rope.partners(new int[] {84, 96, 86, 153, 157, 122, 155, 137, 94, 94, 114, 140, 103}, 126));
		Assert.assertArrayEquals(new int[] {132, 135}, rope.partners(new int[] {97, 78, 111, 164, 87, 82, 135, 114, 132, 173, 129, 170, 90, 75, 139, 106, 125, 112, 75, 157, 98}, 133));
		Assert.assertArrayEquals(new int[] {121, 124}, rope.partners(new int[] {124, 121, 77, 105, 134, 155, 81, 153, 77, 175, 137, 145, 138, 80, 162, 169, 137, 140, 138, 145, 148, 87, 78, 163, 153, 171, 112, 92, 130, 156, 114, 149, 86, 160, 105, 77}, 122));
		Assert.assertArrayEquals(new int[] {155, 160}, rope.partners(new int[] {120, 128, 120, 133, 97, 160, 91, 101, 155, 91, 88, 162, 139, 102, 89, 132, 102, 77, 111}, 155));
		Assert.assertArrayEquals(new int[] {85, 86}, rope.partners(new int[] {120, 105, 167, 86, 85, 150, 163, 159, 102, 124, 83, 161}, 89));
		Assert.assertArrayEquals(new int[] {126, 131}, rope.partners(new int[] {84, 126, 138, 172, 91, 162, 163, 140, 148, 113, 95, 148, 131}, 123));
		Assert.assertArrayEquals(new int[] {81, 81}, rope.partners(new int[] {133, 146, 82, 98, 152, 107, 84, 124, 100, 157, 162, 81, 123, 160, 142, 117, 170, 115, 156, 121, 163, 139, 88, 142, 104, 146, 86, 81, 105, 80, 99}, 81));
		Assert.assertArrayEquals(new int[] {111, 116}, rope.partners(new int[] {144, 163, 137, 111, 116, 111, 92, 158, 103, 142, 142, 109, 109, 81, 87, 143, 167}, 121));
		Assert.assertArrayEquals(new int[] {153, 161}, rope.partners(new int[] {111, 125, 138, 112, 127, 100, 153, 161, 78, 92, 131, 89}, 161));
		Assert.assertArrayEquals(new int[] {83, 85}, rope.partners(new int[] {85, 152, 162, 151, 96, 137, 78, 141, 165, 94, 149, 105, 147, 99, 100, 131, 97, 79, 90, 115, 83, 170, 165, 92, 93, 94, 132, 152, 158, 118, 148, 137, 123, 117, 97, 146, 114, 159, 159, 95, 121, 80, 90, 75, 142, 127, 102, 120, 141, 78}, 83));
		Assert.assertArrayEquals(new int[] {159, 163}, rope.partners(new int[] {149, 112, 109, 124, 87, 163, 153, 150, 167, 105, 136, 105, 165, 138, 159, 101, 115, 99, 154, 114, 75, 171, 166, 128, 104, 145}, 160));
		Assert.assertArrayEquals(new int[] {103, 104}, rope.partners(new int[] {103, 149, 140, 141, 98, 115, 134, 166, 130, 136, 118, 123, 141, 104, 154, 88, 139, 118, 157, 144, 121, 117, 171, 111, 171, 174, 90, 169, 156, 78, 133, 167, 82}, 102));
		Assert.assertArrayEquals(new int[] {156, 158}, rope.partners(new int[] {171, 81, 107, 158, 155, 116, 87, 156, 85, 109, 83, 77, 86, 78, 174, 145, 147, 89, 113, 75, 127, 125, 108, 134, 123, 129, 95, 135, 81, 113, 138, 139}, 161));
		Assert.assertArrayEquals(new int[] {133, 136}, rope.partners(new int[] {170, 92, 152, 126, 116, 155, 116, 145, 131, 93, 123, 175, 76, 78, 88, 78, 146, 104, 171, 159, 112, 86, 133, 150, 81, 110, 76, 92, 167, 136, 76, 160}, 135));
		Assert.assertArrayEquals(new int[] {149, 149}, rope.partners(new int[] {125, 138, 77, 110, 97, 160, 109, 163, 82, 167, 117, 130, 143, 91, 98, 116, 142, 175, 149, 92, 81, 125, 134, 113, 132, 109, 79, 169, 141, 130, 144, 164, 79, 149, 156}, 149));
		Assert.assertArrayEquals(new int[] {119, 127}, rope.partners(new int[] {117, 174, 171, 156, 150, 117, 94, 170, 138, 95, 103, 98, 127, 119, 147, 142, 88, 104}, 126));
		Assert.assertArrayEquals(new int[] {132, 135}, rope.partners(new int[] {157, 130, 174, 143, 132, 163, 114, 154, 126, 77, 124, 175, 137, 171, 122, 111, 93, 107, 100, 135, 85, 112, 155, 110, 101, 104, 165, 92, 87, 80, 127, 90, 125, 106, 149, 92, 139, 136, 93, 166, 158, 80, 156}, 133));
		Assert.assertArrayEquals(new int[] {144, 145}, rope.partners(new int[] {105, 89, 108, 77, 82, 162, 139, 163, 100, 154, 125, 122, 75, 144, 96, 86, 169, 146, 97, 127, 168, 98, 86, 154, 86, 138, 118, 173, 168, 139, 157, 162, 91, 161, 145, 134, 156, 133, 134, 80, 94, 129, 80, 84}, 142));
		Assert.assertArrayEquals(new int[] {156, 159}, rope.partners(new int[] {168, 160, 104, 107, 93, 174, 138, 152, 76, 152, 159, 83, 156, 159, 97, 103, 132, 99, 161, 123, 107, 75}, 157));
		Assert.assertArrayEquals(new int[] {165, 174}, rope.partners(new int[] {119, 139, 152, 139, 133, 152, 98, 174, 81, 150, 128, 103, 78, 131, 111, 160, 114, 137, 114, 101, 87, 84, 94, 165, 87}, 175));
		Assert.assertArrayEquals(new int[] {149, 150}, rope.partners(new int[] {136, 149, 96, 98, 82, 89, 118, 97, 109, 100, 169, 165, 173, 95, 125, 101, 111, 88, 111, 171, 139, 107, 75, 123, 95, 85, 150, 82, 171, 79}, 149));
		Assert.assertArrayEquals(new int[] {108, 110}, rope.partners(new int[] {174, 83, 128, 115, 85, 100, 163, 98, 164, 149, 175, 78, 122, 150, 137, 108, 77, 117, 139, 81, 162, 147, 110, 83, 76, 152, 108, 156, 135, 131, 167, 95, 129, 134, 131, 143, 80, 115, 107, 118, 92, 135, 100, 137, 113, 83}, 109));
		Assert.assertArrayEquals(new int[] {155, 156}, rope.partners(new int[] {83, 156, 81, 143, 155, 79, 78, 107, 97, 135, 121}, 161));
		Assert.assertArrayEquals(new int[] {167, 170}, rope.partners(new int[] {88, 81, 118, 82, 125, 109, 97, 99, 100, 131, 132, 94, 157, 170, 116, 95, 158, 154, 167, 101, 135, 161}, 172));
		Assert.assertArrayEquals(new int[] {132, 135}, rope.partners(new int[] {115, 82, 125, 93, 138, 111, 149, 101, 107, 116, 160, 137, 142, 95, 100, 173, 143, 159, 150, 132, 119, 110, 86, 135, 96, 157, 111, 76, 121, 93, 116, 147, 83}, 130));
		Assert.assertArrayEquals(new int[] {137, 137}, rope.partners(new int[] {85, 112, 85, 151, 144, 76, 79, 132, 144, 156, 93, 137, 108, 111, 84, 106, 165, 83, 140, 137, 75, 101, 163, 118, 158, 148, 171, 97, 175, 131, 159}, 135));
		Assert.assertArrayEquals(new int[] {97, 99}, rope.partners(new int[] {150, 87, 175, 169, 86, 135, 163, 99, 88, 118, 118, 136, 136, 110, 123, 117, 97, 129, 154, 95, 83, 152, 123, 125, 128, 84, 152, 144, 85, 165, 141, 148, 153, 125, 165, 88, 91}, 98));
		Assert.assertArrayEquals(new int[] {173, 173}, rope.partners(new int[] {101, 173, 167, 155, 129, 175, 110, 173, 169, 167, 137, 112, 166, 136, 124, 115, 167, 110, 111, 99, 110}, 171));
		Assert.assertArrayEquals(new int[] {152, 159}, rope.partners(new int[] {152, 90, 106, 122, 127, 102, 81, 85, 172, 171, 159, 150, 94, 92}, 158));
		Assert.assertArrayEquals(new int[] {106, 110}, rope.partners(new int[] {144, 110, 87, 91, 164, 144, 126, 173, 137, 150, 106, 80, 110, 128, 91, 172, 98, 98, 123, 77, 130, 166, 161, 158, 158, 172, 142, 154}, 104));
		Assert.assertArrayEquals(new int[] {102, 103}, rope.partners(new int[] {82, 105, 112, 147, 112, 77, 93, 127, 158, 95, 151, 139, 103, 103, 174, 112, 95, 108, 109, 162, 164, 118, 119, 121, 156, 150, 169, 127, 171, 102, 123, 149, 132, 108, 83, 148, 174}, 99));
		Assert.assertArrayEquals(new int[] {99, 101}, rope.partners(new int[] {110, 87, 101, 137, 149, 85, 77, 113, 124, 75, 136, 87, 97, 99, 96, 139, 149, 102, 160, 110, 97, 151, 106, 81, 149, 166, 91, 162}, 99));
		Assert.assertArrayEquals(new int[] {149, 156}, rope.partners(new int[] {86, 110, 141, 147, 119, 156, 108, 90, 102, 125, 86, 146, 149, 140, 101, 136, 140, 161, 116, 165, 93, 95, 129}, 153));
		Assert.assertArrayEquals(new int[] {159, 160}, rope.partners(new int[] {100, 163, 100, 122, 102, 100, 119, 109, 169, 143, 79, 94, 81, 151, 87, 82, 153, 160, 164, 119, 144, 165, 159, 151, 93, 107}, 159));
		Assert.assertArrayEquals(new int[] {89, 90}, rope.partners(new int[] {159, 155, 123, 84, 87, 97, 75, 100, 123, 82, 79, 164, 129, 133, 161, 169, 156, 166, 92, 90, 82, 149, 86, 174, 167, 133, 169, 89, 161, 125, 82, 149, 87, 174, 158, 140, 146, 160, 130, 158, 159, 115, 174, 76, 164, 111, 89, 138}, 90));
		Assert.assertArrayEquals(new int[] {151, 159}, rope.partners(new int[] {159, 113, 78, 172, 77, 147, 118, 84, 141, 108, 133, 100, 116, 79, 151, 115}, 154));
		Assert.assertArrayEquals(new int[] {108, 112}, rope.partners(new int[] {84, 138, 129, 170, 142, 112, 136, 174, 130, 148, 163, 159, 150, 149, 154, 153, 103, 83, 80, 108, 161, 133, 105, 137, 122, 174, 157, 101, 140, 107, 88, 141, 163, 84, 118, 115, 140, 161, 141, 132, 99, 164, 98, 174, 151, 146, 101, 121, 87}, 111));
		Assert.assertArrayEquals(new int[] {157, 158}, rope.partners(new int[] {136, 88, 136, 83, 115, 162, 157, 95, 172, 114, 108, 104, 95, 149, 134, 105, 106, 100, 109, 86, 100, 117, 90, 132, 108, 114, 155, 141, 112, 168, 160, 150, 139, 154, 103, 150, 78, 95, 163, 158, 117}, 157));
		Assert.assertArrayEquals(new int[] {144, 154}, rope.partners(new int[] {128, 155, 108, 101, 154, 84, 128, 87, 100, 172, 134, 144, 95, 134, 122, 127, 130, 175, 89, 173, 82, 75, 140, 77, 76, 95, 166}, 149));
		Assert.assertArrayEquals(new int[] {166, 166}, rope.partners(new int[] {132, 166, 102, 126, 168, 105, 129, 101, 111, 143, 79, 84, 118, 108, 153, 105, 93, 171, 114, 122, 94, 101, 168, 169, 105, 108, 175, 147, 84, 92, 127, 111, 116, 129, 122, 157, 168, 134, 97, 142, 149, 151, 158, 121, 114, 166, 131, 173, 119, 125}, 166));
		Assert.assertArrayEquals(new int[] {167, 168}, rope.partners(new int[] {103, 86, 112, 164, 93, 94, 167, 175, 149, 84, 158, 135, 91, 90, 79, 136, 81, 95, 116, 118, 83, 122, 151, 145, 128, 101, 137, 143, 132, 102, 121, 82, 146, 120, 122, 171, 83, 145, 95, 129, 135, 91, 174, 99, 117, 108, 168, 157, 114, 144}, 168));
		Assert.assertArrayEquals(new int[] {125, 135}, rope.partners(new int[] {141, 90, 90, 174, 151, 114, 111, 164, 151, 93, 89, 85, 125, 154, 94, 145, 91, 135, 91, 135, 165, 111, 159, 163, 119, 137, 102, 89, 156, 101, 143, 98, 158, 174, 167, 81, 116, 110, 167, 151, 122, 173, 120, 122, 147, 105, 155}, 129));
		Assert.assertArrayEquals(new int[] {86, 98}, rope.partners(new int[] {98, 85, 76, 126, 159, 86, 142, 154, 165, 130, 145, 124, 116}, 94));
		Assert.assertArrayEquals(new int[] {85, 86}, rope.partners(new int[] {125, 85, 99, 89, 110, 135, 130, 116, 93, 153, 91, 161, 141, 100, 125, 111, 162, 127, 138, 113, 173, 86, 110, 87, 149, 142, 171, 175, 163, 91, 105, 129, 171, 115, 105, 101, 170}, 80));
		Assert.assertArrayEquals(new int[] {112, 113}, rope.partners(new int[] {160, 173, 126, 159, 151, 81, 94, 123, 146, 112, 163, 145, 120, 118, 142, 120, 119, 113}, 105));
		Assert.assertArrayEquals(new int[] {118, 122}, rope.partners(new int[] {135, 140, 115, 154, 127, 139, 126, 129, 123, 88, 118, 147, 115, 165, 83, 156, 142, 117, 135, 85, 158, 140, 87, 109, 122, 105, 76, 85, 83, 127, 148, 140, 98, 145, 98, 92, 94, 76, 132, 124, 160}, 120));
		Assert.assertArrayEquals(new int[] {107, 109}, rope.partners(new int[] {81, 171, 127, 121, 122, 107, 98, 142, 159, 114, 174, 132, 151, 148, 159, 115, 120, 98, 163, 124, 148, 83, 76, 86, 113, 78, 87, 172, 143, 97, 109, 116, 75}, 108));
		Assert.assertArrayEquals(new int[] {132, 132}, rope.partners(new int[] {119, 76, 88, 123, 174, 145, 143, 173, 123, 174, 106, 163, 120, 143, 114, 89, 175, 160, 102, 132, 76, 105, 97, 157, 161, 97, 132, 77, 89, 85, 147, 144, 84, 98}, 135));
		Assert.assertArrayEquals(new int[] {146, 147}, rope.partners(new int[] {127, 91, 92, 148, 155, 153, 88, 149, 112, 128, 170, 105, 136, 94, 132, 87, 96, 122, 156, 107, 131, 105, 77, 100, 162, 150, 140, 131, 92, 136, 102, 103, 127, 147, 130, 148, 86, 136, 119, 100, 122, 146, 94, 158, 85, 140, 130}, 146));
		Assert.assertArrayEquals(new int[] {120, 125}, rope.partners(new int[] {82, 163, 95, 162, 140, 158, 151, 120, 104, 75, 168, 125, 170, 150, 116, 161, 82, 149, 99, 166, 126, 108, 145, 159, 159, 136, 89, 134, 106, 108, 112, 173, 84, 153, 143, 158}, 122));
		Assert.assertArrayEquals(new int[] {109, 127}, rope.partners(new int[] {127, 109}, 152));
		Assert.assertArrayEquals(new int[] {80, 80}, rope.partners(new int[] {134, 147, 134, 89, 128, 158, 139, 88, 83, 157, 97, 80, 98, 80}, 79));
		Assert.assertArrayEquals(new int[] {84, 85}, rope.partners(new int[] {136, 146, 80, 156, 131, 113, 168, 137, 168, 151, 163, 161, 141, 149, 136, 76, 131, 104, 90, 170, 115, 82, 101, 87, 162, 86, 175, 173, 150, 155, 85, 82, 84, 115, 143, 82, 122, 157, 174}, 84));
		Assert.assertArrayEquals(new int[] {156, 156}, rope.partners(new int[] {83, 139, 156, 164, 140, 156, 101, 76, 170}, 157));
		Assert.assertArrayEquals(new int[] {104, 106}, rope.partners(new int[] {116, 77, 104, 156, 142, 121, 150, 138, 106, 172, 89}, 102));
		Assert.assertArrayEquals(new int[] {86, 94}, rope.partners(new int[] {103, 148, 108, 110, 152, 153, 147, 130, 121, 86, 142, 173, 116, 97, 151, 173, 169, 94, 163}, 91));
		Assert.assertArrayEquals(new int[] {93, 94}, rope.partners(new int[] {132, 175, 127, 174, 136, 160, 88, 93, 167, 94, 104}, 91));
		Assert.assertArrayEquals(new int[] {154, 154}, rope.partners(new int[] {83, 154, 136, 124, 136, 159, 169, 166, 113, 174, 85, 78, 86, 169, 154, 86, 87, 171, 95, 114}, 152));
		Assert.assertArrayEquals(new int[] {92, 97}, rope.partners(new int[] {102, 116, 173, 166, 119, 112, 83, 118, 97, 85, 112, 98, 133, 160, 81, 164, 92, 172, 85, 135, 116, 151, 136, 89, 102, 160}, 94));
		Assert.assertArrayEquals(new int[] {89, 99}, rope.partners(new int[] {171, 145, 78, 99, 106, 170, 142, 89}, 90));
		Assert.assertArrayEquals(new int[] {165, 166}, rope.partners(new int[] {175, 166, 152, 163, 75, 100, 140, 153, 77, 169, 110, 88, 155, 93, 146, 104, 81, 94, 149, 83, 96, 147, 163, 174, 92, 117, 118, 90, 76, 165, 133, 101, 83, 99, 123, 149, 129, 106, 165, 174, 102, 110, 150, 117}, 166));
		Assert.assertArrayEquals(new int[] {130, 135}, rope.partners(new int[] {108, 77, 135, 105, 77, 130, 160, 82, 105, 113, 85, 101, 147, 80, 115, 112, 153, 78}, 138));
		Assert.assertArrayEquals(new int[] {81, 86}, rope.partners(new int[] {170, 128, 159, 168, 91, 110, 99, 92, 113, 115, 107, 135, 170, 117, 153, 127, 130, 86, 140, 144, 103, 88, 120, 147, 100, 138, 81, 146, 129, 170}, 83));
		Assert.assertArrayEquals(new int[] {155, 162}, rope.partners(new int[] {155, 91, 83, 76, 162, 134, 102}, 169));
		Assert.assertArrayEquals(new int[] {138, 141}, rope.partners(new int[] {112, 105, 129, 127, 123, 131, 138, 156, 162, 144, 141, 163, 168, 86, 144, 149, 123, 159, 101, 160, 149, 88, 112, 144, 128, 154, 78, 116, 148, 109, 133, 115, 135, 144, 151, 118, 78, 84, 143, 78}, 138));
		Assert.assertArrayEquals(new int[] {155, 161}, rope.partners(new int[] {86, 143, 166, 167, 129, 134, 146, 146, 77, 147, 137, 94, 140, 164, 86, 151, 98, 155, 122, 139, 110, 132, 145, 161, 136, 111, 121}, 159));
		Assert.assertArrayEquals(new int[] {101, 153}, rope.partners(new int[] {153, 95, 76, 95, 75, 101}, 139));
		Assert.assertArrayEquals(new int[] {125, 128}, rope.partners(new int[] {128, 102, 86, 173, 81, 99, 125, 104, 84, 133}, 126));
		Assert.assertArrayEquals(new int[] {135, 139}, rope.partners(new int[] {83, 118, 114, 152, 175, 113, 128, 86, 92, 173, 143, 119, 94, 139, 155, 168, 154, 127, 135, 118, 93, 168, 134, 150, 90, 154, 84, 114, 124, 100}, 138));
		Assert.assertArrayEquals(new int[] {158, 158}, rope.partners(new int[] {155, 166, 75, 96, 159, 110, 172, 134, 156, 79, 102, 86, 163, 160, 138, 158, 173, 137, 114, 112, 95, 99, 158, 117, 173, 83, 103, 101, 145, 144, 125, 123, 95, 94, 136, 133, 114, 170, 88, 159, 87, 105, 111, 166, 124, 120, 147, 75, 173}, 157));
		Assert.assertArrayEquals(new int[] {110, 121}, rope.partners(new int[] {121, 161, 168, 124, 89, 95, 128, 109, 80, 110, 155, 84, 88, 146, 80, 127, 108, 130, 131, 125, 169, 97, 100, 152, 100, 168, 152, 164, 95}, 116));
		Assert.assertArrayEquals(new int[] {168, 171}, rope.partners(new int[] {164, 85, 107, 126, 77, 168, 114, 76, 121, 107, 121, 171, 79, 175, 141, 120, 82, 90, 119, 88, 86, 99, 135, 130}, 168));
		Assert.assertArrayEquals(new int[] {90, 91}, rope.partners(new int[] {130, 151, 119, 128, 90, 108, 166, 113, 86, 114, 169, 139, 120, 107, 91, 174, 125, 123}, 92));
		Assert.assertArrayEquals(new int[] {142, 145}, rope.partners(new int[] {126, 122, 90, 112, 92, 84, 118, 111, 119, 142, 121, 130, 145, 157, 104, 108, 171}, 145));
		Assert.assertArrayEquals(new int[] {109, 114}, rope.partners(new int[] {143, 145, 162, 151, 87, 87, 98, 137, 114, 167, 137, 96, 95, 109, 79}, 106));
		Assert.assertArrayEquals(new int[] {154, 159}, rope.partners(new int[] {168, 80, 172, 144, 167, 94, 169, 130, 163, 159, 138, 78, 154, 127, 112}, 155));
		Assert.assertArrayEquals(new int[] {149, 149}, rope.partners(new int[] {131, 150, 162, 94, 149, 164, 154, 76, 143, 149, 165, 156, 142, 103, 80, 86, 140}, 147));
		Assert.assertArrayEquals(new int[] {90, 90}, rope.partners(new int[] {113, 87, 82, 102, 132, 86, 142, 150, 117, 146, 94, 85, 155, 123, 174, 118, 129, 103, 102, 89, 106, 139, 136, 129, 155, 128, 90, 99, 151, 77, 94, 90, 147, 122, 114, 175, 151, 87}, 90));
		Assert.assertArrayEquals(new int[] {114, 117}, rope.partners(new int[] {109, 103, 158, 94, 117, 152, 162, 130, 93, 88, 104, 85, 158, 161, 168, 114, 153, 164, 126, 132, 161, 99}, 114));
		Assert.assertArrayEquals(new int[] {171, 171}, rope.partners(new int[] {103, 97, 104, 146, 111, 140, 171, 86, 171, 113}, 169));
		Assert.assertArrayEquals(new int[] {101, 101}, rope.partners(new int[] {141, 91, 172, 123, 94, 153, 159, 169, 106, 138, 93, 121, 129, 112, 132, 173, 79, 107, 152, 114, 123, 173, 143, 144, 152, 101, 92, 162, 149, 89, 79, 101, 163, 83, 111, 119, 103, 123, 159, 170, 141, 94, 165, 113, 146, 115, 80, 169, 147, 89}, 99));
		Assert.assertArrayEquals(new int[] {132, 139}, rope.partners(new int[] {159, 123, 169, 169, 128, 166, 128, 173, 150, 139, 88, 169, 88, 158, 101, 145, 125, 121, 94, 132}, 134));
		Assert.assertArrayEquals(new int[] {88, 89}, rope.partners(new int[] {160, 103, 164, 89, 140, 173, 88}, 75));
		Assert.assertArrayEquals(new int[] {76, 84}, rope.partners(new int[] {100, 130, 170, 118, 76, 165, 124, 84, 130}, 75));
		Assert.assertArrayEquals(new int[] {140, 142}, rope.partners(new int[] {162, 117, 120, 174, 85, 75, 149, 169, 94, 134, 169, 128, 149, 97, 131, 120, 121, 107, 90, 82, 122, 125, 168, 174, 155, 86, 159, 102, 158, 156, 174, 164, 82, 130, 142, 140}, 142));
		Assert.assertArrayEquals(new int[] {87, 98}, rope.partners(new int[] {98, 87, 158, 76, 148}, 105));
		Assert.assertArrayEquals(new int[] {88, 90}, rope.partners(new int[] {141, 148, 159, 132, 90, 162, 158, 88, 142, 101, 86, 105, 163, 161, 165, 124, 107, 164, 103, 152, 107, 106, 97, 104, 128, 173}, 90));
		Assert.assertArrayEquals(new int[] {135, 138}, rope.partners(new int[] {118, 174, 126, 111, 160, 135, 154, 120, 98, 138, 107, 159, 83, 103, 84, 147, 79, 109, 90, 124, 138, 83, 151, 122, 148, 174, 175, 115, 78, 110, 157, 122, 110, 138, 103, 156, 162}, 134));
		Assert.assertArrayEquals(new int[] {168, 172}, rope.partners(new int[] {157, 168, 86, 92, 92, 97, 118, 83, 139, 109, 143, 99, 132, 129, 175, 115, 149, 125, 124, 172}, 166));
		Assert.assertArrayEquals(new int[] {154, 157}, rope.partners(new int[] {146, 173, 79, 79, 148, 107, 105, 171, 89, 84, 153, 98, 154, 148, 157, 148, 172, 169, 164, 142, 101, 98, 96, 163}, 155));
		Assert.assertArrayEquals(new int[] {97, 98}, rope.partners(new int[] {170, 154, 83, 84, 125, 101, 137, 98, 156, 75, 131, 107, 141, 154, 127, 144, 136, 157, 166, 129, 133, 135, 170, 145, 120, 104, 134, 153, 97, 125, 166, 103, 109, 152}, 91));
		Assert.assertArrayEquals(new int[] {109, 132}, rope.partners(new int[] {155, 109, 132, 76, 161, 96, 142, 78}, 115));
		Assert.assertArrayEquals(new int[] {99, 102}, rope.partners(new int[] {102, 99}, 100));
		Assert.assertArrayEquals(new int[] {100, 101}, rope.partners(new int[] {101, 100, 99}, 100));
		Assert.assertArrayEquals(new int[] {100, 110}, rope.partners(new int[] {100, 110, 90}, 100));
		Assert.assertArrayEquals(new int[] {76, 77}, rope.partners(new int[] {77, 76, 75}, 76));
		Assert.assertArrayEquals(new int[] {98, 102}, rope.partners(new int[] {98, 102}, 100));
		Assert.assertArrayEquals(new int[] {100, 102}, rope.partners(new int[] {100, 100, 100, 102}, 101));
		Assert.assertArrayEquals(new int[] {75, 100}, rope.partners(new int[] {75, 100}, 100));
		Assert.assertArrayEquals(new int[] {76, 76}, rope.partners(new int[] {76, 76, 76, 76, 76, 76}, 76));
		Assert.assertArrayEquals(new int[] {98, 101}, rope.partners(new int[] {104, 98, 101}, 100));
		Assert.assertArrayEquals(new int[] {170, 170}, rope.partners(new int[] {75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170}, 169));
		Assert.assertArrayEquals(new int[] {100, 101}, rope.partners(new int[] {100, 99, 101, 99}, 100));
		Assert.assertArrayEquals(new int[] {170, 170}, rope.partners(new int[] {75, 117, 168, 170, 175, 167, 167, 142, 170, 85, 89, 170}, 169));
		Assert.assertArrayEquals(new int[] {170, 174}, rope.partners(new int[] {170, 174, 175}, 75));
		Assert.assertArrayEquals(new int[] {99, 102}, rope.partners(new int[] {102, 99, 104}, 100));
		Assert.assertArrayEquals(new int[] {103, 103}, rope.partners(new int[] {97, 103, 103}, 100));
		Assert.assertArrayEquals(new int[] {79, 86}, rope.partners(new int[] {134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137, 127, 130, 121, 93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103, 149, 110, 156}, 82));
		Assert.assertArrayEquals(new int[] {79, 80}, rope.partners(new int[] {78, 79, 80, 100}, 80));
		Assert.assertArrayEquals(new int[] {75, 76}, rope.partners(new int[] {75, 76, 76, 76}, 75));
		Assert.assertArrayEquals(new int[] {100, 101}, rope.partners(new int[] {99, 100, 101}, 100));
		Assert.assertArrayEquals(new int[] {101, 101}, rope.partners(new int[] {99, 99, 99, 101, 101, 101}, 100));
	}

}
