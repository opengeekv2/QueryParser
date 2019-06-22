package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

import com.iexpertos.queryparser.QueryParser;

class QueryParserShould {

	@Test
	void return_the_token_of_a_single_word() {
		QueryParser parser = new QueryParser();
		
		String[] result = parser.parse("senior");
		
		assertThat(result.length, is(1));
		assertThat(result[0], is("senior"));
	}

}
