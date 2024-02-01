package finalTset;

import java.util.ArrayList;

public class CountableWordsList {
    private  ArrayList<CountableWord> wordArrayList;
    private CountableWord countableWord;

    public CountableWordsList(String word){
        wordArrayList = new ArrayList<CountableWord>();
        countableWord = new CountableWord(word);
        wordArrayList.add(countableWord);
    }

    public void add(String word){
        if (countableWord.equals(word)) {
            countableWord.increaseCount();
        }
        else{
            CountableWord countableAnotherW = new CountableWord(word);
            wordArrayList.add(countableAnotherW);
        }
    }

    public void print(){
        int size = 1;
        for(CountableWord cw : wordArrayList) {
            System.out.printf("%s", cw.toString());
            size++;

            if(size == wordArrayList.size()){
                // do nothing
            }
            else{
                System.out.printf(", ");
            }
        }
    }


}
