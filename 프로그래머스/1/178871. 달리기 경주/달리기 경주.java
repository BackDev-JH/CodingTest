import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> result = new HashMap<>();
        
        for (int i = 0; i < players.length; i++){
            result.put(players[i], i);
        }
        
        for (String call : callings){
            int rank = result.get(call);
            String ahead = players[rank-1];
            
            players[rank-1] = call;
            players[rank] = ahead;
            
            result.put(call, rank-1);
            result.put(ahead, rank);
            
        }
        
        return players;
        
    }
}