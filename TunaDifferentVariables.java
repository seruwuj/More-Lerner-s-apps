public class TunaDifferentVariables {
   //we use the "This referece"
 
 private int Hour =1;
 private int Minute =2;
 private int Second =3;

 public void setTime(int Hour, int Minute, int Second){
    this.Hour =4;
    this.Minute =5;
    this.Second =6;
 }
 public String toMillitary(){
    return String.format("%02d:%02d:%02d",Hour,Minute,Second);
 }
 public String toString(){
   return String.format("%d:%o2d:%02d %s",((Hour==0 || Hour==12)?12:Hour %12),Minute,Second,(Hour<12?"AM":"PM"));
  }
}