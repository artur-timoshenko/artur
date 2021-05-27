/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.*;

/**
 *
 * @author Andrey
 */
public class TextProcessing {
    String text;
    private Comparator<HashMap.Entry<String, Integer>> comparator = new Comparator<HashMap.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            Integer first = o1.getValue();
            Integer second = o2.getValue();
            return first.compareTo(second);
        }
    };

    public TextProcessing(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public String getCleanText() {
       return cleanString(text);
    }

    private String[] splitIntoWords() {
        return cleanString(this.text).split(" ");
    }

    public int getUniqueWordsCount() {
        String[] words = this.splitIntoWords();
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word: words) {
            uniqueWords.add(word);
        }
        return uniqueWords.size();
    }

    public int getTotalWordCount() {
        String[] words = this.splitIntoWords();
        return words.length;
    }

    public ArrayList<String> getMostcommonWords() {
        String[] words = this.splitIntoWords();
        HashMap<String, Integer> wordCounter = new HashMap<>();
        for (String word : words) {
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }

        return getFirstN(wordCounter, 5);
    }

    public int get4DifferentLetterWords() {
        String[] words = this.splitIntoWords();
        int res = 0;

        for (String word : words) {
            HashSet<Character> letters = new HashSet<>();
            for (Character c : word.toCharArray()) {
                letters.add(c);
            }
            if (letters.size() == 4) {
                res++;
            }
        }
        return res;
    }

    public ArrayList<String> getThreeLetterSeqs() {
        String[] words = this.splitIntoWords();
        int n = 6;
        HashMap<String, Integer> seqs = new HashMap<>();
        for (String word: words) {
            if (word.length() < n) {
                continue;
            }
            String currentSeq = "";
            for (int i=0; i<n; i++) {
                currentSeq += word.charAt(i);
            }
            seqs.put(currentSeq, seqs.getOrDefault(currentSeq, 0) + 1);
            for (int i=n; i<word.length();i++) {
                currentSeq = currentSeq.substring(1);
                currentSeq += word.charAt(i);
                seqs.put(currentSeq, seqs.getOrDefault(currentSeq, 0) + 1);
            }
        }

        return getFirstN(seqs, 6);
    }

    private ArrayList<String> getFirstN(HashMap<String, Integer> map, int size) {
        PriorityQueue<HashMap.Entry<String, Integer>> highest = new PriorityQueue<HashMap.Entry<String, Integer>>(size, this.comparator);
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            highest.add(entry);
            while (highest.size() > size) {
                highest.poll();
            }
        }
        return getResultList(highest);
    }

    private ArrayList<String> getResultList(PriorityQueue<Map.Entry<String, Integer>> highest) {
        ArrayList<String> result = new ArrayList<>();
        while (highest.size() > 0) {
            result.add(highest.poll().getKey());
        }
        int list_size = result.size();
        for (int i = 0; i < list_size / 2; i++) {
            String temp = result.get(i);
            result.set(i, result.get(list_size - i - 1));
            result.set(list_size - i - 1, temp);
        }

        return result;
    }

    public int getWordsWithoutG() {
        String[] words = this.splitIntoWords();
        int res = 0;
        for (String word : words) {
            boolean charExist = false;
            for (Character c : word.toCharArray()) {
                if (c == 'j') {
                    charExist = true;
                    break;
                }
            }
            if (!charExist){
                res++;
            }
        }
        return res;
    }




    private String cleanString(String input){
        input = input.toLowerCase();
        input = input.replaceAll("-{2,}","");
        input = input.replaceAll(" {2,}"," ");
        input = input.replaceAll("[^\\w -]", "").trim();
        return input;
    }
}