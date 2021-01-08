class GrumpyBookStore {

    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
         int satisfiedCustomers = 0;
         int n = customers.length;
	      for(int i=0;i<n;i++){
            if(grumpy[i] == 0){
                satisfiedCustomers += customers[i];
            }
          }
        
         int maxUnsatisfiedCustomers = Integer.MIN_VALUE;
         int currentSum = 0;
         int windowStart = 0;
         int size = 0;
         for(int windowEnd = 0;windowEnd <n;windowEnd++){
            if(grumpy[windowEnd] == 1){
                currentSum += customers[windowEnd];
            }

            size = windowEnd - windowStart;
            if(size >= X-1){
                maxUnsatisfiedCustomers = Math.max(maxUnsatisfiedCustomers,currentSum);

                if(grumpy[windowStart] == 1){
                    currentSum -= customers[windowStart];
                }
                windowStart ++;
            }
         }
         return satisfiedCustomers + maxUnsatisfiedCustomers;
    }

    public static void main(String args[]){
        int customer [] =  {1,0,1,2,1,1,7,5};
        int grumpy [] = {0,1,0,1,0,1,0,1};
        int X = 3;
        int res = maxSatisfied(customer,grumpy,X);
        System.out.println(" Result : "+res);

    }
}