import java.util.*;
public class dfhdfnd {
    public static void main(String[] args) {

 List numbers = new ArrayList();
 for(int i=1; i<=49; i++)
numbers.add(i);
 Collections.shuffle(numbers);
List winningCombination = numbers.subList(0, 6);
 Collections.sort(winningCombination);
 System.out.println(winningCombination);
    }
}
