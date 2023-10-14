class Solution { 
    public boolean checkIfSelfDividing(int actualNum){
        int num = actualNum;

        while(num>0){
            int rem = num%10;
            if(rem==0){return false;}
            if(actualNum%rem!=0){return false;}
            num=num/10;
        }
        return true;
       
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = left; i<=right; i++){
            if(checkIfSelfDividing(i)) arr.add(i);
        }
        return arr;

    }
}