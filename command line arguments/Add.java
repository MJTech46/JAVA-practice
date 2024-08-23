public class Add {
    public static void main(String[] args) {
        /* please provide only integers at the CLI arg.
            Example: java Add 1 2 3 4 5 6 7 8 9 10
            Output: Result: 55
        */
        int sum = 0;
        // for-each loop
        for(String str : args){
            sum += Integer.parseInt(str);
        }
        System.out.println("Result: " + sum);
    }
}
