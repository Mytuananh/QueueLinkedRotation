public class Main {
    public static void main(String[] args) {
        Solution.Queue a = new Solution.Queue();
        a.front = a.rear = null;

        Solution.enQueue(a, 1);
        Solution.enQueue(a, 2);
        Solution.enQueue(a, 3);

        Solution.displayQueue(a);
        System.out.println("");
        System.out.printf("Deleted value = %d", Solution.deQueue(a));
        System.out.println("");
        System.out.printf("Deleted value = %d", Solution.deQueue(a));
        System.out.println("");
        Solution.displayQueue(a);
        System.out.println("");
        Solution.enQueue(a, 4);
        Solution.enQueue(a, 5);

        Solution.displayQueue(a);

    }
}
