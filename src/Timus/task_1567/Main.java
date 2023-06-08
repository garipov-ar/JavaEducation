package Timus.task_1567;

import java.io.*;


public class Main {
    public static void main(String[] args)
            throws IOException {
        int[] c = new int[256];

        for (int i = 'a'; i <= 'z'; i++) {
            c[i] = (i - 'a') % 3 + 1;
        }
        c[' '] = 1;
        c['.'] = 1;
        c[','] = 2;
        c['!'] = 3;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int ans = 0;

        for (char ch: str.toCharArray()) {
            ans += c[ch];
        }
        System.out.println(ans);
    }
}