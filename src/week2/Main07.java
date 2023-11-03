package week2;
import java.util.*;

public class Main07{
    static class Pair{
        int first, second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        List<Pair> l = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            //출연횟수저장
            mp1.put(temp, mp1.getOrDefault(temp, 0) + 1);
            //순서 저장
            if(!mp2.containsKey(temp)){
                mp2.put(temp, i + 1);
            }
        }

        //커스텀 정렬을 위한 list pair에 대입
        // 횟수 : 출현순서
        for(Map.Entry<Integer, Integer> entry: mp1.entrySet()){
            l.add(new Pair(entry.getValue(), entry.getKey()));
        }

        Collections.sort(l, new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b){
                if(a.first == b.first){
                    //순서 기준 오름차순
                    return mp2.get(a.second) - mp2.get(b.second);
                }
                //횟수 기준 내림차순
                return b.first - a.first;
            }
        });

        for(Pair p : l){
            // 나온횟수만큼 반복
            for(int j = 0; j < p.first; j++){
                System.out.print(p.second + " ");
            }
        }
    }
}

/*
 * 횟수먼저 정렬하고 그 다음 순서기준정렬
 *
 */