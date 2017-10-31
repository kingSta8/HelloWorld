public class Task1 {
    public static void main(String[] args) {

        String[] LetterList = {"a","b","c","d","e"};
        String[] NumberList = {"0","2","4","6","8"};
        String result = "";

        int x = 0;
        do {
            result += LetterList[x].concat(NumberList[x]);
            x++;
        } while (x<=4);

        System.out.println(result);
    }
}
