package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.iexpertos.queryparser.QueryParser;

class QueryParserShould {

	@ParameterizedTest
	@CsvSource({"senior, senior", "java,java", ".net, .net"})
	void return_the_token_of_a_single_word(String query, String expectedResult) {
		QueryParser parser = new QueryParser();
		
		String[] result = parser.parse(query);
		
		assertThat(result.length, is(1));
		assertThat(result[0], is(expectedResult));
	}
	
	@ParameterizedTest
	@CsvSource({"SENIOR, senior", "JAVA, java", ".NET, .net"})
	void not_be_case_sensitive(String query, String expectedResult) {
		QueryParser parser = new QueryParser();
		
		String[] result = parser.parse(query);
		
		assertThat(result.length, is(1));
		assertThat(result[0], is(expectedResult));
	}

}
