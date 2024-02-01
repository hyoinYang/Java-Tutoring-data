package finalTset;

import java.util.Objects;

public class CountableWord {
    private String savedWord;
    private int num;

    public CountableWord(String word){
        this.savedWord = word;
        num = 0;
    }

    public boolean equals(Objects word){
        if(savedWord.equals(word)){
            return true;
        }
        else{
            return false;
        }
    }

    public void increaseCount(){
        num++;
    }

    @Override
    public String toString(){
        return (savedWord + "("+ num + ")");
    }
}
