package com.java.ds.ll;

public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root=new TrieNode();
	}
	
	private class TrieNode{
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode() {
			this.children=new TrieNode[26];
			this.isWord=false;
		}
	}
	
	public void insert(String word) {
		if(word==null || word.length()==0) {
			throw new IllegalArgumentException();
		}
		TrieNode current=root;
		for(int i=0;i<word.length();i++) {
			char value = word.charAt(i);
			int charIndex=value-'a';
			if(current.children[charIndex]==null) {
				TrieNode node=new TrieNode();
				current.children[charIndex]=node;
				current=node;
			}
		}
		current.isWord=true;
		
		
	}
	
	public boolean search(String word) {
		
		
		return false;
	}
	
	
	public static void main(String[] args) {
		Trie node=new Trie();
		node.insert("cat");
		node.insert("cab");
		node.insert("son");
		node.insert("so");
		System.out.println("word inserted successfully");
		
	}

}
