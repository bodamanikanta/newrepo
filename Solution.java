import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> rank = new ArrayList<>();
        List<Integer> finalRank = new ArrayList<>();
        int rlen,plen,j,i,r=1,last,temp1;

        rlen=ranked.size();
        rank.add(1);
        last=ranked.get(0);
        for(i=1;i<rlen;i++){
            if(last!=ranked.get(i))
                r++;
            rank.add(r);
            last=ranked.get(i);
        }

        j=rlen-1;
        plen=player.size();
        for(i=0;i<plen;i++){
            temp1=player.get(i);
            while(true){
                if(temp1<ranked.get(j)){
                    finalRank.add(rank.get(j)+1);
                    break;
                }
                else if(temp1==ranked.get(j)){
                    finalRank.add(rank.get(j));
                    break;
                }
                else{
                    j--;
                    if(j<0){
                        finalRank.add(1);
                        break;
                    }
                }
            }
        }

        return finalRank;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("TempOutputFile")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
