package com.company.Problem3;

public class Problem3 {
    public int maximumWealth(int[][] accounts) {
        int reached = 0;
        int reached1 = 0;
        for (int i = 0; i< accounts.length; i++){
            for (int j = 0; j < accounts[i].length; j++){
                reached1 += accounts[i][j];
            }
//            if (reached < reached1){
//                reached = reached1;
//            }
            reached = Math.max(reached,reached1);
            reached1 = 0;
        }
        return reached;
    }

//    public int maximumWealth(int[][] accounts) {
//        int ans = 0;
//        for (int i=0; i<accounts.length; i++) {
//            for (int j=1; j<accounts[i].length; j++) {
//                accounts[i][j] = accounts[i][j] + accounts[i][j - 1];
//            }
//            ans = Math.max(ans, accounts[i][accounts[i].length - 1]);
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        int arr = problem.maximumWealth(new int[][] {{1,3},{4,2}});
        System.out.println("");

    }
}