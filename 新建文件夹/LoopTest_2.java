/*
利用ASCII表 输出打印26个英文字母
*/
public class LoopTest_2 {
    public static void main(String[] args){
        char xiaoxie='a';
        char daxie='A';
        for(int i=0;i<26;i++){
            System.out.println(xiaoxie+" "+daxie);
            xiaoxie++;
            daxie++;
        }
    }
    
}