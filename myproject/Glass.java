public class Glass {
    int fibonacci(int n){
        int fib[n + 2];
        fibo[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <= n; i++){

            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];

    }
    
}
