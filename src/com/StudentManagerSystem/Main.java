/*
 * created by @Amir
*/

package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BPlusTree<String, Integer> tree = new BPlusTree<>();
        tree.insert("aydin", 1);
    }
}
