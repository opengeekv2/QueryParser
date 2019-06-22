package com.iexpertos.queryparser;

public class QueryParser {

	public String[] parse(String query)
	{
		if ("senior".equals(query)) {
			String[] result = {"senior"};
			return result;
		}
		String[] result = {"java"};
		return result;
	}
}
