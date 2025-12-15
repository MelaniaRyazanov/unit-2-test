public class KillCilantro{
   public static void main(String[]args){
      
     //String killCilantro = 
          System.out.println(killCilantro("something cilantro something"));
          System.out.println(killCilantro("cilantro something"));
          

     
   
   }
   public static String killCilantro(String inputStr){
      String s = null;
       for(s = inputStr; s.indexOf("cilantro") != -1;){
            int index = s.indexOf("cilantro");
            String s1 = s.substring(0, index);
            String s2 = s.substring(index + "cilantro".length(), inputStr.length());
            s = s1 + "parsley" + s2;
            
         }
     
      
       return s; ///fix
   }
  

}