class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int attackNum = 0;
        int hp = health;
        int success = 0;

        for (int i = 1; i <= attacks[attacks.length-1][0]; i++){
            if (i != attacks[attackNum][0]){
                hp += bandage[1];
                success++;
                if (success == bandage[0]){
                    hp += bandage[2];
                    success = 0;
                }
                if (hp > health) hp = health;
            } else {
                success = 0;
                hp -= attacks[attackNum][1];
                attackNum++;
                if (hp <= 0) return -1;
            }
        }
        return hp;
    }
}