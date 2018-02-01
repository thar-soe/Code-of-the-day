
public static String abbreviate(String word) { //Kevin's Method
        char[] charWord = word.toCharArray();
        StringBuilder abbWord = new StringBuilder();
        abbWord.append(charWord[0] + ((charWord.length-2) + "") + charWord[charWord.length-1]);
        return abbWord.toString();
    }
