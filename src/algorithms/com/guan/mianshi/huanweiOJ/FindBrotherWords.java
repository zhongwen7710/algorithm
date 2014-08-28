package algorithms.com.guan.mianshi.huanweiOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * �����ֵܵ���
 * @author 
 *
 */
public class FindBrotherWords {

	List<List<String>> dictionary = new ArrayList<List<String>>();

	/**
	 * ���ӵ���
	 * 
	 * @param word
	 */
	public void addWord(String word) {
		if (word != null) {
			if (dictionary.size() <= 0) {
				dictionary.add(new ArrayList<String>());
				dictionary.get(0).add(word);
				return;
			}
			List<String> wordBros = null;
			boolean hasBro = false;
			for (int i = 0; i < dictionary.size(); i++) {
				wordBros = dictionary.get(i);
				String firstBro = null;
				if (wordBros != null && wordBros.size() > 0) {
					firstBro = wordBros.get(0);
					if (firstBro != null && isBrother(firstBro, word)) {
						if (!wordBros.contains(word)) {
							wordBros.add(word);
							sortBros(wordBros);
						}
						hasBro = true;
						break;
					}
				}
			}
			if (!hasBro) {
				dictionary.add(new ArrayList<String>());
				dictionary.get(dictionary.size() - 1).add(word);
			}
		}
	}

	/**
	 * ��õ����ֵܸ���
	 * 
	 * @param word
	 * @return
	 */
	public int getWordBroCount(String word) {
		if (dictionary.size() > 0) {
			List<String> wordBros = null;
			for (int i = 0; i < dictionary.size(); i++) {
				wordBros = dictionary.get(i);
				String firstBro = null;
				if (wordBros != null && wordBros.size() > 0) {
					firstBro = wordBros.get(0);
					if (firstBro != null && isBrother(firstBro, word)) {
						if (wordBros.contains(word)) {
							return wordBros.size() - 1;
						}
						return wordBros.size();
					}
				}
			}
		}
		return 0;
	}

	/**
	 * ��ȡָ������ֵܵ���
	 * 
	 * @param word
	 * @param num
	 * @return
	 */
	public String getBroWord(String word, int num) {
		String broWord = null;
		if (word == null || num <= 0) {
			return broWord;
		}
		if (dictionary.size() > 0) {
			List<String> wordBros = null;
			for (int i = 0; i < dictionary.size(); i++) {
				wordBros = dictionary.get(i);
				String firstBro = null;
				if (wordBros != null && wordBros.size() > 0) {
					firstBro = wordBros.get(0);
					if (firstBro != null && isBrother(firstBro, word)) {
						if (wordBros.contains(word)) {
							wordBros.remove(word);
						}
						if (num < wordBros.size()) {
							return wordBros.get(num - 1);
						}
					}
				}
			}
		}
		return broWord;
	}

	/**
	 * ����ֵ�
	 */
	public void emptyWords() {
		dictionary.clear();
	}

	private void sortBros(List<String> wordBros) {
		if (wordBros != null && wordBros.size() > 0) {
			Collections.sort(wordBros);
		}
	}

	private boolean isBrother(String word1, String word2) {
		if (word1 != null && word2 != null) {
			int length = 0;
			for (int i = 0; i < word2.length(); i++) {
				if (word1.contains(word2.charAt(i) + "")) {
					length++;
				} else {
					return false;
				}
			}
			if (length == word2.length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		FindBrotherWords dict = new FindBrotherWords();
		String[] words = new String[Integer.parseInt(num)];
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.nextLine();
			dict.addWord(words[i]);
		}
		String targetWord = sc.nextLine();
		System.out.println(dict.getWordBroCount(targetWord));
		String wordNumStr = sc.nextLine();
		System.out.println(dict.getBroWord(targetWord,
				Integer.parseInt(wordNumStr)));
		sc.close();
	}

}