import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Java8DemoTest {

    @Test
    public void shouldAllowConversionFromStringToInteger() throws Exception {

        Converter<String, Integer> converter = Integer::valueOf;

        Integer convertedValue = converter.convert("123");

        assertEquals(convertedValue, Integer.valueOf(123));
    }

    @Test
    public void shouldAllCovnersionFromLowerCaseToCapital() throws Exception {

        Converter<String, String> converter = String::toUpperCase;
        List<String> upperCaseStrings = Stream.of("nelson", "anthonyswami", "davenapalli")
                .map(converter::convert)
                .collect(Collectors.toList());

        upperCaseStrings.forEach( System.out::println);

        assertEquals(upperCaseStrings.size(), 3 );
        assertEquals(upperCaseStrings.contains("NELSON"), true );
        assertEquals(upperCaseStrings.contains("ANTHONYSWAMI"), true );
        assertEquals(upperCaseStrings.contains("DAVENAPALLI"), true );
    }
}