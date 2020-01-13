import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void testOriginOutput(){
        int number = 1;
        String res = fizzBuzz.of(number);
        assertThat(res).isEqualTo("1");
    }


    @Test
    public void testFizzOutput(){
        int number =3;
        String res = fizzBuzz.of(number);
        assertThat(res).isEqualTo("Fizz");
    }

    @Test
    public void testBBuzzOutput(){
        int number = 5;
        String res = fizzBuzz.of(number);
        assertThat(res).isEqualTo("Buzz");
    }

    @Test
    public void testFizzBuzzOutput(){
        int number = 15;
        String res = fizzBuzz.of(number);
        assertThat(res).isEqualTo("FizzBuzz");
    }
}
