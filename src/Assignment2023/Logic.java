package Assignment2023;

import java.util.HashMap;

public class Logic {
    private HashMap _morseHashMap;

    public Logic() {
        _morseHashMap = GenerateHashMap();
    }

    public String Translate(String input) {
        String translation = "";
        input = input.toLowerCase();
        String[] splittedList;

        if (IsMorse(input)) {
            splittedList = input.split(" ");
        } else {
            splittedList = input.split("");
        }

        for (int i = 0; i < splittedList.length; i++) {
            if (_morseHashMap.containsKey(splittedList[i])) {
                translation = translation + ConvertMorse(splittedList[i]);
            } else {
                return "Invalid value: " + splittedList[i];
            }
        }
        return translation.trim();
    }

    public String ConvertMorse(String translateInput) {

        String translatedValue = _morseHashMap.get(translateInput).toString();
        if (IsMorse(translateInput)) {
            return translatedValue;
        } else {
            return translatedValue + " ";
        }
    }

    private Boolean IsMorse(String input) {
        return input.startsWith("*") || input.startsWith("-");
    }

    private HashMap GenerateHashMap() {

        HashMap<String, String> morseCode = new HashMap<>();
        morseCode.put(" ", "|");
        morseCode.put("a", "*-");
        morseCode.put("b", "-***");
        morseCode.put("c", "-*-*");
        morseCode.put("d", "-**");
        morseCode.put("e", "*");
        morseCode.put("f", "**-*");
        morseCode.put("g", "--*");
        morseCode.put("h", "****");
        morseCode.put("i", "**");
        morseCode.put("j", "*---");
        morseCode.put("k", "-*-");
        morseCode.put("l", "*-**");
        morseCode.put("m", "--");
        morseCode.put("n", "-*");
        morseCode.put("o", "---");
        morseCode.put("p", "*--*");
        morseCode.put("q", "--*-");
        morseCode.put("r", "*-*");
        morseCode.put("s", "***");
        morseCode.put("t", "-");
        morseCode.put("u", "**-");
        morseCode.put("v", "***-");
        morseCode.put("w", "*--");
        morseCode.put("x", "-**-");
        morseCode.put("y", "-*--");
        morseCode.put("z", "--**");
        morseCode.put("1", "*----");
        morseCode.put("2", "**---");
        morseCode.put("3", "***--");
        morseCode.put("4", "****-");
        morseCode.put("5", "*****");
        morseCode.put("6", "-****");
        morseCode.put("7", "--***");
        morseCode.put("8", "---**");
        morseCode.put("9", "----*");
        morseCode.put("0", "-----");

        morseCode.put("|", " ");
        morseCode.put("*-", "a");
        morseCode.put("-***", "b");
        morseCode.put("-*-*", "c");
        morseCode.put("-**", "d");
        morseCode.put("*", "e");
        morseCode.put("**-*", "f");
        morseCode.put("--*", "g");
        morseCode.put("****", "h");
        morseCode.put("**", "i");
        morseCode.put("*---", "j");
        morseCode.put("-*-", "k");
        morseCode.put("*-**", "l");
        morseCode.put("--", "m");
        morseCode.put("-*", "n");
        morseCode.put("---", "o");
        morseCode.put("*--*", "p");
        morseCode.put("--*-", "q");
        morseCode.put("*-*", "r");
        morseCode.put("***", "s");
        morseCode.put("-", "t");
        morseCode.put("**-", "u");
        morseCode.put("***-", "v");
        morseCode.put("*--", "w");
        morseCode.put("-**-", "x");
        morseCode.put("-*--", "y");
        morseCode.put("--**", "z");
        morseCode.put("*----", "1");
        morseCode.put("**---", "2");
        morseCode.put("***--", "3");
        morseCode.put("****-", "4");
        morseCode.put("*****", "5");
        morseCode.put("-****", "6");
        morseCode.put("--***", "7");
        morseCode.put("---**", "8");
        morseCode.put("----*", "9");
        morseCode.put("-----", "0");

        return morseCode;
    }
}