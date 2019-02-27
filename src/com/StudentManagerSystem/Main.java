/*
 * created by @Amir
*/

package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "./src/com/StudentManagerSystem/data/File";
        BPlusTree < String , Integer > btree = new BPlusTree<>();

        btree.insert("Amir".toLowerCase(), 1234);
        btree.insert("A4ir".toLowerCase(), 1234);
        btree.insert("Am54ir".toLowerCase(), 1234);
        btree.insert("Am4545ir".toLowerCase(), 1234);
        btree.insert("Am242ir".toLowerCase(), 1234);

        FileIO.writeAnObjectToFile("./src/com/StudentManagerSystem/data/bTree", btree);
        BPlusTree btree2 = (BPlusTree)FileIO.readAnObjectFromFile("./src/com/StudentManagerSystem/data/bTree");
    }
}
