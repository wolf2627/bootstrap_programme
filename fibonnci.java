class fibonnci {
    public static void main(String[] args){
        int first = 0;
        int second = 1;
        int next;
        int no_of_elements = 10;
        int k  = 0;

        while(k <= no_of_elements){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            k++;
        }
    }
}

// fib 0 1 1 2 3