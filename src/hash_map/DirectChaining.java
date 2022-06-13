package hash_map;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxSize;

    DirectChaining(int size) {
        hashTable = new LinkedList[size];
        maxSize = 5;
    }

    public int hashFunction(String word, int M) {
        char[] ch;
        ch = word.toCharArray();

        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum = sum + ch[i];

        }
        System.out.println(sum % M);
        return sum % M;
    }

    public void insertTable(String word) {
        int index = hashFunction(word, hashTable.length);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(word);
        } else {
            hashTable[index].add(word);
        }
    }

    public void displayTable() {
        if (hashTable == null) {
            System.out.println("HASH TABLE EMPTY.");
            return;
        }
        System.out.println("HASH TABLE: ");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(" index : " + i + " keys -> " + hashTable[i]);
        }
    }
}
