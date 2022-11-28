package studio9;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	public int id;

	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		int x = 0;
		int y = 0;
		int z = 0;
		int v = 0;
		Map <String, Integer> countingsux = new HashMap<String, Integer>();
		for (String curString: words) {
			if (countingsux.containsKey(curString)) {
				// store 1 at currString
			}
			if (countingsux.equals("to")) {
				x++;
			}
			else if (countingsux.equals("be")) {
				y++;	 
			}
			
			else if (countingsux.equals("or")) {
				z++;	
			}
			
			else if (countingsux.equals("not")) {
				v++;		 	 
			}

		}
		
		Map <String, Integer> yaywedidit = new HashMap<String, Integer>(); 
	}
}

/* public Map<Integer, Animal> convertListBeforeJava8(List<Animal> list) {
    Map<Integer, Animal> map = new HashMap<>();
    for (Animal animal : list) {
        map.put(animal.getId(), animal);
    }
    return map; */