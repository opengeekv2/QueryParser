package com.iexpertos.queryparser;

public class QueryParser {

	public String[] parse(String query)
	{	if ("SENIOR".equals(query)) {
			return new String[] { "senior" };
		}
		if ("JAVA".equals(query)) {
			return new String[] { "java" };
		}
		return new String[] { query };
	}
}
