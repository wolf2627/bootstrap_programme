class whileloop {
    public static void main(String[] args){
        // print boot..prog 5 times
        int i = 1;
        while(i <= 10){
            System.out.println("i = " + i + " boot..prog");
            i = i + 2;
        }
        System.out.println("End of while loop");
        System.out.println("i = " + i);
    }
}