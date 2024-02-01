package finalTset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    // 202210229, 양효인

    private Map<Character, CountableWordsList> map;
    private String fileName;
    private CountableWordsList cwl;

    private char[] keySet;

    public Main(String fileName){
        this.fileName = fileName;
        keySet = new char[48];
    }

    public void createMap(){
        // 파일 읽고 단어들 분리
        map = new HashMap<Character, CountableWordsList>();
        ReadFile readFile = new ReadFile(fileName);
        ArrayList<String> lines = readFile.readLines();
        String[] strs = new String[lines.size()];
        for(int i = 0; i < lines.size(); i++){
            strs = lines.get(i).split("[ \t\n\'\",.?!]");
        }

        // 맵 생성 - 키 만들기
        int idx = 0;
        for (String str : strs){
            if (!(keySet[idx] == str.charAt(0))) {
                keySet[idx] = str.charAt(0);
                idx++;
            }
            else{
                idx++;
            }
        }
        // 맵 생성 - 단어들 리스트 만들고 map에 넣기
        cwl = new CountableWordsList(strs[0]);
        for (String str : strs){
            cwl.add(str);
            map.put(str.charAt(0),cwl);
        }
        map.put('a', cwl);

    }

    public void printMap(){
        for (int i = 0; i < map.size(); i++) {
            System.out.printf("%c : ", keySet[i]);
            map.get(keySet[i]).print();
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Main main = new Main("ipsum.txt");
        main.createMap();
        main.printMap();
    }
}