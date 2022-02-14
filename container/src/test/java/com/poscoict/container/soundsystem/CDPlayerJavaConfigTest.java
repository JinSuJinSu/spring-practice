package com.poscoict.container.soundsystem;

<<<<<<< HEAD
=======
import static org.junit.Assert.assertEquals;
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

<<<<<<< HEAD
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CDPlayer.class})
public class CDPlayerJavaConfigTest {
	
=======
import com.poscoict.container.config.soundsystem.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CDPlayerConfig.class})
public class CDPlayerJavaConfigTest {
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlayerNot() {
		assertNotNull(cdPlayer);
	}
<<<<<<< HEAD
=======
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals( "Playing 붕붕 by 김혜인", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
>>>>>>> ce5c9b52ea917e91cd01233757a5aa283f53b841

}
