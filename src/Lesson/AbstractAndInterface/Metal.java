package Lesson.AbstractAndInterface;

interface Metal {
  public int n = 100;

   int getWeight();

   private void h(){
       System.out.println("");
   }
   default void h2(){
       h();
   }
}
