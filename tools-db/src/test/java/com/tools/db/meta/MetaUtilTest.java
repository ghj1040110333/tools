package com.tools.db.meta;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;

import com.tools.core.collection.CollectionUtil;
import com.tools.core.util.StringUtil;
import com.tools.db.ds.DSFactory;

/**
 * 元数据信息单元测试
 *
 * @author Looly
 *
 */
public class MetaUtilTest {
	DataSource ds = DSFactory.get("test");

	@Test
	public void getTablesTest() {
		List<String> tables = MetaUtil.getTables(ds);
		Assert.assertEquals("user", tables.get(0));
	}

	@Test
	public void getTableMetaTest() {
		Table table = MetaUtil.getTableMeta(ds, "user");
		Assert.assertEquals(CollectionUtil.newHashSet("id"), table.getPkNames());
	}

	@Test
	public void getColumnNamesTest() {
		String[] names = MetaUtil.getColumnNames(ds, "user");
		Assert.assertArrayEquals(StringUtil.splitToArray("id,name,age,birthday,gender", ','), names);
	}
}
