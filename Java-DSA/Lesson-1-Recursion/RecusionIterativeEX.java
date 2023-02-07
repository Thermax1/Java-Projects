class RecursionIterativeEX {
    
    static int powerofTwoRec(int n) {
        if (n == 0)
            return 1;
        else {
            int power = 2*powerofTwoRec(n-1);
            return power;
        }
    }

    static int powerofTwoIT(int n) {
        int i = 0;
        int power = 1;
        while (i < n){
            power = power * 2;
            i = i + 1;
        }
        return power;
    }
}