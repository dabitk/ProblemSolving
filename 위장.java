import java.util.*;

class Solution {
    //String[][] clothes : [이름-의상종류로] * 행의 수로 이루어진 2차 배열
    //배열의 행의 길이 제한은 1 이상 30 이하.
    //모든 문자열 길이 1 이상 20 이하, 전부 소문자 또는 '_'로만 이루어져 있음.
    //주어진 의상 중에 중복은 없음.
    //하루에 적어도 1개의 의상을 걸치고 있음.
    
    //목표 : 가능한 모든 의상 조합의 수
    
    //접근법 :
    //1. 모든 경우의 수를 구하는 것은 각 부위 별로 존재하는 선택지 수를 곱하면 된다.
    //   단, 해당 부위의 의상을 '입지 않는다'라는 선택지도 존재한다는 것을 고려해서 
    //   부위별로 '의상 수 + 1' 한 값들을 곱한다
    //ex) (얼굴 1개+1) * (상의 1개+1) * (하의 1개+1) * (겉옷 1개+1)
    //2. 이렇게 하면 모든 의상의 경우의 수가 나오는 데, 이중 '아무 옷도 입지 않는다'라는 선택지는 문제에서 제외시켰으므로
    //   '모든 경우의 수 - 1'을 한 값이 해답이 된다.
    
    public int solution(String[][] clothes) {
        //   해시맵에 '각 부위 : 각 부위별로 존재하는 의상의 수'의 'key:value' 페어를 저장한다
        
        Map<String, Integer> m = new HashMap<String, Integer>();
        
        for(int i = 0;i<clothes.length;i++){
        	//System.out.println("here");
            //clothes[i][1]는 의상의 종류를 나타냄.
            if(!m.containsKey(clothes[i][1])){
                //맵에 해당 의상 종류가 존재하지 않는 경우 맵에 추가
                m.put(clothes[i][1], 1);
            	//System.out.println("here1");
            }else{
                //해당 의상 종류가 이미 존재한다면 등장횟수를 +1 한다.
                m.put(clothes[i][1],m.get(clothes[i][1])+1);
            	//System.out.println("here2");
            }
        }
        
        
        int answer = 1;
        Iterator<String> keys = m.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            answer *= m.get(key)+1;
            //System.out.println(key + " : " + m.get(key));
        }
        

        return answer-1;
    }
}