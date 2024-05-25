package .vscode;

public class output {
    public static void main(String[] args){
        if (args.length == 0) return;
        int min = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > min) {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println(min);
    }
    
}
