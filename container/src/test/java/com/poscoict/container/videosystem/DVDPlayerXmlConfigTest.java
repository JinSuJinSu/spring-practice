package com.poscoict.container.videosystem;



<<<<<<< HEAD
=======
import static org.junit.Assert.assertEquals;
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/poscoict/container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
<<<<<<< HEAD
	
=======
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	// @Autowired
<<<<<<< HEAD
	// 예외 발생
	// XML Bean 설정(Avengers)에서는 id를 자동 부여하지 않는다.
	// 따라서 @Qualifier를 사용할 수 없다.
	private DigitalVideoDisc dvd1;
	
	@Qualifier("IronMan")
	@Autowired
	private DigitalVideoDisc dvd2;
	
	@Ignore
	@Test
	public void testDvd1() {
=======
	// 예외발생
	// Explicit XML Bean 설정(Avengers)에서는 id를 자동 부여 하지 않는다.
	// 따라서 @Qualifier를 사용할 수 없다.
	private DigitalVideoDisc dvd1;

	@Qualifier("ironMan")
	@Autowired
	private DigitalVideoDisc dvd2;

	@Qualifier("avengersInfinityWar")
	@Autowired
	private DigitalVideoDisc dvd3;

	@Qualifier("avengersEndgame")
	@Autowired
	private DigitalVideoDisc dvd4;

	@Qualifier("avengersAgeOfUltron")
	@Autowired
	private DigitalVideoDisc dvd5;

	@Qualifier("avengersCaptainAmerica")
	@Autowired
	private DigitalVideoDisc dvd6;

	@Qualifier("avengersDirectorEdition")
	@Autowired
	private DigitalVideoDisc dvd7;

	@Qualifier("avengersExpansionEdition1")
	@Autowired
	private DigitalVideoDisc dvd8;
	
	@Qualifier("avengersExpansionEdition2")
	@Autowired
	private DigitalVideoDisc dvd9;
	
	@Qualifier("avengersExpansionEdition3")
	@Autowired
	private DigitalVideoDisc dvd10;
	
	@Autowired
	private DVDPack dvdPack;
	
	@Qualifier("dvdPlayer1")
	@Autowired
	private DVDPlayer dvdPlayer1;
	
	@Qualifier("dvdPlayer2")
	@Autowired
	private DVDPlayer dvdPlayer2;
	
	@Qualifier("dvdPlayer3")
	@Autowired
	private DVDPlayer dvdPlayer3;
	
	@Qualifier("dvdPlayer4")
	@Autowired
	private DVDPlayer dvdPlayer4;
	
	@Qualifier("dvdPlayer5")
	@Autowired
	private DVDPlayer dvdPlayer5;

	@Ignore
	@Test
	public void testDvd1() {
		System.out.println("dvd1:" + dvd1);
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDvd2() {
<<<<<<< HEAD
		assertNotNull(dvd2);
	}
	
	


	
	
}
=======
		System.out.println("dvd2:" + dvd2);
		assertNotNull(dvd2);
	}

	@Test
	public void testDvd3() {
		System.out.println("dvd3:" + dvd3);
		assertNotNull(dvd3);
	}

	@Test
	public void testDvd4() {
		System.out.println("dvd4:" + dvd4);
		assertNotNull(dvd4);
	}

	@Test
	public void testDvd5() {
		System.out.println("dvd5:" + dvd5);
		assertNotNull(dvd5);
	}

	@Test
	public void testDvd6() {
		System.out.println("dvd6:" + dvd6);
		assertNotNull(dvd6);
	}

	@Test
	public void testDvd7() {
		System.out.println("dvd7:" + dvd7);
		assertNotNull(dvd7);
	}

	@Test
	public void testDvd8() {
		System.out.println("dvd8:" + dvd8);
		assertNotNull(dvd8);
	}
	
	@Test
	public void testDvd9() {
		System.out.println("dvd9:" + dvd9);
		assertNotNull(dvd9);
	}
	
	
	@Test
	public void testDvd10() {
		System.out.println("dvd10:" + dvd10);
		assertNotNull(dvd10);
	}
	
	@Test
	public void testDvdPack() {
		System.out.println("dvdPack:" + dvdPack);
		assertNotNull(dvdPack);
	}
	
	@Test
	public void testPlay1() {
//		System.out.println("dvdPlayer1:" + dvdPlayer1);
		dvdPlayer1.play();
		assertEquals("Playing Movie MARVEL's ironMan",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay2() {
//		System.out.println("dvdPlayer2:" + dvdPlayer2);
		dvdPlayer2.play();
		assertEquals("Playing Movie MARVEL's ironMan",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay3() {
//		System.out.println("dvdPlayer3:" + dvdPlayer3);
		dvdPlayer3.play();
		assertEquals("Playing Movie MARVEL's ironMan",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
//		System.out.println("dvdPlayer4:" + dvdPlayer4);
		dvdPlayer4.play();
		assertEquals("Playing Movie MARVEL's ironMan",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay5() {
//		System.out.println("dvdPlayer5:" + dvdPlayer5);
		dvdPlayer5.play();
		assertEquals("Playing Movie MARVEL's ironMan",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
