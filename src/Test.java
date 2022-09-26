public class Test
{
    public static void main(String[] args)
    {
        int num[] = {16, 345, 3542, 12, -12, 0};
        int size[] = {1, 2, 3, 4,};
        int value = -1;
        String[] CatchPhrase = {"easy", "come", "easy", "go"};
        CatchPhrase[1] = "income";
        while(value < num.length)
        {
            value++;
            System.out.println(num[value]);
        }
    }
}
