
package dictionary;

import java.util.Scanner;

/**
 *dinh 17020684
 * don 17020685
 * @author Pc
 */
public class DictionaryCommandLine {
    Scanner scan = new Scanner(System.in);
		private DictionaryManagement dictionaryManagement = new DictionaryManagement();
		
		// 
		private void showOption() {
			Scanner sc = new Scanner(System.in);
			int choice;
				do {
					System.out.println("\n=========DICTIONARY =========\n");
					System.out.println("\t0. thoat\t\t\t\n");
					System.out.println("\t1. Them tu\t\t\n");
					System.out.println("\t2. Sua tu\t\t\n");
					System.out.println("\t3. Xoà\t\t\n");
					System.out.println("\t4. Tim kiem\t\t\n");
					System.out.println("\t5. Xem toan bọ\t\t\n");
					System.out.println("\t6. Export to File\t\n");
					System.out.println("-------\tEnter your option--------- ");
					System.out.println("Lua chọn thao tac la: ");
					choice = sc.nextInt();
					dictionaryManagement.selectOption(this,choice);
				}while(choice!=0);
				dictionaryManagement.selectOption(this,6);
		}
		public void showAllWords(Dictionary dictionaries) {
			
			System.out.println(" No\t| English\t\t| Vietnamese\t\t\t\n");
			int no = 0;
			for (Word word : dictionaries.getData()) {
				System.out.println(++no + "\t| " + word.getWord_target() + "\t\t| " + word.getWord_explain() + "\t\t\t\t\n");
			}
		}
		
		public void dictionarySearcher(){
			String keyword;
			Scanner sc = new Scanner(System.in);
			System.out.println("[Search] Enter keyword you want to search: ");
			keyword = sc.nextLine();
			int isFinded = 0;
			int no = 0;
			
			for(Word word : dictionaryManagement.getDictionaries().getData()) {
				if(word.getWord_target().contains(keyword) && word.getWord_target().indexOf(keyword) == 0) {
					++no;
					isFinded = 1;
					if (no == 1) System.out.println(" No\t| English\t\t| Vietnamese\t\t\t\n");
					System.out.println(no + "\t| " + word.getWord_target() + "\t\t| " + word.getWord_explain() + "\t\t\t\t\n");
				}
			}
			if(isFinded == 0) {
				System.out.println("Không thấy kết quả nào");
			}
		}
		
		// Dictionary Basic
		public void dictionaryBasic() {
			dictionaryManagement.insertFromCommandline();
			this.showAllWords(dictionaryManagement.dictionaries);
		}
   
		// Dictionary Advanced
		public void dictionaryAdvanced() {
			dictionaryManagement.insertFromFile();
			this.showOption();
		}
}
