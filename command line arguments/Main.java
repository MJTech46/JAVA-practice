public class Main {
    public static void main(String[] args) {
        /* please provide CLI arguments for this.
           Example: java Main arg1 arg2 hello
           Output: arg1
                   arg2 
                   hello
        */

        // for each loop
        System.out.println("\n**for each loop**");
        for (String str : args) {
            System.out.println(str);
        }

        // normal loop
        System.out.println("\n**normal loop**");
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
}
