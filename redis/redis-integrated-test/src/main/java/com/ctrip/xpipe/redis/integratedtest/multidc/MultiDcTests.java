package com.ctrip.xpipe.redis.integratedtest.multidc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author wenchao.meng
 *
 * Jun 22, 2016
 */
@RunWith(Suite.class)
@SuiteClasses({
	DataSyncTest.class
})
public class MultiDcTests {

}
