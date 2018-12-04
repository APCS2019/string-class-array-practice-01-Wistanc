

public class HiddenWord{
  private String puzzle;
}
public HideenWord(String puzzle){
  this.puzzle=puzzle;
}
public String getHint(String guess){
  String temp=" ";
  For(int i=0;i<guess.length();i++){
     if(puzzle.substring(i,i+1).equals(guess.substring(i,i+1)){
       temp+=substring(i+1);
     else if(puzzle.indexOf(guess.substring(i,i+1)){
       temp+="+";
     else 
     temp+="*";
  }
 return temp
}
