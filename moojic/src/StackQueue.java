import java.util.*;
import java.lang.*;

class StackQueue {

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Stack<Integer>> stackindex = new ArrayList<Stack<Integer>>(10); //stores stacks
        for(int i=0;i<10;i++)
            stackindex.add(i, new Stack<Integer>());
        ArrayList<Queue<Integer>> queueindex = new ArrayList<Queue<Integer>>(10); //stores stacks
        for(int i=0;i<10;i++)
            queueindex.add(i, new ArrayDeque<Integer>());

        while(s.hasNextLine())
        {
            String[] temp = s.nextLine().split(" ");
            if(temp[0].equals("new_s"))
            {
                int ind = Integer.parseInt(temp[1]);
                stackindex.set(ind, new Stack<Integer>());
            }
            else if(temp[0].equals("push"))
            {
                int ind = Integer.parseInt(temp[1]);
                int elem = Integer.parseInt(temp[2]);
                if(stackindex.get(ind).size()!=10)
                    stackindex.get(ind).push(elem);
                else
                    System.out.println("error: stack is full");
            }
            else if(temp[0].equals("pop"))
            {
                int ind = Integer.parseInt(temp[1]);
                if(!stackindex.get(ind).isEmpty())
                    stackindex.get(ind).pop();
                else
                    System.out.println("error: stack is empty");
            }
            else if(temp[0].equals("delete_s"))
            {
                int ind = Integer.parseInt(temp[1]);
                if(stackindex.get(ind)!=null)
                    stackindex.set(ind,null);
            }
            else if(temp[0].equals("print_s"))
            {
                int ind = Integer.parseInt(temp[1]);
                if(stackindex.get(ind)==null)
                    System.out.println("empty");
                else
                {   for(int i = 0;i<stackindex.get(ind).size();i++)
                    System.out.print(stackindex.get(ind).get(i));
                    System.out.println();
                }
            }
            else if(temp[0].equals("new_q"))
            {
                int ind = Integer.parseInt(temp[1]);
                queueindex.set(ind, new ArrayDeque<Integer>());

            }
            else if(temp[0].equals("enqueue"))
            {
                int ind = Integer.parseInt(temp[1]);
                int elem = Integer.parseInt(temp[2]);
                if(queueindex.get(ind).size()!=10)
                    queueindex.get(ind).add(elem);
                else
                    System.out.println("error: queue is full");
            }
            else if(temp[0].equals("dequeue"))
            {
                int ind = Integer.parseInt(temp[1]);
                if(queueindex.get(ind).size()==0)
                    System.out.println("error: queue is empty");
                else
                    queueindex.get(ind).remove();
            }
            else if(temp[0].equals("delete_q"))
            {
                int ind = Integer.parseInt(temp[1]);
                if(queueindex.get(ind)!=null)
                    queueindex.set(ind, null);

            }
            else if(temp[0].equals("print_q"))
            {
                int ind = Integer.parseInt(temp[1]);
                int i = 0;
                for (int elem : queueindex.get(ind)) {
                    System.out.print(elem+" ");
                }
                System.out.println();
            }
            else if(temp[0].equals("stack->stack"))
            {
                int ind1 = Integer.parseInt(temp[1]);
                int ind2 = Integer.parseInt(temp[1]);
                if(!stackindex.get(ind1).isEmpty())
                {
                    int elem = stackindex.get(ind1).pop();
                    if(stackindex.get(ind2).size()!=10)
                        stackindex.get(ind2).push(elem);
                    else
                        System.out.println("error: stack is full");
                }
                else
                    System.out.println("error: stack is empty");


            }
            else if(temp[0].equals("stack->queue"))
            {
                int ind1 = Integer.parseInt(temp[1]);
                int ind2 = Integer.parseInt(temp[1]);
                if(!stackindex.get(ind1).isEmpty())
                {
                    int elem = stackindex.get(ind1).pop();
                    if(queueindex.get(ind2).size()!=10)
                        queueindex.get(ind2).add(elem);
                    else
                        System.out.println("error: queue is full");
                }
                else
                    System.out.println("error: stack is empty");
            }
            else if(temp[0].equals("queue->queue"))
            {
                int ind1 = Integer.parseInt(temp[1]);
                int ind2 = Integer.parseInt(temp[1]);
                if(!queueindex.get(ind1).isEmpty())
                {
                    int elem = queueindex.get(ind1).remove();
                    if(queueindex.get(ind2).size()!=10)
                        queueindex.get(ind2).add(elem);
                    else
                        System.out.println("error: queue is full");
                }
                else
                    System.out.println("error: queue is empty");
            }
            else if(temp[0].equals("queue->stack"))
            {
                int ind1 = Integer.parseInt(temp[1]);
                int ind2 = Integer.parseInt(temp[1]);
                if(!queueindex.get(ind1).isEmpty())
                {
                    int elem = queueindex.get(ind1).remove();
                    if(stackindex.get(ind2).size()!=10)
                        stackindex.get(ind2).push(elem);
                    else
                        System.out.println("error: stack is full");
                }
                else
                    System.out.println("error: queue is empty");
            }
            else
                System.out.println("error: wrong command");
        }
    }
}
