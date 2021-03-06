 

public class LoopFun {

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {
        Integer storeTempValue = 1;
        for (int i = 1; i <= number; i++) {
            storeTempValue = storeTempValue * i;
        }
        return storeTempValue;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     *
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String toUpperCase = phrase.toUpperCase();
        char[] storeCharArray = toUpperCase.toCharArray();
        StringBuilder storeReverse = new StringBuilder();

        for (int i = 0; i < storeCharArray.length; i++) {
            if (i == 0)
                storeReverse.append(storeCharArray[i]);
            else if (storeCharArray[i] == ' ')
                storeReverse.append(storeCharArray[i + 1]);
        }
        return storeReverse.toString();
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     * 'a' => 'd'
     * 'w' => 'z'
     * 'x' => 'a'
     * 'y' => 'b'
     *
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        StringBuffer output = new StringBuffer();

        for (int i = 0; i < word.length(); i++) {
            char charStore = word.charAt(i);
            char storeNewLetter = charStore;
            if (charStore >= 'a' && charStore <= 'z') {
                storeNewLetter = (char) ((charStore -'a' + 3) % 26 + 'a');
            } else if (charStore >= 'A' && charStore <= 'Z') {
                storeNewLetter = (char) ((charStore - 'A' + 3) % 26 + 'a');
            }
            output.append(storeNewLetter);

        }

        return output.toString();
    }
}
