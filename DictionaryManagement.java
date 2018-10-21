
package dictionary;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
/**
 *dinh 17020684
 * don 17020685
 * @author Pc
 */
public class DictionaryManagement {
    
    final static int exsit = 0,notFull = -1,ok = 1;
    
    public Word mw;
    public TreeMap tm = new TreeMap<String, Word>();
    public void Read() throws FileNotFoundException, IOException
    {
    Scanner read = new Scanner(new FileInputStream("Dictionaries.txt"),"UTF-8");
    String line;
    
    while(read.hasNextLine())
    {   line = read.nextLine();
        if(!line.contains("%%"))
          { 
            
              this.AddTM(line);

          }
  
    }
}
    public void AddTM(String line){
               StringTokenizer st = new StringTokenizer(line , "/");
               while(st.hasMoreTokens()){
                   String key = st.nextToken();
                   String val = st.nextToken();
                   key = key.trim();
                   
                   val = val.trim();

                   mw = new Word(key,val);
                   tm.put(key.toLowerCase(),mw);

        }
    }
    public int checkword(Word word, TreeMap<String,Word> tm) {
        if((word.getWord_target().compareTo("")==0)||(word.getWord_explain().compareTo("")==0))return notFull;
        else
        {
        if(tm.containsKey(word.getWord_target()))
            return exsit;
        else
        {
            String str = word.getWord_target().toLowerCase();
            tm.put(str, word);
            return ok;
            }

        }
    }
    public void deleteWord(String word){
      Giaodien.rf.tm.remove(word);
    }
    
    public void editWord(Word word)
    {
        Giaodien.rf.tm.put(word.getWord_target().toLowerCase(),word);
        
    }
    
    public Dictionary dictionaries = new Dictionary();

	public Dictionary getDictionaries() {
		return dictionaries;
	}
        public void insertFromCommandline() {
		Scanner sc = new Scanner(System.in);
		int numsOfWords;
		String wordTarget, wordExplain;
		System.out.println("[Import] Enter number of words: ");
		numsOfWords = sc.nextInt(); 
		sc.nextLine(); 
	
		while(numsOfWords>0) {
			this.addAWord();
			--numsOfWords;
		}
            
	}
	
	public void insertFromFile() {
		try {
			Scanner inFile = new Scanner(new FileInputStream("src/dictionaries.txt"),"UTF-8");
			String wordTarget, wordExplain;
			while(inFile.hasNextLine()) {
				String oneLine = inFile.nextLine();
				wordTarget = oneLine.substring(0, oneLine.indexOf('\t'));
				wordExplain = oneLine.substring(oneLine.indexOf('\t')+1, oneLine.length());
				Word word = new Word(wordTarget, wordExplain);
				this.getDictionaries().getData().add(word);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found!!!");
		}
	}
	

	public void dictionaryExportToFile() {
 
		try{
			FileWriter writer = new FileWriter("src/dictionaries.txt");
			for(Word word: getDictionaries().getData()) {
				  writer.write(word.getWord_target() + "\t" + word.getWord_explain() + "\n");
			}
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("Đã lưu");
	}


	public void dictionaryLookup() {
		String keyword;
		Scanner sc = new Scanner(System.in);
		System.out.println("[Search] Enter keyword you want to search: ");
		keyword = sc.nextLine();
		int location = this.search(this.dictionaries.getData(),keyword,0,this.getDictionaries().getData().size()-1);
		if(location == -1) {
			System.out.println("Không tìm thấy: " + keyword);
		}
		else {
			System.out.println(" No\t| English\t\t| Vietnamese\t\t\t\n");
			System.out.println("-\t| " + this.getDictionaries().getData().get(location).getWord_target() + "\t\t| " + this.getDictionaries().getData().get(location).getWord_explain() + "\t\t\t\t\n");
		}
	}
	
	
	public void editWord() {
		Scanner sc = new Scanner(System.in);
		String editWord;
		System.out.println("Nhập từ cần sửa (English): ");
		editWord = sc.nextLine();
		int location = this.search(this.dictionaries.getData(),editWord,0,this.getDictionaries().getData().size()-1);
		if(location == -1) {
			System.out.println("Không tìm thấy: " + editWord);
		}
		else {
			System.out.println("Nhập từ mới (English): ");
			this.getDictionaries().getData().get(location).setWord_target(sc.nextLine());
			System.out.println("Nhập nghĩa của từ mới (Vietnamese): ");
			this.getDictionaries().getData().get(location).setWord_explain(sc.nextLine());
		}

	}
	
	
	public void deleteWord() {
		Scanner sc = new Scanner(System.in);
		String deleteWord;
		System.out.println("Nhập từ cần xóa: ");
		deleteWord = sc.nextLine();
		int location = this.search(this.dictionaries.getData(),deleteWord,0,this.getDictionaries().getData().size()-1);
		if(location == -1) {
			System.out.println("Không tìm thấy: " + deleteWord);
		}
		else {
			this.getDictionaries().getData().remove(location);
		}

	}
	

	// search
	public int search(ArrayList<Word> wordList, String str, int head, int tail) {
		if(tail-head <2)	return -1;
		if(wordList.get((head+tail)/2).getWord_target().compareTo(str)==0)	return (head+tail)/2;
		else if((wordList.get((head+tail)/2).getWord_target().compareTo(str)>0))
				return search(wordList,str,head,(head+tail)/2);
		else
			return search(wordList,str,(head+tail)/2,tail);
		
	}
	
	public void addAWord() {
		Scanner sc = new Scanner(System.in);
		String wordTarget, wordExplain;
		wordTarget = sc.nextLine();
		wordExplain = sc.nextLine();
		int location;
		Word word = new Word(wordTarget, wordExplain);
		if(this.getDictionaries().getData().get(0).getWord_target().compareTo(wordTarget)>0)
			location = 0;
		else if(this.getDictionaries().getData().get(this.getDictionaries().getData().size()-1).getWord_target().compareTo(wordTarget)<0)
			location = this.getDictionaries().getData().size();
		else {
			location = this.searchToAdd(this.dictionaries.getData(),wordTarget,0,this.getDictionaries().getData().size()-1);
		}
		if(location==-1)
			System.out.println("Từ này đã tồn tại");
		else
			this.getDictionaries().getData().add(location+1, word);	
		}
	
	public int searchToAdd(ArrayList<Word> wordList, String str, int head, int tail) {
		if(wordList.get((head+tail)/2).getWord_target().compareTo(str)==0 || wordList.get((head+tail)/2+1 ).getWord_target().compareTo(str)==0)	return -1;
		if(wordList.get((head+tail)/2).getWord_target().compareTo(str)< 0 && wordList.get((head+tail)/2+1).getWord_target().compareTo(str)>0 ) return (head+tail)/2;
		else if(wordList.get((head+tail)/2).getWord_target().compareTo(str) > 0)
				return searchToAdd(wordList,str,head,(head+tail)/2);
		else
			return searchToAdd(wordList,str,(head+tail)/2,tail);
		
	}
	
	 
	public void selectOption(DictionaryCommandLine dictionaryCommandLine, int choice) {
		switch (choice) {
		case 1:
			insertFromCommandline();

			break;
			
		case 2:
			editWord();
			break;
			
		case 3:
			deleteWord();
			break;
		
		case 4:

			dictionaryCommandLine.dictionarySearcher();
			break;
			
		case 5:
			dictionaryCommandLine.showAllWords(this.getDictionaries());
			break;
		
		case 6:

			dictionaryExportToFile();
			break;
					
		default:
			break;
		}
	}
}
