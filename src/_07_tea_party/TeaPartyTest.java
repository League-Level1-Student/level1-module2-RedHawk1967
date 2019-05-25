package _07_tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
       /**
        * Jane Austen is a woman, so say “Hello Ms. Austen”. 
        * George Orwell is a man, so say “Hello Mr. Orwell”. 
        * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
        **/

       @Test
       public void test() {
               teaParty teaParty = new teaParty();
               String greeting = teaParty.welcome(null, false, false);
               assertEquals("Welcome To The Party Ms.Austen", teaParty.welcome("Austen", true, false));
               assertEquals("Welcome To The Party Mr.Orwell", teaParty.welcome("Orwell", false, false));
               assertEquals("Welcome To The Party Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
       }
}
