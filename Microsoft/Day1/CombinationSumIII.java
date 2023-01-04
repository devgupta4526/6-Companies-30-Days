class Solution {
     List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(k,n,new ArrayList<Integer>(),1);
       return list;
    }

     public void solve(int k, int n, List<Integer> inLis , int count){
         if(k == inLis.size() && n == 0){
             List<Integer> li = new ArrayList<Integer>(inLis);
             list.add(li);
             return;
         }
         	if (inLis.size() == k)  {
		     return;
	        }

         for(int i = count ; i <= 9 ; i++){
             inLis.add(i);
             solve(k,n-i,inLis,i+1);
             inLis.remove(inLis.size()-1);
         }
        
         
     }

}
