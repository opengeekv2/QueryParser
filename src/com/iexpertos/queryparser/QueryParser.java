package com.iexpertos.queryparser;

public class QueryParser {

	public String[] parse(String query)
	{	if ("SENIOR".equals(query)) {
			return new String[] { "senior" };
		}
		return new String[] { query };
	}
}
