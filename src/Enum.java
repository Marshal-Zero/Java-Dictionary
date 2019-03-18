import java.util.HashMap;
import java.util.Map;

public class Enum {


    public enum dictionaryWords {
        ADJECTIVE("|\n" +
                "Adjective [noun] : Adjective is a word that describes a person or thing, for example big,\n" +
                "redand clever in a big house, red wine and a clever idea.\n" +
                "|"),
        BOOK("|\n" +
                "Book [noun] : To arrange for someone to have a seat on a plane.\n" +
                "Book [noun] : To arrange something on a particular date.\n" +
                "|"),
        BOOKABLE("|\n" +
                "Bookable [adjective] : Can be ordered in advance.\n" +
                "|"),
        CONJUNCTION("|\n" +
                "Conjunction [noun] : Conjunction is a word that joins words, phrases or sentences, for\n" +
                "example'and', 'but', 'or'.\n" +
                "|"),
        CSC210("|\n" +
                "CSC210 [adjective] : Comfortable with Objects and Classes.\n" +
                "CSC210 [adjective] : Ready for CSC 220.\n" +
                "CSC210 [noun] : Intro to Java.\n" +
                "CSC210 [verb] : To learn Java.\n" +
                "|"),
        CSC220("|\n" +
                "CSC220 [adjective] : Ready to create complex data structures.\n" +
                "CSC220 [noun] : Data Structures.\n" +
                "CSC220 [verb] : To create data structures.\n" +
                "|"),
        CSC340("|\n" +
                "CSC340 [adjective] : = C++ version of CSC210 + CSC220 + more.\n" +
                "CSC340 [noun] : A CS upper division course\n" +
                "CSC340 [noun] : Many hours outside of class.\n" +
                "CSC340 [noun] : Programming Methodology\n" +
                "|"),
        INTERJECTION("|\n" +
                "Interjection [noun] : Interjection is a short sound, word or phrase spoken suddenly to\n" +
                "expressan emotion. Oh!, Look out! and Ow! are interjections.\n" +
                "|"),
        PLACEHOLDER("|\n" +
                "Placeholder [adjective] : To be updated...\n" +
                "Placeholder [adjective] : To be updated...\n" +
                "Placeholder [adverb] : To be updated...\n" +
                "Placeholder [conjunction] : To be updated...\n" +
                "Placeholder [interjection] : To be updated...\n" +
                "Placeholder [noun] : To be updated...\n" +
                "Placeholder [noun] : To be updated...\n" +
                "Placeholder [noun] : To be updated...\n" +
                "Placeholder [preposition] : To be updated...\n" +
                "Placeholder [pronoun] : To be updated...\n" +
                "Placeholder [verb] : To be updated...\n" +
                "|"),
        PRONOUN("|\n" +
                "Pronoun [noun] : The part of speech that substitutes for nouns or noun phrases and\n" +
                "designates persons or things asked for, previously specified, or understood from the context.\n" +
                "Pronoun [noun] : Any of the words within this part of speech, such as he or whom.\n" +
                "|"),
        VERB("|\n" +
                "Verb [noun] : Verb is a word or group of words that expresses an action (such as eat), an\n" +
                "event(such as happen) or a state (such as exist).\n" +
                "|");


        private String type;

        dictionaryWords(String value) {

            this.type = value;
        }


        public String getType() {
            return type;
        }


        private static final Map<String, dictionaryWords> lookup = new HashMap<>();


        static {

            for (dictionaryWords value : dictionaryWords.values()) {
                lookup.put(value.getType(), value);

            }
        }

        private static dictionaryWords[] values = dictionaryWords.values();

        public static dictionaryWords getDay(int i) {
            return values[i - 1];

        }
    }

}









