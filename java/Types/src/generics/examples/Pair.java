package generics.examples;

public class Pair<L,R> {
    private L l;
    private R r;
    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }
    public L getL(){ return l; }
    public R getR(){ return r; }
    public void setL(L l){ this.l = l; }
    public void setR(R r){ this.r = r; }
    
    public String toString()
    {
      return "(L = " + l + " R = " + r + ")";
    }
    
    public static void main(String[] args)
    {
      Pair<String,Integer> si = new Pair<>("Johnny", 67);
      System.out.println(si);

      Pair<String,Pair<Integer,Integer>> sii =
    		  new Pair<>("Johnny", new Pair<>(255,404));
      System.out.println(sii);      
    }
}