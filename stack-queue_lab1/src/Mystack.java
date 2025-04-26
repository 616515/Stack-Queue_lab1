public class Mystack {
    private int top=-1;
    private int[] list;
    public Mystack(int size)
    {
        list = new int[size];
    }
    public void push(int x)
    {
        top = top + 1;
        list[top] = x;
    }
    public int pop()
    {
        int x = list[top];
        list[top] = 0;
        top = top-1;
        return x;
    }
}